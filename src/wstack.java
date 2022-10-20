import java.util.Stack;

public class wstack {

    public static void reverse(StringBuffer s) {
        int n = s.length();
        Stack obj = new Stack();

        int i;
        for (i = 0; i < n; i++) {
            obj.push(s.charAt(i));
        }

        for (i = 0; i < n; i++) {
            char ch = (char) obj.pop();
            s.setCharAt(i, ch);
        }
    }

    public static void main(String args[]) {

        StringBuffer s = new StringBuffer("egsbdfn");

        reverse(s);

        System.out.println(s);
    }
}

