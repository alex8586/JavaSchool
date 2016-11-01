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
    private RideDAO rideDAO;
    @Autowired
    private RideConverter rideConverter;
    @Autowired
    private RideFactory rideFactory;

    @Override
    public TripRegistrationResult execute(TripRegistrationCommand command) {
        Terminal terminal = terminalDAO.getRequired(command.getTerminalId());

        if(terminal.getTerminalType().getId() != 1){
            //return error - you can't register ticket on this kind of terminal
        }

        Trip trip = terminal.getVehicle().getCurrentTrip();
        Token token = tokenDAO.getById(command.getTokenId());

        //This should be separated service which used by controllers as well
        Ride ride = null;
        for (Ride existingRide : trip.getRides()) {
            if(ride.getTridId() == trip.getId()) {
                ride = existingRide;
                break;
            }
        }
        //This should be separated service which used by controllers as well

        if(ride == null){
            ride = rideFactory.create(trip,token);
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
