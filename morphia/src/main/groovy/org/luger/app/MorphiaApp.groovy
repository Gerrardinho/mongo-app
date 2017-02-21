package org.luger.app

import org.luger.app.domain.Car
import org.luger.app.repository.CarRepository
import org.luger.app.service.CarService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by gerardo8.
 */
@SpringBootApplication
class MorphiaApp {

    @Bean
    init(CarService carService) {
        { clr ->
            carService.deleteAll()
            carService.save(new Car("Chevrolet", "Camaro", 1971))
        } as CommandLineRunner
    }

    static void main(String[] args) {
        SpringApplication.run(MorphiaApp, args)
    }

}
