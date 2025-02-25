package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {
    public static void main(String[] args){
        // Injection of dependencies via annotations
        ApplicationContext context=new AnnotationConfigApplicationContext("extension","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("Result : " + metier.calcul());
    }
}