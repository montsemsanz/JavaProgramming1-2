public class Driver{
    public static void run(){
        
        Subscription sub = new Subscription("43 43 43 43");
        MMS m = new MMS("43 43 23 43", "photograph");
        m.addMultimedie(new Multimedie(6, "text"));
        m.addMultimedie(new Multimedie(6, "text"));
        
        sub.add(m);
        
        sub.printActivityList();
    }
}
