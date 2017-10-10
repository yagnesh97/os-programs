class pcdemo{
	public static void main(String args[]){
		sharedmem sm = new sharedmem();
		producer p = new producer(sm, 1);
		consumer c = new consumer(sm);
	}
}
