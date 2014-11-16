package Packets.Interfaces.Abstract;

import Packets.Interfaces.Classes.Co2;
import Packets.Interfaces.Classes.Gudron;
import Packets.Interfaces.Classes.Nicotina;
import Packets.Interfaces.DEtalii;
import Packets.Interfaces.Tigari;

/**
 * Created by Ciobotaru on 16.11.2014.
 */
public class DetaliiFactory extends AbstracFactory{

    @Override
    public Tigari getTigari(String Tigari)
    {
        return null;
    }
    @Override
    public DEtalii getDetalii(String TipDEtalii) {
        if (TipDEtalii == null) {
            return null;
        }
        if (TipDEtalii.equalsIgnoreCase("Nicotina"))
        {
            return new Nicotina();
        }
        if (TipDEtalii.equalsIgnoreCase("Gudron"))
        {
            return new Gudron();
        }

        if (TipDEtalii.equalsIgnoreCase("Co2"))
        {
            return new Co2();
        }
        return  null    ;
    }
}
