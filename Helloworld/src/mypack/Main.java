package mypack;

class Main
{
	//static int count = 0;
    // Print all subsets of given set[]
     public void printSubsets(char set[])
    {
        int n = set.length;
        int count = 0;
 
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
            // Print current subset
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { 
                    System.out.print(set[j] + " " );
                }
            }
            System.out.println("}"  + "   " + count++);
                
            
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	Main m = new Main();
        char set[] = {'3', '3', '9' ,'9','5'};
        m.printSubsets(set);
    }
}



// (1<<j) is a number with jth bit 1
// so when we 'and' them with the
// subset number we get which numbers
// are present in the subset and which
// are not
