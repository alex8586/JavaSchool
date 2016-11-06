package lv.javaguru.java3.dto.builders;

import lv.javaguru.java3.dto.TerminalTypeDTO;

public class TerminalTypeDTOBuilder {

    private Long id;
    private String name;

    private TerminalTypeDTOBuilder(){

    }

    public static TerminalTypeDTOBuilder createTerminalTypeDTO(){
        return new TerminalTypeDTOBuilder();
    }

    public TerminalTypeDTO build(){
        TerminalTypeDTO terminalTypeDTO = new TerminalTypeDTO();
        terminalTypeDTO.setId(id);
        terminalTypeDTO.setName(name);
        return terminalTypeDTO;
    }

    public TerminalTypeDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalTypeDTOBuilder withName(String name){
        this.name = name;
        return this;
    }
}
