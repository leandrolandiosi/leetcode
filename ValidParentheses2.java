import java.util.Stack;

public class ValidParentheses2 {
    public static boolean isValid(String s) {
        Stack<Character> pilha=new Stack<>();//Cria uma pilha
        for(char c : s.toCharArray()){//Transforma string s em um array e loopa char a char
            if(c=='(') pilha.push(')');//para cara chave inicializada coloca seu fechamento na pilha
            else if(c=='{') pilha.push('}');
            else if(c=='[') pilha.push(']');
            else if(pilha.isEmpty() || pilha.pop()!=c) return false; //valida se a pilha está vazia ou corresponde com a ultima chave aberta.
        }
        return pilha.isEmpty();//se esvaziou a pilha a string está correta.
    }
    public static void main(String[] args) {
        Boolean i = isValid("[([]])");
        if (i){System.out.println("true");}else{System.out.println("false");}
    }

}
