class TimeOfExecution{
	public static void main(String[] args){
		long startTime = getStartTime();
		programForCheck();
		long endTime = getEndTime();
		long diff = endTime - startTime;
		System.out.print("Time of Execution: "+diff+" ms.");
	}
	static void programForCheck(){
		/*The program whose execution 
		time is to be known goes here.*/
	}
	static long getEndTime(){
		return System.currentTimeMillis();
	}
	static long getStartTime(){
		return System.currentTimeMillis();
	}
}