
package util;

public class StringCalculatorTest {
   
    public static void main(String[] args) {
        
        StringCalculator calc = new StringCalculator();
        
        double resultado = calc.calcular("23+10", "+");
        
        System.out.println(resultado);
        
    }
 
}
