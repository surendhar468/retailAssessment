package com.assessment.retail.bean;

import java.util.Date;
import java.util.List;

public class BillDetails {

  private String billNo;
  private List<ItemDetails> items;
  private Customer customer;
  private Date biilDate;
  private String cashierId;

  /**
   * @return the billNo
   */
  public String getBillNo() {
    return billNo;
  }

  /**
   * @param billNo
   *          the billNo to set
   */
  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  /**
   * @return the items
   */
  public List<ItemDetails> getItems() {
    return items;
  }

  /**
   * @param items
   *          the items to set
   */
  public void setItems(List<ItemDetails> items) {
    this.items = items;
  }

  /**
   * @return the customer
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * @param customer
   *          the customer to set
   */
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * @return the biilDate
   */
  public Date getBiilDate() {
    return biilDate;
  }

  /**
   * @param biilDate
   *          the biilDate to set
   */
  public void setBiilDate(Date biilDate) {
    this.biilDate = biilDate;
  }

  /**
   * @return the cashierId
   */
  public String getCashierId() {
    return cashierId;
  }

  /**
   * @param cashierId
   *          the cashierId to set
   */
  public void setCashierId(String cashierId) {
    this.cashierId = cashierId;
  }

}
