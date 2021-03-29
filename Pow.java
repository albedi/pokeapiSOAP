import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        //double res = POW(1.1,2);
        double res = POW(1.1,3);
        System.out.println("XXXXXXXX");
        System.out.println(" " + res + " <--");
    }
    
    // public double pow(double a, double b)
    public static double POW(double a, double b){
        if(b <= 1) return a;
        return MULT(a,POW(a,--b));
    }
    
    public static double MUL(double a, double b){
        if(b <= 1) return a;
        return a + MUL(a, --b);
    }
    
    public static double MULT(double a, double b){
        int noZero = noDec(a) + noDec(b);
        double dec = POW10(noZero);
        double ent = MUL(MUL(a, dec), MUL(b, dec));
        String str = String.valueOf(ent);
        int ip = str.indexOf(".");
        int ln = str.length();
        int np = ip - noZero -2;
        str = str.replace(".","");
        String res = str.substring(0,np) + "." + str.substring(np);
        return Double.parseDouble(res);
    }
    
    public static int noDec(double a){
        String str = String.valueOf(a);
        int ip = str.indexOf(".");
        int ln = str.length();
        return ln - ip -1;
    }
    
    public static long POW10(int n){
        String str = "1";
        for(int i=0; i < n; i++) str += "0";
        return Long.parseLong(str);
    }
}
