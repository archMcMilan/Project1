package test;

import model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Artem on 06.06.16.
 */
public class MenuTest {

    private Menu init(){
        Vegetable cucumber=new Vegetable(IngredientList.CUCUMBER,100,2000);
        Vegetable tomato=new Vegetable(IngredientList.TOMATO,50,3000);
        Vegetable onion=new Vegetable(IngredientList.ONION,20,500);
        Spice salt=new Spice(IngredientList.SALT,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(onion);
        simpleSaladIng.add(salt);
        Dish dish1= new Salad(simpleSaladIng);

        Vegetable potato=new Vegetable(IngredientList.POTATO,30,1000);
        Vegetable carrot=new Vegetable(IngredientList.CARROT,50,2000);
        Vegetable cabbage=new Vegetable(IngredientList.CABBAGE,20,300);
        Spice kari=new Spice(IngredientList.KARI,5,0);
        ArrayList<Ingredient> secondSaladIng=new ArrayList<>();
        secondSaladIng.add( carrot);
        secondSaladIng.add(potato);
        secondSaladIng.add(cabbage);
        secondSaladIng.add(kari);
        Dish dish2=new Salad(secondSaladIng);

        LinkedList<Dish> dishes=new LinkedList<>();
        dishes.add(dish1);
        dishes.add(dish2);
        return new Menu(dishes);
    }

    @Test
    public void dropDishByIngredientIdTest(){
        Menu menu=init();
        assert(menu.dropDishByIngredientId(1));
    }

}