import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Comparator<Dish> comparator=(Dish d1,Dish d2) ->{
			 return d1.getName().compareTo(d2.getName());
			 
		};
		
		
		//TreeSet<Dish> dishlist = new TreeSet<> (comparator);//Comparing based on name
		TreeSet<Dish> dishlist = new TreeSet<> (Dish::compareCalories);//Comparing based on calories 
		
		dishlist.add(new Dish("pork Fry",false,800,Dishtype.Meat));
		dishlist.add(new Dish("Pepper Chicken",false,700,Dishtype.Meat));
		dishlist.add(new Dish("BBQ Ribe",false,600,Dishtype.Meat));
		dishlist.add(new Dish("French Fries",true,500,Dishtype.others));
		dishlist.add(new Dish("Double Cheese Pizza",true,400,Dishtype.others));
		dishlist.add(new Dish("Season Fruit",false,120,Dishtype.others));
		dishlist.add(new Dish("Salmon",false,500,Dishtype.Fish));
		dishlist.add(new Dish("Prawns",false,300,Dishtype.Fish));
		dishlist.add(new Dish("Rice",true,200,Dishtype.others));
		dishlist.add(new Dish("Milk Shake",true,150,Dishtype.others));
		
		dishlist.forEach(System.out::println);
	
	}

}
