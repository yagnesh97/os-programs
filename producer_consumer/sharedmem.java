class sharedmem{
	int x;
	public void put(int x){
		this.x = x;
		System.out.println("Put: "+x);
	}
	
	public void get(){
		System.out.println("Get: "+x);
	}
}