package lv.javaguru.java3.core.commands.trips.tripControl;

import lv.javaguru.java3.core.commands.trips.RideConverter;
import lv.javaguru.java3.core.commands.trips.tripRegistration.TripRegistrationCommand;
import lv.javaguru.java3.core.commands.trips.tripRegistration.TripRegistrationResult;
import lv.javaguru.java3.core.database.TerminalDAO;
import lv.javaguru.java3.core.database.TokenDAO;
import lv.javaguru.java3.core.database.VehicleDAO;
import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.core.domain.Trip;
import lv.javaguru.java3.core.domain.Vehicle;
import lv.javaguru.java3.core.domain.tickets.Token;
import lv.javaguru.java3.core.services.DomainCommandHandler;
import lv.javaguru.java3.core.services.trip.ExistingRideExtractorImpl;
import lv.javaguru.java3.dto.RideDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripControlHandler implements DomainCommandHandler<TripControlCommand, TripControlResult> {

    @Autowired
    private ExistingRideExtractorImpl existingRideExtractor;
    @Autowired
    private TerminalDAO terminalDAO;
    @Autowired
    private TokenDAO tokenDAO;
    @Autowired
    private VehicleDAO vehicleDAO;

    @Autowired
    private RideConverter rideConverter;

    @Override
    public TripControlResult execute(TripControlCommand command) {
        Terminal terminal = terminalDAO.getRequired(command.getTerminalId());
        if(terminal.getTerminalType().getId() != 2){
            throw new IllegalArgumentException();
        }

        //controllers terminal is not connected to specific vehicle
        Vehicle vehicle = vehicleDAO.getByCode(command.getVehicleCode());
        Trip trip = vehicle.getCurrentTrip();
        Token token = tokenDAO.getById(command.getTokenId());
        Ride ride = existingRideExtractor.extract(trip,token);
        if(ride!= null) {
            RideDTO rideDTO = rideConverter.convert(ride);
            return new TripControlResult(rideDTO);
        }
        else{
            return new TripControlResult(null);
        }
    }

    @Override
    public Class getCommandType() {
        return TripControlCommand.class;
    }
}
