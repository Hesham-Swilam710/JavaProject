
package com.mycompany.x_oproject;


public class Board {
    private char[][] board;

    public Board() {
         this.board = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    }

//    public Board(char[][] board) {
//        this.board = board;
//    }

//    public char[][] getBoard() {
//        return board;
//    }
//
//    public void setBoard(char[][] board) {
//        this.board = board;
//    }
    
    public int getRow(int place){
     return (place-1)/3;
    }
    public int getColumn(int place){
    
    return(place-1)%3;
    }
    
    // to cheak if the board is empty or not 
    public boolean isEmpty(int place){
        // cheack if the user's choise in right range
        if(place>=1&&place<=9){
            
        int row = getRow(place);
        int column = getColumn(place);
        
       if(this.board[row][column]=='x'||this.board[row][column]=='X'||this.board[row][column]=='o'||this.board[row][column]=='O')
            return false;
            return true; 
        }
        else return false;
    }
    
     // to repalce step
    public boolean repalceChar(int place,Player player){
        
         if(isEmpty(place)){
          int row=getRow(place);
        int column=getColumn(place);
        
        this.board[row][column]=player.getOperator();
       return true;
         }
         else return false;
    }
    
    public void Draw(){
        for(int i=0;i<3;i++){
       System.out.println("-------------------");
            for(int j=0;j<3;j++){
                System.out.print("|  "+board[i][j]+"  ");     
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }
     
     
     public boolean isFull(){
         // if you find any place empty return false 
     for(int i=1;i<=9;i++){
       if(this.isEmpty(i))
           return false;
     }
     return true;
     }
     
     
     public boolean isWin(Player player){
         // rows
         if(this.board[0][0]==this.board[0][1]&&this.board[0][1]==this.board[0][2])
             return true;
        if(this.board[1][0]==this.board[1][1]&&this.board[1][1]==this.board[1][2])
             return true;
        if(this.board[2][0]==this.board[2][1]&&this.board[2][1]==this.board[2][2])
             return true;
          //columns 
        if(this.board[0][0]==this.board[1][0]&&this.board[1][0]==this.board[2][0])
             return true;
        if(this.board[0][1]==this.board[1][1]&&this.board[1][1]==this.board[2][1])
             return true;
       if(this.board[0][2]==this.board[1][2]&&this.board[1][2]==this.board[2][2])
             return true;
             // diagonals
       if(this.board[0][0]==this.board[1][1]&&this.board[1][1]==this.board[2][2])
             return true;
       if(this.board[0][2]==this.board[1][1]&&this.board[1][1]==this.board[2][0])
             return true;
         
         return false;
     }
    
    
     
     
     
     
     // end of board class
    }
    
    
    

