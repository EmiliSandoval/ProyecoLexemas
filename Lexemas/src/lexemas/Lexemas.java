/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexemas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author yayis
 */
public class Lexemas {
    public void busqueda(JTextArea NO){
        
        JFileChooser   f = new JFileChooser();
        f.showOpenDialog(null);
        File arc = f.getSelectedFile();
        try{
                FileReader fr = new FileReader(arc);
                BufferedReader  br =new BufferedReader(fr);
                String tx="";
                String lin="";
                while(((lin=br.readLine())!=null)){
                    tx+=lin+"\n";
                }
                NO.setText(tx);
                JOptionPane.showMessageDialog(null,"si se pudo, pa'");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No Compatible");
        }
    }    
}


