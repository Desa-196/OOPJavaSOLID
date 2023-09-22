public class DevideOperation implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(
            (a.getReal()*b.getReal() + a.getImaginary()*b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2)),
            (a.getImaginary()*b.getReal() - a.getReal()*b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2)));
    }
}
