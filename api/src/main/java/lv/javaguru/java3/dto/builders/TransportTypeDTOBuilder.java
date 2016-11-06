package lv.javaguru.java3.dto.builders;


import lv.javaguru.java3.dto.TransportTypeDTO;

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
