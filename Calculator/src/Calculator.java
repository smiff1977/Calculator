public class Calculator
{
            public int add ( int a, int b){
            int k = a + b;
            return k;
        }

        public int subtract ( int a, int b){
            int e = a - b;
            return e;
        }

        public int multiply ( int a, int b){
            int f = a * b;
            return f;
        }

        public int divide ( int a, int b){
            int g = a / b;
            return g;
        }

        public int modulo ( int a, int b){
            int h = a % b;
            return h;
        }

        public static void main (String[]args){

            Calculator myCalculator = new Calculator();
            System.out.println(myCalculator.add(5, 7));
            System.out.println(myCalculator.subtract(45, 11));
            System.out.println(myCalculator.multiply(10, 5));
            System.out.println("The remainder is " + myCalculator.modulo(150, 125));

       }
}
