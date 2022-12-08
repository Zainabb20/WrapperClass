public class Main
{
    public static void main(String[] args)
    {
        //Primitive to Wrapper class - Autoboxing
        int i=20;                        //int value
        Integer j=new Integer(i);       //Converting int to Integer Wrapper Class
        Integer k = Integer.valueOf(i); //Converting int to Integer Wrapper Class
        Integer z =i;                   //automatically write Integer.valueOf(i) internally - autoboxing

        System.out.println(+i +" "+j+ " "+k +" "+z);

        String s= Integer.toString(10);   //convert Integer value to String
        System.out.println(s);

        //Wrapper to Primitive - Unboxing

        Integer a=new Integer(3);    //coverting 3 into Integer object
        int b= a.intValue();              //converting Integer to int
        int c=a;                         //unboxing - write a.intValue() internally

        System.out.println(+a+" "+b+" "+c);

        /* Primitive Type -             boolean, char, int, long, short, char, byte, double, float
           Respective Wrapper Classes - Boolean, Char, Int, Long, Short, Char, Byte, Double, Float
        */




    }
}