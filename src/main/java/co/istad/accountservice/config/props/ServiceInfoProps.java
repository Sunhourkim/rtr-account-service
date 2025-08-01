package co.istad.accountservice.config.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service")
@Getter
@Setter
public class ServiceInfoProps {
    private  String info;
    private  String version;
}
