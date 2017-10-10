class sharedmem{
	public synchronized void classroom(int x){
		System.out.println("Teacher "+x+" enters in the class.");
		System.out.println("Teacher "+x+" is teaching.");
		System.out.println("Teacher "+x+" exits.");
	}		
}