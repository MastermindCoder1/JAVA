import java.util.Random;
import java.util.Scanner;

public class ch_01_rock_paper_scisssor {
    public static void main(String[] args) {
        String[] string = {"rock", "paper", "scissor"};
        Random random = new Random();
        int randomindex =random.nextInt(string.length);
        String randomstring =string[randomindex];


        Scanner sc = new Scanner(System.in);
        System.out.println("your choice is :");
        String your_choice = sc.next();
        


        if(randomstring.equals("paper")){
            if(your_choice.equals("rock")){
                System.out.println("you lose!");
            }
            else if(your_choice.equals("scissor")){
                System.out.println("you win!");
            }
            else if(your_choice.equals(randomstring)){
                System.out.println("the match is tie");

            }
            else {
                System.out.println("write the correct input");
            }
        }

        if(randomstring.equals("rock")){
            if(your_choice.equals("scissor")){
                System.out.println("you lose!");
            }
            else if(your_choice.equals("paper")){
                System.out.println("you win!");
            }
            else if(your_choice.equals(randomstring)){
                System.out.println("the match is tie");
            }
            else {
                System.out.println("write the correct input");
            }
        }


        if(randomstring.equals("scissor")){
            if(your_choice.equals("paper")){
                System.out.println("you lose!");
            }
            else if(your_choice.equals("rock")){
                System.out.println("you win!");
            }
            else if(your_choice.equals(randomstring)){
                System.out.println("the match is tie");
            }
            else {
                System.out.println("write the correct input");
            }
        }

        System.out.println("the computer choice was:"+randomstring);
     }

    
}
