package dao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao  {
    @Override
    public double getData() {
        System.out.println("Database version");
        double temp= 24.5;
        return temp;
    }
}