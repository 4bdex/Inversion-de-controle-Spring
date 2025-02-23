package extension;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web Service version");
        double temp=23.5;
        return temp;
    }
}