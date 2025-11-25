package com.infoviaan.basic.IfElse;

public class CheckProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cost = 5000;
		double sell = 6000;
		double profit, loss;
		
		if(cost < sell) {
			profit = sell - cost;
			System.out.println("Total profit is = " + profit);
		} else if(cost > sell) {
			loss = cost - sell;
			System.out.println("Total loss is  = " + loss);
		} else if(cost == sell) {
			System.out.println("No! profit and No! loss");
		} else {
			 System.out.println("Invalid ");
		}

	}

}
