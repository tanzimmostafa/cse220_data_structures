import java.util.Scanner;
public class Tester1{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String intro = "Enter 1-Add patient/2-serve patient/3-Cancel all appointments/4-Can doctor go home/5-Show All patient/6-Exit";
  System.out.println(intro);
  int select=0;
  WRM1 x=new WRM1();
  while(select!=6){
    
    try{
      select =sc.nextInt();
    if(select==1){
      x.RegisterPatient();
      System.out.println("---------");
      System.out.println(intro);
    }
       else if(select==2){
          x.ServePatient();
          System.out.println("------\n"+intro);
          
        }
        else if(select==3){
          x.CancelAll();
          System.out.println("------\n"+intro);
          
        }
        else if(select==4){
          x.CanDoctorGoHome();
          System.out.println("------\n"+intro);
        }
        else if(select==5){
          x.ShowAllPatient();
          System.out.println("-----\n"+intro);
        }
        else{
        System.out.println(intro);
        }
        
    }catch(Exception a){
    System.out.println("Try AGain");
    sc.next();
    }
  }  
  }
}