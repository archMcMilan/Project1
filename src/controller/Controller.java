package controller;

import model.*;
import view.View;

import java.util.ArrayList;

/**
 * Created by Artem on 30.05.2016.
 */
public class Controller {

    View view=new View();
    public void processUser(){

        Salad simple=Initialization.initializationSimpleSalad();
        ArrayList<Vegetable> tempVeg= simple.sortVegetable();
        view.printMessage(tempVeg);
        view.printMessage(simple.findVegetables(200,1500));
        view.printMessage(simple.countCalories());
        view.printMessage(simple);
        view.printMessage(simple.sortById());
        view.printMessage(simple.sortByWeight());
        view.printMessage(simple);
    }

    /**
     * Method find dishes which matches specified ingredients
     * @param dishes
     * @param ingredients
     * @return available
     */
    public ArrayList<Dish> outputAvailableDishes(ArrayList<Dish> dishes,ArrayList<Ingredient> ingredients){
        ArrayList<Dish> availableDishes=new ArrayList<>();
        boolean flag=true;
        for(Dish d:dishes){
            for(Ingredient di:d.getIngredients()) {
                if (!ingredients.contains(di)) {
                    flag = false;
                }
            }
            if (flag) {
                availableDishes.add(d);
            }
        }
        return availableDishes;
    }

    /**
     * Method control new salad creation
     * @param ingredients
     * @return created salad object
     */
    public Salad createNewSalad(ArrayList<Ingredient> ingredients){
        Salad temp=new Salad(ingredients);
        return temp;
    }

    /**
     * Method control new vegetable creation
     * @param name
     * @param id
     * @param weight
     * @param calories
     * @return created vegetable object
     */
    public Vegetable createNewVegetable(String name,int id,double weight,int calories){
        Vegetable temp=new Vegetable(name,id,weight,calories);
        return temp;
    }


    /**
     * Method control new spice creation
     * @param name
     * @param id
     * @param weight
     * @param spicy
     * @return created spice object
     */
    public Spice createNewSpice(String name,int id,double weight,int spicy){
        Spice temp=new Spice(name,id,weight,spicy);
        return temp;
    }

    /**
     * Method control new menu creation
     * @param menu
     * @param dish
     * @param <T>
     */
    public <T extends Dish> void addDishInMenu(Menu menu,T dish){
        menu.addDish(dish);
    }

    /**
     * Method drop dish from menu by id
     * @param menu
     * @param id
     * @return true if anything was deleted otherwise false
     */
    public boolean dropDishFromMenuById(Menu menu,int id){
        if(menu.dropDishByIngredientId(id)){
            return true;
        }
        return false;
    }

}
