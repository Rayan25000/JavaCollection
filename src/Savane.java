
import java.util.ArrayList;
import java.util.Random;

public class Savane {

    static ArrayList<Animal> listAnimal = new ArrayList<>();
    static ArrayList<Animal> animalAuto = new ArrayList<>();

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

    /**public void rencontrer(){
        Random random = new Random();
        Animal a1 = listAnimal.get(random.nextInt(listAnimal.size()));
        Animal a2 = listAnimal.get(random.nextInt(listAnimal.size()));
        a1.rencontrer(a2, this);
    }*/

    //Méthode rencontre des 50 lions
    public void rencontrer(){
        Random random = new Random();
        Animal a1 = animalAuto.get(random.nextInt(animalAuto.size()));
        Animal a2 = animalAuto.get(random.nextInt(animalAuto.size()));
        a1.rencontrer(a2, this);
        //modification remove list = dernier survivant
        /**if(!a1.vivant){
            String index = a1.nom.substring(4);
            animalAuto.remove(animalAuto.get(Integer.parseInt(index)));
        } else if(!a2.vivant){
            String index = a2.nom.substring(4);
            animalAuto.remove(animalAuto.get(Integer.parseInt(index)));
        }*/
    }
}
