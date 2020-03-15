package myPackages;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("Enter your weight: ");
        int weight = input.nextInt();
        System.out.println("Enter your planet: ");
        String planet = input.next();
       switch (planet) {
            case "Venus":
                double weightNew = 0.78 * weight;
                System.out.println("In Venus you weight " + weightNew);
                break;
            case "Mars":
                weightNew = 0.39 * weight;
                System.out.println("In Mars you weight " + weightNew);
                break;
            case "Jupiter":
                weightNew = 2.65 * weight;
                System.out.println("In Jupiter you weight " + weightNew);
                break;
            case "Saturn":
                weightNew = 1.17 * weight;
                System.out.println("In Saturn you weight " + weightNew);
                break;
            case "Uranus":
                weightNew = 1.05 * weight;
                System.out.println("In Uranus you weight " + weightNew);
                break;
            case "Neptune":
                weightNew = 1.23 * weight;
                System.out.println("In Neptune you weight " + weightNew);
                break;
        }*/
    //exercise 9 
    String names[] = {"Peter","Jack","Nick","Jane"};
    for (int i = 0;i<names.length;i++){
        System.out.println(names[i]);
    }
    for(String friends: names){
            System.out.println(friends);
        }
    int i= 0;
    while( i < names.length){
        System.out.println(names[i]);
        i++;
    }
 i=0;
//    do {//will always execute at least one time
//
//            System.out.print(names[i]);
//        } while (i < names.length);
//
//        System.out.println(names[i+1]);
//i++;

    

    }
}
