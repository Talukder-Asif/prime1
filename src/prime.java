public class prime {
    void CheckPrime(int n)
    {
        int i,flag=0;
        for(i=2;i<n;i++) {
            if(n%i==0) {
                flag++;
                break;
            }
        }
        if(flag==0) {
        System.out.print("it is a prime number");
        } else {
            System.out.print("it is not a prime number");
        }
    }
}
