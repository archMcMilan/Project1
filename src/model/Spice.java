package model;

/**
 * Created by Артем on 01.06.2016.
 */
public class Spice extends Ingredient {
    private int spicy;

    public Spice(String name, int id, double weight, int spicy) {
        super(name, id, weight);
        this.spicy = spicy;
    }

    public int getSpicy() {
        return spicy;
    }

    public int compareTo(Spice o) {
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
        try{
            if(o instanceof Spice){
                return (this.compareTo((Spice) o));
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


    @Override
    public Spice clone() {
        Spice temp=new Spice(this.getName(),this.getId(),this.getWeight(),this.getSpicy());
        return temp;
    }
}
