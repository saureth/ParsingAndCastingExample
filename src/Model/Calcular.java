package Model;
public class Calcular implements Ctrl.CalcularIF{
    private float firstValueF;
    private float secondValueF;
    private float resultF;

    public Calcular() {
    }

    public Calcular(float firstValueF, float secondValueF) {
        this.firstValueF = firstValueF;
        this.secondValueF = secondValueF;
        this.resultF = 0.0f;
    }  
    
    @Override
    public float Add(float one, float two) {
        resultF=Float.parseFloat(""+ (one + two));
        return resultF;
    }
    @Override
    public float Substract(float one, float two) {
        resultF=Float.parseFloat(""+ (one - two));
        return resultF;
    }
    @Override
    public float Multiply(float one, float two) {
        resultF=Float.parseFloat(""+ (one * two));
        return resultF;
    }
    @Override
    public float Divide(float one, float two) {
        System.out.println(two);
        if(validateDivide(two)){            
            resultF=(one/two);            
        }
        return resultF;
    }  
    
    public float getFirstValueF() {
        return firstValueF;
    }
    public void setFirstValueF(float firstValueF) {
        this.firstValueF = firstValueF;
    }
    public float getSecondValueF() {
        return secondValueF;
    }
    public void setSecondValueF(float secondValueF) {
        this.secondValueF = secondValueF;
    }
    public float getResultF() {
        return resultF;
    }    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Float.floatToIntBits(this.firstValueF);
        hash = 19 * hash + Float.floatToIntBits(this.secondValueF);
        hash = 19 * hash + Float.floatToIntBits(this.resultF);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calcular other = (Calcular) obj;
        if (Float.floatToIntBits(this.firstValueF) != Float.floatToIntBits(other.firstValueF)) {
            return false;
        }
        if (Float.floatToIntBits(this.secondValueF) != Float.floatToIntBits(other.secondValueF)) {
            return false;
        }
        if (Float.floatToIntBits(this.resultF) != Float.floatToIntBits(other.resultF)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return " "+getResultF();
    }
    
    public boolean validateDivide(float secNum){
        boolean notZero= false;
        System.out.println("Dentro :" + this.getSecondValueF());
        if (this.getSecondValueF()== secNum&& secNum!=0) {
            notZero=true;            
        }
        return notZero;
    }
}
