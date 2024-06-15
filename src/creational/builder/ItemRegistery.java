package creational.builder;

public class ItemRegistery {
	public static void main(String[] args) {
		StoreItem item1 = StoreItem.StoreItemBuilder
				.builder()
				.name("First-Product")
				.shortDescription("Food-Product")
				.longDescription("This Product is a food category healthy product.")
				.price("100.00")
				.stockAvailable("25")
				.packagingType("wrapped")
				.build();
		StoreItem item2 = StoreItem.StoreItemBuilder
				.builder()
				.name("Second-Product")
				.shortDescription("Cooking-Product")
				.longDescription("This Product is a cooking category edible oil product.")
				.price("150.00")
				.stockAvailable("15")
				.packagingType("Bootle-Packed")
				.build();
		addItemToRegistery(item1);
		addItemToRegistery(item2);
	}
	public static void addItemToRegistery(StoreItem storeItem) {
		System.out.println("Item has been added \n "+storeItem.toString() + 
				"\n ...........................................................");
	}

}
