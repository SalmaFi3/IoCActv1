package net.salma.ext;

import net.salma.dao.IDao;

    public class DaoImplV2 implements IDao {
        @Override
        public double getData() {
            System.out.println("Version Capteur ...");
            double t=12;
            return t;
        }
    }


