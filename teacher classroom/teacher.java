class teacher implements Runnable{
	Thread t;
	sharedmem sm;
	int x;
	
	teacher(sharedmem sm, int x){
		t = new Thread(this);
		this.sm = sm;
		this.x = x;
		t.start();
	}
	
	public void run(){
		sm.classroom(x);
	}
}
