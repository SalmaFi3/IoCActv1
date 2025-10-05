package net.salma.pres;

import net.salma.dao.DaoImpl;
import net.salma.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);

        //Injection de dépendances relies les 2 objets
        //metier.setDao(d);
        System.out.println("RES= "+metier.calcul());
    }
}
