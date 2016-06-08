package test;

import model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Artem on 06.06.16.
 */
public class SaladTest {

    private Salad init(){
        Vegetable carrot=new Vegetable(IngredientList.CARROT,30,1000);
        Vegetable potato=new Vegetable(IngredientList.POTATO,50,2000);
        Vegetable onion=new Vegetable(IngredientList.ONION,20,300);
        Spice salt=new Spice(IngredientList.SALT,5,0);
        ArrayList<Ingredient> simpleSaladIng=new ArrayList<>();
        simpleSaladIng.add(potato);
        simpleSaladIng.add(carrot);
        simpleSaladIng.add(onion);
        simpleSaladIng.add(salt);
        return new Salad(simpleSaladIng);
    }
    @Test
    public void sortVegetableTest(){
        Salad salad=init();
        ArrayList<Vegetable> vegetables=salad.sortVegetable();
        for(int i=0;i<vegetables.size()-1;i++){
            if(vegetables.get(i).compareTo(vegetables.get(i+1))>0){
                Assert.fail();
            }
        }
        assert(true);
    }

    @Test
    public void findVegetablesTest(){
        Salad salad=init();
        ArrayList<Vegetable> vegetables=salad.findVegetables(1000,2000);
        assert(vegetables.size()==2);
    }

    @Test
    public void findVegetablesTestWithNothingReturned(){
        Salad salad=init();
        ArrayList<Vegetable> vegetables=salad.findVegetables(3000,4000);
        assert(vegetables.size()==0);
    }

    @Test
    public void cloneTest(){
        Salad salad=init();
        Assert.assertNotEquals (salad,salad.clone());
    }
}