import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
        //largest of three numbers
        /*
        if (a>b && a>c)
            System.out.println("a is maximum");
        else if (b>a &&  b>c) {
            System.out.println("b is maximum");
        }
        else{
            System.out.println("c is maximum");
        }

         */

     /*
      int max=a;

      if(b>max)
         max=b;
      if (c>max) {
          max=c;
      }

      System.out.println(max);

      */

      /*
       int max=Math.max(c,Math.max(a,b));
       System.out.println(max);

       */

        // alphabet case check
        /*
        Scanner in =new Scanner(System.in);
        char c=in.next().trim().charAt(0);
        if (c>='a' && c<='z')
            System.out.println("lowercase");
        else
            System.out.println("uppercase");`

         */
        //fibonnaci numbers
       /*
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

        //number of times a given number occurs
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the digit to check");
        int num=sc.nextInt();
        int count=0;
        while (n>0){
            int rem=n%10;
            if(rem==num)
                count+=1;
            n=n/10;
        }
        System.out.println(count);
        */
        //reverse of a number

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            ans=ans*10+rem;
        }
        System.out.println(ans);




      }


    }

