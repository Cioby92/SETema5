package Packets.Interfaces.Abstract;

import Packets.Interfaces.DEtalii;
import Packets.Interfaces.Tigari;

/**
 * Created by Ciobotaru on 16.11.2014.
 */
public abstract class AbstracFactory {
    public abstract Tigari getTigari(String TipTigari);
    public  abstract DEtalii getDetalii(String DEtalii);
}
