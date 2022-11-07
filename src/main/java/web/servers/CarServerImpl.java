package web.servers;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServerImpl implements CarServer{

    private final CarDAO carDAO;

    public CarServerImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCar(int count) {
        return carDAO.getCars(count);
    }
}
