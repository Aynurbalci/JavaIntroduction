package ExamExercisesGame;

import jdk.swing.interop.SwingInterOpUtils;

public class GameArena {
    static  boolean isGameOver;
    Player player1,player2;
    public void addPlayers(Player player1, Player player2) {
        this.player1=player1;
        this.player2=player2;
    }

    public void startGame() {
        System.out.println("Play!");
        while(!isGameOver){
            player1.move();
            player2.move();
            processMoves();


        }
        displayScores();


    }
    private void displayScores(){
        System.out.println("-----------RESULT-------------");
        System.out.printf("%s %d %n",player1.name,player1.wins);
        System.out.printf("%s %d %n",player2.name,player2.wins);
        System.out.printf("TRIALS: %d DRAWS : %d %n",Player.trials,Player.draws);
        System.out.println("------------------------------");

    }
   private void processMoves(){
        if(isGameOver)return;

        if(player1.sign==HandSign.PAPER&& player2.sign==HandSign.ROCK){
            player1.wins++;
            System.out.println(player1.name+" wins");
        }


        else if(player1.sign==HandSign.SCISSOR&&player2.sign==HandSign.PAPER){
            player1.wins++;
            System.out.println(player1.name+" wins");
        }


        else if(player1.sign==HandSign.ROCK&&player2.sign==HandSign.SCISSOR){
            player1.wins++;
            System.out.println(player1.name+" wins");
        }

        else if(player1.sign==player2.sign){
            Player.draws++;
            System.out.println("draws!");
        }

        else{
            player2.wins++;
            System.out.println(player2.name+" wins");
        }



    }
}
