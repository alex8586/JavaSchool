package lv.javaguru.java3.integrations.rest.dto;


import lv.javaguru.java3.core.domain.Route;
import lv.javaguru.java3.core.domain.TransportType;

public class TransportTypeDTOBuilder {
    private Long id;
    private String code;
    private String name;

    private TransportTypeDTOBuilder() {

    }

    public static TransportTypeDTOBuilder createTransportTypeDTO() {
        return new TransportTypeDTOBuilder();
    }

    public TransportTypeDTO build() {
        TransportTypeDTO transportTypeDTO = new TransportTypeDTO();
        transportTypeDTO.setId(id);
        transportTypeDTO.setName(name);
        transportTypeDTO.setCode(code);
        return transportTypeDTO;
    }

    public static TransportTypeDTO buildFromTransportType(TransportType transportType){
        TransportTypeDTO transportTypeDTO = new TransportTypeDTO();
        transportTypeDTO.setId(transportType.getId());
        transportTypeDTO.setName(transportType.getName());
        transportTypeDTO.setCode(transportType.getCode());
        return transportTypeDTO;
    }

    public TransportTypeDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public TransportTypeDTOBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public TransportTypeDTOBuilder withName(String name) {
        this.name = name;
        return this;
    }
}
