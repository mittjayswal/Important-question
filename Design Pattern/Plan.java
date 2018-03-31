package com.as.mitt.designpattern;

public abstract class Plan {

	int rate ;
	public abstract void getplan();
	
	public void generateBill(int units) {
		System.out.println(rate);
		 System.out.println(units * rate);
	}
	
}
class DomesticPlan extends Plan {

	@Override
	public void getplan() {
		rate  = 3;
	}
	
	
}
class CommercialPlan extends Plan{

	@Override
	public void getplan() {
		rate = 4;
	}
	
	
}
class GetPlanFactory {
	public Plan getPlan (String planName) {
		if (planName == null) {
			return null;
		}
		else if (planName.equalsIgnoreCase("DOMESTIC PLAN")){
			return new DomesticPlan();
		}
		else if (planName.equalsIgnoreCase("COMMERCIAL PLAN")) {
			return new CommercialPlan();
		}
		return null;
		
	}
}
class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory getObject = new GetPlanFactory();
		
		
		Plan p = getObject.getPlan("commercial plan");
		p.getplan();		
		p.generateBill(10);
	}
	
	
	
	
}
