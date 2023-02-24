package entities;

public class Product {

	private String productName;
	private Double productPrice;
	
	public Product() {
	}
	
	

	public Product(String name, Double price) {
		this.productName = name;
		this.productPrice = price;
	}



	public String getName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public Double getPrice() {
		return productPrice;
	}

	public void setPrice(Double price) {
		this.productPrice = price;
	}



	
	
}
