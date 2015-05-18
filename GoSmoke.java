import java.io.IOException;

public class GoSmoke {
    public static void main (String[] args) throws IOException{

        MainWindow app = new MainWindow();
        app.setVisible(true);
        app.pack();
        Server server = new Server();
    }
}
