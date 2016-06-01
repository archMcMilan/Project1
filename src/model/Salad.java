package model;

import java.util.ArrayList;

/**
 * Created by Artem on 30.05.2016.
 */
public class Salad extends Dish {

    public Salad(ArrayList<Ingredient> ingredients) {
        super(ingredients);
    }

    public ArrayList<Vegetable> sortVegetable() {
        ArrayList<Vegetable> vegetables=new ArrayList<>();
        for(Ingredient i:getIngredients()){
            if(i instanceof Vegetable){
                vegetables.add((Vegetable) i);
            }
        }
        int left = 0;
        int right = vegetables.size() - 1;

        do {
            for (int i = left; i < right; i++) {
                if (vegetables.get(i).compareTo(vegetables.get(i + 1)) > 0) {
                    vegetables=Operations.swap(vegetables,i,i+1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (vegetables.get(i).compareTo(vegetables.get(i-1)) < 0) {
                    vegetables=Operations.swap(vegetables,i-1,i);
                }
            }
            left++;
        } while (left <= right);
        return vegetables;
    }


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

}
