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
     * @returnerer talværdien, der er angivet på displayet.
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
     * displayValue op på toppen af stakken og re-setter displayValue 
     * til 0.
     */
    public void enter()
    {
        stack.push(displayValue);
        displayValue = 0;
    }
    
    /**
     * Adderer værdien af højre og venstre operand.
     */
    public void plus()
    {
        setOperands();
        int result = 0;
        result = leftOperand + rightOperand;
        updateStack(result);
    }
    
    /**
     * Multiplicererværdien af højre og venstre operand. 
     */
    public void multiply()
    {
        setOperands();
        int result = 0;
        result = leftOperand * rightOperand;
        updateStack(result);
    }
    
    /**
     * Trækker værdien af højre operand fra værdien af venstre. 
     */
    public void minus()
    {
        setOperands();
        int result = 0;
        result = leftOperand - rightOperand;
        updateStack(result);
    }
    
    /**
     * Dividerer værdien af venstre operand med værdien af højre operand.
     */
    public void division()
    {
        setOperands();
        int result = 0;
        result = leftOperand / rightOperand;
        updateStack(result);
    }
    
    /**
     * Udregner fakultet-værdien af den angivne operand.
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
     * Opløfter den venstre operand i den potens, der bliver angivet af 
     * højre operand.
     */
    public void potensopløftning()
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
     * Metoden returnerer den øverste og næstøverste værdi på stakken,
     * som så bliver indsat som henholdsvis højre og venstre operand.
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
     * Skubber resultatet af beregningen op på toppen af stakken. 
     */
    public void updateStack(int result)
    {
        stack.push(result);
        displayValue = result;
        addingOperandAfterOperator = true;
    }
    
     
    /**
     * Når man trykker på C tasten, bliver alle værdier i regnemaskinen 
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
     * Udskriver en fejlmelding, hvis bruger på en eller anden måde anvender
     * regnemaskinen forkert.
     */
    public void printErrorStatement()
    {
        System.out.println("Fejlmelding: Dette er en HP regnemaskine. " + "\n" +
        "Denne regnemaskine fungerer ved hjælp af omvendt polsk notation" + "\n" + 
        "Det betyder, at du først skal angive dine operander og derefter " + "\n" +
        "den ønskede operator. Tjek altid, at du har angivet talværdi(er) " + "\n" +
        "først og den ønskede regnefunktion bagefter.");
        clear();
    }
    
    /**
     * Returnerer titlen på regnemaskinen. 
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
