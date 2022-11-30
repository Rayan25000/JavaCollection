import java.util.ArrayList;
import java.util.Collection;

public class TestSavane extends Savane {

    public static void main(String[] args) {

        //création de 10 zebres
        Zebre z1 = new Zebre("Zebre1", "male");
        listAnimal.add(z1);
        Zebre z2 = new Zebre("Zebre2", "male");
        listAnimal.add(z2);
        Zebre z3 = new Zebre("Zebre3", "male");
        listAnimal.add(z3);
        Zebre z4 = new Zebre("Zebre4", "male");
        listAnimal.add(z4);
        Zebre z5 = new Zebre("Zebre5", "male");
        listAnimal.add(z5);
        Zebre z6 = new Zebre("Zebre6", "femelle");
        listAnimal.add(z6);
        Zebre z7 = new Zebre("Zebre7", "femelle");
        listAnimal.add(z7);
        Zebre z8 = new Zebre("Zebre8", "femelle");
        listAnimal.add(z8);
        Zebre z9 = new Zebre("Zebre9", "femelle");
        listAnimal.add(z9);
        Zebre z10 = new Zebre("Zebre10", "femelle");
        listAnimal.add(z10);

        //création de 10 lion
        Lion l1 = new Lion("Lion1", "male");
        listAnimal.add(l1);
        Lion l2 = new Lion("Lion2", "male");
        listAnimal.add(l2);
        Lion l3 = new Lion("Lion3", "male");
        listAnimal.add(l3);
        Lion l4 = new Lion("Lion4", "male");
        listAnimal.add(l4);
        Lion l5 = new Lion("Lion5", "male");
        listAnimal.add(l5);
        Lion l6 = new Lion("Lion6", "femelle");
        listAnimal.add(l6);
        Lion l7 = new Lion("Lion7", "femelle");
        listAnimal.add(l7);
        Lion l8 = new Lion("Lion8", "femelle");
        listAnimal.add(l8);
        Lion l9 = new Lion("Lion9", "femelle");
        listAnimal.add(l9);
        Lion l10 = new Lion("Lion10", "femelle");
        listAnimal.add(l10);

        for (Animal animal : listAnimal) {
            animal.mangerDansLaSavane();
            animal.dormirDansLaSavane();
        }

    }
}
