
package util;

public class DoubleArrayOperator {
    
    public double somaArray(double[] doubleArray){
       
        double total = 0;
        
        for(double d : doubleArray){
            
            total += d;
            
        }
        
        return total;
        
    }
    
    public double multiplicarArray(double[] doubleArray){
        double total = 0;
        
        for(double d : doubleArray){
            
            total = total * d;
            
        }
        
        return total;
    }
    
    public double dividirArray(double[] doubleArray){
        double total = 0;
        
        for(double d : doubleArray){
            
            total = total / d;
            
        }
        
        return total;
    }
    
    public double subtrairArray(double[] doubleArray){
         double total = 0;
        
        for(double d : doubleArray){
            
            total -= d;
            
        }
        
        return total;
    }
    
    public double mediaArray(double[] doubleArray){
        
        return somaArray(doubleArray)/doubleArray.length;
        
    }
    
}
