package god.d04.generic;

/**
 * Created by 이성희 on 2017-03-02.
 */
public class Car {
    protected String name;
    public Car(String name) {
        this.name=name;
    }
    public String toString() {
        return "Car name="+name;
    }
}
