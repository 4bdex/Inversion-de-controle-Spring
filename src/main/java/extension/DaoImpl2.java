package extension;

import org.springframework.stereotype.Component;

import dao.IDao;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web Service version");
        double temp=23.5;
        return temp;
    }
}