package array;

import java.util.Arrays;

public class ArrayPractice {

public void arrayDemo(){
         String [] name = {"Sumaia","Shakhawat", "Masud", "Lubna"};
//        String[]name = new String[4];
//        name[0] = "Sumaia";
//        name[1] = "Shakhawat";
//        name[2] = "Masud";
//        name[3] = "Lubna";

    int nameLength =     name.length;
    System.out.println(nameLength);

    name[0] = "Bashir";
    //Arrays.sort(name);

    for (int i = 0; i<=name.length-1; i++){
        System.out.println(name[i]);
    }

    // print the length and print each element using loop
        int [] number = {10, 20, 30, 40, 50};
        float[] stocks = {100.34f, 400.5456f, 200.45454f, 454.45456f};

    }

    // Here name is Array Variable

    // git init, git add, git commit -m , git push (Git hub)
    // git pull, git pull request, git conflict, resolve git conflict

    public static void main(String[] args) {
        ArrayPractice obj = new ArrayPractice();
        obj.arrayDemo();
    }

}
