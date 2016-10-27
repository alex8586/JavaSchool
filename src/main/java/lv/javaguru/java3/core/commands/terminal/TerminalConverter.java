package lv.javaguru.java3.core.commands.terminal;

import lv.javaguru.java3.core.domain.Terminal;
import lv.javaguru.java3.integrations.rest.dto.TerminalDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static lv.javaguru.java3.integrations.rest.dto.TerminalDTOBuilder.createTerminalDTO;

@Component
public class TerminalConverter {

    public TerminalDTO convert(Terminal terminal){

        return createTerminalDTO()
                .withId(terminal.getId())
                .withVehicleId(terminal.getVehicleId())
                .withTerminalTypeId(terminal.getTerminalType())
                .build();
    }

    public List<TerminalDTO> convert(List<Terminal> list){
        return list.stream().map(terminal -> convert(terminal)).collect(Collectors.toList());
    }
}
