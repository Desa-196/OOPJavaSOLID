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
            logger.writeLog("Выбран пункт меню" + menuItem);
            ComplexOperation[] operations = new ComplexOperation[] {
                new MultiplyOperation(),
                new DevideOperation(),
                new SumOperation()
            };
            ComplexNumber[] complexNumbers;

            switch(menuItem)
            {
                case 1:
                case 2:
                case 3:
                    complexNumbers = view.getComplexNumberFromConsole();
                    logger.writeLog(
                            String.format(
                                    "Введены значения: a1 = %s, b1 = %s, a2 = %s, b2 = %s",
                                    complexNumbers[0].getReal(), complexNumbers[0].getImaginary(),
                                    complexNumbers[1].getReal(), complexNumbers[0].getImaginary()));
                    //передаем полученные комплексные числа и операцию которую необходимо с ними произвести в модель, результат отдаем в view
                    view.viewResult(model.calculate(complexNumbers[0], complexNumbers[1], operations[menuItem - 1]));   
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
