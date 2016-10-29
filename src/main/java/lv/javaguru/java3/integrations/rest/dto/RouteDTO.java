package lv.javaguru.java3.integrations.rest.dto;


import lv.javaguru.java3.core.domain.TransportType;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

public class RouteDTO {
    private Long id;
    private String code;
    private String name;
    private TransportTypeDTO transportType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportTypeDTO getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportTypeDTO transportType) {
        this.transportType = transportType;
    }
}
