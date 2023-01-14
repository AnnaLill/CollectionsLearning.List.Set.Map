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


        catList.remove(1);

        Cat cat = catList.get(0);
        System.out.println(cat);

        System.out.println(catList.indexOf(cat));

        catList.add(2, cat);
        catList.set(2, new Cat ("Меня сюда вставили"));

        catList.removeAll(Arrays.asList(cat,catList.get(3)));

        System.out.println(catList.toString());

        System.out.println(catList.size());

    }


}