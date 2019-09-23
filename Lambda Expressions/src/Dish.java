public class Dish {
	
	private String name;
	private boolean vegetarian;
	private int calories;
    private Dishtype dishtype;
    
    public Dish() {
    	
    }

	public Dish(String name, boolean vegetarian, int calories, Dishtype dishtype) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.dishtype = dishtype;
	}
	
	//Implementing comparator interface by using compare method and this compare method takes 2 arg's)
	public static int compareCalories(Dish d1 , Dish d2) {
		if(d1.getCalories() > d2.getCalories()) {
			return 1;	
		}else if(d1.getCalories() < d2.getCalories()) {
			return -1;
		}
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Dishtype getDishtype() {
		return dishtype;
	}

	public void setDishtype(Dishtype dishtype) {
		this.dishtype = dishtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((dishtype == null) ? 0 : dishtype.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (calories != other.calories)
			return false;
		if (dishtype != other.dishtype)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", dishtype=" + dishtype
				+ "]";
	}

	
	
	
}
