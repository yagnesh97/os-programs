class consumer implements Runnable{
	Thread t;
	sharedmem sm;
	int x = 1;
	consumer(sharedmem sm){
		t = new Thread(this);
		this.sm = sm;
		t.start();
	}
	
	public void run(){
		while(x<=10){
			sm.get();
			x++;
		}
	}
}