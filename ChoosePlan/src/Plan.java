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
         this.insert("insert into Plans values ("+ name +','+ price + "," + duration +","+ PicAddress +")")
     }
     public void updateData(Object ){
         this.update("update Plans where id="+this.id+"set")
     }
     public void deleteData(){
         this.delete("delete from Plans where id="+this.id)
     }
     public void getData(){
         this.select("select * from Plans where id="+this.id)

     }

}
