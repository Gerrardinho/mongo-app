package org.luger.app.config

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.bson.types.ObjectId

/**
 * Created by gerardo8.
 */
class ObjectIdSerializer extends JsonSerializer<ObjectId> {

    @Override
    void serialize(ObjectId value, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(value.toString())
    }

}
