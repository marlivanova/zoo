package app;

import com.zoo.animals.Tiger;

/**
 * Created by kisik on 26.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Tiger myTiger = new Tiger();
        //Integer hungerLevel = myTiger.getHungerLevel();
        //System.out.println(hungerLevel);

        Tiger myTiger = new Tiger("Bubu", 78);
        System.out.println("name: " + myTiger.getName() + " hunger: " + myTiger.getHungerLevel());



    }
}
