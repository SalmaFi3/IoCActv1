package net.salma.pres;

import net.salma.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.salma");
        IMetier metier =  applicationContext.getBean(IMetier.class);
        System.out.println("RES= "+metier.calcul());
    }

}
