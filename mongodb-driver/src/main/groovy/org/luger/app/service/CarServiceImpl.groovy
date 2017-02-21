package org.luger.app.service

import org.bson.Document
import org.bson.types.ObjectId
import org.luger.app.repository.CarRepository
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
    void save(Document document) {
        this.carRepository.save(document)
    }

    @Override
    List<Document> findAll() {
        this.carRepository.findAll()
    }

    @Override
    void deleteAll() {
        this.carRepository.dropCollection()
    }

    @Override
    Document findById(ObjectId id) {
        this.carRepository.findById(id)
    }
}
