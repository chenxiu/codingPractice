package practice;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s1 = "()[]{}";
    String s2 = "([)]";
    System.out.print(isValid(s2));
  }

  private static boolean isValid(String s) {
    char[] charA = s.toCharArray();
    Stack st = new Stack();
    for (int i = 0; i < charA.length; i++) {
      if (charA[i] == '(' || charA[i] == '{' || charA[i] == '[')
        st.push(charA[i]);
      else {
        if (st.isEmpty())
          return false;
        else if (charA[i] == ')') {
          if ((char) st.pop() != '(')
            return false;
        } else if (charA[i] == ']') {
          if ((char) st.pop() != '[')
            return false;
        } else if (charA[i] == '}') {
          if ((char) st.pop() != '{')
            return false;
        }
      }
    }
    if (!st.isEmpty())
      return false;
    return true;
  }
}
