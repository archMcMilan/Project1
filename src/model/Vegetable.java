package model;

/**
 * Created by Artem on 30.05.2016.
 */
public class Vegetable extends Ingredient {
    private int calories;

    public Vegetable(String name, int id, double weight, int calories) {
        super(name, id, weight);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public int compareTo(Vegetable o) {
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
        try {
            if(o instanceof Vegetable){
                return (this.compareTo((Vegetable) o));
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Vegetable clone(){
        Vegetable temp=new Vegetable(this.getName(),this.getId(),this.getWeight(),this.getCalories());
        return temp;
    }
}
