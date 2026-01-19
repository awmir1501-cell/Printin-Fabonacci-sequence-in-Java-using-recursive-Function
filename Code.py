def binary(n):
    list1=[]
    while(n>0):
        result=int(n%2)
        n=int(n/2)
        list1.append(result)
    list1=list1[::-1]
    return list1
def octal(n):
    list2=[]
    while(n>0):
        result=int(n%8)
        n=int(n/8)
        list2.append(result)
    list2=list2[::-1]
    return list2
def hexadecimal(n):
    list3=[]
    while(n>0):
        result=int(n%16)
        n=int(n/16)
        if(result==10):
            list3.append("A")
        elif(result==11):
            list3.append("B")
        elif(result==12):
            list3.append("C")
        elif(result==13):
            list3.append("D")
        elif(result==14):
            list3.append("E")
        elif(result==15):
            list3.append("F")
        else:
            list3.append(result)  
    list3=list3[::-1]
    return list3
num=int(input("Enter Number in Base 10 : "))
print("Number in Base 2 is : ",binary(num))
print("Number in Base 8 is : ",octal(num))
print("Number in Base 16 is : ",hexadecimal(num))
