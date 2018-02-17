import java.util.Scanner;

public class gardendemo
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int choice, wateringChoice, trimmingChoice, fertilizingChoice;
      
      //polymorphic array for all the objects
      garden object[] = new garden[4];
      object[0] = new flowers();
      object[1] = new shrubs();
      object[2] = new tree();
      object[3] = new garden();
      

      //for loops to simulate days
      for(int days = 1; days < 10000; days++)
      {
      
      System.out.println("Welcome to day " + days + " of your garden");
         
          do{
             System.out.print("Would you like to check on you plants before deciding what to do? Yes(1) No(2)");
             choice = kb.nextInt();
             
             if(choice == 1)
             {
                object[3].gardenWarning();              
             }
             
             }while(choice < 1 || choice > 2);
         do{    
         System.out.print("So which plant would you like to water? (1)Flowers (2)Shrubs (3)Trees ");
         wateringChoice = kb.nextInt();
         }while(wateringChoice < 1 || wateringChoice > 3);
         
         System.out.println("Plants watered");
         
         do{    
         System.out.print("So which plant would you like to trim? (1)Flowers (2)Shrubs (3)Trees ");
         trimmingChoice = kb.nextInt();
         }while(trimmingChoice < 1 || trimmingChoice > 3);
         
         System.out.println("Plants trimmed");
         
         do{    
         System.out.print("So which plant would you like to fertilize? (1)Flowers (2)Shrubs (3)Trees ");
         fertilizingChoice = kb.nextInt();
         }while(fertilizingChoice < 1 || fertilizingChoice > 3);
                  
         
         System.out.println("Plants fertilized");
         
         //ends the day in garden
         object[3].endDay();
         
         //takes the choices you made and resets the day counter for each
         if(wateringChoice == 1)
            object[0].watering();
         else if(wateringChoice == 2)
            object[1].watering();
         else if(wateringChoice == 3)
            object[2].watering();
            
         if(trimmingChoice == 1)
            object[0].trimming();
         else if(trimmingChoice == 2)
            object[1].trimming();
         else if(trimmingChoice == 3)
            object[2].trimming();   
         
         if(fertilizingChoice == 1)
            object[0].fertilizing();
         else if(fertilizingChoice == 2)
            object[1].fertilizing();
         else if(fertilizingChoice == 3)
            object[2].fertilizing();
            
         
      }
   }
}