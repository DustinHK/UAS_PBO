/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import DB.MyConnection;
import Login.LoginJFrame;
/**
 *
 * @author lenovo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login.LoginJFrame obj = new LoginJFrame();
        obj.show();
        MyConnection.loadConnection();
    }
    
}
