
package com.mycompany.x_oproject;

import java.util.Scanner;

public class Game {
    private Board board=new Board();
    private Player player01=new Player(),player02=new Player();
      // to help me so i can determine which player will play
    private int count =0;
    public Game() {
    }

    public Game(Board board, Player player01, Player player02) {
        this.board = board;
        this.player01 = player01;
        this.player02 = player02;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer01() {
        return player01;
    }

    public void setPlayer01(Player player01) {
        this.player01 = player01;
    }

    public Player getPlayer02() {
        return player02;
    }

    public void setPlayer02(Player player02) {
        this.player02 = player02;
    }
    
    private char assignOperator(char operator){
          if(operator=='x'||operator=='X')
                    return'o';
              else
                      return'x';
    }
    // reading player's data

    public void readPlayerData(){
          String name;
        char operator;
        Scanner input=new Scanner(System.in);
      // player one data 
            System.out.println("Player 1 Enter your Name ,Please");
            name=input.next();
            System.out.println("which Operator you want to play by it ? X or O");
            operator=input.next().charAt(0);
            player01.setName(name);
            player01.setOperator(operator);
            // player two data 
                System.out.println("Player 2 Enter your Name ,Please");
            name=input.next();
              player02.setName(name);
              
              // to assign player02 operator
          player02.setOperator(assignOperator(operator));  
          
     
    }
    
     // Master function in the project
  public void play(){
        Scanner input = new Scanner(System.in);
        readPlayerData();
        board.Draw();
        
        while(!board.isFull()){
            Player currentPlayer = player01;
            if(count%2==1) currentPlayer = player02;

            while(true){
                int choise;
                 if(count%2==1)
                System.out.println(player02.getName()+" Select Empty Posittion From The Board :");
                 else
                       System.out.println(player01.getName()+" Select Empty Posittion From The Board :");
                choise=input.nextInt();
                if(board.repalceChar(choise,currentPlayer)){
                    break;
                }
            }
            
            board.Draw();
            if(board.isWin(currentPlayer)){
                System.out.println("The winner is : " + currentPlayer.getName());
                break;
            }
            count++;   
        }
        
        if(board.isFull()){
            System.out.println("Game is Draw ..");            
        }
    } 
   
    
}
