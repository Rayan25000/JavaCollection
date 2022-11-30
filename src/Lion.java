import java.util.Random;

public class Lion extends Animal{


    public Lion(String sexe, String nom) {
        super(sexe, nom);
    }

    public void manger(){
        System.out.println("je mange de la viande (" + this.nom + " LION " + this.sexe + ")" );
    }
    public void dormir(){
        System.out.println("je dors dans la savane (" + this.nom + " LION " + this.sexe + ")");
    }

    public void rencontre(Animal animal, Savane savane){
        if(animal instanceof Lion){
            if(!this.sexe.equals(animal.sexe)) {
                String concat = this.nom + animal.nom;
                int rand = (int) ( Math.random() * 2 + 1);
                if(rand == 1 ){
                    new Lion(concat, "male");
                    System.out.println("Nouveau Lion male");
                } else if(rand == 2){
                    new Lion(concat, "femelle");
                    System.out.println("Nouveau Lion femelle");
                }
            } else {
                double prob = Math.random();
                if(prob >= 0.7 ){
                    this.vivant = false;
                    animal.vivant = false;
                    System.out.println("Les deux lions sont morts");
                } else {
                    int rand = (int) ( Math.random() * 2 + 1);
                    if(rand == 1 ){
                        this.vivant = false;
                        System.out.println("Ce lion meurt");
                    } else if(rand == 2){
                        animal.vivant = false;
                        System.out.println("Le lion rencontré est mort");
                    }
                }
            }
        }

    }

}
