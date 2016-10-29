package lv.javaguru.java3.core.commands.terminals;

import lv.javaguru.java3.core.commands.terminalTypes.TerminalTypeConverter;
import lv.javaguru.java3.core.commands.vehicle.VehicleConverter;
import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTOBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TerminalConverter {

    @Autowired
    VehicleConverter vehicleConverter;

    @Autowired
    TerminalTypeConverter terminalTypeConverter;

    public TerminalDTO convert(Terminal terminal){
        return TerminalDTOBuilder.createTerminalDTO()
                .withId(terminal.getId())
                .withVehicleDTO(vehicleConverter.convert(terminal.getVehicle()))
                .withTerminalTypeDTO(terminalTypeConverter.convert(terminal.getTerminalType()))
                .build();
    }

    public List<TerminalDTO> convert(List<Terminal> list){
        return list.stream().map(terminal -> convert(terminal)).collect(Collectors.toList());
    }
}
