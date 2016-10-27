package lv.javaguru.java3.core.domain;

public class TerminalBuilder {

    private Long id;
    private Long vehicleId;
    private Long terminalType;

    private TerminalBuilder(){

    }

    public static TerminalBuilder createTerminal(){
        return new TerminalBuilder();
    }

    public Terminal build(){
        Terminal terminal = new Terminal();
        terminal.setId(id);
        terminal.setVehicleId(vehicleId);
        terminal.setTerminalType(terminalType);
        return terminal;
    }

    public TerminalBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalBuilder withVehicleId(Long vehicleId){
        this.vehicleId = vehicleId;
        return this;
    }

    public TerminalBuilder withTerminalType(Long terminalType){
        this.terminalType = terminalType;
        return this;
    }
}
