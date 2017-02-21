package org.luger.app.repository

import org.luger.app.domain.Car
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by gerardo8.
 */
interface CarRepository extends MongoRepository<Car, String> {

}