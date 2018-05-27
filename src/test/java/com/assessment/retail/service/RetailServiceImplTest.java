/**
 * 
 */
package com.assessment.retail.service;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author
 *
 */
public class RetailServiceImplTest {

	/**
	 * <pre>
	 *   SCENARIO: If the user is an employee of the store, he gets a 30% discount
	 *   GIVEN: valid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo exists
	 *   THEN: Bill invoice amount will be 240.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithValidBillNoCustEmployee() {
		String billNo = "BILL001";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(240.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If the user is an employee of the store, he gets a 30% discount
	 *   GIVEN: Invalid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo does not exists
	 *   THEN: Bill invoice amount will be 0.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithInvalidBillNoCustEmployee() {
		String billNo = "BILL005";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(0.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If the user is an affiliate of the store, he gets a 10% discount
	 *   GIVEN: Valid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo exists
	 *   THEN: Bill invoice amount will be 260.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithValidBillNoCustAffiliated() {
		String billNo = "BILL002";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(260.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If the user is an affiliate of the store, he gets a 10% discount
	 *   GIVEN: Invalid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo does not exists
	 *   THEN: Bill invoice amount will be 0.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithInvalidBillNoCustAffliated() {
		String billNo = "BILL005";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(0.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If the customer has been a customer for over 2 years, he gets a 5% discount.
	 *   GIVEN: Valid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo exists
	 *   THEN: Bill invoice amount will be 265.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithValidBillNoCustOver2Yrs() {
		String billNo = "BILL003";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(265.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If the customer has been a customer for over 2 years, he gets a 5% discount.
	 *   GIVEN: Invalid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo does not exists
	 *   THEN: Bill invoice amount will be 0.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithInvalidBillNoCustOver2Yrs() {
		String billNo = "BILL005";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(0.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}
	
	/**
	 * <pre>
	 *   SCENARIO: If new customer.
	 *   GIVEN: Valid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo exists
	 *   THEN: Bill invoice amount will be 270.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithValidBillNoNewCust() {
		String billNo = "BILL004";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(270.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	/**
	 * <pre>
	 *   SCENARIO: If new customer.
	 *   GIVEN: Invalid BillNo property
	 *   AND itemType values 'NonGrocery' and 'Grocery'
	 *   WHEN: the billNo does not exists
	 *   THEN: Bill invoice amount will be 0.0
	 * </pre>
	 */
	@Test
	public void testCalculcateBillInvoiceAmtWithInvalidBillNoNewCust() {
		String billNo = "BILL005";
		RetailService retailService = new RetailServiceImpl();
		try {
			float invoiceBillAmt = retailService.calculcateBillInvoiceAmt(billNo);
			assertEquals(0.0, invoiceBillAmt, 0.0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}
}
