package Basic;

public class BlankTri {
     public static void main(String arg[]) {
    	 int n=5;
    		for(int i=1;i<=n;i++) {
    			for(int k=n-1;k>=i;k--) {
    				System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++) {
    			if(j==1||j==i||i==n) {
    			System.out.print("* ");
    		}else {
    		System.out.print("  ");
    		}
    		}
    		System.out.println();
    		}	
     }
}
