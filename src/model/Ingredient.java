package model;


/**
 * Class provides general information about each meal
 */
public abstract class Ingredient implements Comparable<Ingredient>,Cloneable{
    private IngredientList ing;
    private double weight;

    /**
     * init constructor
     * @param ing
     * @param weight
     */
    public Ingredient(IngredientList ing, double weight) {
        this.ing = ing;
        this.weight = weight;
    }

    public IngredientList getIng() {
        return ing;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Ingredient o) {
        if(this.getIng().getId()>o.getIng().getId()){
            return 1;
        }else if(this.getIng().getId()==o.getIng().getId()){
            return 0;
        }else{
            return -1;
        }
    }

    public abstract Ingredient clone();

    @Override
    public String toString() {
        return "Ingredient{" +
                "ing=" + ing +
                ", weight=" + weight +
                '}';
    }
}
