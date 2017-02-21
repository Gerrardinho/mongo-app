package org.luger.app.config

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.core.JsonTokenId
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.bson.types.ObjectId

/**
 * Created by gerardo8.
 */
class ObjectIdDeserializer extends JsonDeserializer<ObjectId> {

    @Override
    ObjectId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        if (p.hasTokenId(JsonTokenId.ID_STRING)) {
            String string = p.getText().trim();
            if (string.length() != 24) {
                return null
            }
            new ObjectId(p.getText())
        }

    }
}
