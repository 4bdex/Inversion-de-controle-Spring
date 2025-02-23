package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // loose coupling
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*1.15; 
         return res;
    }
}