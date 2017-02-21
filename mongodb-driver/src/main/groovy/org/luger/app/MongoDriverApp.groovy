package org.luger.app

import org.bson.Document
import org.luger.app.service.CarService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by gerardo8.
 */

@SpringBootApplication
class MongoDriverApp {

    private static final Logger log = LoggerFactory.getLogger(MongoDriverApp)

    @Bean
    init(CarService carService) {
        { clr ->

            carService.deleteAll()

            Map<String, Object> map = new HashMap<>()
            map.put("make", "Chevrolet")
            map.put("model", "Camaro")
            map.put("year", 1970)

            carService.save(new Document(map))

            map.replace("year", "1970")

            carService.save(new Document(map))

            map.replace("year", new Date())

            carService.save(new Document(map))

            def cars = carService.findAll()

            cars.each {
                car -> println car
            }

        } as CommandLineRunner
    }

    static void main(String[] args) {
        SpringApplication.run(MongoDriverApp, args)
    }

}
