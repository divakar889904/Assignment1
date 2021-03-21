package com.assesment;
import java.util.*;
public class Assesment4 {

	    public ArrayList switchIt(ArrayList aOne, int a, int b){
	        int temp = (int) aOne.get(a);
	        aOne.set(a, aOne.get(b));
	        aOne.set(b, temp);
	        return aOne;
	    }
	    public static void main(String[] args) {
	        Assesment4 s = new Assesment4();
	        ArrayList<Integer> arr = new ArrayList<Integer>(4);
	        arr.add(10);
	        arr.add(20);
	        arr.add(30);
	        arr.add(40);
	        ArrayList<Integer> arr1 = s.switchIt(arr,0,1);
	        for(int i: arr1){
	            System.out.println(i);
	        }
	    }
	
}
