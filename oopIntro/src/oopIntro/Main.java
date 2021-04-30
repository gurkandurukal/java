package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Product product1=new Product(1, "Lenovo 14", 15000, "16 Gb RAM", 10); //Örnek oluşturma, referans oluşturma, instance creation
//		product1.id=1;
//		product1.name="Lenovo V14";
//		product1.unitPrice=15000;
//		product1.detail="16 Gb RAM";
		
		Product product2=new Product(); //Örnek oluşturma, referans oluşturma, instance creation
//		product2.id=2;
//		product2.name="Lenovo V15";
//		product2.unitPrice=16000;
//		product2.detail="32 Gb RAM";
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 Gb RAM");

		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3=new Product(); //Örnek oluşturma, referans oluşturma, instance creation
//		product3.id=3;
//		product3.name="HP 5";
//		product3.unitPrice=10000;
//		product3.detail="8 Gb RAM";
		
		Product[] products= {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		

		System.out.println(products.length);
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
	}

}
