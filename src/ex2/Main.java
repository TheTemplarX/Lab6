package ex2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashSet<String> carti = new HashSet<>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Cate carti?");
        int nr = myObj.nextInt();
        for(int i = 0; i < nr; i++){
            carti.add(myObj.next());
        }
        System.out.println(carti);
    }
}
