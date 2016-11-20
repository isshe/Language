/*==============================================================================\
* Copyright(C)2015 Chudai.
*
* File name    : ArithmeticOperation.java
* Version      : v1.0.0
* Author       : 初代
* Date         : 2015/09/19
* Description  :
* Function list: 1.
*                2.
*                3.
* History      :
\*==============================================================================*/

public class ArithmeticOperation
{
    public static void main(String[] args)
    {
        int a, b, c, d;
        a = 6 + 7;
        System.out.println("a = " +a);

        b = a % 5;
        System.out.println("b = a % 5 = " + b);

        c = b++;
        System.out.println("c = b++ = " + c);

        d = --c;
        System.out.println("d = --c = " + d);
    }
}
