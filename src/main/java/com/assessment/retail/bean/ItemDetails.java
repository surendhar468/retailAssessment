/**
 * 
 */
package com.assessment.retail.bean;

/**
 * @author
 * 
 * Class contains customer item details
 */
public class ItemDetails {
  private Item item;
  private long itemQty;

  /**
   * @return the item
   */
  public Item getItem() {
    return item;
  }

  /**
   * @param item
   *          the item to set
   */
  public void setItem(Item item) {
    this.item = item;
  }

  /**
   * @return the itemQty
   */
  public long getItemQty() {
    return itemQty;
  }

  /**
   * @param itemQty
   *          the itemQty to set
   */
  public void setItemQty(long itemQty) {
    this.itemQty = itemQty;
  }

}
