import ru.synergy.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филлипп Мапкович");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catList = new ArrayList<>();
        for (Cat cat: cats){
            catList.add(cat);
        }

        catList.add(new Cat("Бегемот 2"));

    System.out.println(catList.toString());

    }


}