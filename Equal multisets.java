import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
import java.util.Arrays;
 
class Demo {

  
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int n = cin.nextInt();
        long arr1[] = new long[n];
        long arr2[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = cin.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i] = cin.nextLong();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        BigInteger count = new BigInteger("0");
        for(int i=0;i<n;i++)
        {
            count = count.add(new BigInteger(Long.toString(Math.abs(arr1[i]-arr2[i]))));
        }
        count = count.mod(new BigInteger("1000000007"));
        System.out.println(count);
    
 }
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  }