public class flowers extends garden implements gardeningEssentials
{
   //used to perform the action on flowers
   public void watering()
   {
      garden.wateringSchedule[0]=0;
   }
   public void trimming()
   {
      garden.trimmingSchedule[0]=0;
   }
   public void fertilizing()
   {
      garden.fertilizingSchedule[0]=0;
   }

}