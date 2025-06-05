//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GradeConverter converter = new GradeConverter();

        for(int i=0 ; i<105 ; i++){
            System.out.println(i+";"+converter.convert(i));
        }
    }
}