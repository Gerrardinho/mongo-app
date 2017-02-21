package org.luger.app.service

import org.bson.Document
import org.bson.types.ObjectId

/**
 * Created by gerardo8.
 */
interface CarService {

    void save(Document document)

    List<Document> findAll()

    void deleteAll()

    Document findById(ObjectId id)

}