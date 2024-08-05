package com.stagesync.stagesyncapp.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    private final String mongoUri;
    private final String database;

    public MongoConfig(@Value("${MONGODB_DATABASE:dummy_database}") String database,
                       @Value("${MONGODB_URI:mongodb://localhost:27017}") String mongoUri) {
        this.database = database;
        this.mongoUri = mongoUri;
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(mongoUri);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, getDatabaseName());
    }
}