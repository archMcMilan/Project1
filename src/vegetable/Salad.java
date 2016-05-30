package vegetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem on 30.05.2016.
 */
public class Salad {
    List<Vegetable> ingredients;

    public int countCalories(){
        int result=0;
        for(int i=0;i<ingredients.size();i++){
            result+=ingredients.get(i).getCalories();
        }
        return result;
    }

    public void sort(){

    }

    public List<Vegetable> findVegetables(int minCalories, int maxCalories){
        List<Vegetable> returnList=new ArrayList<>();
        for(Vegetable v:ingredients){
            returnList.add(v);
        }
        return returnList;
    }


}
