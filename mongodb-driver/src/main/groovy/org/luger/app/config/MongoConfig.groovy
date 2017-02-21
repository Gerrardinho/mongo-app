package org.luger.app.config

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by gerardo8.
 */

@Configuration
class MongoConfig {

    @Bean
    MongoDatabase mongoDatabase() {
        MongoClient mongoClient = new MongoClient()
        MongoDatabase database = mongoClient.getDatabase("mongo_driver_app")
        database
    }

}
