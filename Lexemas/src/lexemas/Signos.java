package lexemas;
//
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//
public class Signos  extends JFrame {
    private JTextArea txt;
    private JScrollPane Cajahot;
    private JButton btnBotonhot;
    private String[] Arreglo;
//
    public Signos() throws HeadlessException {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
//
        txt = new JTextArea();
        Cajahot = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Cajahot.setBounds(50, 10, 380, 450);
        btnBotonhot = new JButton("Analiza");
        btnBotonhot.setBounds(210, 400, 80, 20);
        btnBotonhot.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent ae) {
                Arreglo = txt.getText().split("[^a-zA-Z0-9']+");
                for (int i = 0; i < Arreglo.length; i++) {
                    if (Arreglo[i].equals("if") || Arreglo[i].equals("else")|| Arreglo[i].equals("gris")) {
                        System.out.println(Arreglo[i]);
                    }
                }
            }
        });
//
        add(btnBotonhot);
        add(Cajahot);
        setVisible(true);
    }
    public static void main(String[] args) {
        Signos mini = new Signos();
    }
}
