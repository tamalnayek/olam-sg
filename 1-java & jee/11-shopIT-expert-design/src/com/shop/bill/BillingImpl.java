package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 * 
 *  design & performance issues
 *  ----------------------------
 *  
 *  1. tight-coupling b/w dependent & dependency
 *  	==> can't extend with new-features
 *  2. too many dependency-instances created & discarded
 *  	==> slow,memory/resource-use high
 *  3. unit-testing not possible
 *  	==> dev & bug fix slow
 *  
 * 
 * 	why these issues ?
 * 
 *   ==> dependent itself creating its own dependency
 *   
 *  soln:
 *  
 *   	==> don't create , do lookup in factory
 *   
 *   limitation on factory-lookup:
 *   
 *    	==> factory-location tight-coupling
 * 
 *  best-soln:
 *  
 *  	=> don't create / lookup , inject by 'third-party'  ( IOC )
 *  
 *  IOC ==> Inversion Of Control 	
 *  
 *  	how to do ?
 *  
 *  		==> dependency injection ( di )
 *  
 *  
 *      how to inject dependency ?
 *      
 *      many ways ?
 *      
 *      	- constructor level DI
 *          - setter level DI
 *          
 *          
 *          
 *          
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix = null;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}
	
	

	/* (non-Javadoc)
	 * @see com.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		for (int i = 0; i < cart.length; i++) {
			String item = cart[i];
			double itemPrice = priceMatrix.getPrice(item);
			total = total + itemPrice;
		}
		return total;

	}

}
