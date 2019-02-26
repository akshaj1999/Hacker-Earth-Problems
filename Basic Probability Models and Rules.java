import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        String str = cin.nextLine();
        double pmb = Double.parseDouble(str);
        str = cin.nextLine();
        double pab = Double.parseDouble(str);
        str = cin.nextLine();
        double p1 = Double.parseDouble(str);
        double result = p1*(pmb*(1-pab)+pab*(1-pmb));
        System.out.format("%.6f",result);

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
