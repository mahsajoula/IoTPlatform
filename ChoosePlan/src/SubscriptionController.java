

public class SubscriptionController {

    private AddOn addOn;
    private Cart cart;
    private Plan plan;


    public boolean getSubscriptionsAndPlans() {
        try {
            for(int i = 0 ; i < 2 ; i ++) {
                plan = new Plan(String.valueOf(i));
                plan.getData();

            }
            for (int i = 0 ; i < 2 ; i ++) {
                addOn = new AddOn(String.valueOf(i));
                addOn.getData;
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    public boolean choosePlan(Cart data) {
        try {
            cart.setData(data);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
