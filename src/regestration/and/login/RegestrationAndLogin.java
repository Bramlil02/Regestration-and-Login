/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regestration.and.login;

import java.util.Scanner;

/**
 *
 * St10491369
 */
public class RegestrationAndLogin {

    
    public static void main(String[] args) {
       
        Scanner po = new Scanner(System.in);
       Login ob = new Login();
        
       
       
       //Regestration
      
       
       System.out.println("=======Resgestration========");
       
       
       
       System.out.print("Enter Name :");
       String Name = po.nextLine();
       
       System.out.print("Enter Surname :");
       String Surname = po.nextLine();
       
       System.out.print("Enter Username :");
       String Username = po.nextLine();
      
        
        System.out.print("Enter Password :");
       String password = po.nextLine();
       
           
             
       System.out.print("Enter CellphoneNumber :");
     String CellphoneNumber = po.nextLine();
     
     
      if (ob.checkCellphonenumber(CellphoneNumber)){
               System.out.print("Cellphonenumber succesfully added");
         } else {
               System.out.print("Cellphonenumber incorrectly formatted or does not contain international code");
               po.nextLine();
            
                if(ob.checkPasswordcomplexcity(password)){
              System.out.print("Password successfully captured");
              } else {
                  System.out.print("Password is not correctly formatted, please ensure that the password contains eight characters,a capital letter, a number, and a special character");
            po.nextLine();

                 if (ob.checkUsername(Username)){
           System.out.println("Username successfully captured");
       }else{
           System.out.println("Username not correctly formatted please ensure that your username contains an underscore and is no more than five characters in length");
        po.nextLine();
      
           
      }
                 
                 }
                }
      }
       }
        
    


        
     
     
    
           
         
    



  
     
         
   


          
    


  
           
         
           
           
       
               
       


    


