package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 30.05.2016.
 */
public class Salad extends Dish {

    public ArrayList<Vegetable> sortVegetable() {
        ArrayList<Vegetable> vegetables=new ArrayList<>();
        for(Ingredient i:getIngredients()){
            if(i instanceof Vegetable){
                vegetables.add((Vegetable) i);
            }
        }
        int left = 0;
        int right = getIngredients().size() - 1;

        do {
            for (int i = left; i < right; i++) {
                if (vegetables.get(i).compareTo(vegetables.get(i + 1)) > 1) {
                    vegetables=Operations.swap(vegetables,i,i+1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (vegetables.get(i).compareTo(vegetables.get(i + 1)) < -1) {
                    vegetables=Operations.swap(vegetables,i,i+1);
                }
            }
            left++;
        } while (left <= right);
        return vegetables;
    }


    public List<Vegetable> findVegetables(int minCalories, int maxCalories) {
        List<Vegetable> returnList = new ArrayList<>();
        for (Ingredient i : getIngredients()) {
            if (i instanceof Vegetable) {
                returnList.add((Vegetable) i);
            }
        }
        return returnList;
    }


}
