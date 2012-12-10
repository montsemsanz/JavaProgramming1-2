import javax.swing.*;
public class SubscriptionFrame extends JFrame
{
    private Subscription sub;
    private JLabel totalLabel;
    
    public SubscriptionFrame(){
        this(Subscription.load());
    }
    public SubscriptionFrame(Subscription s){
        sub = s;
        
        totalLabel = new JLabel("Hej");
        JPanel p = new JPanel();
        
        p.add(totalLabel);
        
        JButton b = new JButton("Hallo");
        p.add(b);
        
        getContentPane().add(p);
        updateGUI();
        pack();
        setVisible(true);
    
    }
    
    public void updateGUI(){
        totalLabel.setText("Balance: " + sub.getBalance());
    }
}
