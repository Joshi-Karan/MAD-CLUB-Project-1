package com.Project_1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Topic_2 extends Topic_1 {
    String topic2run(){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("This is going to be hard test.");
        System.out.println("Every question will have two answer!!");
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        Integer[] Questions = new Integer[]{1,2,3};
        List<Integer> Q = Arrays.asList(Questions);
        Collections.shuffle(Q);
        String[] Answer1 = new String[]{"Journalist","Whistleblower","President","Steve"};
        List<String> A1 = Arrays.asList(Answer1);
        Collections.shuffle(A1);
        String[] Answer2 = new String[]{"ICR-51","Ricin","Clothes","Grocery"};
        List<String> A2 = Arrays.asList(Answer2);
        Collections.shuffle(A2);
        String[] Answer3 = new String[]{"SIGIANT","FreedomHosting-2","Google","Yahoo"};
        List<String> A3 = Arrays.asList(Answer3);
        Collections.shuffle(A3);
        int score = 0;
        for (int i = 0 ; i < 3 ; i++){
            if(Questions[i]==1){
                System.out.println("Question: Who benefits from Dark Web?");
                System.out.println(Answer1[0]+", "+Answer1[1]+", "+Answer1[2]+", "+Answer1[3]+"     (Enter first answer then hit ENTER and then enter other answer. Spellings matter)");
                String ansCheck1 = scan.next(); String ansCheck2 = scan.next();
                if(((ansCheck1.equals("Journalist"))|| (ansCheck1.equals("Whistleblower")))&&((ansCheck2.equals("Journalist"))||(ansCheck2.equals("Whistleblower")))){
                    System.out.println("Correct Answer");
                    score+=10;
                }
                else{
                    System.out.println("Wrong. Correct ans is Journalist and Whistleblower.");
                }
            }
            else if(Questions[i]==2){
                System.out.println("Question: What can you buy from Dark Web?");
                System.out.println(Answer2[0]+", "+Answer2[1]+", "+Answer2[2]+", "+Answer2[3]+"     (Enter first answer then hit ENTER and then enter other answer. Spellings matter)");
                String ansCheck1 = scan.next(); String ansCheck2 = scan.next();
                if(((ansCheck1.equals("ICR-51"))|| (ansCheck1.equals("Ricin")))&&((ansCheck2.equals("ICR-51"))||(ansCheck2.equals("Ricin")))){
                    System.out.println("Correct Answer");
                    score+=10;
                }
                else{
                    System.out.println("Wrong. Correct ans is ICR-51 and Ricin.");
                }
            }
            else if(Questions[i]==3){
                System.out.println("Question: Which two Dark Web service giant were cracked down?");
                System.out.println(Answer3[0]+", "+Answer3[1]+", "+Answer3[2]+", "+Answer3[3]+", "+"     (Enter first answer then hit ENTER and then enter other answer. Spellings matter)");
                String ansCheck1 = scan.next(); String ansCheck2 = scan.next();
                if(((ansCheck1.equals("SIGIANT"))|| (ansCheck1.equals("FreedomHosting-2")))&&((ansCheck2.equals("SIGIANT"))||(ansCheck2.equals("FreedomHosting-2")))){
                    System.out.println("Correct Answer");
                    score+=10;
                }
                else{
                    System.out.println("Wrong. Correct ans is SIGIANT and FreedomHosting-2.");
                }
            }
        }
        System.out.print("\n/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.print("\nCongrats you completed the topic.\n");
        System.out.println("Your score is "+score);
        System.out.print("\n/////////////////////////////////////////////////////////////////////////////////////////");
        return null;
    }
}
