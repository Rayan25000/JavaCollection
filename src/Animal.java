import java.util.ArrayList;

public class Animal extends Savane{

    String sexe;
    String nom;
    boolean vivant;

    public Animal(String sexe, String nom) {
        this.sexe = sexe;
        this.nom = nom;
        vivant = true;
    }

    public void manger(){
        System.out.println("je mange ");
    }

    public void dormir(){
        System.out.println("je dors ");
    }

    public void rencontrer(Animal animal, Savane savane){
        System.out.println("rencontre");

    }
}
