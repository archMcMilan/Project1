package vegetable;

/**
 * Created by Artem on 30.05.2016.
 */
public class Vegetable implements Comparable<Vegetable> {
    private int calories;
    private String name;
    private int id;

    public Vegetable(int calories, String name, int id) {
        this.calories = calories;
        this.name = name;
        this.id = id;
    }

    public int getCalories() {
        return calories;
    }


    @Override
    public int compareTo(Vegetable o) {
        if(this.getCalories()< o.getCalories()){
            return -1;
        }else if(this.getCalories()==o.getCalories()){
            return 0;
        }else{
            return 1;
        }
    }
}
