import sun.plugin2.message.Message;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    protected final static int portNumber = 1034;
    static ServerSocket serverSocket;
    static Socket socket;

    public Server() throws IOException {
        try {
            serverSocket = new ServerSocket(portNumber);
            socket = serverSocket.accept();
            new ClientThread(socket);
            Scanner socketReader = new Scanner(socket.getInputStream());
            while(socketReader.hasNext()){
                System.out.println(socketReader.nextLine());
            }
        }   catch (Exception e) {
            System.err.println("Socket exception");
            e.printStackTrace();
        }
    }
}
