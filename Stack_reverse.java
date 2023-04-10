import java.util.Stack;

public class Stack_reverse {


        static void reverse(String s)
        {

            Stack<String> stc = new Stack<>();

            String temp = "";


            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == ' ')
                {
                    stc.add(temp);
                    temp = "";
                }
                else
                {
                    temp = temp + s.charAt(i);
                }

            }


            stc.add(temp);

            while(!stc.isEmpty())
            {

                temp = stc.peek();
                System.out.print(temp + " ");
                stc.pop();
            }

            System.out.println();
        }

        public static void main(String[] args)
        {
            String s = "this is a ds practical file of ds ";
            reverse(s);
        }
    }

