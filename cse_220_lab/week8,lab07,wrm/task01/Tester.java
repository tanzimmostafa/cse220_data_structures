import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    String start = "Enter 1-Add patient/2-serve patient/3-Cancel all appointments/4-Can doctor go home/5-Show All patient/6-Exit";
    System.out.println(start);                                              
    int select = 0 ;
    WRM w = new WRM();
    
    while(select!=6){
      try{
        select = s.nextInt();
        if(select == 1){
          w.RegisterPatient();
          System.out.println("------\n"+start);
        }
        else if(select==2){
          w.ServePatient();
          System.out.println("------\n"+start);
          
        }
        else if(select==3){
          w.CancelAll();
          System.out.println("------\n"+start);
          
        }
        else if(select==4){
          w.CanDoctorGoHome();
          System.out.println("------\n"+start);
        }
        else if(select==5){
          w.ShowAllPatient();
          System.out.println("------\n"+start);
        }
       // else if(select==6){    
      //  }
//        else{
//          System.out.println(start);
//        }
        
      } 
      catch(Exception e){
        System.out.println("Try Again!!"+start);
        s.next();//?\\mayb so that another input(any type of input) is taken and if its wrong
        //input(eg letter)again exception is thrown
        //if used s.netInt()-it would only take any int inputs
      }
      
    }
  }
}