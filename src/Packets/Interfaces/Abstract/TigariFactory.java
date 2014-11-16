package Packets.Interfaces.Abstract;

import Packets.Interfaces.Classes.Davidoff;
import Packets.Interfaces.Classes.Dunhill;
import Packets.Interfaces.Classes.Kent8;
import Packets.Interfaces.DEtalii;
import Packets.Interfaces.Tigari;

/**
 * Created by Ciobotaru on 16.11.2014.
 */
public class TigariFactory extends AbstracFactory {
   @Override
    public Tigari getTigari(String TipTigari) {

       if (TipTigari == null) {
            return null;
        }
        if (TipTigari.equalsIgnoreCase("Dunhill")) {
            return new Dunhill();
        }
        if (TipTigari.equalsIgnoreCase("Kent8")) {
            return new Kent8();

        }
        if (TipTigari.equalsIgnoreCase("Davidoff")) {
            return new Davidoff();
        }
        return null;
    }


   public  DEtalii getDetalii(String Deatalii)
    {
        return   null;
    }
    }

