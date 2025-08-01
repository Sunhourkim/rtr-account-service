package co.istad.accountservice;

import co.istad.accountservice.config.props.DatabaseProps;
import co.istad.accountservice.config.props.ServiceInfoProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {
        DatabaseProps.class,
        ServiceInfoProps.class
})
@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

}
