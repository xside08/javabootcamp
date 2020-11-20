package main.java.com.andrii;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0) {
                    if (o2 % 2 == 0) {
                        return o1 - o2;
                    }
                    return -1;
                } else if (o2 % 2 == 0) {
                    return 1;
                } else {
                    return o1 - o2;
                }

            }
        });


        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 2, 6, 7, 8, 9, 10, 11));
        treeSet.addAll(ints);
        System.out.println(treeSet);

        Car car1 = new Car(2000, "BMW", 4.4);
        Car car2 = new Car(300, "Opel", 3.2);
        Car car3 = new Car(1500, "VW", 1.5);
        Car car4 = new Car(200, "ZaaAZ", 4.4);

        List<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

        Set<Car> priceComparator = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        Set<Car> nameComparator = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().length() - o2.getBrand().length();
            }
        });
        Set<Car> nameDesk = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.compareTo(o2);
            }
        });
        nameDesk.addAll(carList);
        System.out.println(nameDesk);

        nameComparator.addAll(carList);
        priceComparator.addAll(carList);
        System.out.println(nameComparator);
        System.out.println(priceComparator);
    }
}

