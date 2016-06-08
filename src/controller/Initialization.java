package controller;

import model.*;

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
        Vegetable cucumber=new Vegetable(IngredientList.CUCUMBER,100,2000);
        Vegetable tomato=new Vegetable(IngredientList.TOMATO,50,3000);
        Vegetable onion=new Vegetable(IngredientList.ONION,20,500);
        Spice salt=new Spice(IngredientList.SALT,5,0);
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
        Vegetable potato=new Vegetable(IngredientList.POTATO,30,1000);
        Vegetable carrot=new Vegetable(IngredientList.CARROT,50,2000);
        Vegetable cabbage=new Vegetable(IngredientList.CABBAGE,20,300);
        Spice kari=new Spice(IngredientList.KARI,5,0);

        ArrayList<Ingredient> saladIng=new ArrayList<>();
        saladIng.add(potato);
        saladIng.add(carrot);
        saladIng.add(cabbage);
        saladIng.add(kari);
        return new Salad(saladIng);
    }

}
