package lv.javaguru.java3.commands;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CommandManagerImpl implements CommandManager {

    @Autowired
    private List<DomainCommandHandler> commandHandlers;
    private Map<Class, DomainCommandHandler> commandMap;

    @PostConstruct
    public void init() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        commandMap = new HashMap<>();
        if(commandHandlers != null && !commandHandlers.isEmpty()) {
            for (DomainCommandHandler service : commandHandlers) {
                Class domainCommandClass =  getGenericParameter(service.getClass());
                commandMap.put(domainCommandClass, service);
                logger.info("Registring domain command " + domainCommandClass + " for " + service);
            }
        }
    }

    private Class getGenericParameter(Class clazz){
        ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericInterfaces()[0];
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }

    public DomainCommandHandler getCommandHandler(DomainCommand domainCommand) {
        return commandMap.get(domainCommand.getClass());
    }
}
