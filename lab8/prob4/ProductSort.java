package labs.lab8.prob4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum SortPlan{
	PRD_PRICE,
	PRD_TITLE;
}

class Product{
	final String title;
	final double price;
	final int model;
	
	public Product(String title, double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getModel() {
		return model;
	}
	
	/*
	 * Sort products using inner class by title and price.
	 */
	public static void sortInner(List<Product> prdList, final SortPlan by) {
		
		class ProductComparator implements Comparator<Product>{

			@Override
			public int compare(Product prd1, Product prd2) {
				if(by.equals(SortPlan.PRD_PRICE)) {
					if(prd1.getPrice() == prd2.getPrice()) return 0;
					if(prd1.getPrice()< prd2.getPrice()) return -1;
					else return 1;
					
				}
				else {
					return prd1.getTitle().compareTo(prd2.getTitle());
				}
			}
			
		}
		
		
		Collections.sort(prdList, new ProductComparator());
	}
	
	/*
	 * Sort products using lambda by title and price.
	 */
	public static void sortByLambda(List<Product> prdList, final SortPlan by) {
		Collections.sort(prdList, (prd1, prd2)->{
													if(by.equals(SortPlan.PRD_PRICE)) {
														if(prd1.getPrice()==prd2.getPrice()) return 0;
														if(prd1.getPrice()> prd2.getPrice()) return -1;
														else return 1;
													}
													else {
														return prd2.getTitle().compareTo(prd1.getTitle());
													}
														
									});
	}
	
	/*
	 * Sort products by title and model.
	 */
	public static void sortByTtileAndModel(List<Product> prdList, final SortPlan by) {
		Collections.sort(prdList, (prd1, prd2)->{
													return (prd1.getTitle().compareTo(prd2.getTitle()) == 0)? 
															prd1.getModel() - (prd2.getModel()): prd1.getTitle().compareTo(prd2.getTitle());
													
														
									});
	}
	
	@Override
	public String toString() {
		return String.format("\n%s: %s: %s", title, price, model);
	}
}

public class ProductSort {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(new Product("Java", 100, 2000),  new Product("Java", 100, 1999), new Product("Leadership", 10 , 2017), new Product("BMW", 10000, 2002));
		
		/*
		 * Inner class implementation.
		 */
		//Sort by product price.
		System.out.println("\n-------------");
		System.out.println("| Inner class |");	
		System.out.println("---------------");
		System.out.println("\nSorted by product price:\n");
		Product.sortInner(products, SortPlan.PRD_PRICE);			
		products.forEach(System.out::println);
		
		//Sort by product title.
		System.out.println("\n\nSorted by product title:\n");	
		Product.sortInner(products, SortPlan.PRD_TITLE);			
		products.forEach(System.out::println);
		
		/*
		 * Inner class implementation.
		 */
		System.out.println("\n---------");
		System.out.println("| Lambda 1 |");	
		System.out.println("-----------");
		System.out.println("\nSorted by product price:\n");
		
		Product.sortByLambda(products, SortPlan.PRD_PRICE);		
		products.forEach(System.out::println);
		
		//Sort by product title.
		System.out.println("\n\nSorted by product title:\n");	
		
		Product.sortByLambda(products, SortPlan.PRD_TITLE);			
		products.forEach(System.out::println);
		
		//Sort by product title and model.
		System.out.println("\n---------");
		System.out.println("| Lambda 2 |");	
		System.out.println("-----------");
		System.out.println("\nSorted by title and price:\n");
		
		Product.sortByTtileAndModel(products, SortPlan.PRD_TITLE);			
		products.forEach(System.out::println);
	}
}
