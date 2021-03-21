class TV extends Electronics{
    private int channel = 5; //insert appropriate getter and setter
    
    public void setChannel(int c){
        this.channel = c;
    }
    
    public int getChannel(){
        return channel;
    }
    
    @Override
    void reset (){
        setChannel(0);
    }
}
