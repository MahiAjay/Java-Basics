import java.sql.PseudoColumnUsage;

import javax.sound.sampled.SourceDataLine;

public class _04classification {
    public static void main(String[]args){
        /* Two types of java datatypes:
        . Primitive - datatypes which have specified size and we cannot store data more than the specified size.
         Eg: byte(1 byte),short(2 bytes),int(4 bytes),float(4 bytes), long(8 bytes), double(8 bytes), boolean(1 bit),
            char(2 bytes)
            #1 byte= 8 bits 
            byte is the space of one character
            bit is 0 or 1
        . Non primitive or reference data types - These are the objects. Non primitive datatypes are not defined.The size is 
                                        same as the other objects. It does not varies. 

        */
        byte j = -54;// since byte is of 1 byte therefore it stores numbers from -128 to 127 only
        System.out.println(j);
        double c = 64.6574883d;
        System.out.println(c);
        char grade = 'A';
        System.out.println(grade);
        /* Operators in java

        operand operator operand = result
          4       -        2     =  2
          Types of operator in java
          Arithmatic operator
          logical operator
          Assignment operator
          Comparison operator
        */
        int a = 45 , b = 67;
        //if we want to change the increase or decrease the value of the assigned variable then:
        a += 4 ;// the value of a is now increased with 4
        b -= 6 ; // the value of b is now decreased with 6
        System.out.println("The value of a + b:");
        System.out.println(a + b);

        System.out.println("The value of a - b:");
        System.out.println(a - b);

        System.out.println("The value of a * b:");
        System.out.println(a * b);

        System.out.println("The value of a / b:");
        System.out.println(a / b);

        System.out.println("The value of a % b:");
        System.out.println(a % b);

        System.out.println(a++);//first print then increment
        System.out.println(++a);//first increment then print
        System.out.println(--a);//vice versa
        System.out.println(a--);//vice versa

        /*
        Comparison operators
        . == : checks for equality of two values
        . != : checks if two values are not equal
        . <
        . >
        . <=
        . >=

        Logical operator
        . && : logical and operator - Returns true only if both connections are true
        . || : logical or operator- Returns true only if any one connections is true
        . ! : Logical not - reverse the result from true to false and vice versa
        */

    }
    
}
