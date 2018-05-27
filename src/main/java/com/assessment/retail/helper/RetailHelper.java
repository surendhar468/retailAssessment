/**
 * 
 */
package com.assessment.retail.helper;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.assessment.retail.bean.BillDetails;
import com.assessment.retail.bean.ItemDetails;
import com.assessment.retail.constants.Constants;
import com.assessment.retail.util.MockBillDetails;
import com.assessment.retail.util.Utils;

/**
 * @author
 * 
 * Helper contains the method to calculate the retail bill amount.
 *
 */
public class RetailHelper {
  
  /**
   * Method to get discount based on customer type and also these discounts do not apply on groceries items.
   * @param customerType
   * @return
   */
  public static float getDiscountByCustType(String customerType) {
    float custTypeDiscount = 0.0f;
    if (Constants.CUSTOMER_EMPLOYEE_TYPE.equalsIgnoreCase(customerType)) {
      custTypeDiscount = Constants.EMPLOYEE_DISCOUNT; //If the customer is an employee of the store, he gets a 30% discount.
    } else if (Constants.CUSTOMER_AFFILIATED_TYPE.equalsIgnoreCase(customerType)) {
      custTypeDiscount = Constants.AFFILIATE_DISCOUNT; //If the customer is an affiliate of the store, he gets a 10% discount.
    } else if (Constants.CUSTOMER_OVER_2YEARS_TYPE.equalsIgnoreCase(customerType)) {
      custTypeDiscount = Constants.CUSTOMER_OVER_2YEARS_DISCOUNT; //If the customer has been a customer for over 2 years, he gets a 5% discount.
    }
    return custTypeDiscount;
  }
  
  /**
   * Method to check the customer has been a customer for over 2 years based on customer registered date and bill date.
   * @param custDate
   * @param billDate
   * @return
   */
  public static boolean isCustomerOver2Years(Date custDate, Date billDate) {
    Calendar billDateCal = Utils.getCalendar(billDate);
    Calendar custDateCal = Utils.getCalendar(custDate);
    int diffYears = custDateCal.get(Calendar.YEAR) - billDateCal.get(Calendar.YEAR);
    if (billDateCal.get(Calendar.MONTH) > custDateCal.get(Calendar.MONTH) || 
        (billDateCal.get(Calendar.MONTH) == custDateCal.get(Calendar.MONTH) && billDateCal.get(Calendar.DATE) > custDateCal.get(Calendar.DATE))) {
      diffYears--;
    }
    if(diffYears>=2){
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Method to calculate items wise amt.
   * 
   * @param itemDetailsList
   * @return
   */
  public static Map<String, Float> calculateItemsAmtByItemType(List<ItemDetails> itemDetailsList) {
    Map<String, Float> itemTypeAmtMap = new HashMap<String, Float>();
    for (ItemDetails item : itemDetailsList) {
      float itemWiseAmt = item.getItemQty() * item.getItem().getRate();
      if (Constants.ITEM_GROCERY_TYPE.equalsIgnoreCase(item.getItem().getType())) {
        if (itemTypeAmtMap.containsKey(Constants.ITEM_GROCERY_TYPE)) {
          itemTypeAmtMap.put(Constants.ITEM_GROCERY_TYPE, (itemWiseAmt) + itemTypeAmtMap.get(Constants.ITEM_GROCERY_TYPE));
        } else {
          itemTypeAmtMap.put(Constants.ITEM_GROCERY_TYPE, itemWiseAmt);
        }
      } else {
        if (itemTypeAmtMap.containsKey(Constants.ITEM_NON_GROCERY_TYPE)) {
          itemTypeAmtMap.put(Constants.ITEM_NON_GROCERY_TYPE, (itemWiseAmt) + itemTypeAmtMap.get(Constants.ITEM_NON_GROCERY_TYPE));
        } else {
          itemTypeAmtMap.put(Constants.ITEM_NON_GROCERY_TYPE, itemWiseAmt);
        }
      }
    }
    return itemTypeAmtMap;
  }
  
  /**
   * 
   * @param itemAmt
   * @return
   */
  public static float calculateAmtOnEveryBill(float itemsBillAmt) {
    float discountAmt = 0.0f;
    if(itemsBillAmt >= 100) {
      int val = (int) (itemsBillAmt/Constants.DISCOUNT_FOR_EVERY_BILL);
      discountAmt = val * Constants.DISCOUNT_FOR_EVERY_$100_BILL;
    }
    return discountAmt;
  }
  
  /**
   * Getting bill details by billno from mock data.
   */
    public static BillDetails getBillDetails(String billNo) {
      return MockBillDetails.getMockBillDetailsById(billNo);
    }
}
