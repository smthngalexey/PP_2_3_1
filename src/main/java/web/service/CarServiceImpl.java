package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carsList = createCarsList();

    @Override
    public List<Car> printCarsListByCount(Integer count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

    private List<Car> createCarsList() {
        carsList = new ArrayList<>();
        carsList.add(new Car("Audi", "A6", "black"));
        carsList.add(new Car("BMW", "X4", "white"));
        carsList.add(new Car("Toyota", "Hilux", "red"));
        carsList.add(new Car("Ford", "Focus", "blue"));
        carsList.add(new Car("Volvo", "S60", "grey"));

        return carsList;
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
