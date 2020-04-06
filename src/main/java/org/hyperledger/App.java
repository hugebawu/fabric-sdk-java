package org.hyperledger;

import org.hyperledger.fabric.sdk.HFClient;
import org.hyperledger.fabric.sdk.security.CryptoSuite;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HFClient client = HFClient.createNewInstance();
		client.setCryptoSuite(CryptoSuite.Factory.getCryptoSuite());
		System.out.println("fabric-sdk-java installed successfully.");
	}

}
