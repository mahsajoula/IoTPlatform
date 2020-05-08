public class UI {
SubscriptionController ob=new SubscriptionController(); // creating an Object
	static void ChoosePlan(){
		try{
			boolean SubscriptionsAndPlansLists=ob.getSubscriptionsAndPlans(); //calling first method
			System.out.println(SubscriptionsAndPlansLists);
			try{
				boolean choosePlans=ob.choosePlan();  //calling second method
				System.out.println(choosePlans);
			}
			catch (Exception e) {
				System.out.println("Something went wrong.");
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}
	public static void main (String[ ] args) {
		
		ChoosePlan();
 	
	
	}
}
