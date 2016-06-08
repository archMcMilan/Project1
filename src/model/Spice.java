package model;

/**
 * Class that provides Ingredient fields and specified field for such meal type
 */
public class Spice extends Ingredient {
    private int spicy;

    public Spice(IngredientList ing, double weight, int spicy) {
        super(ing, weight);
        this.spicy = spicy;
    }

    public int getSpicy() {
        return spicy;
    }

    /*/**
     * Method to compare two spices by spicy
     * @param o
     * @return -1 if this value less than compared to, 0 if they are equals, 1 if this is more than compared to
     */
    /*public int compareTo(Spice o) {
        if(this.getSpicy()< o.getSpicy()){
            return -1;
        }else if(this.getSpicy()==o.getSpicy()){
            return 0;
        }else{
            return 1;
        }
    }


    @Override
    public int compareTo(Ingredient o) {
        return (this.compareTo((Spice) o));
    }*/


    @Override
    public Spice clone() {
        Spice temp=new Spice(this.getIng(),this.getWeight(),this.getSpicy());
        return temp;
    }

    @Override
    public String toString() {
        return "Spice{" + getIng().getId()+
                " spicy=" + spicy +
                '}';
    }
}
