package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class provides general information about each dish
 */
public abstract class Dish implements Cloneable{
    private ArrayList<Ingredient> ingredients;

    public Dish(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    public ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> listClone=new ArrayList<>();
        for(Ingredient i:ingredients){
            listClone.add(i.clone());
        }
        return listClone;
    }

    /**
     * Method sorts ingredients by id
     * @return sorted list by id
     */
    public ArrayList<Ingredient> sortById(){
        ArrayList<Ingredient> ingredientsList=getIngredients();
        for (int i=0;i<ingredientsList.size();i++){
            for(int j=i;j<ingredientsList.size();j++){
                if(ingredientsList.get(i).getId()>ingredientsList.get(j).getId()){
                    Collections.swap(ingredientsList,i,j);
                }
            }
        }
        return ingredientsList;
    }

    /**
     * Method sorts ingredients by weight
     * @return sorted list by weight
     */
    public ArrayList<Ingredient> sortByWeight(){
        ArrayList<Ingredient> ingredientsList=getIngredients();
        for (int i=0;i<ingredientsList.size();i++){
            for(int j=i;j<ingredientsList.size();j++){
                if(ingredientsList.get(i).getWeight()>ingredientsList.get(j).getWeight()){
                    Collections.swap(ingredientsList,i,j);
                }
            }
        }
        return ingredientsList;
    }

    /**
     * Method returned the amount of all ingredients' calories
     * @return
     */
    public int countCalories(){
        int result=0;
        for(Ingredient i:getIngredients()){
            if(i instanceof Vegetable){
                result+=((Vegetable) i).getCalories();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "ingredients=" + ingredients +
                '}';
    }


}
