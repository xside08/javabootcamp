package main.java.com.andriy;

public class ArrMatrix {
    public static void main(String[] args){
        String[] first = {"Привіт","Me","You","Welcome","Yay" };
        String[] second = {"Quit","незнайомцю","Busy","Walking"};
        String[] third = {"Darkness","Smile","радий","Like"};
        String[] fourth = {"time","of","Sadness","бачити"};
        String[] fifth = {"Stop","Cheat","Walking","Person","hey"};
        String[][] newMass = {first,second,third,fourth,fifth};

        String new2 = "";
        for(int x = 0; x<newMass.length; x++){
            for(int z = 0; z<newMass[x].length; z++){
                if(x==z) {
                    new2 = new2 + " " + newMass[x][z];
                }
            }
        }
        System.out.println(new2);
    }
}




