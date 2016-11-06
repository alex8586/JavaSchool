package lv.javaguru.java3.commands.trips.tripRegistration;

import lv.javaguru.java3.commands.trips.rides.RideConverter;
import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.database.api.tickets.TokenDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.services.trips.rides.RideFactory;
import lv.javaguru.java3.services.trips.rides.ExistingRideExtractorImpl;

import lv.javaguru.java3.dto.RideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripRegistrationCommandHandler
        implements DomainCommandHandler <TripRegistrationCommand, TripRegistrationResult>{

    @Autowired
    private TerminalDAO terminalDAO;
    @Autowired
    private TokenDAO tokenDAO;
    @Autowired
    private RideConverter rideConverter;
    @Autowired
    private RideFactory rideFactory;

    @Autowired
    private ExistingRideExtractorImpl existingRideExtractor;

    @Override
    public TripRegistrationResult execute(TripRegistrationCommand command) {
        Terminal terminal = terminalDAO.getRequired(command.getTerminalId());

        if(terminal.getTerminalType().getId() != 1){
            throw new IllegalArgumentException();
        }

        Trip trip = terminal.getVehicle().getCurrentTrip();
        Token token = tokenDAO.getById(command.getTokenId());

        System.out.println("trips" + trip);
        System.out.println("token " + token);
        Ride ride = existingRideExtractor.extract(trip,token);
        System.out.println("rides " + ride);
        if(ride == null){
            ride = rideFactory.create(trip,token);
            System.out.println("new rides " + ride);
            trip.getRides().add(ride);
        }
        RideDTO rideDTO = rideConverter.convert(ride);
        return new TripRegistrationResult(rideDTO);
    }

    @Override
    public Class getCommandType() {
        return TripRegistrationCommand.class;
    }
}
