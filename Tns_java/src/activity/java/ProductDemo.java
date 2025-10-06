package activity.java;

public class ProductDemo {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setId(001);
		p1.setName("Laptop");
		p1.setPrice("50000");
		System.out.println(p1);
		
		Product p2=new Product();
		p2.setId(002);
		p2.setName("Smartphone");
		p2.setPrice("20000");
		System.out.println(p2);
		
		Product p3=new Product();
		p3.setId(003);
		p3.setName("Headset");
		p3.setPrice("10000");
		System.out.println(p3);
	}
}
