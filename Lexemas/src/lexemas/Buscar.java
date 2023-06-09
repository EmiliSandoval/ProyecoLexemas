package lexemas;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTextArea;
public class Buscar extends javax.swing.JFrame {
 private String[] Arreglo;
    public Buscar() {
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Hot");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jMenu1.setBackground(new java.awt.Color(0, 204, 204));
        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(255, 204, 255));
        jMenuItem1.setForeground(new java.awt.Color(153, 0, 153));
        jMenuItem1.setText("Open File");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setForeground(new java.awt.Color(153, 0, 153));
        jMenuItem2.setText("Keyword Finder");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Lexemas b = new Lexemas ();
        b.busqueda(jTextArea1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        Analizar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
public void Analizar(){
    
    Arreglo = jTextArea1.getText().split("(?<=\\W)|(?=\\W)"); //Expresion regular CHECKKKKK!!!!!!!!!!!!!
    //[^a-zA-Z0-9\\.\\=\\,\\;\\!=\\;=\\<\\>\\==\\<=\\>=\\+\\-\\*\\/\\(\\)']+
                HashMap<String, Integer> palabras = new HashMap< String,Integer>();
         

                
       palabras.put(">=",1);
       palabras.put("begin",2);
       palabras.put("end",3);
       palabras.put("id",4);
       palabras.put("=",5);
       palabras.put("write",6);
       palabras.put("read",7);
       palabras.put(".",8);
       palabras.put("const",9);
       palabras.put("var",10);
       palabras.put(",",11);
       palabras.put("to",12);
       palabras.put("dto",13); 
       palabras.put("+",14);
       palabras.put("-",15);
       palabras.put("*",16);
       palabras.put("/",17);
       palabras.put("(",18);
       palabras.put(")",19);
       palabras.put("call",20);
       palabras.put("if",21);
       palabras.put("then",22);
       palabras.put("while",23);
       palabras.put("do",24);
       palabras.put("for",25);
       palabras.put(";",26);
       palabras.put("==",27);
       palabras.put("!=",28);
       palabras.put("<",29);
       palabras.put(">",30);
       palabras.put("<=",31);
       //
       for (int i = 0; i < Arreglo.length; i++) {
                   if(palabras.containsKey(Arreglo[i])){               
                        jTextArea2.append(Arreglo[i]+"    Num en lista:    "+palabras.get(Arreglo[i])+"\n");
                String numero = Removew (Arreglo[i]);
                    if (!numero.isEmpty()) {
                        jTextArea2.append("Numero: " + " Se encuentra en la posicion " + (i + 1) + "\n");
                    }               
                } else if (!Arreglo[i].trim().isEmpty()) {
                        jTextArea3.append("ERROR: " +  Arreglo[i] + "Se encuentra en la posicion " + (i + 1) + "\n");
                }
                }
}      //

        boolean NumberTrue (String palabra) {
            try{
        Double.parseDouble(palabra);
        return true;
       } catch (NumberFormatException e) {
        return false;
    }
}

        String Removew (String palabra) {
            return palabra.replaceAll("[^0-9.]", "");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
