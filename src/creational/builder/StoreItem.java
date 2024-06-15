package creational.builder;

public class StoreItem {
	private final String name;
	private final String price;
	private final String shortDescription;
	private final String longDescription;
	private final String stockAvailable;
	private final String packagingType;
	
	@Override
	public String toString() {
		return "StoreItem [name=" + name + ",\n price=" + price + ",\n shortDescription=" + shortDescription
				+ ",\n longDescription=" + longDescription + ",\n stockAvailable=" + stockAvailable + ",\n packagingType="
				+ packagingType + "]";
	}

	private StoreItem(StoreItemBuilder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.shortDescription = builder.shortDescription;
		this.longDescription = builder.longDescription;
		this.stockAvailable = builder.stockAvailable;
		this.packagingType = builder.packagingType;
		
	}
	
	public static class StoreItemBuilder {
		private String name;
		private String price;
		private String shortDescription;
		private String longDescription;
		private String stockAvailable;
		private String packagingType;
		
		public static StoreItemBuilder builder() {
			return new StoreItemBuilder();
		}
		public StoreItem build() {
			return new StoreItem(this);
		}
		public StoreItemBuilder name(String name) {
			this.name = name;
			return this;
		}
		public StoreItemBuilder price(String price) {
			this.price = price;
			return this;
		}
		public StoreItemBuilder shortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
			return this;
		}
		public StoreItemBuilder longDescription(String longDescription) {
			this.longDescription = longDescription;
			return this;
		}
		public StoreItemBuilder stockAvailable(String stockAvailable) {
			this.stockAvailable = stockAvailable;
			return this;
		}
		public StoreItemBuilder packagingType(String packagingType) {
			this.packagingType = packagingType;
			return this;
		}
	}
	

}
