package hattasugiarto.spring.core.event;

import hattasugiarto.spring.core.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {
    @Getter
    private final User user;

    public LoginSuccessEvent(User user){
        super(user);
        this.user = user;
    }

}
