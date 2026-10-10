import java.util.*;
public class game_rock_paper_scissor {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for rock, 1 for paper, 2 for scisoor");
        System.out.println("userinput= ");
        int userinput=sc.nextInt();
        Random random=new Random();
        int computerinput=random.nextInt(3);
        if(userinput == computerinput){
            System.out.println("game is draw");
        }else if((userinput==0 && computerinput==2)||(userinput==1 && computerinput==0)||(userinput==2 && computerinput==1)){
            System.out.println("you win!!");
        }else{
            System.out.println("computer win!!");
        }
        System.out.println("computer choice: "+ computerinput);
        if(computerinput==0){
            System.out.println("computer choice: rock");
        }if(computerinput==1){
            System.out.println("computer choice: paper");
        }if(computerinput==2){
            System.out.println("computer choice: scissor");
        }
    }
}
