import java.util.Objects;
import java.util.Random;

public class Zebre extends Animal{


    public Zebre(String nom, String sexe) {
        super(nom, sexe);
    }

    public void manger(){
        System.out.println("je mange de l'herbe (" + this.nom + " ZEBRE " + this.sexe + ")" );
    }
    public void dormir(){
        System.out.println("je dors dans la savane (" + this.nom + " ZEBRE " + this.sexe + ")");

    }

    public void rencontrer(Animal animal, Savane savane){
        if(animal instanceof Zebre){
            if(!this.sexe.equals(animal.sexe)) {
                String concat = this.nom + animal.nom;
                int rand = (int) ( Math.random() * 2 + 1);
                if(rand == 1 ){
                    new Zebre(concat, "male");
                } else if(rand == 2){
                    new Zebre(concat, "femelle");
                }
            }
        }
    }

}
