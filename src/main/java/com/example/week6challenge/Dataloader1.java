package com.example.week6challenge;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader1 implements CommandLineRunner{
    @Autowired
    CarRepository repository;
    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car("Toyota", "camry", "1991", "21,955", "sedan");
        repository.save(car);

        car = new Car("Toyota", "corolla", "1995", "16,955", "sedan");
        repository.save(car);

        car = new Car("Toyota", "zira", "1998", "24,955", "sedan");
        repository.save(car);

        car = new Car("Toyota", "siro", "1996", "26,955", "sedan");
        repository.save(car);

        car = new Car("Toyota", "fifo", "1992", "23,955", "sedan");
        repository.save(car);

        car = new Car("Toyota", "nino", "1998", "25,955", "sedan");
        repository.save(car);
    }

}
