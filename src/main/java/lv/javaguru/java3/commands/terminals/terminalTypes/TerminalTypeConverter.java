package lv.javaguru.java3.commands.terminals.terminalTypes;

import lv.javaguru.java3.domain.terminals.TerminalType;
import lv.javaguru.java3.dto.TerminalTypeDTO;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import static lv.javaguru.java3.dto.builders.TerminalTypeDTOBuilder.createTerminalTypeDTO;


@Component
public class TerminalTypeConverter {

    public TerminalTypeDTO convert(TerminalType terminalType){
        return createTerminalTypeDTO()
                .withId(terminalType.getId())
                .withName(terminalType.getName())
                .build();
    }

    public List<TerminalTypeDTO> convert(List<TerminalType> terminalType){
        return terminalType.stream().map(type -> convert(type)).collect(Collectors.toList());
    }
}
