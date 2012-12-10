import javax.swing.*;
import java.awt.*;
import java.util.*;
public class PanelStack<T> extends JPanel implements Stack<T>
{
    private java.util.List<T> elms = new ArrayList<T>();  
    
    public PanelStack(){
        updateDisplay();
    }
    
    private void updateDisplay(){
        removeAll();
        setLayout(new GridLayout(elms.size(), 1));
        for(T t : elms) {
            add(newTF(t.toString()));
        }
        updateUI();
    }
    
    private JTextField newTF(String val){
        JTextField res = new JTextField(11);
        res.setText(val.toString());
        return res;
    }
    
    public void push(T v){ 
        elms.add(v);
        updateDisplay();
    }
    public T top(){ 
        return elms.get(elms.size() - 1);
    } 
    public T pop(){
        T res = elms.remove(elms.size() - 1);
        updateDisplay();
        return res;
    }
    public boolean isEmpty() { return elms.isEmpty();}
    @Override
    public String toString(){return elms.toString();}
    public int sizes(){return elms.size();}
    
}    