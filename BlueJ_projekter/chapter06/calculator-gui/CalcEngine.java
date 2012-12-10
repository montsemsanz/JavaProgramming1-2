/**
 * The main part of the calculator doing the calculations.
 * 
 * @author  David J. Barnes and Michael Kolling
 * @version 0.1 (incomplete)
 */
public class CalcEngine
{
    // The value in the display.
    private int displayValue;
    // The previous operator typed (- or +).
    private char previousOperator;
    // The left operand to previous operator.
    private int leftOperand;
    // The successive operands to previous operator.
    private int rightOperand;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
        rightOperand = 0;
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(int number)
    {
        if(leftOperand == 0) {
            leftOperand = number;
            displayValue = number;
        }
        if(leftOperand != 0) {
            rightOperand = number; 
            displayValue = number;
        }
    }
    
    /**
     * The 'plus' button was pressed. 
     */
    public void plus()
    {
        previousOperator = '+'; 
        if((leftOperator != 0) && rightOperator != 0)) {
            
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus()
    {
        previousOperator = '-';
    }

    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        if(previousOperator = '+') {
            result = leftOperand + rightOperand;
            displayValue = result;
        }
        if(previousOperator = '-') {
            result = leftOperand - rightOperand;
            displayValue = result;
        }
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Forbedret calculator";
    }

    /**
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Susie";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion()
    {
        return "Version 1.1";
    }
}
