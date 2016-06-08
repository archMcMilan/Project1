package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class that provides Dish fields
 */
public class Salad extends Dish {

    public Salad(ArrayList<Ingredient> ingredients) {
        super(ingredients);
    }

    /**
     * Method sorts ingredients list by vegetable(use comparator)
     * @return sorted list
     */
    public ArrayList<Vegetable> sortVegetable() {
        ArrayList<Vegetable> vegetables=new ArrayList<>();
        for(Ingredient i:getIngredients()){
            if(i instanceof Vegetable){
                vegetables.add((Vegetable) i);
            }
        }
        Collections.sort(vegetables);
        return vegetables;
    }


    /**
     * Method finds vegetables that meet conditions - it's calories value are between minCalories and maxCalories
     * @param minCalories
     * @param maxCalories
     * @return list of vegetables that meet conditions
     */
    public ArrayList<Vegetable> findVegetables(int minCalories, int maxCalories) {
        ArrayList<Vegetable> returnList = new ArrayList<>();
        for (Ingredient i : getIngredients()) {
            if (i instanceof Vegetable) {
                if(((Vegetable)i).getCalories()>=minCalories &&((Vegetable)i).getCalories()<=maxCalories)
                returnList.add((Vegetable) i);
            }
        }
        return returnList;
    }

    @Override
    public Salad clone(){
        Salad temp=new Salad(this.getIngredients());
        return temp;
    }

}
