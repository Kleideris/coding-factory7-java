package gr.aueb.cf.challenges.tasks14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final Logger INSTANCE = new Logger();


    private Logger() {
    }

    public void logMessage(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.err.println("[" + timestamp + "]" + message);
    }
}
