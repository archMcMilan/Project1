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
        Vegetable cucumber=new Vegetable("Cucumber",1,30,1000);
        Vegetable tomato=new Vegetable("Tomato",2,50,2000);
        Vegetable onion=new Vegetable("Onion",3,20,300);
        Spice salt=new Spice("Salt",1,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(onion);
        simpleSaladIng.add(salt);
        Dish dish1= new Salad(simpleSaladIng);

        Vegetable potato=new Vegetable("Potato",4,30,1000);
        Vegetable carrot=new Vegetable("Carrot",5,50,2000);
        Vegetable cabbage=new Vegetable("Cabbage",6,20,300);
        Spice kari=new Spice("kari",1,5,0);
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