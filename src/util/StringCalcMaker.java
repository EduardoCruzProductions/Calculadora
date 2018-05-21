
package util;

import java.util.List;
import java.util.ArrayList;

public class StringCalcMaker {
    
    public static final String SUBTRACAO = "-";
    public static final String SOMA = "+";
    public static final String DIVISAO = "/";
    public static final String MULTIPLICACAO = "x";
    
    public double singleCalc(String exp){
        
        String operador = "";
        
        for (int i = 0; i < exp.length(); i++) {
            
            char c = exp.charAt(i);
            
            if(c == SUBTRACAO.charAt(0)){
            
                operador = SUBTRACAO;
                break;
                
            }else if(c == DIVISAO.charAt(0)){
                
                operador = DIVISAO;
                break;
                
            }else if(c == MULTIPLICACAO.charAt(0)){
                
                operador = MULTIPLICACAO;
                break;
                
            }else if(c == SOMA.charAt(0)){
                
                operador = SOMA;
                break;
            
            }
            
        }
        
        String[] numbers = exp.split(operador);
        
        return 0.d;
        
    }
    
}
