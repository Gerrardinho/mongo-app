package org.luger.app.config

import com.fasterxml.jackson.databind.module.SimpleModule
import org.bson.types.ObjectId
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

/**
 * Created by gerardo8.
 */
@Configuration
class AppConfig {

    @Bean
    Jackson2ObjectMapperBuilder objectMapper() {
        SimpleModule objectIdModule = new SimpleModule("ObjectIdModule");
        objectIdModule.addSerializer(ObjectId, new ObjectIdSerializer())
        objectIdModule.addDeserializer(ObjectId, new ObjectIdDeserializer())
        Jackson2ObjectMapperBuilder.json().modulesToInstall(
                objectIdModule
        )
    }
}
