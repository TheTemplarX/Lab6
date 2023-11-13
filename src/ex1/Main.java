package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sir = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Cati studenti?");
        int nr = myObj.nextInt();
        for(int i = 0; i < nr; i++){
            System.out.println("Student " + (i+1) + ":");
            String student = myObj.next();
            sir.add(student);
        }
        for(int i = 0; i < sir.size(); i++){
            System.out.println(sir.get(i));
        }
    }
}
