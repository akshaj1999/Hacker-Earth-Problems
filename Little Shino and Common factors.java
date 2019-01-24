import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
 
class Demo {

    static long gcd(long a, long b) 
    { 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
    }  

  
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        long a = cin.nextLong();
        long b = cin.nextLong();
        long hcf = Demo.gcd(a,b);
        long count =0;
        for(int i=1;i<=Math.sqrt(hcf);i++)
          {
              if(hcf%i==0)
              count++;
          }
          int temp =(int) Math.sqrt(hcf);
          if(temp == Math.sqrt(hcf))
          {
              count*=2;
              count--;
          }
          else
          count*=2;
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