#include <iostream>
using namespace std;
void binary(int n)
{
    int arr[100]={};
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
        cout<<arr[i]<<" ";
    }
}
void octal(int n)
{
    int arr[100]={};
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
        cout<<arr[i]<<" ";
    }
}
void hexadecimal(int n)
{
    string arr="";
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
            arr.append(to_string(result));
        count++;
    }
      int start=0;
      int end=arr.length()-1;
      char temp;
      while (start<end)
      {
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
    cout<<arr;
}
int main()
{
    int n=0;
    cout<<"Enter a number in Base 10 : ";
    cin>>n;
    cout<<"\nNumber in Base 2 is : ";
    binary(n);
    cout<<"\n";
    cout<<"Number in Base 8 is : ";
    octal(n);
    cout<<"\n";
    cout<<"Number in Base 16 is : ";
    hexadecimal(n);
    return 0;
}