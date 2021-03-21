class TestClass{
	    public static void main(String[] args) {
        TV t = new TV();
        Radio r = new Radio();
        r.reset(); 
        t.reset();
        
        
        System.out.println(r.getFrequency()); 
        System.out.println(t.getChannel()+"\n"); 
      }
}