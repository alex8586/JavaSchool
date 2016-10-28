package lv.javaguru.java3.core.domain;

public class TerminalBuilder {

    private Long id;
    private Vehicle vehicle;
    private TerminalType terminalType;

    private TerminalBuilder(){

    }

    public static TerminalBuilder createTerminal(){
        return new TerminalBuilder();
    }

    public Terminal build(){
        Terminal terminal = new Terminal();
        terminal.setId(id);
        terminal.setVehicle(vehicle);
        terminal.setTerminalType(terminalType);
        return terminal;
    }

    public TerminalBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalBuilder withVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return this;
    }

    public TerminalBuilder withTerminalType(TerminalType terminalType){
        this.terminalType = terminalType;
        return this;
    }
}
