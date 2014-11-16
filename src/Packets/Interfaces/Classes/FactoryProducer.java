package Packets.Interfaces.Classes;

import Packets.Interfaces.Abstract.AbstracFactory;
import Packets.Interfaces.Abstract.DetaliiFactory;
import Packets.Interfaces.Abstract.TigariFactory;

/**
 * Created by Ciobotaru on 16.11.2014.
 */
public class FactoryProducer {

    public static AbstracFactory getFactory(String alege) {
        if (alege.equalsIgnoreCase("Tigari"))
            return new TigariFactory();
        else if (alege.equalsIgnoreCase("Detalii"))
            return new DetaliiFactory();

        return null;
    }
}
