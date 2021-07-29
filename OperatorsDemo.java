class  OperatorsDemo{
static int add(int a,int b)
{
int addResult=a+b;
return addResult;
}
static int sub(int x,int y)
{
int subResult=x-y;
return subResult;
}
static int mul(int m, int n)
{
int mulResult=m*n;
return mulResult;
}
static int div(int p,int q)
{
int divResult=p/q;
return divResult;
}
static int mod(int r,int s)
{
int modResult=r%s;
return modResult;
}


public static void main(String args[])
{
int addResult1=add(10,20);
System.out.println("addResult1:"+addResult1);
int subResult1=sub(100,200);
System.out.println("subResult1:"+subResult1);
int mulResult1=mul(1,2);
System.out.println("mulResult1:"+mulResult1);
int divResult1=div(10,20);
System.out.println("divResult1:"+divResult1);
int modResult1=mod(10,20);
System.out.println("modResult1:"+modResult1);
}
}