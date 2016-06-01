package model;

import java.util.ArrayList;

/**
 * Created by Артем on 01.06.2016.
 */
public abstract class Dish{
    private ArrayList<Ingredient> ingredients;

    public ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> listClone=new ArrayList<>();
        for(Ingredient i:ingredients){
            listClone.add(i.clone());
        }
        return listClone;
    }

    public ArrayList<Ingredient> sortById(){
        ArrayList<Ingredient> ingredientsList=getIngredients();
        for (int i=0;i<ingredientsList.size()-1;i++){
            for(int j=i;j<ingredientsList.size()-1;j++){
                if(ingredientsList.get(i).getId()>ingredientsList.get(j).getId()){
                    Operations.swap(ingredientsList,i,j);
                }
            }
        }
        return ingredientsList;
    }

    public ArrayList<Ingredient> sortByWeight(){
        ArrayList<Ingredient> ingredientsList=getIngredients();
        for (int i=0;i<ingredientsList.size()-1;i++){
            for(int j=i;j<ingredientsList.size()-1;j++){
                if(ingredientsList.get(i).getWeight()>ingredientsList.get(j).getWeight()){
                    Operations.swap(ingredientsList,i,j);
                }
            }
        }
        return ingredientsList;
    }

    public int countCalories(){
        int result=0;
        for(Ingredient i:getIngredients()){
            if(i instanceof Vegetable){
                result+=((Vegetable) i).getCalories();
            }
        }
        return result;
    }
}
