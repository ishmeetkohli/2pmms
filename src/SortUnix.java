public class SortUnix {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
        System.out.println("Sorting... be patient");
		//Remove ".exe" for Mac and Linux
        Runtime.getRuntime().exec("sort -k 1 taxpayers_3M.txt -o taxpayers_3M_sort.txt").waitFor();
        
		System.out.println("Time elapsed (sec) = " + (System.currentTimeMillis() - startTime) / 1000.0);
	}
}