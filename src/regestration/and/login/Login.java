/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regestration.and.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
       private String name;
    private String surname;
    private int age;
    private String Cellphonenumber;
    private String password;
    private String username;

    public Login(String name, String surname, String Cellphonenumber, int age, String password, String username) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.Cellphonenumber = Cellphonenumber;
        this.password = password;
        this.username = username;
        
      
    }
   public boolean checkUsername(String Username){
       if (Username.contains("_") && Username.length()<=5){
           
        return true;
        
       }else{
           return false;
       }
       
       
      
   }
   
    public boolean checkPasswordComplexcity(String Password){
           if (Password.contains ("\"^(?=.*[A-Z])(?=.*[a-z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,20}$\";")){
               
               return true;
           
          }else{
               return false;
           }
        
        
}

public boolean checkCellphonenumber(String Cellphonenumber){
    
    if (Cellphonenumber.contains("\"^\\\\+27\\\\d{9}$\";")){
        return true;
    }else{
        return false;// phoneNumber  && phoneNumber.matches(regex);

    }
}
}