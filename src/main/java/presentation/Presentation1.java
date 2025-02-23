package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {
    public static void main(String[]args){
        /* Injection of dependencies via static instantiation */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Result : " + metier.calcul());
    }
}