import model.Ingredient;
import model.Salad;
import model.Spice;
import model.Vegetable;

import java.util.ArrayList;

/**
 * Created by Artem on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Vegetable cucumber=new Vegetable("Cucumber",1,30,1000);
        Vegetable tomato=new Vegetable("Tomato",2,50,2000);
        Vegetable onion=new Vegetable("Onion",3,20,300);
        Spice salt=new Spice("Salt",1,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(salt);
        simpleSaladIng.add(onion);
        Salad simple=new Salad(simpleSaladIng);
        System.out.println(simple.sortVegetable());
        System.out.println(simple.findVegetables(200,1500));
        System.out.println(simple.countCalories());
        System.out.println(simple);
        System.out.println(simple.sortById());
        System.out.println(simple.sortByWeight());
        System.out.println(simple);
    }

}
