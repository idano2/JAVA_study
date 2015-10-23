package OOP1;

public class Car {
	private int id;
	private String marka;
	private String model;
	private int year;
	private String color;
	private int price;
	private int number;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getMarka(){
		return marka;
	}
	public void setMarka(String marka){
		this.marka = marka;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public String getColor (){
		return color;
	}
	public void setColor (String color){
		this.color = color;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
					
	public Car() {
	       }
	   
	public Car(int id, String marka, String model, int year, String color, int price, int number) {
	    this.id = id;
	    this.marka = marka;
	    this.model = model;
	    this.year = year;
        this.price = price;
        this.color = color;
        this.number = number;
		}   
	
	@Override
    public String toString()
    {
        return "ID-"+this.id+" марка "+this.marka+" модель "+this.model+" год выпуска "+this.year+" цвет "+
    this.color+" цена "+this.price+"  рег. № "+this.number;
    }
	}	
	