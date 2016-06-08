package model;

/**
 * Class that provides Ingredient fields and specified field for such meal type
 */
public class Vegetable extends Ingredient {
    private int calories;

    public Vegetable(IngredientList ing, double weight, int calories) {
        super(ing, weight);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
/*
    /**
     * Method to compare two vegetables by calories
     * @param o
     * @return -1 if this value less than compared to, 0 if they are equals, 1 if this is more than compared to
     */
    /*private int compareTo(Vegetable o) {
        if(this.getCalories()< o.getCalories()){
            return -1;
        }else if(this.getCalories()==o.getCalories()){
            return 0;
        }else{
            return 1;
        }
    }


    @Override
    public int compareTo(Ingredient o) {
        return (this.compareTo((Vegetable) o));
    }*/

    @Override
    public Vegetable clone(){
        Vegetable temp=new Vegetable(this.getIng(),this.getWeight(),this.getCalories());
        return temp;
    }

    @Override
    public String toString() {
        return "Vegetable{" + getIng().getId()+
                " calories=" + calories +
                '}';
    }
}
