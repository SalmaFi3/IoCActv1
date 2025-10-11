package net.salma.metier;
import net.salma.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component ("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("dV2")
    private IDao dao; //couplage faible car elle depend de l'interface IDao

    //Injecter ds l'attribut dao un objet d'une classe qui implemente l'interface IDao au moment de l'instanciation

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }

    //Injecter ds l'attribut dao un objet d'une classe qui implemente l'interface IDao après instanciation

     public void setDao(IDao dao) {
        this.dao = dao;
    }

}
