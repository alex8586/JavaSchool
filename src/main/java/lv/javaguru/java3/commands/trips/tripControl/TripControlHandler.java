package lv.javaguru.java3.commands.trips.tripControl;

import lv.javaguru.java3.commands.trips.rides.RideConverter;
import lv.javaguru.java3.commands.DomainCommandHandler;
import lv.javaguru.java3.database.api.termnals.TerminalDAO;
import lv.javaguru.java3.database.api.tickets.TokenDAO;
import lv.javaguru.java3.database.api.vehicles.VehicleDAO;
import lv.javaguru.java3.domain.terminals.Terminal;
import lv.javaguru.java3.domain.tickets.Token;
import lv.javaguru.java3.domain.trips.Ride;
import lv.javaguru.java3.domain.trips.Trip;
import lv.javaguru.java3.domain.vehicles.Vehicle;
import lv.javaguru.java3.dto.RideDTO;
import lv.javaguru.java3.services.trips.rides.ExistingRideExtractorImpl;
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

        //controllers termin is not connected to specific vehicles
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
