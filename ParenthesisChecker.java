import java.util.*;
public class ParenthesisChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        if(isBalanced(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
        }
        finally{
            sc.close();
        }

    }
    public static boolean isBalanced(String str){
        Stack <Character> stack = new Stack<>();
        for (char ch :str.toCharArray()){
            switch(ch){
                case  '(' :
                case  '{' :
                case  '[' :
                    stack.push(ch);
                    break;
                case  ')' :
                    if(stack.isEmpty()||stack.pop()!= '(') return false;
                    break;
                case'}':
                    if(stack.isEmpty() ||stack.pop() != '{') return false;
                    break;
                case ']':
                    if(stack.isEmpty()||stack.pop ()!= '[')return false;
                    break;
    }
}
    return stack.isEmpty();
}

}



// sum
// avg
// min
// max
// count 
// between
// and
// or
// in
// Not
// like
// not between 
// where
// group by
// is null
// order by 
// having clause









