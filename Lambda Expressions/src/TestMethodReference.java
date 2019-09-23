import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dish> dishlist = new ArrayList<> ();
		
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
		
		//Dish::compareCalories --->method in class(sending method reference)
		Collections.sort(dishlist, Dish::compareCalories);
		dishlist.forEach(System.out::println);
	
	}

}
