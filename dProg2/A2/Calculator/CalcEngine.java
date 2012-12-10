/**
 * The main part of the calculator performing the
 * arithmetic logic of the calculations.
 * @author Susie 
 * @version 0.2
 */
public class CalcEngine
{
    // The value shown in the display.
    private int displayValue;
    // The previous operator typed (+ or -).
    private char previousOperator;
    // The left operand to previous operator.
    private int leftOperand;
    // The right operand is already set.
    private boolean rightOperandSet;

    /**
     * Create a CalcEngine instance.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @return The value currently displayed
     * on the calculator.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed.
     * @param number The single digit.
     */
    public void numberPressed(int number)
    {
        displayValue = displayValue * 10 + number;
        if(leftOperand == 0) {
            leftOperand = displayValue;
        }
        else {
            rightOperandSet = true;
        }
    }
    
    /**
     * 
     */
    public int getLeftOperand()
    {
        return leftOperand;
    }
    
    /**
     * The '+' button was pressed. 
     */
    public void plus()
    {
        checkForRightOperand();
        previousOperator = '+';
        displayValue = 0;
    }
        
    /**
     * The '-' button was pressed.
     */
    public void minus()
    {
        checkForRightOperand();
        previousOperator = '-';
        displayValue = 0;
    }
    
    /**
     * 
     */
    public void checkForRightOperand()
    {
        if((rightOperandSet == true) && (previousOperator == '+')) {
            leftOperand = leftOperand + displayValue;
            rightOperandSet = false;
        }
        if((rightOperandSet == true) && (previousOperator == '-')) {
            leftOperand = leftOperand - displayValue;
            rightOperandSet = false;
        }
    }
    
    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        if((leftOperand != 0) && (previousOperator != ' ') 
        && (rightOperandSet == true)) {
            calculateResult();
        }
    }
    
    /**
     * 
     */          
    public int calculateResult()
    {
        if(previousOperator == '+') {
            return displayValue = leftOperand + displayValue;
        }
        else {
            return displayValue = leftOperand - displayValue;
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
        rightOperandSet = false;
    }
    
    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Den nye, forbedrede regnemaskine!";
    }

    /**
     * @return The author of this engine.
     */
    public String getAuthor()
    {
        return "LargeBrain II";
    }

    /**
     * @return The version number of this engine.
     */
    public String getVersion()
    {
        return "version 0.2";
    }
    
}

