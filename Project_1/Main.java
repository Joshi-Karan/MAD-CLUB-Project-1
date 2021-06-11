package com.Project_1;
import java.util.Scanner;

public class Main extends Topic_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("///Welcome to MAD CLUB Project 1///");
        System.out.println("Today we take some test. Enter answer below question. ");
        System.out.println("Correct answer gives you 10 points nothing happen for wrong answer. Lets Begin");
        System.out.println("");
        Topic_1 top1 = new Topic_1();
        Topic_2 top2 = new Topic_2();
        top1.topic1run();
        boolean conti = true;
        while(conti){
        System.out.println("Do you want to give the test again or continue?");
        System.out.println("Enter 1 for yes and 2 for no");
        int cont = scan.nextInt();
        if (cont == 1){
            top1.topic1run();
        }
        else{
        top2.topic2run();
        conti=false;}}
    }
}
