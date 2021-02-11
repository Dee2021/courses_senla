import com.container.Box;
import com.container.Cone;
import com.container.Container;
import com.container.Cylinder;
import com.structure.Deck;
import com.structure.Port;
import com.structure.Ship;

public class Main {

    public static void main(String[] args) {

//        Container.Density a = Container.Density.DENSITY1000;


        Box box1 = new Box(false,Container.Density.DENSITY1000);
        Box box2 = new Box(false,Container.Density.DENSITY1000);
        Cylinder cylinder1 = new Cylinder(true,Container.Density.DENSITY1000);
        Cone cone1 = new Cone(true,Container.Density.DENSITY1000);

        Deck deck = new Deck();
        Deck deck2 = new Deck();
        deck.AddContainer(box1);
        deck.AddContainer(box2);
        deck2.AddContainer(cylinder1);
        deck2.AddContainer(cone1);

        Ship ship1 = new Ship(1);
        Ship ship2 = new Ship(2);

        ship1.AddDeck(deck);
        ship2.AddDeck(deck);
        ship2.AddDeck(deck2);


        Port port = new Port();

        port.Add(ship1);
        port.Add(ship2);










//        System.out.println("Высота контейнера: " + box1.height);
        System.out.println("Масса: " + box1.MassCont() + " ед.");

//        System.out.println("Высота контейнера: " + box2.height);
        System.out.println("Масса: " + box2.MassCont() + " ед.");

//        System.out.println("Высота контейнера: " + cylinder1.height);
        System.out.println("Масса: " + cylinder1.MassCont() + " ед.");

//        System.out.println("Высота контейнера: " + cone1.height);
        System.out.println("Масса: " + cone1.MassCont() + " ед.");






        System.out.println("Масса воды, которую привозят корабли: " + port.MassPort());

    }






}
