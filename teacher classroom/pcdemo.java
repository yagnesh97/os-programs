class pcdemo{
	public static void main(String args[]){
		sharedmem sm = new sharedmem();
		new teacher(sm, 1);
		new teacher(sm, 2);
		new teacher(sm, 3);
	}
}
