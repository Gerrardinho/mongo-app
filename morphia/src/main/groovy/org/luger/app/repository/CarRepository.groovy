package org.luger.app.repository

import org.bson.types.ObjectId
import org.luger.app.domain.Car
import org.mongodb.morphia.dao.DAO

/**
 * Created by gerardo8.
 */
interface CarRepository extends DAO<Car, ObjectId> {

}