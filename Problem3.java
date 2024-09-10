public class Problem3
{
    public static void main(String[] args)
    {
        int baka = 1397;
        int n = 1;
        int i = 0;
        System.out.println("Four digit number: " + baka);
        while (i < 4)
        {
            System.out.println((baka/n)%10);
            n *= 10;
            i++;
        }
    }
}
