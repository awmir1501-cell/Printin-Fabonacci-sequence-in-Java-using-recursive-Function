package Recursions;

public class fourth {
    static void fabonacci(int n1,int n2,int i,int n)
    {
        if(n==i)
        {
            int temp=n1+n2;
            System.out.println(temp);
            return;
        }
        int temp=n1+n2;
        System.out.println(temp);
        fabonacci(n2, temp,i+1, n);
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fabonacci(0, 1, 0, 7);
    }
}
