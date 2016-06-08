package test;

import model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static controller.Initialization.initializationSimpleSalad;

/**
 * Created by Artem on 06.06.16.
 */
public class DishTest {

    private Dish init(){
        return initializationSimpleSalad();
    }

    @Test
    public void getIngredientsTest(){
        Dish dish=init();
        Assert.assertNotEquals(dish.getIngredients(),dish.getIngredients());
    }

    @Test
    public void getIngredientsDeepCloneTest(){
        Dish dish=init();
        assert(dish.getIngredients().get(0)!=dish.getIngredients().get(0));
    }

    @Test
    public void sortByWeightTest(){
        Dish dish=init();
        ArrayList<Ingredient> ingredients=dish.sortByWeight();
        for(int i=0;i<ingredients.size()-1;i++){
            if(ingredients.get(i).getWeight()>ingredients.get(i+1).getWeight()){
                Assert.fail();
            }
        }
        assert(true);
    }

    @Test
    public void sortByIdTest(){
        Dish dish=init();
        ArrayList<Ingredient> ingredients=dish.sortById();
        for(int i=0;i<ingredients.size()-1;i++){
            if(ingredients.get(i).getIng().getId()>ingredients.get(i+1).getIng().getId()){
                Assert.fail();
            }
        }
        assert(true);
    }

    @Test
    public void countCaloriesTest(){
        Dish dish=init();
        Vegetable cucumber=new Vegetable(IngredientList.CUCUMBER,100,2000);
        Vegetable tomato=new Vegetable(IngredientList.TOMATO,50,3000);
        Vegetable onion=new Vegetable(IngredientList.ONION,20,500);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(onion);
        Dish dish2=new Salad(simpleSaladIng);
        assert(dish.countCalories()==dish2.countCalories());
    }
}