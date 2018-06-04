package util;

public class StringCalcMaker {

    public static final String SUBTRACAO = "-";
    public static final String SOMA = "+";
    public static final String DIVISAO = "/";
    public static final String MULTIPLICACAO = "x";

    public double singleOperation(String exp) throws Exception{

        String operador = "";

        for (int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);
            operador = getOperador(c);
            
            if(operador != null){
                
                break;
                
            }
            
        }

        if(operador.isEmpty()){
            
            throw new Exception("Operador não encontrado");
            
        }else{
        
            
            double[] numbers = convertArrayStringToDouble(exp.split("\\"+operador));
            DoubleArrayOperator dao = new DoubleArrayOperator();
            
            switch(operador){
                
                case SOMA:
                    return dao.somaArray(numbers);
                    
                case SUBTRACAO:
                    return dao.subtrairArray(numbers);
                    
                case MULTIPLICACAO:
                    return dao.multiplicarArray(numbers);
                    
                case DIVISAO:
                    return dao.dividirArray(numbers);
             
                default:
                    throw new Exception("Operador não encontrado");
                    
            }
        
        }
        
    }

    private double[] convertArrayStringToDouble(String[] arrayString) throws Exception{
        
        double[] arrayDouble = new double[arrayString.length];
        
        for (int i = 0; i < arrayString.length; i++) {
            
            arrayDouble[i] = Double.parseDouble(arrayString[i]);
            
        }
        
        return arrayDouble;
        
    }
    
    private String getOperador(char c) {

        if (c == SUBTRACAO.charAt(0)) {

            return SUBTRACAO;

        } else if (c == DIVISAO.charAt(0)) {

            return DIVISAO;

        } else if (c == MULTIPLICACAO.charAt(0)) {

            return MULTIPLICACAO;

        } else if (c == SOMA.charAt(0)) {

            return SOMA;

        }else{
            
            return null;
            
        }

    }

}
