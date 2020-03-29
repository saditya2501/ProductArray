import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n, sum = 1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int c=0;
        for(int i = 0; i < n; i++)
        {   sum=1;
            for(int j = 0; j < n; j++)
            {if(i!=j)
                sum=sum*a[j];
            }
            System.out.print(sum+" ");
        }
    }
}