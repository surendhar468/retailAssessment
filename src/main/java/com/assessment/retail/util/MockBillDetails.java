/**
 * 
 */
package com.assessment.retail.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Date;

import com.assessment.retail.bean.BillDetails;
import com.assessment.retail.bean.Customer;
import com.assessment.retail.bean.Item;
import com.assessment.retail.bean.ItemDetails;
import com.assessment.retail.constants.Constants;

/**
 * @author 
 * 
 * Class contains mock data for bill details
 * 
 */
public class MockBillDetails {

  public static Set<BillDetails> billDetailsList = new HashSet<BillDetails>();
  
  static {
	List<ItemDetails> items = new ArrayList<ItemDetails>();
    
    // ITEM 101
    ItemDetails itemDetails1 = new ItemDetails();
    Item item1 = new Item();
    item1.setCode("ITEM101");
    item1.setDescription("ITEM 101");
    item1.setRate(10);
    item1.setType(Constants.ITEM_NON_GROCERY_TYPE);
    itemDetails1.setItem(item1);
    itemDetails1.setItemQty(2);
    items.add(itemDetails1);
    
    // ITEM 102
    ItemDetails itemDetails2 = new ItemDetails();
    Item item2 = new Item();
    item2.setCode("ITEM102");
    item2.setDescription("ITEM 102");
    item2.setRate(20);
    item2.setType(Constants.ITEM_NON_GROCERY_TYPE);
    itemDetails2.setItem(item2);
    itemDetails2.setItemQty(4);
    items.add(itemDetails2);
    
    // ITEM 3
    ItemDetails itemDetails3 = new ItemDetails();
    Item item3 = new Item();
    item3.setCode("ITEM103");
    item3.setDescription("ITEM 103");
    item3.setRate(30);
    item3.setType(Constants.ITEM_GROCERY_TYPE);
    itemDetails3.setItem(item3);
    itemDetails3.setItemQty(6);
    
    items.add(itemDetails3);

    // User is an employee of the store
    BillDetails billDetails1 = new BillDetails();
    billDetails1.setBillNo("BILL001");
    billDetails1.setItems(items);
    billDetails1.setBiilDate(new Date());
    Customer customer1 = new Customer();
    customer1.setFirstName("Test");
    customer1.setLastName("One");
    customer1.setMobileNum("1234567890");
    customer1.setCustomerId("CUST001");
    customer1.setCustomerType(Constants.CUSTOMER_EMPLOYEE_TYPE);
    customer1.setEmailId("test.one@test.com");
    customer1.setAddress("USA");
    customer1.setStatus("A");
    customer1.setTelephoneNumber("1234567890");
    billDetails1.setCustomer(customer1);
    
    // User is an affiliated of the store
    BillDetails billDetails2 = new BillDetails();
    billDetails2.setBillNo("BILL002");
    billDetails2.setItems(items);
    billDetails2.setBiilDate(new Date());
    Customer customer2 = new Customer();
    customer2.setFirstName("Test");
    customer2.setLastName("Two");
    customer2.setMobileNum("12345670");
    customer2.setCustomerId("CUST002");
    customer2.setCustomerType(Constants.CUSTOMER_AFFILIATED_TYPE);
    customer2.setEmailId("test.two@test.com");
    customer2.setAddress("USA");
    customer2.setStatus("A");
    customer2.setTelephoneNumber("1234567890");
    billDetails2.setCustomer(customer2);
    
    // user	has	been a customer	for	over 2 years
    BillDetails billDetails3 = new BillDetails();
    billDetails3.setBillNo("BILL003");
    billDetails3.setItems(items);
    billDetails3.setBiilDate(new Date());
    Customer customer3 = new Customer();
    customer3.setFirstName("Test");
    customer3.setLastName("Three");
    customer3.setMobileNum("12345670");
    customer3.setCustomerId("CUST003");
    customer3.setCustomerType(Constants.CUSTOMER_OVER_2YEARS_TYPE);
    customer3.setEmailId("test.three@test.com");
    customer3.setAddress("USA");
    customer3.setStatus("A");
    customer3.setTelephoneNumber("1234567890");
    billDetails3.setCustomer(customer3);
    
    // new user with does not match above 3 scenarios
    BillDetails billDetails4 = new BillDetails();
    billDetails4.setBillNo("BILL004");
    billDetails4.setItems(items);
    billDetails4.setBiilDate(new Date());
    Customer customer4 = new Customer();
    customer4.setFirstName("Test");
    customer4.setLastName("Four");
    customer4.setMobileNum("12345670");
    customer4.setCustomerId("CUST004");
    customer4.setCustomerType(null);
    customer4.setEmailId("test.four@test.com");
    customer4.setAddress("USA");
    customer4.setStatus("A");
    customer4.setTelephoneNumber("1234567890");
    billDetails4.setCustomer(customer4);

    billDetailsList.add(billDetails1);
    billDetailsList.add(billDetails2);
    billDetailsList.add(billDetails3);
    billDetailsList.add(billDetails4);
  }
  
  /**
   * Method to get bill details based on bill no.
   * @param billNo
   * @return
   */
  public static BillDetails getMockBillDetailsById(String billNo) {
    BillDetails billDetails = new BillDetails();
    for(BillDetails bill: billDetailsList) {
     if(billNo.equals(bill.getBillNo())) {
       billDetails = bill;
       break;
     }
    }
    return billDetails;
  }

}
