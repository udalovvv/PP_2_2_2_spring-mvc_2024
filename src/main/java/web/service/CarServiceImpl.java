package web.service;
import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    static List<Car> carList = new ArrayList<>();
    private static long COUNT = 1;

    static {
        carList.add(new Car(COUNT++, "BMW", "1-series", 2f, "white"));
        carList.add(new Car(COUNT++, "BMW", "2-series", 2f, "black"));
        carList.add(new Car(COUNT++, "BMW", "3-series", 2f, "green"));
        carList.add(new Car(COUNT++, "BMW", "4-series", 2f, "yellow"));
        carList.add(new Car(COUNT++, "BMW", "5-series", 2f, "blue"));
    }


    @Override
    public List<Car> returnTheNumberOfCarsByCounter(int counter) {
        return carList.stream()
                .limit(counter)
                .limit(5)
                .toList();
    }
}
