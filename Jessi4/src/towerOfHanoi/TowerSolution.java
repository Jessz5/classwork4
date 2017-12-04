package towerOfHanoi;

public class TowerSolution {
	public static void main(String[] args){
		int n = 5;
		String start ="A";
		String helper ="B";
		String end ="C";
		towerSolution(n, start, helper, end );
	}

	public static void towerSolution(int n, String start, String helper, String end) {
		if(n == 1) {
			System.out.println("Move " +start+" to "+end+".");
		}else {
			towerSolution(n-1,start,end,helper);
			System.out.println("Move "+start+" to "+end+".");
			towerSolution(n-1,helper,start,end);
		}
		
	}
}
