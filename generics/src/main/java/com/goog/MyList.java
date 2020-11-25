package main.java.com.goog;
import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number>  {

    List<T> firstList = new ArrayList<>();

    public void add(T number){
        firstList.add(number);
    }

    public  T largerOfList(){
        T index = firstList.get(0);
        for (int i = 0; i < firstList.size(); i++) {
            if (firstList.get(i).intValue() > index.intValue()) {
                index = firstList.get(i);
            }
        }
            return index;
    }
    public T smallerOfList(){
        T index = firstList.get(0);
        for (int i = 0; i < firstList.size(); i++){
            if(firstList.get(i).intValue() < index.intValue()){
                index = firstList.get(i);
            }
        }
        return index;
    }
}
