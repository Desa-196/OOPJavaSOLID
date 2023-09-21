public class SumOperation implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}
