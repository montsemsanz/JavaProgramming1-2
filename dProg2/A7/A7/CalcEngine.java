/**
 * The main part of the calculator performing the
 * arithmetic logic of the calculations.
 * @author Susie 
 * @version 20.12.07
 */
public class CalcEngine  
{
    private ListStack<Integer> stack;
    private boolean addingOperandAfterOperator;
    private int leftOperand;
    private int rightOperand;
    private int displayValue;
        
    /**
     * Opretter et objekt af klassen CalcEngine.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @returnerer talv�rdien, der er angivet p� displayet.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * Indtaster v�rdien af en af operanderne i regnestykket.
     * @param number Den indtastede talv�rdi.
     */
    public void numberPressed(int number)
    {
        if(addingOperandAfterOperator) {
            displayValue = number;
            addingOperandAfterOperator = false;
        }
        else {
            displayValue = displayValue * 10 + number;
        }
    }
        
    /**
     * Afslutter indtastningen af en operand ved at skubbe den angivne 
     * displayValue op p� toppen af stakken og re-setter displayValue 
     * til 0.
     */
    public void enter()
    {
        stack.push(displayValue);
        displayValue = 0;
    }
    
    /**
     * Adderer v�rdien af h�jre og venstre operand.
     */
    public void plus()
    {
        setOperands();
        int result = 0;
        result = leftOperand + rightOperand;
        updateStack(result);
    }
    
    /**
     * Multiplicererv�rdien af h�jre og venstre operand. 
     */
    public void multiply()
    {
        setOperands();
        int result = 0;
        result = leftOperand * rightOperand;
        updateStack(result);
    }
    
    /**
     * Tr�kker v�rdien af h�jre operand fra v�rdien af venstre. 
     */
    public void minus()
    {
        setOperands();
        int result = 0;
        result = leftOperand - rightOperand;
        updateStack(result);
    }
    
    /**
     * Dividerer v�rdien af venstre operand med v�rdien af h�jre operand.
     */
    public void division()
    {
        setOperands();
        int result = 0;
        result = leftOperand / rightOperand;
        updateStack(result);
    }
    
    /**
     * Udregner fakultet-v�rdien af den angivne operand.
     */
    public void fakultet()
    {
        int n = stack.top();
        int res = 1;
        while(n > 0) {
            res = res * n;
            n = n - 1;
        }
        updateStack(res);
    }

    /**
     * Opl�fter den venstre operand i den potens, der bliver angivet af 
     * h�jre operand.
     */
    public void potensopl�ftning()
    {
        setOperands();
        int result = 1;
        for(int i = rightOperand; 0 < i; i--) {
            result = result * leftOperand;
        }
        updateStack(result);
    }
        
    /**
     * Udregner kvadratroden af den angivne operand.
     */
    public void kvadratrod()
    {
    }
    
    /**
     * Metoden returnerer den �verste og n�st�verste v�rdi p� stakken,
     * som s� bliver indsat som henholdsvis h�jre og venstre operand.
     * OBS: Listen poppes efter hver top.
     */
    public void setOperands()
    {
        if(stack.size() >= 2) {
            leftOperand = stack.top();
            stack.pop();
            rightOperand = stack.top();
            stack.pop();
    }
        else {
            printErrorStatement();
        }
    }
    
    /**
     * Skubber resultatet af beregningen op p� toppen af stakken. 
     */
    public void updateStack(int result)
    {
        stack.push(result);
        displayValue = result;
        addingOperandAfterOperator = true;
    }
    
     
    /**
     * N�r man trykker p� C tasten, bliver alle v�rdier i regnemaskinen 
     * nulstillet.
     */
    public void clear()
    {
        stack = new ListStack<Integer>(); 
        displayValue = 0;
        leftOperand = 0;
        rightOperand = 0;
        addingOperandAfterOperator = false;
    }
       
    /**
     * Udskriver en fejlmelding, hvis bruger p� en eller anden m�de anvender
     * regnemaskinen forkert.
     */
    public void printErrorStatement()
    {
        System.out.println("Fejlmelding: Dette er en HP regnemaskine. " + "\n" +
        "Denne regnemaskine fungerer ved hj�lp af omvendt polsk notation" + "\n" + 
        "Det betyder, at du f�rst skal angive dine operander og derefter " + "\n" +
        "den �nskede operator. Tjek altid, at du har angivet talv�rdi(er) " + "\n" +
        "f�rst og den �nskede regnefunktion bagefter.");
        clear();
    }
    
    /**
     * Returnerer titlen p� regnemaskinen. 
     */
    public String getTitle()
    {
        return "Super-Calculator";
    }
    
    /**
     * Returnerer forfatteren af regnemaskinen.
     */
    public String getAuthor()
    {
        return "Susie";
    }
    
    /**
     * Returnerer hvilken version af regnemaskinen, der er tale om.
     */
    public String getVersion()
    {
        return "Jule-Version 2.0";
    }
     
    /**
     * 
     */
    public int getSize()
    {
        return stack.size();
    }
    
}
