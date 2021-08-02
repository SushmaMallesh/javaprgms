class AssignmentArithimeticOperators{
int i=22;
int j=55;
int k,l,m,n,o;
public static void main(String args[])
{
AssignmentArithimeticOperators aao=new AssignmentArithimeticOperators();
aao.k=aao.i+aao.j;
System.out.println("addition of 2 numbers are="+aao.k);
aao.l=aao.i-aao.j;
System.out.println("subtraction of 2 numbers are="+aao.l);
aao.m=aao.i*aao.j;
System.out.println("multiplication of 2 numbers are="+aao.m);
aao.n=aao.i%aao.j;
System.out.println("modulus of 2 numbers are="+aao.n);
aao.o=aao.i/aao.j;
System.out.println("division of 2 numbers are="+aao.o);
}
}