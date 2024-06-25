import java.io.IOException;
import java.net.*;
import java.util.concurrent.TimeUnit;


public class CrptApi {

    private TimeUnit timeUnit;
    private int requestLimit;

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
    }

    public static void main(String[] args) {
        Connection con = new Connection("https://ismp.crpt.ru/api/v3/lk/documents/create", 80);
        return;
    }
}

class Connection {

  private Socket socket = null;

    public Connection(String target, int port) {
      try {
            this.socket = new Socket(target, port);
        } catch (Exception e) {
            System.err.println("Error at socket connection the error is:\n" + e);
        }
    }

    public void Close() {
        try {
            this.socket.close();
        } catch (Exception e) {
            System.err.println("Error on closing the connection the error is:\n" + e);
        }
        return;
    }
}