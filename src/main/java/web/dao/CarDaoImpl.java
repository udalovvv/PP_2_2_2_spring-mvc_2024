package web.dao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import web.entity.Car;
import java.util.List;
import org.hibernate.query.Query;

@Repository
public class CarDaoImpl implements CarDao{

    private final SessionFactory sessionFactory;

    public CarDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Car> findAll() {
        String hql = "SELECT car FROM Car car";
        Query<Car> query = sessionFactory.getCurrentSession().createQuery(hql, Car.class);
        return query.getResultList();
    }
}
