public class ComplexNumber {
    
    private double real;
    public double getReal(){
        return real;
    }
    private double imaginary;
    public double getImaginary(){
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
}
