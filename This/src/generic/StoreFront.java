package generic;

import java.awt.Color;

public class StoreFront {

	public static void main(String[] args) {
		
		Book bookItem1= new Book("Java Rules", "Oracle");
		Clothing clothingItem1=new Shirt("Child Tee", Clothing.Size.SMALL,Color.RED);
		Clothing clothingItem2= new Shirt("Mens Button Down", Clothing.Size.LARGE,Color.BLUE);

		FeatureSpot<Item> mainFeature = new FeatureSpot<>();
		mainFeature.featureItem(bookItem1,60);
		System.out.println(mainFeature);
		mainFeature.featureItem(clothingItem1,60);
		
		try { 
			Thread.sleep((100));
			}catch(InterruptedException ex){}
		System.out.println(mainFeature);
		
	

	FeatureSpot<Clothing> clothesFeature = new FeatureSpot<>();
	clothesFeature.featureItem(clothingItem2,15);
	
	try { 
		Thread.sleep((100));
		}catch(InterruptedException ex){}
	System.out.println(clothesFeature);

}
	
	//upper bound
	
	public static void printItemNonBounded(FeatureSpot<Item> spot) {
		Item item= spot.getItem();
		System.out.println(item);
		
	}
	public static void printItem(FeatureSpot<? extends Item> spot) {
		Item item= spot.getItem();
		System.out.println(item);
		
	}
	public static void printItemUpperBoundRestrictions(FeatureSpot<? extends Item> spot) {
		Item item= new Book("alaki", "dolaki");
		Item retreivedItem=spot.getItem();
		
	}
	
	//lower bound
	public static void featureNewItem(FeatureSpot<? super Item> spot) {
		Item item= new Book("alakilower", "dolakilower");
		System.out.println(item);
		
	}
	public static void featureNewClothing(FeatureSpot<? super Clothing> spot) {
		Clothing clothingItem = new Shirt("woman button down", Clothing.Size.SMALL, Color.BLACK);
		spot.featureItem(clothingItem, 60);
		
	}
	public static void LowerBoundRestrictions(FeatureSpot<? super Clothing> spot) {
		Item item= new Shirt("woman buuton down",Clothing.Size.LARGE,Color.BLUE);
		
		
	}
	
}