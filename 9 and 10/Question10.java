package com.assesment;

interface Shape{
	double computeArea();
}
interface Operation{
	void operate(String name,Double[]param);
}
public class Question10 {
	public static void main(String[] args) {
		Shape s=()->{
			return 889904;
		};
		System.out.println(s.computeArea());
	}
}