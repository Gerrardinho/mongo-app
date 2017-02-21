package org.luger.app.domain

import org.bson.types.ObjectId
import org.mongodb.morphia.annotations.Entity
import org.mongodb.morphia.annotations.Id

/**
 * Created by gerardo8.
 */
@Entity("cars")
class Car {

    @Id
    ObjectId id

    String make

    String model

    int year

    Car() {
    }

    Car(String make, String model, int year) {
        this.make = make
        this.model = model
        this.year = year
    }
}
