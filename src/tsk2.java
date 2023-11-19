public class tsk2
{
    public static void main(String[] args)
    {
        int k = 3;
        int s = 9;
        int count = 0;
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++)
        {
            int sum = 0;
            int num = i;
            while (num > 0)
            {
                sum += num % 10;
                num /= 10;
            }
            if (sum == s)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
