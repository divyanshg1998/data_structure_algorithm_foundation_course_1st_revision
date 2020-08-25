package Dec29_2018;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(2,4,0,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,1,1)));
   
        
        List<List<Integer>> al1 = new ArrayList<>();
        al1.add((Arrays.asList(1,2,2,1)));
        al1.add((Arrays.asList(3,1,2,0)));
     


	ArrayList<Integer> arr=new ArrayList<>();
	arr.add(10);
	arr.add(30);
	arr.add(40);
	
	arr.add(2,100);
	arr.remove(3);
	for(int data: arr){
		System.out.print(data+" ");
	}
	
	System.out.println("hey");
	arr.add(3,1000);
	arr.set(0,9);
	
	
	for(int data: arr){
		System.out.print(data+" ");
	}
	System.out.println();
	
	for(int i=0; i<arr.size(); i++){
		System.out.print(arr.get(i)+" ");
	} 
	System.out.println();

	ArrayList<String> test1=new ArrayList<>();
	ArrayList<String> test2=new ArrayList<>();
	test2.add("");
	
	System.out.println(test1+" "+test2);

	for(String val:test1){
		System.out.println("hello1");
	}

	for(String val:test2){
		System.out.println("hello2");
	}
	
	}

}
