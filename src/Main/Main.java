package Main;

import Packets.Interfaces.Abstract.AbstracFactory;
import Packets.Interfaces.Classes.FactoryProducer;
import Packets.Interfaces.DEtalii;
import Packets.Interfaces.Tigari;

/**
 * Created by Ciobotaru on 16.11.2014.
 */
public class Main {

    public static void main() {
        AbstracFactory TigariFactory = FactoryProducer.getFactory("Tigari");

        Tigari tigari1 = TigariFactory.getTigari("Dunhill");

        tigari1.printDetalii();

        Tigari tigari2 = TigariFactory.getTigari("Kent8");

        tigari2.printDetalii();

        AbstracFactory DetaliiFactory=FactoryProducer.getFactory("detalii");

        DEtalii detalii1= DetaliiFactory.getDetalii("Nicotina");
        detalii1.print_detalii();


        DEtalii detalii2= DetaliiFactory.getDetalii("Gudron");
        detalii2.print_detalii();
    }
}
