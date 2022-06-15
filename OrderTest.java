import java.util.ArrayList; 
// import java.util.Set; 
// import java.util.HashMap;

public class OrderTest {
    public static void main (String[] args) {

        // below of no consequence other that init test
        Order orderObj = new Order(); 
        String someVariable = "yeppers"; 
        orderObj.somethingMthd(someVariable); 

        // 1.0 - APP variables

        // 1.1 - items objects
        Item itemObj1 = new Item();
        itemObj1.itemName = "mocha";
        itemObj1.itemPrice = 100.01;

        Item itemObj2 = new Item();
        itemObj2.itemName = "latte";
        itemObj2.itemPrice = 200.02;

        Item itemObj3 = new Item(); 
        itemObj3.itemName = "drip coffee"; 
        itemObj3.itemPrice = 300.03; 

        Item itemObj4 = new Item(); 
        itemObj4.itemName = "cappucino"; 
        itemObj4.itemPrice = 400.04; 

        // 1.2 order objects

        Order orderObj1 = new Order(); 
        orderObj1.customerName = "Cindhuri";
        Order orderObj2 = new Order(); 
        orderObj2.customerName = "Jimmy"; 
        Order orderObj3 = new Order(); 
        orderObj3.customerName = "Noah"; 
        Order orderObj4 = new Order(); 
        orderObj4.customerName = "Sam"; 

        // System.out.println(orderObj1); // prints the ojbect instance, nothing more
        // System.out.println(orderObj1.totalPrice); // prints 0.0, i.e. the default;

        // 1.3 application of orders - initial test

        // orderObj2.orderItemsAL.add(itemObj1); 
        // orderObj2.totalPrice += itemObj1.itemPrice; 

        // let's make above into a method? trying below 

        orderObj2.addItemToOrderMethod(itemObj1); 
        orderObj3.addItemToOrderMethod(itemObj4); 
        orderObj4.addItemToOrderMethod(itemObj2); 

        orderObj2.updateOrderStatus("ready"); 

        orderObj4.addItemToOrderMethod(itemObj2); 

        orderObj2.updateOrderStatus("ready"); 


        orderObj1.getOrderFullReadOut(); 
        orderObj2.getOrderFullReadOut(); 
        orderObj3.getOrderFullReadOut(); 
        orderObj4.getOrderFullReadOut(); 




        // 1.4 application of orders - assigned tests


        // System.out.println("-------now, trying as a cross-file method ---------"); 

        // Order orderObjC = new Order(); 
        // String customerNameVbl = "Cindhuri"; 
        // orderObjC.initiateOrderMthd(customerNameVbl); 

    }
}