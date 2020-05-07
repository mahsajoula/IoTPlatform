import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cart extends Database implements DatabaseImp {

    private String cartID;
    private String userID;
    private List<Plan> plans = new ArrayList<>();
    private List<AddOn> addOns = new ArrayList<>();
    private float totalPrice;

    public Cart(String userID) {
        super();
        this.userID = userID;
        this.cartID = userID + new Date();
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void addPlan(Plan plans) {
        this.plans.add(plans);
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }

    public void addAddOn(AddOn addOns) {
        this.addOns.add(addOns);
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean deletePlan(String planID) {
        for (Plan plan : plans) {
            if (plan.id == planID) {
                this.plans.remove(plan);
                return true;
            }
        }
        return false;
    }

    public boolean deleteAddOn(String addOnID) {
        for (AddOn addOn : this.addOns) {
            if (addOn.id == addOnID) {
                this.plans.remove(addOn);
                return true;
            }
        }
        return false;
    }

    @override
    public void setData(Cart Data) {
        this.insert("INSERT INTO Cart VALUES (" + Data.cartID + Data.userID + Data.plans + Data.addOns + Data.totalPrice + ")");
    }

    @override
    public void updateData(String id, String column, String value) {
        Cart cart = (Cart) this.update("UPDATE Plans SET" + column + "=" + value + "WHERE id =" + id);
        this.cartID = cart.cartID;
        this.userID = cart.userID;
        this.plans = cart.plans;
        this.addOns = cart.addOns;
        this.totalPrice = cart.totalPrice;
    }

    @override
    public void deleteData(Cart Data) {

    }

    @override
    public void getData(Cart Data) {
        Cart cart = (Cart) this.read("SELECT * FROM Cart WHERE cartID = " + Data.cartID);
        this.cartID = cart.cartID;
        this.userID = cart.userID;
        this.plans = cart.plans;
        this.addOns = cart.addOns;
        this.totalPrice = cart.totalPrice;

    }

}
