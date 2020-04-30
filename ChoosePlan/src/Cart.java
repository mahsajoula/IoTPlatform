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
            if (plan.planID == planID) {
                this.plans.remove(plan);
                return true;
            }
        }
        return false;
    }

    public boolean deleteAddOn(String addOnID) {
        for (Plan addOn : addOns) {
            if (addOn.addOnID == addOnID) {
                this.plans.remove(addOn);
                return true;
            }
        }
        return false;
    }

}
