package ecommerceplatform;

import java.util.List;
public class LinearSearch {
	public static Product linearSearch(List<Product> products,String name)
	{
		name=name.toLowerCase();
		for(Product p:products) {
			if(p.getProductName().equalsIgnoreCase(name))
			{
				return p;
			}
		}
		return null;
	}
}
