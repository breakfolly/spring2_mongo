package config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableJpaRepositories
@EnableMongoRepositories(basePackages = "com.boilerplate.springmongo.repositories")
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private String port;

    @Value("${spring.data.mongodb.database}")
    private String database;

    @Value("${spring.data.mongodb.min-connections-per-host}")
    private Integer minConnectionsPerHost;

    @Bean(name = "mongoClient")
    @Override
    public MongoClient mongoClient() {
        return (new MongoClient(this.host, Integer.valueOf(this.port)));
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }

}
