/**
 * 
 */
package com.assessment.retail.service;

import java.util.Map;

import com.assessment.retail.bean.BillDetails;
import com.assessment.retail.bean.Customer;
import com.assessment.retail.constants.Constants;
import com.assessment.retail.helper.RetailHelper;

/**
 * @author 
 *
 */
public class RetailServiceImpl implements RetailService {
  
 /**
  * Method to calculate the bill invoice amount based on bill no.
  * 
  */
  public float calculcateBillInvoiceAmt(String billNo) {
	  float totalBillAmt = 0.0f;
	  try {
			// Getting bill details by bill number from mock data.
		    BillDetails billDetails = RetailHelper.getBillDetails(billNo);
		    
		    if(billDetails!=null) {
		      Customer customer = billDetails.getCustomer();
		      if(customer!=null) {
		    	  String custType = customer.getCustomerType();
		          if((!Constants.CUSTOMER_EMPLOYEE_TYPE.equalsIgnoreCase(custType) || !Constants.CUSTOMER_AFFILIATED_TYPE.equalsIgnoreCase(custType)) && 
		              custType==null && customer.getCreatedDate()!=null) {
		            if(RetailHelper.isCustomerOver2Years(customer.getCreatedDate(), billDetails.getBiilDate())) {
		              custType = Constants.CUSTOMER_OVER_2YEARS_TYPE;
		            }
		          }
		          // getting discount percentage based on customer type criteria.
		          float custTypeBasedDiscount = RetailHelper.getDiscountByCustType(custType);
		          // Calculate item wise bill amt.
		          Map<String, Float> itemTypeWiseAmtMap = RetailHelper.calculateItemsAmtByItemType(billDetails.getItems());
		          float nonGroceryItemsTotalAmt = 0.0f;
		          if(custTypeBasedDiscount>0 && itemTypeWiseAmtMap.containsKey(Constants.ITEM_NON_GROCERY_TYPE)) {
		        	  nonGroceryItemsTotalAmt = itemTypeWiseAmtMap.get(Constants.ITEM_NON_GROCERY_TYPE) - (itemTypeWiseAmtMap.get(Constants.ITEM_NON_GROCERY_TYPE) * (custTypeBasedDiscount/100));
		          } else {
		        	  nonGroceryItemsTotalAmt = itemTypeWiseAmtMap.get(Constants.ITEM_NON_GROCERY_TYPE);
		          }
		          
		          float groceryItemsTotalAmt = 0.0f;
		          if(itemTypeWiseAmtMap.containsKey(Constants.ITEM_GROCERY_TYPE)) {
		        	  groceryItemsTotalAmt = itemTypeWiseAmtMap.get(Constants.ITEM_GROCERY_TYPE);  
		          }
		          float itemsBillAmt = nonGroceryItemsTotalAmt + groceryItemsTotalAmt;
		          totalBillAmt = itemsBillAmt - RetailHelper.calculateAmtOnEveryBill(itemsBillAmt);  
		      }
		    }
	  } catch(Exception ex) {
		  ex.printStackTrace();
	  }
	  return totalBillAmt;
  }
}
