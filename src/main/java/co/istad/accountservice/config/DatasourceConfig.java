package co.istad.accountservice.config;

import co.istad.accountservice.config.props.DatabaseProps;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DatasourceConfig {

    private final DatabaseProps databaseProps;

    @Bean
    public DataSource pgDataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(databaseProps.getDriver())
                .url(databaseProps.getUrl())
                .username(databaseProps.getUsername())
                .password(databaseProps.getPassword())
                .build();
    }
}
