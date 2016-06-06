package test;

import model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Artem on 06.06.16.
 */
public class DishTest {

    private Dish init(){
        Vegetable cucumber=new Vegetable("Cucumber",1,30,1000);
        Vegetable tomato=new Vegetable("Tomato",2,50,2000);
        Vegetable onion=new Vegetable("Onion",3,20,300);
        Spice salt=new Spice("Salt",1,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(tomato);
        simpleSaladIng.add(cucumber);
        simpleSaladIng.add(onion);
        simpleSaladIng.add(salt);
        return new Salad(simpleSaladIng);
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
            if(ingredients.get(i).getId()>ingredients.get(i+1).getId()){
                Assert.fail();
            }
        }
        assert(true);
    }

    @Test
    public void countCaloriesTest(){
        Dish dish=init();
        Vegetable coconate=new Vegetable("Coconate",4,30,1000);
        Vegetable apple=new Vegetable("Apple",5,50,2000);
        Vegetable banana=new Vegetable("Banana",6,20,300);
        Spice salt=new Spice("Salt",1,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(apple);
        simpleSaladIng.add(coconate);
        simpleSaladIng.add(banana);
        Dish dish2=new Salad(simpleSaladIng);
        assert(dish.countCalories()==dish2.countCalories());
    }
}