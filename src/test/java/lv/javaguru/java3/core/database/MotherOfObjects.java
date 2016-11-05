package lv.javaguru.java3.core.database;


import lv.javaguru.java3.config.Application;
import lv.javaguru.java3.core.domain.*;
import lv.javaguru.java3.core.domain.tickets.*;
import lv.javaguru.java3.core.services.vehicle.VehicleService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@SpringApplicationConfiguration(classes = {Application.class})
public class MotherOfObjects {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    TokenTypeDAO tokenTypeDAO;

    @Autowired
    TransportTypeDAO transportTypeDAO;

    @Autowired
    RouteDAO routeDAO;

    @Autowired
    TokenDAO tokenDAO;

    @Autowired
    VehicleDAO vehicleDAO;

    @Autowired
    VehicleService vehicleService;

    @Autowired
    TerminalDAO terminalDAO;

    @Autowired
    TerminalTypeDAO terminalTypeDAO;

    @Autowired
    TicketDAO ticketDAO;


    public void flush(){
        sessionFactory.getCurrentSession().flush();
    }

    public TokenType getTokenType(Long key){
        return tokenTypeDAO.getById(key);
    }
    public TransportType getTransportType(Long key){
        return transportTypeDAO.getById(key);
    }
    public TerminalType getTerminalType(Long key){
        return terminalTypeDAO.getById(key);
    }

    public Token getToken(TokenType tokenType){
        Token token = new Token();
        token.setTokenType(tokenType);
        tokenDAO.create(token);
        return token;
    }
    public Token getToken(Long key){
        return getToken(getTokenType(key));
    }
    public Token getSampleToken(){
        return getToken(1L);
    }

    public Route getRoute(TransportType transportType){
        Route route = new Route();
        route.setTransportType(transportType);
        route.setName("A - B");
        route.setCode("123" + transportType.getCode());
        routeDAO.create(route);
        return route;
    }
    public Route getRoute(Long key){
        return getRoute(getTransportType(key));
    }
    public Route getSampleRoute(){
        return getRoute(1L);
    }

    public Vehicle getVehicle(Route route){
        Random random = new Random();
        Vehicle vehicle = new Vehicle();
        vehicle.setCarCode(String.valueOf(random.nextInt(99999)));
        vehicle.setRoute(route);
        vehicleDAO.create(vehicle);
        return vehicle;
    }

    public Vehicle getSampleVehicle(){
        return getVehicle(getSampleRoute());
    }

    public Trip getRevolvedTrip(){
        Vehicle vehicle = getSampleVehicle();
        Trip trip = vehicleService.revolveTrip(vehicle);
        return trip;
    }


    public Terminal getTerminal(TerminalType terminalType,Vehicle vehicle){
        Terminal terminal = new Terminal();
        terminal.setTerminalType(terminalType);
        terminal.setVehicle(vehicle);
        terminalDAO.create(terminal);
        return terminal;
    }
    public Terminal getTerminal(TerminalType terminalType){
        return getTerminal(terminalType,getSampleVehicle());
    }
    public Terminal getTerminal(Vehicle vehicle){
        return getTerminal(getTerminalType(1l),vehicle);
    }
    public Terminal getSampleTerminal(){
        return getTerminal(getTerminalType(1l),getSampleVehicle());
    }

    public void addOneTimer(Token token , Trip trip){
        OneTimeTicket oneTimer = new OneTimeTicket();
        Terminal sampleTerminal = getSampleTerminal();
        oneTimer.setIssueTerminal(sampleTerminal);
        oneTimer.setTrip(trip);
        oneTimer.setTokenId(token.getId());
        token.addTicket(oneTimer);
        ticketDAO.create(oneTimer);
        tokenDAO.update(token);
    }

    public void addPrepaidRide(Token token, int rides){
        PrepaidRideTicket prepaidRide = new PrepaidRideTicket();
        prepaidRide.setIssueTerminal(getSampleTerminal());
        prepaidRide.setBalance(rides);
        prepaidRide.setTokenId(token.getId());
        token.addTicket(prepaidRide);
        ticketDAO.create(prepaidRide);
        tokenDAO.update(token);
    }
}
