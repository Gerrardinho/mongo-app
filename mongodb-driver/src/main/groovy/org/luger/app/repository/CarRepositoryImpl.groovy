package org.luger.app.repository

import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document
import org.bson.types.ObjectId
import org.springframework.stereotype.Repository

import static com.mongodb.client.model.Filters.eq

/**
 * Created by gerardo8.
 */
@Repository
class CarRepositoryImpl implements CarRepository {

    private final MongoCollection<Document> collection

    CarRepositoryImpl(MongoDatabase mongoDatabase) {
        this.collection = mongoDatabase.getCollection("cars")
    }

    @Override
    void save(Document document) {
        this.collection.insertOne(document)
    }

    @Override
    List<Document> findAll() {
        this.collection.find().asList()
    }

    @Override
    void dropCollection() {
        this.collection.drop()
    }

    @Override
    Document findById(ObjectId id) {
        this.collection.find(eq("_id", id)).first()
    }
}
