package assignSE;

	public class Product {
	private int id;
	private String name;
	private String descr;
	private double price;
	public Product(int id, String name, String descr, double price) {
		
		this.id = id;
		this.name = name;
		this.descr = descr;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void display()
	{
	   System.out.println(" product info :");
	   System.out.println(id+" "+name+" "+descr+" "+price);
	}

}
