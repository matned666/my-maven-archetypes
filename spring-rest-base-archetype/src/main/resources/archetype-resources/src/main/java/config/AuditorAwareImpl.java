package ${package}.config;

import ${package}.model.security.User;
import ${package}.service.UserService;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<User> {

    private UserService userService;

    public AuditorAwareImpl(UserService userService) {
        this.userService = userService;
    }

    @NonNull
    @Override
    public Optional<User> getCurrentAuditor() {
        return userService.getAuditor();
    }
}
