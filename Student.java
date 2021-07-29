class Student
{
String name,department;
int marks;
void singer()
{
System.out.println(name+ ","+department+","+marks+" "+"and she is a singer");
}
void dancer()
{
System.out.println(name+","+department+","+marks+" "+"and she is a dancer");
}
void writer()
{
System.out.println(name+","+department+","+marks+" "+"and she is a writer");
}
void listener()
{
System.out.println(name+","+department+","+marks+" "+"and she is a listener");
}
void artrist()
{
System.out.println(name+","+department+","+marks+" "+"and she is a artrist");
}
void player()
{
System.out.println(name+","+department+","+marks+" "+"and she is a player");
}
public static void main(String args[])
{
Student students=new Student();
students.name="sumera";
students.department="cse";
students.marks=88;
students.singer();

Student p=new Student();
p.name="preethi";
p.department="ec";
p.marks=98;
p.dancer();

Student t=new Student();
t.name="teju";
t.department="eee";
t.marks=78;
t.writer();

Student s=new Student();
s.name="sanchitha";
s.department="cse";
s.marks=68;
s.listener();

Student a=new Student();
a.name="aishu";
a.department="ise";
a.marks=77;
a.artrist();

Student pp=new Student();
pp.name="pooja";
pp.department="eee";
pp.marks=87;
pp.player();

}
}