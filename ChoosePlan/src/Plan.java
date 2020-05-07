public class Plan extends Database implements DatabaseImp {
    String id;
    String name;
    float price;
    String duration;
    String PicAddress;
    String userId;

    public Plan(String userId, String planId) {
        super();
        this.userId = userId;
        this.id = planId;
    }

    // public String getId(){
    // return id;
    // }
    // public String getName(){
    // return name;
    // }
    // public float getPrice(){
    // return price;
    // }
    // public String getDuration(){
    // return duration;
    // }
    // public String getUserId(){
    // return userId;
    // }

    @override
    public void setData(Plan Data) {

    }

    @override
    public void updateData(String id, String column, String value) {
        Plan plan = (Plan) this.update("UPDATE Plans SET" + column + "=" + value + "WHERE id =" + id);
        this.name = plan.name;
        this.price = plan.price;
        this.duration = plan.duration;
        this.PicAddress = plan.PicAddress;
    }

    @override
    public void deleteData() {

    }

    @override
    public void getData() {
        Plan plan = (Plan) this.read("SELECT * FROM Plans WHERE id =" + this.id);
        this.name = plan.name;
        this.price = plan.price;
        this.duration = plan.duration;
        this.PicAddress = plan.PicAddress;
    }

}
