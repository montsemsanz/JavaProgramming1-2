public class Driver{
    public static void run(){
        Subscription sub = new Subscription("89 42 00 00");
        SMS.setAmount(1);
        sub.add(new SMS("32 43 21 34", "hej der!"));
        sub.add(new SMS("32 43 21 34", "hej der!"));
        sub.add(new SMS("32 43 21 34", "hej der!"));
        sub.add(new SMS("32 43 21 34", "hej der!"));
        
        SMS.setAmount(2);
        sub.add(new SMS("32 43 21 34", "hej der!"));
        sub.add(new SMS("32 43 21 34", "hej der!"));
        
        sub.printActivityList();
    }
}
