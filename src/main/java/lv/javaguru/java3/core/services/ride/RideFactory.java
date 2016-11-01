package lv.javaguru.java3.core.services.ride;

import lv.javaguru.java3.core.domain.Ride;
import lv.javaguru.java3.core.domain.tickets.Token;

public interface RideFactory {

    Ride create(Token token);
}
