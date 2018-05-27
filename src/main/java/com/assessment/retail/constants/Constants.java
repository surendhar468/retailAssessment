/**
 * 
 */
package com.assessment.retail.constants;

/**
 * @author
 * Class contains constants values which are using in application.
 */
public class Constants {
  
  public static final int EMPLOYEE_DISCOUNT = 30;  //If the customer is an employee of the store, he gets a 30% discount.
  public static final int AFFILIATE_DISCOUNT = 10; //If the customer is an affiliate of the store, he gets a 10% discount.
  public static final int CUSTOMER_OVER_2YEARS_DISCOUNT = 5; //If the customer has been a customer for over 2 years, he gets a 5% discount.
  
  public static final String CUSTOMER_EMPLOYEE_TYPE = "Employee";
  public static final String CUSTOMER_AFFILIATED_TYPE = "Affiliated";
  public static final String CUSTOMER_OVER_2YEARS_TYPE = "Over2Years";
  public static final String ITEM_GROCERY_TYPE = "Grocery";
  public static final String ITEM_NON_GROCERY_TYPE = "NonGrocery";
  
  public static final int DISCOUNT_FOR_EVERY_$100_BILL = 5; //$5, For every $100 on the bill, there would be a $5 discount.
  public static final int DISCOUNT_FOR_EVERY_BILL = 100; // $100
}
