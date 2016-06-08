package test;

import controller.Controller;
import model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Artem on 06.06.16.
 */
public class ControllerTest {

    private ArrayList<Dish> init(){
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

        ArrayList<Dish> dishes=new ArrayList<>();
        dishes.add(dish1);
        dishes.add(dish2);
        return dishes;
    }
    @Test
    public void outputAvailableDishesTest() {
        Vegetable cucumber=new Vegetable(IngredientList.CUCUMBER,100,2000);
        Vegetable tomato=new Vegetable(IngredientList.TOMATO,50,3000);
        Vegetable onion=new Vegetable(IngredientList.ONION,20,500);
        Spice salt=new Spice(IngredientList.SALT,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(onion);
        simpleSaladIng.add(salt);
        Dish dish= new Salad(simpleSaladIng);

        Controller controller=new Controller();

        for(Ingredient i: dish.getIngredients()){
            boolean flag=false;
            for(Dish d:controller.outputAvailableDishes(init(),simpleSaladIng)){
                if(!d.getIngredients().contains(i)){
                    flag=true;
                }
            }
            if(flag){
                Assert.fail();
            }

        }
        assert(true);
    }

}