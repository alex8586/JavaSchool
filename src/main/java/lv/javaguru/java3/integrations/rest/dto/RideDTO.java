package lv.javaguru.java3.integrations.rest.dto;

import lv.javaguru.java3.core.domain.tickets.Token;

public class RideDTO {

    private Long id;
    private Token token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
