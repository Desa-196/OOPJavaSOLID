public class Model {
    ILogger logger;

    public Model(ILogger logger){
        this.logger = logger;
    }
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, ComplexOperation operation){
        if(operation == null){
            logger.writeLog("Ошибка в методе calculate, передано значение null");
             throw new NullPointerException();
        }
        return operation.calculate(a, b);
    }
}
