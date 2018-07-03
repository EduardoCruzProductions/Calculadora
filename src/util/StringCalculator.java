
package util;

public class StringCalculator {
    
    public final String SOMA = "+";
    public final String SUBTRACAO = "-";
    public final String MULTIPLICACAO = "x";
    public final String DIVISAO = "/";
    
    public double calcular(String text, String op){
        
        
        
        String[] numeros;
        
        if(op.equals(SOMA)){
            
            numeros = text.split("\\"+op);
            
        }else{
            
            numeros = text.split(op);
            
        }
        
        double v1 = 0, v2 = 0;
        
        try{
            
            v1 = Double.parseDouble(numeros[0]);
            v2 = Double.parseDouble(numeros[1]);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        switch(op){
            
            case SOMA:
                return v1 + v2;
            case SUBTRACAO:
                return v1 - v2;
            case MULTIPLICACAO:
                return v1 * v2;
            case DIVISAO:
                return v1 / v2;
               
            default:
                return 0;
            
        }
        
    }
    
}
