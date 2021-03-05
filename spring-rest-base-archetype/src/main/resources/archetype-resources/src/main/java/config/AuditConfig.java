package ${package}.config;

import ${package}.model.security.User;
import ${package}.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"${package}"})
@EnableTransactionManagement
@EnableJpaAuditing
public class AuditConfig {

    private final UserService userService;

    public AuditConfig(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public AuditorAware<User> auditorProvider() {
        return new AuditorAwareImpl(userService);
    }

}
