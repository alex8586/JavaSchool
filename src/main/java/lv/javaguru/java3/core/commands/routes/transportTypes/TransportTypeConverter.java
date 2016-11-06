package lv.javaguru.java3.core.commands.routes.transportTypes;

import lv.javaguru.java3.core.domain.TransportType;
import lv.javaguru.java3.dto.TransportTypeDTO;
import lv.javaguru.java3.dto.builders.TransportTypeDTOBuilder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TransportTypeConverter {

    public TransportTypeDTO convert(TransportType transportType){
        System.out.println(transportType);
        return TransportTypeDTOBuilder.createTransportTypeDTO()
                .withId(transportType.getId())
                .withName(transportType.getName())
                .withCode(transportType.getCode())
                .build();
    }

    public List<TransportTypeDTO> convert(List<TransportType> transportTypes){
        return transportTypes.stream().map(this::convert).collect(Collectors.toList());
    }

}
