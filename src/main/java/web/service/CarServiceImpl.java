package web.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> returnTheNumberOfCarsByCounter(int counter) {
        List<Car> carList =  carDao.findAll();
        return carList.stream()
                .limit(counter)
                .limit(5)
                .toList();
    }
}
