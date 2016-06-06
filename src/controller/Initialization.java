package controller;

import model.Ingredient;
import model.Salad;
import model.Spice;
import model.Vegetable;

import java.util.ArrayList;

/**
 * Created by Artem on 06.06.16.
 */
public class Initialization {
    public Initialization() {

    }

    /**
     * Method init simple salad
     * @return Salad
     */
    public static Salad initializationSimpleSalad() {
        Vegetable cucumber=new Vegetable("Cucumber",1,30,1000);
        Vegetable tomato=new Vegetable("Tomato",2,50,2000);
        Vegetable onion=new Vegetable("Onion",4,20,300);
        Spice salt=new Spice("Salt",1,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(salt);
        simpleSaladIng.add(onion);
        return new Salad(simpleSaladIng);
    }

    /**
     * Method init caesar salad
     * @return Salad
     */
    public static Salad initializationCeasarSalad() {
        Vegetable carrot=new Vegetable("Carrot",4,30,5000);
        Vegetable potato=new Vegetable("Potato",5,50,1000);
        Vegetable cabbage=new Vegetable("Сabbage",6,20,2000);

        ArrayList<Ingredient> saladIng=new ArrayList<>();
        saladIng.add(potato);
        saladIng.add(carrot);
        saladIng.add(cabbage);
        return new Salad(saladIng);
    }

}
