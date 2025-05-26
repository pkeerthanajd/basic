public class cal
{
    public static void main(String a[])
    {
        cal c = new cal();
        c.op1(12, 10);
    }
    public void op1(int n1,int n2)
    {
        int add = n1+n2; System.out.println("sum is "+add);
        int sub = n1-n2; System.out.println("sum is "+sub);
        int pdt = n1*n2; System.out.println("sum is "+pdt);
        int div = n1/n2; System.out.println("sum is "+div);
        int mod = n1%n2; System.out.println("sum is "+mod);

    }
}