import java.util.*;
public class Client
{
    public static void test(){
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            li.add(i);
        }
        System.out.println("Original list: " + li);
        mirror(li);
        System.out.println("Mirrored list: " + li);
        
        List<String> ls = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            ls.add("String nr: " + i);
        }
        System.out.println("Original list: " + ls);
        mirror(ls);
        System.out.println("Mirrored list: " + ls);
    }


    @SuppressWarnings("unchecked") // To avoid compiler warning
	public static void mirror(List l){
        ListStack stack = new ListStack();
        for(Object o : l) {
            stack.push(o);
        }
        
        l.clear();
        for(Object o : stack) {
            l.add(stack.top());
            stack.pop();
        }
    }
}
