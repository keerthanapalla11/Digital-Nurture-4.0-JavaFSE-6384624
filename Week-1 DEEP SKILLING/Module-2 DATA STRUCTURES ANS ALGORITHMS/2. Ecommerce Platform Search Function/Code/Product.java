package ecommerceplatform;

public class Product implements Comparable<Product>{

	int productId;
	String productName;
	String category;
	public Product(int productId,String productName,String category)
	{
		this.productId=productId;
		this.productName=productName;
		this.category=category;
	}
	public String getProductName() {
		return productName;
	}
	public int compareTo(Product other) {
		return this.productName.compareTo(other.productName);
	}
	public String toString()
	{
		return productId+"-"+productName+"("+category+")";
	}
}
