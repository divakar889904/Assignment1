package com.assesment;

interface Drawable{  
    public boolean draw();  
   
}  

public class Question9_Interface {  
	
    public static void main(String[] args) {  
        
        Drawable d2=()->false;
        d2.draw();  
    }  
}
