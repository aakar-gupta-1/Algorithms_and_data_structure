import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
	char top;
	boolean check=false;
        Stack opening_brackets_stack = new Stack();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                opening_brackets_stack.push(next);
            }

            if (next == ')' || next == ']' || next == '}') {               
                top=(char)opening_brackets_stack.pop();
		Bracket B=new Bracket(top,0);
		check=B.Match(next);
            }
        }

        System.out.println(check);
    }
}