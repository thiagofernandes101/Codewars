import Interfaces.DigitalRootInterface;

public class DigitalRoot implements DigitalRootInterface {
    @Override
    public int DigitsSum(int digit) {
        //int digitSum = 0;
        //char[] numbers = String.valueOf(digit).toCharArray();

        //for (char number : numbers) {
        //    digitSum += Integer.parseInt(String.valueOf(number));
        //}

        //if (String.valueOf(digitSum).length() > 1) {
        //    digitSum = DigitsSum(digitSum);
        //}

        //return digitSum;
        return (digit != 0 && digit%9 == 0) ? 9 : digit % 9;
    }
}
