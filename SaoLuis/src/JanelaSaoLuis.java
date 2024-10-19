import java.awt.Color;
import javax.swing.UIManager;
import org.xml.sax.Attributes;
public class JanelaSaoLuis extends javax.swing.JFrame {
    public JanelaSaoLuis() {
        this.getContentPane().setBackground(Color.blue);
        this.setVisible(true);
        initComponents();
        UIManager.put("ToolType.foreground", Color.BLACK);
        UIManager.put("ToolType.background", Color.GREEN);  
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("São Luís");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.cyan);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInit.setBackground(java.awt.Color.white);
        btnInit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosvisuais/img_btnPlay.png"))); // NOI18N
        btnInit.setText("Iniciar");
        btnInit.setToolTipText("Jogar");
        btnInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInit.setDefaultCapable(false);
        btnInit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInitMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInitMouseEntered(evt);
            }
        });
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });
        getContentPane().add(btnInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 117, 49));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosvisuais/imagem_titulo_init.png"))); // NOI18N
        jLabel2.setText("              ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 75, 600, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosvisuais/telainicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        JogoEmSi janelinha = new JogoEmSi();
        
        janelinha.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInitActionPerformed

    private void btnInitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseReleased
       
    }//GEN-LAST:event_btnInitMouseReleased

    private void btnInitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseExited
        btnInit.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_btnInitMouseExited

    private void btnInitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInitMouseEntered
        btnInit.setBackground(new java.awt.Color(76,245,76));
    }//GEN-LAST:event_btnInitMouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

    }//GEN-LAST:event_jLabel2MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaSaoLuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaSaoLuis().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
