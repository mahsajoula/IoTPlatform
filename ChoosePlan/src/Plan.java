public class Plan extends Database implements DatabaseImp {
     String id;
     String name;
     float price ;
     String duration;
     String PicAddress;
     String userId;

     public Plan(String userId,String planId) {
         super();
         this.userId = userId;
         this.id = planId; 
     }
    //  public String getId(){
    //      return id;
    //  }
    //  public String getName(){
    //      return name;
    //  }
    //  public float getPrice(){
    //      return price;
    //  }
    //  public String getDuration(){
    //      return duration;
    //  }
    //  public String getUserId(){
    //      return userId;
    //  }
     public void setData(String name ,float Price , String duration, String PicAddress ){
         
     }
     public void updateData(String planId,String column , Stirng value ){
         Object plan = new Object();
         plan = this.update("update Plans set"+ column +"="+value+"where id="+ planId)
         this.name = plan.name;
         this.price = plan.price;
         this.duration = plan.duration;
         this.PicAddress = plan.PicAddress;
     }
     public void deleteData(){
         
     }
     public void getData(){
         Object plan = new Object();
         plan = this.select("select * from Plans where id="+this.id)
         this.name = plan.name;
         this.price = plan.price;
         this.duration = plan.duration;
         this.PicAddress = plan.PicAddress;

     }

}
