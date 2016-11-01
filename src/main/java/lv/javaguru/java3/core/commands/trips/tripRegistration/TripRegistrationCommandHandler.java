package lv.javaguru.java3.core.commands.trips.tripRegistration;

import lv.javaguru.java3.core.commands.trips.TokenDTOConverter;
import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.domain.*;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.ride.RideFactory;
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
    private RideFactory rideFactory;
    @Autowired
    private TokenDTOConverter tokenDTOConverter;

    @Override
    public TripRegistrationResult execute(TripRegistrationCommand command) {
        Terminal terminal = terminalDAO.getRequired(command.getTerminalId());
        TerminalType terminalType = terminal.getTerminalType();
        if(terminalType.getId() != 1){
//            return error - you can't register ticket on this kind of terminal
        }
        Vehicle currentVehicle = terminal.getVehicle();
        Trip trip = currentVehicle.getCurrentTrip();
        Token token = tokenDAO.getById(command.getTokenId());
        List<Ride> rideList = trip.getRides();

        Ride ride = rideFactory.create(token);
        rideList.add(ride);

        TokenDTO tokenDTO = tokenDTOConverter.convert(token, ride);

        return new TripRegistrationResult(tokenDTO);
    }

    @Override
    public Class getCommandType() {
        return TripRegistrationCommand.class;
    }
}
