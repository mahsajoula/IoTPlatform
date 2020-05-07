public class AddOn extends Database implements DatabaseImp {
    private String addOnID;
    private String addOnName;
    private string addOnPic;
    private string addOnPrice;
    private List<Service> services = new ArrayList<>();

    public AddOn() {
        super();
        this.addOnID = addOnID
    }

    @override
    public void setData() {

    }

    @override
    public void updateData() {
    }

    @override
    public void deleteData() {

    }

    @override
    public void getData(String addOnID) {
        AddOn addOn = (AddOn)  this.read("SELECT * FROM AddOns WHERE id =" + this.addOnID);
        this.addOnName = addOn.addOnName;
        this.addOnPic = addOn.addOnPic;
        this.addOnPrice = addOn.addOnPrice;
        this.services = addOn.services;
    }

}
