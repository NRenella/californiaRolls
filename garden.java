public class garden
{   
   //counter for how many days each has gone without each activity [0]=flowers [1]=shrubs [2]=trees
   //Protected so that subclasses can access them
   protected static int [] wateringSchedule = {0,0,0};
   protected static int [] trimmingSchedule = {4,0,2};
   protected static int [] fertilizingSchedule = {0,1,0};
   
   public void watering()
   {     
   }
   public void trimming()
   {  
   }
   public void fertilizing()
   {  
   }
   
   //for when user wants to see how long each has gone for without care
   
   public void gardenWarning()
   {
   //Warns you if you havent water a plant in three days
      for(int col=0;col<3;col++)
      {
         if(wateringSchedule[col]>3)
         { 
            if(col==0)
               System.out.println("It has been " + wateringSchedule[col] + " days since you watered your flowers.");
            else if(col==1)
               System.out.println("It has been " + wateringSchedule[col] + " days since you watered your shrubs.");
            else if(col==2)
               System.out.println("It has been " + wateringSchedule[col] + " days since you watered your trees.");
           
         }
      }
      //Warns you if you havent trimmed a plant in three days
      for(int col=0;col<3;col++)
      {
         if(trimmingSchedule[col]>3)
         { 
            if(col==0)
               System.out.println("It has been " + trimmingSchedule[col] + " days since you trimmed your flowers.");
            else if(col==1)
               System.out.println("It has been " + trimmingSchedule[col] + " days since you trimmed your shrubs.");
            else if(col==2)
               System.out.println("It has been " + trimmingSchedule[col] + " days since you trimmed your trees.");
          
         }
      }
      //Warns you if you havent fertilized a plant in three days
      for(int col=0;col<3;col++)
      {
         if(fertilizingSchedule[col]>3)
         { 
            if(col==0)
               System.out.println("It has been " + fertilizingSchedule[col] + " days since you fertilized your flowers.");
            else if(col==1)
               System.out.println("It has been " + fertilizingSchedule[col] + " days since you fertilized your shrubs.");
            else if(col==2)
               System.out.println("It has been " + fertilizingSchedule[col] + " days since you fertilized your trees.");
           
         }
      }
   
   }
   //ends the day
   public void endDay()
   {
      for(int col=0;col<3;col++)
      {
         wateringSchedule[col] += 1;
         fertilizingSchedule[col] +=1;
         trimmingSchedule[col] +=1;
      }
      
   }
}