import java.io.FileWriter;
import java.io.IOException;

public class TextLogger implements ILogger {
    String file;

    public TextLogger(String file) {
        this.file = file;
    }

    public void writeLog(String log) {

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(log + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка сохранения в лог файл: " + e.getMessage());
        }
    }
}
