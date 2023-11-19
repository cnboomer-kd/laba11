public class tsk1
{
    public static void main(String[] args)
    {
        int A = 5;
        int B = 10;
        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }
    }
}
