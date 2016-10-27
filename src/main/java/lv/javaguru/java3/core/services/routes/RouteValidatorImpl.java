package lv.javaguru.java3.core.services.routes;

import org.springframework.stereotype.Component;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import static org.apache.commons.lang.StringUtils.isBlank;

@Component
public class RouteValidatorImpl implements RouteValidator {

    @Override
    public void validate(String code, String name) {
        validateCode(code);
        validateName(name);
    }

    private void validateCode(String code) {
        checkNotNull(code, "Route code must not be null");
        checkArgument(!isBlank(code), "Route code must not be empty");
        checkState(code.length() <= 5, "Route code must be 5 letter long at max");
    }

    private void validateName(String name) {
        checkNotNull(name, "Route name must not be null");
        checkArgument(!isBlank(name), "Route name must not be empty");
        checkState(name.length() <= 50, "Route name must be 50 letter long at max");
    }
}
