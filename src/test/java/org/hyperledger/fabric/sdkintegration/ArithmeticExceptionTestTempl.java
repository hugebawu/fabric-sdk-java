package org.hyperledger.fabric.sdkintegration;

/*
 * This class is for exception test
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticExceptionTestTempl {

	String message = "Robert";
	GeneralUtilTempl messageUtil = new GeneralUtilTempl(message);

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
