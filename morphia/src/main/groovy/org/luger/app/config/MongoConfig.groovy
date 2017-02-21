package org.luger.app.config

import com.mongodb.MongoClient
import org.mongodb.morphia.Datastore
import org.mongodb.morphia.Morphia
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by gerardo8.
 */
@Configuration
class MongoConfig {

    @Bean
    Datastore datastore() {
        Morphia morphia = new Morphia()
        morphia.mapPackage("org.luger.app.domain")

        Datastore datastore = morphia.createDatastore(new MongoClient(), "morphia_app")
        datastore.ensureIndexes()
        datastore
    }
}
