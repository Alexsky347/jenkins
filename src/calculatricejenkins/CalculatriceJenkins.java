/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatricejenkins;

/**
 *
 * @author ald
 * 
 */

public class CalculatriceJenkins {
    
    private float initNumber = 0;

    public float getInitNumber() {
        return initNumber;
    }

    public void setInitNumber(float initNumber) {
        this.initNumber = initNumber;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int add(int num, int num1){
        return num + num1;
    }
    
    public int substract(int num, int num1){
         return num - num1;
        
    }
    
    public int divide(int num, int num1){
         return num / num1;
        
    }
    
    public int multiply(int num, int num1){
         return num * num1;
        
    }
    
    
}
