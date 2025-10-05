package net.salma.pres;


import net.salma.dao.IDao;
import net.salma.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner=new Scanner(new File("config.txt"));

        //Permet de lire la 1ere ligne du file config.txt
        String daoClassName=scanner.nextLine();

        /* on utilise l'instanciation dynamique pour
        créer un objet d'une classe qu'on sait pas son nom.
        forName permet de chargé la classe en mémoire si excite
         */
        Class cDao=Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //Injection avec le constructeur SANS parametre.
        //IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
        //Method setDao = cMetier.getClass().getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier, dao);
        System.out.println("RES= "+metier.calcul());
    }
}