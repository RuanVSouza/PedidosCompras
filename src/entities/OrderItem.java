package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;

	
	public OrderItem(){
	}
	
	

	public OrderItem(Integer quantify, Double price, Product product) {
		super();
		this.quantity = quantify;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantify() {
		return quantity;
	}

	public void setQuantify(Integer quantify) {
		this.quantity = quantify;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public double subTotal(){
		return quantity * price;
	}


	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	
	}
	
}
