package ru.mirea.kvbo1.khamit.practica22;


public class Main {
    public static float PolishMath(String a) {
        Stack<Float> s=new Stack<>();
        int answer;
        int k=0;
        char[] ch=a.toCharArray();
        while(k!=ch.length){
            if(ch[k]>'0' && ch[k]<'9') {
                s.push((float)(Character.getNumericValue( ch[k])));
                k++;
            }
             else if(ch[k]=='+'){
                    s.push(s.pop()+s.pop());
                    k++;

                }
               else if(ch[k]=='*'){
                    s.push(s.pop()*s.pop());
                    k++;

                }
                else if(ch[k]=='-'){
                    float a1=s.pop();
                    float a2=s.pop();

                    s.push(a2-a1);
                    k++;

                }
               else if(ch[k]=='/'){
                    float a1=s.pop();
                    float a2=s.pop();

                    s.push(a2/a1);
                    k++;


            }
        }
        return s.pop();
    }

    public static void main(String[] args) {

            String a="23*45*+";
        System.out.println(PolishMath(a));

    }
}
