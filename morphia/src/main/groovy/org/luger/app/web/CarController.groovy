package org.luger.app.web

import org.bson.types.ObjectId
import org.luger.app.domain.Car
import org.luger.app.service.CarService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by gerardo8.
 */
@RestController
@RequestMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
class CarController {

    private final CarService carService

    CarController(CarService carService) {
        this.carService = carService
    }

    @GetMapping
    List<Car> getAll() {
        carService.getAll()
    }

    @GetMapping(value = "/{id}")
    Car get(@PathVariable ObjectId id) {
        carService.get(id)
    }

    @PostMapping()
    ResponseEntity<Car> save(@RequestBody Car car) {
       ResponseEntity.ok(carService.save(car))
    }
}
