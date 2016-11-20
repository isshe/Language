/*==============================================================================\
* Copyright(C)2015 Chudai.
*
* File name    : ConditionalOperation.java
* Version      : v1.0.0
* Author       : 初代
* Date         : 2015/09/19
* Description  :
* Function list: 1.
*                2.
*                3.
* History      :
\*==============================================================================*/

public class ConditionalOperation
{
    public static void main(String[] args)
    {
        double score = 56.8;

        String str = (score >= 60) ? "及格" : "不及格";
        System.out.println("考试成绩:" + str + "(" + score +"分)");
    }
}
