class Main{
    public static void main(String args[]){
        ILogger textLogger = new TextLogger("calc.txt");
        Model model = new Model(textLogger);
        View view = new View();
        Presenter presenter = new Presenter(view, model, textLogger);
        presenter.run();
        
    }
}