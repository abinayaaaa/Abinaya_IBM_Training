package collections;
import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(47);
		arr.add(97);
		
		ArrayList<Integer> brr=new ArrayList<>();
		brr.add(42);
		brr.add(94);
		
		arr.addAll(brr);
		System.out.println(arr);
		
		arr.remove(2);//index
		System.out.println(arr);

	}

}
