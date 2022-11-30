
import java.util.ArrayList;
import java.util.Random;

public class Savane {

    static ArrayList<Animal> listAnimal = new ArrayList<>();

    public void mangerDansLaSavane(){
        for (Animal a : listAnimal) {
            a.manger();
        }
    }

    public void  dormirDansLaSavane(){
        for (Animal a : listAnimal) {
            a.dormir();
        }
    }

    public void rencontrer(){
        Random random = new Random();
        Animal a1 = listAnimal.get(random.nextInt(listAnimal.size()));
        Animal a2 = listAnimal.get(random.nextInt(listAnimal.size()));
        a1.rencontrer(a2, this);
    }
}
