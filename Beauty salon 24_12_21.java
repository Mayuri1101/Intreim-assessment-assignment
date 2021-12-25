1)Discount Price

package beautysalon;

public class DiscountPrice {
	private static double premium = 0.2;
	private static double Gold = 0.15;
	private static double silver = 0.1;
	private static double productPremium = 0.1;
	private static double productGold = 0.1;
	private static double productSilver = 0.1;

	public static double getServiceDiscount(String type) {
		switch (type) {
		case "Premium":
			return premium;
		case "Gold":
			return Gold;
		case "Silver":
			return silver;
		default:
			throw new IllegalArgumentException("Wrong service type");
		}
	}

	public static double getProductDiscount(String type) {
		switch (type) {
		case "Premium":
			return productPremium;
		case "Gold":
			return productGold;
		case "Silver":
			return productSilver;
		default:
			throw new IllegalArgumentException("wrong type");

		}
	}

}

2)Visit

package beautysalon;

import java.sql.Date;

public class Visit {
	private Customer name;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer name, Date date2) {
		this.name = name;
		this.date = date2;
	}

	public String getCustomerName() {
		return name.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountPrice.getServiceDiscount(name.getMemberType())))
				+ (productExpense - (productExpense * DiscountPrice.getProductDiscount(name.getMemberType())));

	}

	@Override
	public String toString() {
		return "Visit{" + "customer name=" + name.getName() + ", customer member=" + name.isMember()
				+ ", customer member type=" + name.getMemberType() + ", date=" + date + ", serviceExpense="
				+ serviceExpense + ", productExpense=" + productExpense + '}';
	}
}

3)Customer

package beautysalon;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;

	public Customer() {
		this.member = false;
	}

	public Customer(String name, boolean member, String memberType) {
		this.name = name;
		this.member = member;
		this.memberType = memberType;
	}

	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", member=" + member + ", memberType='" + memberType + '\'' + '}';
	}
}


4)Discount System

package beautysalon;

import java.util.Date;

public class DiscountSystem {
	public static void main(String[] args) {

		Customer c1 = new Customer("Mayu Tambe", true, "Premium");
		Customer c2 = new Customer("Akshu Shigwan", true, "Silver");
		System.out.println(c1.toString());
		System.out.println(c2.toString());

		Visit v1 = new Visit(c1, (java.sql.Date) new Date());
		System.out.println(v1.toString());

		v1.setProductExpense(4.5);
		v1.setServiceExpense(8.5);
		v1.setProductExpense(1.5);
		System.out.println(v1.toString());
		System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

	}

}

output
Customer{name='Mayu Tambe', member=true, memberType='Premium'}
Customer{name='Akshu Shigwan', member=true, memberType='Silver'}
Visit{customer name=Piet Clerx, customer member=true, customer member type=Premium, date=1899-12-31, serviceExpense=0.0, productExpense=0.0}
Visit{customer name=Piet Clerx, customer member=true, customer member type=Premium, date=1899-12-31, serviceExpense=8.5, productExpense=6.0}
Total expense made by Piet Clerx = 12.2