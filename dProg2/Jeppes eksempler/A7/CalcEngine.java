/**
 * The main part of the calculator doing the calculations.
 * 
 * @author  David J. Barnes and Michael Kolling
 * @version 0.1 (incomplete)
 */
public class CalcEngine
{
    private Stack<Integer> st; 
    private int displayValue;
    private boolean buildingVal;
    private String errorMesg;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine(Stack<Integer> st)
    {
        this.st = st;
        displayValue = 0;
        buildingVal = false;
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
        if (buildingVal){
            displayValue = number + 10*displayValue;
        } else {
            displayValue = number;
            buildingVal = true;
        }
    }
    
    private boolean preOperator(int arity){
        flush();
        if (st.sizes() < arity){
            //Handle error
            errorMesg = "Too few elemenents on stack. Expected " + arity + " elements";
            return false;
        }
        return true;
    }

    /**
     * The 'plus' button was pressed. 
     */
    public void plus()
    {
        if (!preOperator(2)) return;
        st.push(st.pop() + st.pop());
        displayValue = st.top();
        buildingVal = false;
    }
    
    private int fak(int n){
        if (n == 1) return 1;
        return n * fak(n-1);
    }
    
    public void fak(){
        if (!preOperator(1)) return;
        st.push(fak(st.pop()));
        displayValue = st.top();
        buildingVal = false;
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus(){
        if (!preOperator(2)) return;
        st.push(-(st.pop() - st.pop()));
        displayValue = st.top();
        buildingVal = false;
    }
    
    public void mult(){
        if (!preOperator(2)) return;
        st.push(st.pop() * st.pop());
        displayValue = st.top();
        buildingVal = false;
    }
    public void div(){
        if (!preOperator(2)) return;
        int tmp = st.pop();
        st.push(st.pop() / tmp);
        displayValue = st.top();
        buildingVal = false;
    }
    public void sqrt(){
        if (!preOperator(1)) return;
        st.push((int)Math.sqrt(st.pop()));
        displayValue = st.top();
        buildingVal = false;
    }

    private void flush(){
        if (buildingVal) {
            st.push(displayValue);
            buildingVal = false;
        }
    }
    
    public String getStatus(){
        if (errorMesg != null) {
            String res = errorMesg;
            errorMesg = null;
            return res;
        } else return getAuthor();
    }
    
    /**
     * The 'E' button was pressed.
     */
    public void E(){
        st.push(displayValue);
        buildingVal = false;
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        while (!st.isEmpty()) st.pop();
        buildingVal = false;
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Lommeregner";
    }

    /**
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Jeppe & co.";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion()
    {
        return "1.0";
    }
}
