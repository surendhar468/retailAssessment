/**
 * 
 */
package com.assessment.retail.bean;

/**
 * @author
 * 
 * Class for stores Item master data
 */
public class Item {

  private String code;
  private String description;
  private long rate;
  private String type;

  /**
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * @param code
   *          the code to set
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description
   *          the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the rate
   */
  public long getRate() {
    return rate;
  }

  /**
   * @param rate
   *          the rate to set
   */
  public void setRate(long rate) {
    this.rate = rate;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

}
