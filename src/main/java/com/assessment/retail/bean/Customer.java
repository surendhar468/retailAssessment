/**
 * 
 */
package com.assessment.retail.bean;

import java.util.Date;

/**
 * @author
 * 
 */
public class Customer {

  private String customerId;
  private String firstName;
  private String lastName;
  private String mobileNum;
  private String emailId;
  private String address;
  private String telephoneNumber;
  private Date createdDate;
  private String status;
  private String customerType;

  /**
   * @return the customerId
   */
  public String getCustomerId() {
    return customerId;
  }

  /**
   * @param customerId
   *          the customerId to set
   */
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName
   *          the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName
   *          the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the mobileNum
   */
  public String getMobileNum() {
    return mobileNum;
  }

  /**
   * @param mobileNum
   *          the mobileNum to set
   */
  public void setMobileNum(String mobileNum) {
    this.mobileNum = mobileNum;
  }

  /**
   * @return the emailId
   */
  public String getEmailId() {
    return emailId;
  }

  /**
   * @param emailId
   *          the emailId to set
   */
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address
   *          the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the telephoneNumber
   */
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * @param telephoneNumber
   *          the telephoneNumber to set
   */
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  /**
   * @return the createdDate
   */
  public Date getCreatedDate() {
    return createdDate;
  }

  /**
   * @param createdDate
   *          the createdDate to set
   */
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * @param status
   *          the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * @return the customerType
   */
  public String getCustomerType() {
    return customerType;
  }

  /**
   * @param customerType
   *          the customerType to set
   */
  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

}
