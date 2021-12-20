package basics;
public class Main{
    public static void main(String[] args){
        //primitive data types
        boolean firstBoolean=true;
        byte firstByte=5;
        char firstChar='c';
        short firstShort=22;
        int firstInteger=10;
        long firstLong=332;
        float firstFloat=2.2F;
        double firstDouble=3.333;


        firstBoolean=100>30;
        firstInteger+=27;
        int integerDivision=firstInteger/2;

        double doubleDivision=(double)firstInteger/2;

        int truncatedDouble=(int)doubleDivision;

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        long maximum=Long.MAX_VALUE;

        //operators
        int x=(min+max)*3/-3;

        String str="hello world";

        x++;

        long l=3%2;

        boolean isAlien=true;
        if (!isAlien){
            System.out.println("is not alien");
        }else{
            System.out.println("is an alien");
        }

        int n=5;
        if (n==5){
            System.out.println("equal to 5");
        }else if(n>5){
            System.out.println("greater than 5");
        }else{
            System.out.println("less than 5");
        }

        boolean bool= 5==5;

        long a=5;
        long b=4;
        //shortcut for small if elses
        long health= a>b?3:4;
    byte y=-128;
    char chaaa=Character.MAX_VALUE;
    chaaa++;
    int s=chaaa;

        float f=Float.MIN_VALUE;

        System.out.println(f);

    }
}