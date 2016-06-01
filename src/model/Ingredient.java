package model;


/**
 * Created by Артем on 01.06.2016.
 */

public abstract class Ingredient implements Comparable<Ingredient>,Cloneable{
    private String name;
    private int id;
    private double weight;

    public Ingredient(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public abstract Ingredient clone();

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}
