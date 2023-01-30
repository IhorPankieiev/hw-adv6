package Task2;

/**
 * @author Ihor Pankieiev
 * @version 1.0
 * @since 29.01.2023
 */

public class Calc {
    /**
     * First digit
     */
    public int num1;
    /**
     * Second Digit
     */
    public int num2;
    /**
     * Addition operations
     * @return sum's of first and second digit
     */
    public int sum(){
        return this.num1 + this.num2;
    }
    /**
     * Subtraction operations
     * @return subtraction of first and second digit
     */
    public int subtr(){
        return this.num1 - this.num2;
    }
    /**
     * Multiplication operations
     * @return first digit multiplied by second digit
     */
    public int mult(){
        return this.num1 * this.num2;
    }
    /**
     * Division operations
     * @return first digit divided by second digit
     */
    public int div(){
        return this.num1/this.num2;
    }

    /**
     * Constructor initialize two digits needed for math operations
     * @param num1 first digit
     * @param num2 second digit
     */
    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


}
