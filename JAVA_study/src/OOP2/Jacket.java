package OOP2;

public class Jacket extends Equipment{

	private String name;
    private String size;

    public Jacket(String name, String size, int cost, int weight) {
        super(cost, weight);
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
  
   public void setSize(String size) {
        this.size = size;
    }

   public String getSize() {
        return size;
    }
   @Override
   public String toString()
   {
       return this.name+" размер "+this.size+" цена "+this.cost+" вес "+this.weight;
   }

}
