import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

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
	
		//Stream<Dish>  stream = dishlist.stream();
		//Stream<Dish> stream2 = stream.filter(d -> d.getCalories()>300);
		//List<Dish> dish1= stream2.collect(Collectors.toList());
		//for (Dish dish : dish1 ) {
		//		System.out.println(dish);
		
		//}
		
		List<Dish> dishs=dishlist.stream().filter(d -> d.getName().startsWith("S")).collect(Collectors.toList());
		dishs.forEach(System.out::println);
		//System.out::println is a print method reference
		//List<Dish> dishs=dishlist.stream().filter(d -> d.getCalories() > 300).collect(Collectors.toList());
		//for (Dish dish : dishs) {
		//	System.out.println(dish);
	
	//}

}
}

