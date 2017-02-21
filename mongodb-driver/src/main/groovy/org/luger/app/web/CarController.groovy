package org.luger.app.web

import org.bson.Document
import org.bson.types.ObjectId
import org.luger.app.service.CarService
import org.springframework.http.MediaType
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
    List<Document> findAll() {
        this.carService.findAll()
    }

    @GetMapping(value = "/{id}")
    Document findById(@PathVariable ObjectId id) {
        this.carService.findById(id)
    }

    @PostMapping
    void save(@RequestBody Document document) {
        this.carService.save(document)
    }
}
