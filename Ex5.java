//throw key word

class Ex5{

void div(int a, int b) {

try{

System.out.println(a/b);

}catch(ArithmeticException el) {

System.out.println("div():divide by zero -exception"+el);

throw el;

}}

public static void main(String[] ar) {

int a=10;

int b=0;//if zero it will throw ArithmeticException

Ex5 e = new Ex5();

try{

e.div(a,b);

}catch(ArithmeticException ee) { 

System.out.println("main(): divide by zero -exception"+ee);

}}}