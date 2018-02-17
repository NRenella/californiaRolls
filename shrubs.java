public class shrubs extends garden implements gardeningEssentials
{
   //used to perform the action on shrubs
   public void watering()
   {
      garden.wateringSchedule[1]=0;
   }
   public void trimming()
   {
      garden.trimmingSchedule[1]=0;
   }
   public void fertilizing()
   {
      garden.trimmingSchedule[1]=0;
   }
}