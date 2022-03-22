package ExamExercisesGame;

import java.util.Scanner;

enum HandSign {
    PAPER,
    SCISSOR,
    ROCK

}

public class Player {
    Scanner scanner = new Scanner(System.in);

    String name;
    HandSign sign;
    int wins;
    static int draws;
    static int trials;

    Player(String name) {
        this.name = name;

    }

    void move() {
        if(GameArena.isGameOver){
            return;
        }
        boolean inputInvalid = false;
        do {

            char userChoice = scanner.next().charAt(0);
            inputInvalid = false;

            switch (userChoice) {
                case 's':
                    this.sign = HandSign.SCISSOR;
                    break;
                case 'r':
                    this.sign = HandSign.ROCK;
                    break;
                case 'p':
                    this.sign = HandSign.PAPER;
                    break;
                case 'q':
                    GameArena.isGameOver = true;
                    break;
                default:
                    inputInvalid = true;
                    break;

            }

        } while (inputInvalid);
        System.out.println(this.name + " 's" + sign);

    }

}
