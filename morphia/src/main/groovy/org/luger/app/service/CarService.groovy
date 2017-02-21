package org.luger.app.service

import org.bson.types.ObjectId
import org.luger.app.domain.Car

/**
 * Created by gerardo8.
 */
interface CarService {

    Car get(ObjectId id)

    List<Car> getAll()

    Car save(Car car)

    void deleteAll()

}