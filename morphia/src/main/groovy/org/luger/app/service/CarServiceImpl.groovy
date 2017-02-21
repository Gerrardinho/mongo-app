package org.luger.app.service

import org.bson.types.ObjectId
import org.luger.app.domain.Car
import org.luger.app.repository.CarRepository
import org.mongodb.morphia.Key
import org.springframework.stereotype.Service

/**
 * Created by gerardo8.
 */
@Service
class CarServiceImpl implements CarService {

    private final CarRepository carRepository

    CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository
    }

    @Override
    Car get(ObjectId id) {
        this.carRepository.get(id)
    }

    @Override
    List<Car> getAll() {
        this.carRepository.find().asList()
    }

    @Override
    Car save(Car car) {
        Key<Car> carKey = this.carRepository.save(car)
        this.carRepository.get(carKey.getId() as ObjectId)
    }

    @Override
    void deleteAll() {
        this.carRepository.deleteByQuery(this.carRepository.createQuery())
    }
}
