package com.Project_1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Topic_1{
    String topic1run(){
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////");
        Scanner scan = new Scanner(System.in);
        // Here we randomized the question and answer
        Integer[] Question = new Integer[]{1,2,3};
        List<Integer> Q = Arrays.asList(Question);
        Collections.shuffle(Q);
        Integer[] Answer1 = new Integer[]{100000,200000,300000,2};
        List<Integer> A1 = Arrays.asList(Answer1);
        Collections.shuffle(A1);
        Integer[] Answer2 = new Integer[]{4,69,420,777};
        List<Integer> A2 = Arrays.asList(Answer2);
        Collections.shuffle(A2);
        Integer[] Answer3 = new Integer[]{100,101,102,6};
        List<Integer> A3 = Arrays.asList(Answer3);
        Collections.shuffle(A3);
        // Here we start question and answer along with score Handling
        int score = 0;
        for (Integer integer : Question) {
            if (integer == 1) {
                System.out.println("Question: 1 + 1 = ?");
                System.out.println(Answer1[0] + ", " + Answer1[1] + ", " + Answer1[2] + ", " + Answer1[3] + "   (Enter the correct answer below)");
                    int input_a1 = scan.nextInt();
                    if (input_a1 == 2) {
                        System.out.println("Correct answer");
                        score += 10;
                    } else {
                        System.out.println("Incorrect Answer. Correct answer is 2.");
                    }
                }else if (integer == 2) {
                System.out.println("Question: 2 + 2 = ?");
                System.out.println(Answer2[0] + ", " + Answer2[1] + ", " + Answer2[2] + ", " + Answer2[3] + "   (Enter the correct answer below)");
                int input_a2 = scan.nextInt();
                if (input_a2 == 4) {
                    System.out.println("Correct answer");
                    score += 10;
                } else {
                    System.out.println("Incorrect Answer. Correct answer is 4.");
                }
            } else if (integer == 3) {
                System.out.println("Question: 3 + 3 = ?");
                System.out.println(Answer3[0] + ", " + Answer3[1] + ", " + Answer3[2] + ", " + Answer3[3] + "   (Enter the correct answer below)");
                int input_a3 = scan.nextInt();
                if (input_a3 == 6) {
                    System.out.println("Correct answer");
                    score += 10;
                } else {
                    System.out.println("Incorrect Answer. Correct answer is 6.");
                }
            }
        }
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.print("\nCongrats you completed the topic.\n");
        System.out.println("Your score is "+score);
        System.out.print("\n/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\n");
        return null;
    }
}
