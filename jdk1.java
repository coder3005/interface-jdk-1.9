/* interface private method */
interface A 
{
    public static void call()
    {
        add(10,20);
    }
    private static void add(int x,int y)
    {
        System.out.println("Sum of Two Numbers: "+(x+y));
    }
}
class B implements A 
{
    public void sub(int x,int y)
    {
        System.out.println("Sub of Two Numbers: "+(x-y));
    }
}
class test
{
    public static void main(String[] args) {
        B b=new B();
        A.call(); b.sub(200,100);
    }
}
