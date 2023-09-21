public class MultiplyOperation implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber( 
            a.getReal()*b.getReal() - a.getImaginary()*b.getImaginary(), 
            a.getImaginary()*b.getReal() + a.getReal()*b.getImaginary());
    }
}
