import java.util.Scanner;
public class Practice{
    static void binary(int n)
    {
        int []arr=new int [100];
        int count=0;
        int result=0;
        while(n>0)
        {
            result = n%2;
            n=n/2;
            arr[count]=result;
            count++;
        }
        for(int i=count;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void octal(int n)
    {
        int []arr=new int[100];
        int count=0;
        int result=0;
        while (n>0)
        {
            result=n%8;
            n=n/8;
            arr[count]=result;
            count++;
        }
        for(int i=count;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void hexadecimal(int n)
    {
        StringBuilder arr=new StringBuilder();
        int count=0;
        int result=0;
        while (n>0)
        {
            result=n%16;
            n=n/16;
            if(result==10)
            arr.append("A");
            else if(result==11)
                arr.append("B");
            else if(result==12)
                arr.append("C");
            else if(result==13)
                arr.append("D");
            else if(result==14)
                arr.append("E");
            else if(result==15)
            arr.append("F");
            else
                arr=arr.append(String.valueOf(result));
            count++;
        }
        System.out.println(arr.reverse());
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
    System.out.print("Enter a Number in Base 10 : ");
    int num=input.nextInt();
    binary(num);
    System.out.println();
    octal(num);
    System.out.println();
    hexadecimal(num);
}
}
