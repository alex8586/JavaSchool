package lv.javaguru.java3;


import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import lv.javaguru.java3.database.api.ClientResource;
import lv.javaguru.java3.database.api.RouteResource;
import lv.javaguru.java3.database.api.TerminalResource;
import lv.javaguru.java3.dto.RouteDTO;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.List;

public class Main {

    public static void main(String[] args){
        RouteResource routeResource;
        String url = "http://localhost:8080";

        routeResource = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .contract(new JAXRSContract())
                .target(RouteResource.class, url);

        List<RouteDTO> list = routeResource.getAll();
        String output = "";
        for (RouteDTO routeDTO : list) {
            System.out.println(routeDTO.getId() + " " + routeDTO.getCode() + " " + routeDTO.getName() + " " +
                               routeDTO.getTransportType().getId() + " " + routeDTO.getTransportType().getName() + " " +
                                routeDTO.getTransportType().getCode());
            output += routeDTO;
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        try {
            String result = (String) clipboard.getData(DataFlavor.stringFlavor);
            System.out.println("String from Clipboard:" + result);

            Transferable transferable = new StringSelection("booz");

            clipboard.

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
