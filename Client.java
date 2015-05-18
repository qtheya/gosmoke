import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class Client {

    private Socket socket;
    String serverAddress;

    public Client() throws IOException{

        serverAddress = JOptionPane.showInputDialog("Enter Server IP: ");
            try {
                socket = new Socket(serverAddress, 1034);
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }
    }

    public Socket getSocket() {
        return this.socket;
    }

    public void sendMessage(String msg) throws IOException{
        PrintWriter writer = new PrintWriter(this.socket.getOutputStream(), true);
        writer.println(msg);
    }

}

