package ecommerceplatform;
import java.util.List;
public class BinarySearch {

	public static Product binarySearch(List<Product> products,String name)
	{
		name=name.toLowerCase();
		int l=0;int r=products.size()-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			int ans=products.get(m).getProductName().compareToIgnoreCase(name);
			if(ans==0)
			{
				return products.get(m);
			}
			else if(ans<0)
			{
				l=m+1;
			}
			else {
				r=m-1;
			}
		}
		return null;
	}
}
