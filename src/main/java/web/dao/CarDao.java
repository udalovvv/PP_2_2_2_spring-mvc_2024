package web.dao;

import web.entity.Car;

import java.util.List;

public interface CarDao {

    List<Car> findAll();
}
