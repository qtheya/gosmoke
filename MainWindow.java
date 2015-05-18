import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow extends JFrame{

    JButton connect, gosmoke;
    JTextField tf1;
    Client client;

    public MainWindow(){
        super("GoSmoke");
        connect = new JButton("Connect to pacan");
        gosmoke = new JButton("ping pacana");

        tf1 = new JTextField();
        tf1.setPreferredSize( new Dimension( 100, 24 ) );

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(connect);
        buttonsPanel.add(gosmoke);
        buttonsPanel.add(tf1);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        connect.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                try {
                    client = new Client();
                    ClientThread ct = new ClientThread(client);

                }catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        gosmoke.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    client.sendMessage(tf1.getText());
                    //System.out.println(tf1.getText());
                    }catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}