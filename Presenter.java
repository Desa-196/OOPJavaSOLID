public class Presenter {
    private Model model;
    private View view;
    public Presenter(View view, Model model){
        this.model = model;
        this.view = view;
    }
    public void run(){
        System.out.println(view.mainMenu());
    }
}
