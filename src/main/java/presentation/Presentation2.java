package presentation;

import dao.IDao;
import metier.IMetier;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.util.ResourceUtils;

public class Presentation2 {
    public static void main(String[]args) throws Exception {
        // Injection of dependencies via dynamic instantiation
        try{
            try (Scanner scanner = new Scanner(ResourceUtils.getFile("classpath:config.txt"))) { // leak handling
                String daoClassName = scanner.nextLine();
                Class cDao = Class.forName(daoClassName);
                IDao dao = (IDao) cDao.getConstructor().newInstance();
        
                String MetierClassName = scanner.nextLine();
                Class cMetier = Class.forName(MetierClassName);
                IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        
                Method method = cMetier.getMethod("setDao", IDao.class);
                method.invoke(metier, dao);
                System.out.println("Result : " + metier.calcul());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 


}