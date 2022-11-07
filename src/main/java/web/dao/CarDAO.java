package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "lada", 2101));
        cars.add(new Car(2, "lada", 2102));
        cars.add(new Car(3, "lada", 2103));
        cars.add(new Car(4, "lada", 2104));
        cars.add(new Car(5, "lada", 2105));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
