package org.luger.app.repository

import org.bson.Document
import org.bson.types.ObjectId

/**
 * Created by gerardo8.
 */

interface CarRepository {

    void save(Document document)

    List<Document> findAll()

    void dropCollection()

    Document findById(ObjectId id)

}