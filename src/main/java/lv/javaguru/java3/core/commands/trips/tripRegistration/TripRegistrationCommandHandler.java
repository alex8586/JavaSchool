package lv.javaguru.java3.core.commands.trips.tripRegistration;

import lv.javaguru.java3.core.commands.trips.RideConverter;
import lv.javaguru.java3.core.commands.trips.TokenConverter;
import lv.javaguru.java3.core.database.RideDAO;
import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.domain.*;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.ride.RideFactory;
import lv.javaguru.java3.core.services.trip.ExistingRideExtractorImpl;
import lv.javaguru.java3.integrations.rest.dto.RideDTO;
import lv.javaguru.java3.integrations.rest.dto.TokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

        System.out.println("trip" + trip);
        System.out.println("token " + token);
        Ride ride = existingRideExtractor.extract(trip,token);
        System.out.println("ride " + ride);
        if(ride == null){
            ride = rideFactory.create(trip,token);
            System.out.println("new ride " + ride);
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
