import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Events  {

    public Button button1;
    public Button button2;
    public JFrame frame;
    public JPanel panel;
    public Label label1;
    public Label label2;
    public int age = 0;
    public  int count = 0 ;



    public Events()
    {

        frame = new JFrame();
        panel = new JPanel();
        label1 = new Label("Age : " + age);
        label2 = new Label("Count : " + count);
        button1 = new Button("Click Me for Age ");
        button2 = new Button("Click Me for Count");
        button1.addActionListener(listner1);
        button2.addActionListener(listener2);


        panel.setBorder(BorderFactory.createEmptyBorder(40,20,40,20));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button1);
        panel.add(label1);
        panel.add(button2);
        panel.add(label2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Counter");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);








    }


    ActionListener listner1 = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            age++;
            label1.setText("Age : " + age );
        }
    };

    ActionListener listener2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            count++;
            label2.setText("Count : " +count);
        }
    };


}
