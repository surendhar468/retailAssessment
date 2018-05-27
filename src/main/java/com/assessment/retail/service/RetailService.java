package com.assessment.retail.service;


public interface RetailService {
  
  /**
   * Method for calculating invoice bill amount.
   * 
   * @param billNo
   * @return
   */
  float calculcateBillInvoiceAmt(String billNo) throws Exception;
  
}
