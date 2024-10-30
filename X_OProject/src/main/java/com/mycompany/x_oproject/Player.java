
package com.mycompany.x_oproject;


public class Player {
    
    private String name;
    private char operator;
    
    
    // constructors
    public Player() {}

      public Player(String name, char operator) {
        this.name = name;
        this.operator = operator;
    }

      //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

  
    
    
}
