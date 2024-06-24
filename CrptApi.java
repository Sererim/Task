import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class CrptApi {

    private TimeUnit timeUnit;
    private int requestLimit;
    private Socket socket;

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
        this.socket = null;
    }
}
