import java.util.Collections;

import java.util.Comparator;

import java.util.List;

import java.util.ArrayList;

public class DishDetails{
	
	public static List<Dish> filterDishObjects(List<Dish> dishs){
		
		ArrayList<Dish> filterDishes = new ArrayList<>();
		
		for(Dish dish :dishs) {
			
			//if(dish.getCalories()>300 && dish.getDishtype().equals(Dishtype.Meat)){
				
			//	filterDishes.add(dish);
			//
			
	//}
			
			if(dish.getName().startsWith("P")) {
				
				filterDishes.add(dish);
		}
				
		}
		
		return filterDishes;
		
		
	}
	
	
//public static List<String> filterDishNames(List<Dish> dishNames){
		
//	ArrayList<String> filterDishes = new ArrayList<>();
		
//	for(Dish dish :dishNames) {
			
		
	//	if(dish.getName().startsWith("P")) {
				
			//	filterDishes.add(dish.getName());
	//	}
				
	//}
		
//	return filterDishes;	
		
//}

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
	

	
Comparator<Dish> comparator=(Dish d1,Dish d2) ->{
	 return d1.getName().compareTo(d2.getName());
	 
};
	//Collections.sort(dishlist, comparator);
	
	List<Dish>  dishs=filterDishObjects(dishlist);
	for (Dish dish : dishs) {
			System.out.println(dish.getName());
			
	//List<String>  dishNames=filterDishNames(dishlist);
	
	//for (Dish dish : dishList) {
	//	System.out.println(dish);
	//}

	}	
}}
