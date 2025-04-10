/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regestration.and.login;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class RegestrationAndLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner po = new Scanner(System.in);
       Login ob;
       
       //Regestration
       System.out.print("Enter Name");
       String Name = po.nextLine();
       
       System.out.print("Enter Surname");
       String Surname = po.nextLine();
       
       System.out.print("Enter Username");
       String Username = po.nextLine();
       
       System.out.print("Enter Age");
       int Age = po.nextInt();
       
       System.out.print("Enter CellphoneNumber");
       String CellphoneNumber = po.nextLine();
       
       System.out.print("Enter Password");
       String Password = po.nextLine();
       
       ob = new Login (Name, Surname, Username, Age, CellphoneNumber, Password);
      
       
    }
    
}
