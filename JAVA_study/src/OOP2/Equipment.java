package OOP2;

import java.io.Serializable;

public abstract class Equipment implements Serializable{
	
    protected int cost;
    protected int weight;

    public Equipment (int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
