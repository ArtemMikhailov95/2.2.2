package web.servers;

import web.models.Car;

import java.util.List;

public interface CarServer {

    List<Car> getCar(int count);
}
