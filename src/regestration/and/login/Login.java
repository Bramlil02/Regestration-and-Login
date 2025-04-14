/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regestration.and.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Login {
       private String Name;
    private String Surname;
    private String CellphoneNumber;
    private String Password;
    private String Username;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }


    public String getCellphoneNumber() {
        return CellphoneNumber;
    }

    public void setCellphoneNumber(String CellphoneNumber) {
        this.CellphoneNumber = CellphoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;


    

   
   }

    
    public boolean checkCellphonenumber(String Cellphonenumber){
    
    if (Cellphonenumber.contains("\"^\\\\+27\\\\d{9}$\";")){
        return true;
    }else{
        return false;// phoneNumber  && phoneNumber.matches(regex);
    
     
      
    }
    }
 
   public  boolean checkPasswordcomplexcity(String Password) {
        
    return Password.contains("\"^(?=.*[A-Z])(?=.*\\\\d)(?=.*[@#$%^&+=!]).{8, }$\";"); 
   
   }
  public boolean checkUsername(String Username){
      
       
      return Username.contains("_") && Username.length()<=5;
   


                              
  }
  public boolean loginUser(String Username, String Password) {
           Object correctUsername = null;
      
      return Username.equals(correctUsername) && Password.equals(Password);
    
}
public String returnLoginStatus(String Username, String Password) {
    if(loginUser(Username, Password)) {
        
        return "Welcome" + Name + Surname + "it is great to see you again.";
        
    }else{ 
        return "Username or Password incorrect, please try agian";
    }
}
}

      
 


                


      
 


                


      
 


                



