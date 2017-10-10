class producer implements Runnable{
	Thread t;
	sharedmem sm;
	int x;
	
	producer(sharedmem sm, int x){
		t = new Thread(this);
		this.sm = sm;
		this.x = x;
		t.start();
	}
	
	public void run(){
		while(x<=10){
			sm.put(x++);
		}
	}
}