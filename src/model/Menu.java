package model;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class Menu provides dishes list
 */
public class Menu {
    private LinkedList<Dish> dishes;

    public Menu(){
        dishes=new LinkedList<>();
    }

    public Menu(LinkedList<Dish> dishes) {
        this.dishes = dishes;
    }

    public ArrayList<Dish> getDishes() {
        return (ArrayList<Dish>) dishes.clone();
    }

    /**
     * Method adds dish into menu
     * @param dish
     */
    public void addDish(Dish dish){
        dishes.add(dish);
    }

    /**
     * Method drop dish from dishes list by id
     * @param id
     * @return true if anything was dropped and false if nothing was deleted
     */
    public boolean dropDishByIngredientId(int id){
        for(int j=0;j<dishes.size();j++){
            for(Ingredient i:dishes.get(j).getIngredients()){
                if(i.getIng().getId()==id){
                    dishes.remove(j);
                    return true;
                }
            }
        }
        return false;
    }
}
