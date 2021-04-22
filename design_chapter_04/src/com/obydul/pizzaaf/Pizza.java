package com.obydul.pizzaaf;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer r = new StringBuffer();
		r.append("--- "+name+" ---\n");
		if (dough != null) {
			r.append(dough);
			r.append("\n");
		}
		if (sauce != null) {
			r.append(sauce);
			r.append("\n");
		}
		if (cheese != null) {
			r.append(cheese);
			r.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				r.append(veggies[i]);
				if (i < veggies.length-1) {
					r.append(", ");
				}
			}
			r.append("/n");
		}
		if (clam != null) {
			r.append(clam);
			r.append("\n");
		}
		if (pepperoni != null) {
			r.append(pepperoni);
			r.append("\n");
		}		
		return r.toString();
	}
	
	

}
