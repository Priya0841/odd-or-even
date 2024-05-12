
class Solution{
    static String oddEven(int N){
        
        return ((N%2==0) ? "even" : "odd");
    }
}

EXPLAINATION : 

This code defines a function oddEven that takes an integer N as input and returns a string indicating whether the number is even or odd.

N%2 == 0 : This part checks if the remainder of dividing N by 2 is equal to 0.
If it is, it means the number is even because even numbers are exactly divisible by 2.

? "even" : "odd": This is a ternary operator.
  If the condition (N%2 == 0) is true, it returns "even", otherwise it returns "odd".

So, in simple terms, if the number N is divisible by 2 with no remainder,
the function returns "even", otherwise it returns "odd".

For example, if N is 7, the remainder of dividing 7 by 2 is 1, so the function will return "odd".
If N is 10, it's divisible by 2 with no remainder, so the function will return "even".
