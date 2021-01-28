import java.io.IOException;

public class RuntimeExec {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try{
            Process process = runtime.exec("git");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}