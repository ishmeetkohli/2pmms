public class SortUnix {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
        System.out.println("Sorting... be patient");
		//Remove ".exe" for Mac and Linux
        Runtime.getRuntime().exec("sort -k 2 taxpayers_30.txt -o taxpayers_30_sort.txt").waitFor();
        
		System.out.println("Time elapsed (sec) = " + (System.currentTimeMillis() - startTime) / 1000.0);
	}
}