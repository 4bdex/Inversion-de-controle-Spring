package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationXML {
    public static void main(String[] args) {
        // Injection of dependencies via XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Result : " + metier.calcul());
    }
}
