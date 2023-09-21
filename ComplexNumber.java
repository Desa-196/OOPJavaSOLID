public class ComplexNumber {

    private final double real;
    public final double getReal(){
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
    @Override
    public String toString(){
        return String.format("%s + %s*i", real, imaginary);
    }
}
