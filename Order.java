import java.util.ArrayList; 
// import java.util.Set; 
// import java.util.HashMap;
public class Order {

    public String customerName; 
    // public double totalPrice; 
    public boolean orderIsReady;
    public ArrayList<Item> orderItemsAL = new ArrayList<Item>(); 
    public double fullOrderPrice; 
    

    // below is a nice test, but no related to assignment
    public void somethingMthd(String incomingVariableForBelow) {

        System.out.println(incomingVariableForBelow); 

    }

    // note to self: needs to say "Item" i.e. name of class that's being used. 
    // ALSO, put 'void' after public, as shown below, when there's no need to return anything. 
    public void addItemToOrderMethod(Item incomingObj) {

        orderItemsAL.add(incomingObj); 
        // totalPrice += incomingObj.itemPrice; 

    }

    public void updateOrderStatus(String incomingStringVar) {
        if (incomingStringVar == "ready")  {
            orderIsReady = true; 
        }
        else {
            orderIsReady = false; 
        }; 
    }

    public void getOrderFullReadOut () {
        System.out.printf("Customer Name: %s \n", customerName ); 
        System.out.println("Ordered Items:"); 
        for (int i = 0; i < orderItemsAL.size(); i++) {
            int itemNumber = i+1; 
            System.out.println("Item #" + itemNumber + ": " + orderItemsAL.get(i).itemName + " $" + orderItemsAL.get(i).itemPrice); 
        }

        // System.out.printf("Total: $%s\n", totalPrice); 

        for (int i = 0; i < orderItemsAL.size(); i++) {
            fullOrderPrice += orderItemsAL.get(i).itemPrice; 
        }
        
        System.out.printf("Total: $%s\n", fullOrderPrice); 

        String orderIsReadyPrintVersion; 
        if (orderIsReady) {
            orderIsReadyPrintVersion = ("Order Ready!"); 
        }
        else {
            orderIsReadyPrintVersion = ("Working on it!"); 
        }; 

        System.out.println("Order Status: " + orderIsReadyPrintVersion); 
    }

    // public String initiateOrderMthd(String incomingCustomerName) {
        
    //     Order.customerName = incomingCustomerName; 
    //     System.out.println("order created::: \n Customer Name: " + incomingCustomerName); 
    //     return "yeppers"; 
    // }
}