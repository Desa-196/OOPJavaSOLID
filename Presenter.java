public class Presenter {
    private Model model;
    private View view;
    private ILogger logger;

    public Presenter(View view, Model model, ILogger logger) {
        this.model = model;
        this.view = view;
        this.logger = logger;
    }

    public void run() {
        boolean flag = true;
        while (flag) {
            int menuItem = view.mainMenu();
            double a1;
            double b1;
            double a2;
            double b2;
            logger.writeLog("Выбран пункт меню" + menuItem);
            switch (menuItem) {
                case 1:
                    a1 = view.getRealNumberA();
                    b1 = view.getimagInaryNumberA();
                    a2 = view.getRealNumberB();
                    b2 = view.getimagInaryNumberB();
                    logger.writeLog(String.format("Введены значения: a1 = %s, b1 = %s, a2 = %s, b2 = %s", a1, b1, a2, b2));
                    view.viewResult(model.calculate(new ComplexNumber(a1, b1), new ComplexNumber(a2, b2),
                            new MultiplyOperation()));
                    break;
                case 2:
                    a1 = view.getRealNumberA();
                    b1 = view.getimagInaryNumberA();
                    a2 = view.getRealNumberB();
                    b2 = view.getimagInaryNumberB();
                    logger.writeLog(String.format("Введены значения: a1 = %s, b1 = %s, a2 = %s, b2 = %s", a1, b1, a2, b2));
                    view.viewResult(model.calculate(new ComplexNumber(a1, b1), new ComplexNumber(a2, b2),
                            new DevideOperation()));
                    break;
                case 3:
                    a1 = view.getRealNumberA();
                    b1 = view.getimagInaryNumberA();
                    a2 = view.getRealNumberB();
                    b2 = view.getimagInaryNumberB();
                    logger.writeLog(String.format("Введены значения: a1 = %s, b1 = %s, a2 = %s, b2 = %s", a1, b1, a2, b2));
                    view.viewResult(model.calculate(new ComplexNumber(a1, b1), new ComplexNumber(a2, b2),
                            new SumOperation()));
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
