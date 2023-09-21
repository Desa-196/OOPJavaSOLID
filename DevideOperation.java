public class DevideOperation implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b){
        System.out.println(a.getReal()*b.getReal() + a.getImaginary()*b.getImaginary());
        System.out.println("/");
        System.out.println(Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2));
        return new ComplexNumber(
            (a.getReal()*b.getReal() + a.getImaginary()*b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2)),
            (a.getImaginary()*b.getReal() - a.getReal()*b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2)));
    }
}
