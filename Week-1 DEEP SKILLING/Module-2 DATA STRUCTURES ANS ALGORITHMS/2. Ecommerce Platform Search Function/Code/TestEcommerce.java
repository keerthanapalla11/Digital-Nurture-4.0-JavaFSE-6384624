package ecommerceplatform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestEcommerce {

	public static void main(String[] args)
	{
		List<Product> products=new ArrayList<>();
		products.add(new Product(1001,"T-shirt","clothing"));
		products.add(new Product(1002,"Samsung Galaxy Ultra S23","Electronics"));
		products.add(new Product(1003,"Dot & Key Sunscreen","Skincare"));
		products.add(new Product(1004,"Anarkali","clothing"));
		products.add(new Product(1005,"Himalaya Moisturizer","Skincare"));
		String productName="Anarkali";
		Product ans1=LinearSearch.linearSearch(products, productName);
		System.out.println("After Linear Search: "+(ans1!=null?ans1:"Item Not Found"));
		Collections.sort(products);
		Product ans2=BinarySearch.binarySearch(products, productName);
		System.out.println("After Binary Search: "+(ans2!=null?ans2:"Item Not Found"));
	}
}
