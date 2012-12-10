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
     * Opretter et objekt af klassen CalcEngine.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @returnerer talværdien angivet på displayet.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * Indtaster værdien af en af operanderne i regnestykket.
     * @param number Den indtastede talværdi.
     */
    public void numberPressed(int number)
    {
        if(leftOperand == 0) {
            displayValue = displayValue * 10 + number;
        }
        else {
            displayValue = displayValue * 10 + number;
            rightOperandSet = true;
        }
    }
    
    /**
     * @returnerer værdien af den venstre operand. 
     */
    public int getLeftOperand()
    {
        return leftOperand;
    }
    
    /**
     * Når operatoren '+' indtastes, bliver den til sidst 
     * anvendte operator og display værdien sættes til nul, 
     * så en ny operand kan indtastes. 
     */
    public void plus()
    {
        checkForRightOperand();
        previousOperator = '+';
        displayValue = 0;
    }
        
    /**
     * Når operatoren '-' indtastes, bliver den til sidst
     * anvendte operator og display værdien sættes til nul,
     * så en ny operand kan indtastes.
     */
    public void minus()
    {
        checkForRightOperand();
        previousOperator = '-';
        displayValue = 0;
    }
    
    /**
     * Tjekker, om der allerede er angivet en venstre og højre operand med
     * tilhørende operator. Hvis det er tilfældet den indtastede operator 
     * også fungere som et tryk på knappen '=', sådan at resultatet af det
     * "gamle" regnestykke bliver til venstre operand i det nye.  
     */
    public void checkForRightOperand()
    {
        if(leftOperand == 0) {
            leftOperand = displayValue;            
        }
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
     * Når man trykker på '=' knappen, tjekker metoden, at der er angivet 
     * de nødvendige operander og operatorer, så udregningen kan foretages.
     * (Hvis de ikke er til stede foretages internt metodekald til metoden
     * udskriv fejlmelding).
     */
    public void equals()
    {
        if((leftOperand != 0) && (previousOperator != ' ') 
        && (rightOperandSet == true)) {
            calculateResult();
        }
        else {
            printErrorStatement();
        }
    }
    
    /**
     * Udregner resultatet af det indtastede regnestykke.
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
     * Når man trykker på C tasten, bliver alle værdier i 
     * regnemaskinen nulstillet.
     */
    public void clear()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
        rightOperandSet = false;
    }
    
    /**
     * Udskriver en fejlmelding.
     */
    public void printErrorStatement()
    {
        System.out.println("Fejlmelding: Tjek, du har" + "\n" +
        "angivet mindst to talværdier og en operator.");
        clear();
    }
       
    /**
     * @returnerer navnet på regnemaskinen.
     */
    public String getTitle()
    {
        return "Den nye, forbedrede regnemaskine!";
    }

    /**
     * @returnerer navnet på forfatteren til regnemaskinen.
     */
    public String getAuthor()
    {
        return "LargeBrain II";
    }

    /**
     * @returnerer hvilken version af regnemaskinen, der er tale om.
     */
    public String getVersion()
    {
        return "version 0.2";
    }
    
}

