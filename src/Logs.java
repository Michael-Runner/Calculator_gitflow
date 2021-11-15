import java.io.FileWriter;
import java.io.IOException;

public class Logs {
    FileWriter logs;

    public Logs() throws Exception{
        this.logs = new FileWriter("Logs.txt");
    }

    public void write(String log) throws IOException {
        this.logs.write(log + " \n");
    }

    public FileWriter getLogs() {
        return logs;
    }
}
