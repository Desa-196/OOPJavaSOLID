public class Model {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, ComplexOperation operation){
        return operation.calculate(a, b);
    }
}
