package org.luger.app.repository

import org.bson.types.ObjectId
import org.luger.app.domain.Car
import org.mongodb.morphia.Datastore
import org.mongodb.morphia.dao.BasicDAO
import org.springframework.stereotype.Repository

/**
 * Created by gerardo8.
 */
@Repository
class CarRepositoryImpl extends BasicDAO<Car, ObjectId> implements CarRepository {

    protected CarRepositoryImpl(Datastore datastore) {
        super(datastore)
    }

}
