package ie.atu.week7;

public class Calculator {
        public int add(int firstNum, int secondNum)
        {
            if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
                throw new ArithmeticException("Value out of range.");
            int result = firstNum + secondNum;
            return result;

        }

        public int subtract(int firstNum, int secondNum)
        {
            return firstNum - secondNum;
        }

        public int multiply(int firstNum, int secondNum)
        {
            return firstNum * secondNum;
        }

        public int divide(int firstNum, int secondNum)
        {
            return firstNum / secondNum;
        }
}