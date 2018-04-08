import java.util.Arrays;
public class Main {
	public static void main(String[] args){
    int[] b ={1, 0, 0, 1, 0, 1};
    for(int i=0;i<b.length;i++){
    if (b[i]==1) { 
        b[i]=0;
    }
    else b[i]=1;
    }
    System.out.println(Arrays.toString(b)); 
    }
    }  