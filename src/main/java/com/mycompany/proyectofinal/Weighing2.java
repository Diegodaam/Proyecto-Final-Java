
package com.mycompany.proyectofinal;

/**
 *
 * @author dm205
 */
public class Weighing2 {
    
    private String type;
    private int num1;
    private int num2;
    private int num3;
   private String type1;
 
    
    //CONSTRUCTOR
    public Weighing2(String type, int num1, int num2, int num3, String type1) {
        this.type = type;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.type1 = type1;
    
    }
    
  //GETTERS
    public String getType1() {
        return type1;
    }
    
    public String getType() {
        return type;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
    
    //SETTERS 
    public void setType(String type) {
        this.type = type;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }
    
    
    
}
