package org.luger.app.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by gerardo8.
 */
@Document
class Car {

    @Id
    String id

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
