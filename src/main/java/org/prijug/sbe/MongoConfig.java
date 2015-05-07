package org.prijug.sbe;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "sample3";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
}