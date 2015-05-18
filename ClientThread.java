import java.net.Socket;

public class ClientThread extends Thread {

    private final static int DELAY = 30000;
    private Socket socket;

    public ClientThread(Client client) {
        this.socket = client.getSocket();
        this.start();
    }

    public ClientThread(Socket socket) {
        this.socket = socket;
        this.start();
    }
}