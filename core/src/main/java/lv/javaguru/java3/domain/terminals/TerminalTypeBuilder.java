package lv.javaguru.java3.domain.terminals;

public class TerminalTypeBuilder {

    private Long id;
    private String name;

    private TerminalTypeBuilder(){

    }

    public static TerminalTypeBuilder createTerminalType(){
        return new TerminalTypeBuilder();
    }

    public TerminalType build(){
        TerminalType terminalType = new TerminalType();
        terminalType.setId(id);
        terminalType.setName(name);
        return terminalType;
    }

    public TerminalTypeBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TerminalTypeBuilder withName(String name){
        this.name = name;
        return this;
    }

}
