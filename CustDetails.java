package com.storedepartmentalkannan;

public class CustDetails implements BonusPoints, DoorDelivery{
		private String custName;
		private String phNo;
		private String streetName;
		private double billAmt;
		private int distance;
		
		//Non-parameterized constructor
		public CustDetails() {
			super();
		}

		//Parameterized constructor
		public CustDetails(String custName, String phNo, String streetName, double billAmt, int distance) {
			super();
			this.custName = custName;
			this.phNo = phNo;
			this.streetName = streetName;
			this.billAmt = billAmt;
			this.distance = distance;
		}

		
		//Getter and Setter method
		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getPhNo() {
			return phNo;
		}

		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}

		public String getStreetName() {
			return streetName;
		}

		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}

		public double getBillAmt() {
			return billAmt;
		}

		public void setBillAmt(double billAmt) {
			this.billAmt = billAmt;
		}

		public int getDistance() {
			return distance;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}

		@Override
		public String toString() {
			return "CustDetails [custName=" + custName + ", phNo=" + phNo + ", streetName=" + streetName + ", billAmt="
					+ billAmt + ", distance=" + distance + "]";
		}

		@Override
		public double deliveryCharge() {
			
			double deliveryCharge=distance*10;
			return deliveryCharge;
		}

		@Override
		public double calculateBonusPoints() {
		
			if (billAmt>=300)
			{
				return billAmt/10;
			}
			else
			{
				return billAmt;
			}
		}

	
		
		
		
		
		
		
}
