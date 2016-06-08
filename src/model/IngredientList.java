package model;

/**
 * Created by Artem on 07.06.16.
 */
public enum IngredientList{
    CUCUMBER(0),
    TOMATO(1),
    POTATO(2),
    ONION(3),
    CARROT(4),
    SALT(5),
    KARI(6),
    CABBAGE(7);
    private final int id;

    IngredientList(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "" + getClass().getName()+
                "id=" + id +
                '}';
    }
}
