import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JogoEmSi extends javax.swing.JFrame {

    JanelaResultado telafinal = new JanelaResultado();
    // JanelaSaoLuis voltar = new JanelaSaoLuis();

    public JogoEmSi() {
        this.getContentPane().setBackground(Color.cyan);

        initComponents();
    }

    int erros, acertos = 0;
    //Primeira Pergunta
    String pergunta1 = "Qual era o interesse dos franceses no Norte do Brasil?";
    String alternativa_certa1 = "Fundar uma colônia";
    String alternativa2_1 = "Escravizar os nativos";
    String alternativa3_1 = "Explorar a mão de obra farta";


    //Segunda Pergunta
    String pergunta2 = "Nome do Lider francês?";
    String alternativa_certa2 = "Daniel de La Touche";
    String alternativa2_2 = "Gabriel de la Ravardiere";
    String alternativa3_2 = "Miguel Jean Jack";

    //Terceira Pergunta
    String pergunta3 = "Palácio que os franceses criaram: ";
    String alternativa_certa3 = "Palácio dos Leões";
    String alternativa2_3 = "Palácio dos Tigres";
    String alternativa3_3 = "Palácio das Onças";

    //Quarta Pergunta
    String pergunta4 = "Em que local do Brasil os franceses desembarcaram?";
    String alternativa_certa4 = "Ilha de Upaon-Açu";
    String alternativa2_4 = "Atol das Rocas";
    String alternativa3_4 = "Porto de Aratu";

    //Quinta Pergunta
    String pergunta5 = "Quem era o comandante do exército português que lutou contra os franceses?";
    String alternativa_certa5 = "Jerônimo de Albuquerque";
    String alternativa2_5 = "Fernando de Queirós";
    String alternativa3_5 = "Tadeu Alencar";

    //Sexta Pergunta
    String pergunta6 = "O forte construído pelos franceses em São Luís foi primeiramente chamado de...";
    String alternativa_certa6 = "Fort Saint Louis";
    String alternativa2_6 = "Fort Royal";
    String alternativa3_6 = "Fort de la Mancha";

    //Sétima Pergunta
    String pergunta7 = "O que foi a \"Jornada Milagrosa\"?";
    String alternativa_certa7 = "A expedição portuguesa contra a França";
    String alternativa2_7 = "O difícil caminho percorrido pelos franceses";
    String alternativa3_7 = "A resistência indígena contra a ocupação";

    //Oitava Pergunta
    String pergunta8 = "Um dos principais motivos da falta de arquitetura francesa em São Luís, é...";
    String alternativa_certa8 = "Destruição de qualquer estrutura criada pelos franceses";
    String alternativa2_8 = "Simplesmente não criaram nada";
    String alternativa3_8 = "Levaram tudo de volta a França";

    //Nona Pergunta
    String pergunta9 = "A batalha de Guaxenduba foi...";
    String alternativa_certa9 = "Um confronto decisivo entre franceses e portugueses";
    String alternativa2_9 = "Uma luta pessoal de Daniel de Daniel de La Touche e os nativos";
    String alternativa3_9 = "Desavenças entre os próprios franceses";

    //Décima Pergunta
    String pergunta10 = "Tentativa de formar uma colônia francesa no norte dos territórios da América: ";
    String alternativa_certa10 = "França Equinocial";
    String alternativa2_10 = "Colônia francesa";
    String alternativa3_10 = "França Americana";

    //Décima primeira Pergunta
    String pergunta11 = "Desfecho da batalha de Guaxenduba";
    String alternativa_certa11 = "Franceses derrotados";
    String alternativa2_11 = "Portugueses derrotados";
    String alternativa3_11 = "Maranhenses derrotados";

    //Décima segunda Pergunta
    String pergunta12 = "Após a derrota, Daniel de la Touche...";
    String alternativa_certa12 = "Foi rendido e preso em Lisboa";
    String alternativa2_12 = "Aliou-se a Jerônimo de Albuquerque ";
    String alternativa3_12 = "Fugiu para Paris";


    //Décima terceira Pergunta
    String pergunta13 = "Forte feito pelos portugueses em Guaxenduba";
    String alternativa_certa13 = "Forte de Santa Maria de Guaxenduba";
    String alternativa2_13 = "Forte Albuquerque";
    String alternativa3_13 = "Forte São Luís";

    //Décima quarta Pergunta
    String pergunta14 = "Depois da derrota de Daniel de La Touche, Jerônimo de Albuquerque: ";
    String alternativa_certa14 = "Se tornou governador do Maranhão";
    String alternativa2_14 = "Viveu o resto da vida em Porugal";
    String alternativa3_14 = "Foi abandonado pela província";

    //Décima quinta Pergunta
    String pergunta15 = "Conclusão: ";
    String alternativa_certa15 = "Os franceses invadiram, e os portugueses fundaram São Luís";
    String alternativa2_15 = "Os franceses fundaram São Luís e Portugal o tomou";
    String alternativa3_15 = "Os franceses colonizaram São Luís na verdade";


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        chkAlt1 = new javax.swing.JCheckBox();
        chkAlt2 = new javax.swing.JCheckBox();
        chkAlt3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        barrinhaQuerida = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("São Luís");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1380, 768));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        jLabel1.setText("Marque a alternativa correta ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 76, 526, -1));

        btnVerificar.setBackground(new java.awt.Color(13, 164, 1));
        btnVerificar.setFont(new java.awt.Font("NanumGothic", 1, 16)); // NOI18N
        btnVerificar.setForeground(java.awt.Color.white);
        btnVerificar.setText("Verificar");
        btnVerificar.setToolTipText("Acertou?");
        btnVerificar.setBorder(null);
        btnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerificarMouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarMouseEntered(evt);
            }
        });
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 590, 134, 52));

        lblPergunta.setFont(new java.awt.Font("DejaVu Sans", 0, 22)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(80, 77, 77));
        lblPergunta.setText(pergunta1
        );
        lblPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPerguntaMouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPerguntaMouseEntered(evt);
            }
        });
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 190, -1, -1));

        chkAlt1.setBackground(java.awt.Color.cyan);
        chkAlt1.setFont(new java.awt.Font("Noto Sans", 0, 23)); // NOI18N
        chkAlt1.setText(alternativa2_1);
        chkAlt1.setBorder(null);
        chkAlt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chkAlt1MouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chkAlt1MouseEntered(evt);
            }
        });
        chkAlt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlt1ActionPerformed(evt);
            }
        });
        getContentPane().add(chkAlt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 291, -1, -1));

        chkAlt2.setBackground(java.awt.Color.cyan);
        chkAlt2.setFont(new java.awt.Font("Noto Sans", 0, 23)); // NOI18N
        chkAlt2.setText(alternativa_certa1);
        chkAlt2.setBorder(null);
        chkAlt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chkAlt2MouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chkAlt2MouseEntered(evt);
            }
        });
        chkAlt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlt2ActionPerformed(evt);
            }
        });
        getContentPane().add(chkAlt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 341, -1, -1));

        chkAlt3.setBackground(java.awt.Color.cyan);
        chkAlt3.setFont(new java.awt.Font("Noto Sans", 0, 23)); // NOI18N
        chkAlt3.setText(alternativa3_1);
        chkAlt3.setBorder(null);
        chkAlt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chkAlt3MouseExited(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chkAlt3MouseEntered(evt);
            }
        });
        chkAlt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlt3ActionPerformed(evt);
            }
        });
        getContentPane().add(chkAlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 391, -1, -1));

        jLabel2.setBackground(new java.awt.Color(95, 225, 225));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1380, 220));

        btnExit.setBackground(new java.awt.Color(125, 172, 219));
        btnExit.setFont(new java.awt.Font("Noto Sans", 1, 23)); // NOI18N
        btnExit.setForeground(java.awt.Color.lightGray);
        btnExit.setText("x");
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 50, 50));

        barrinhaQuerida.setMaximum(15);
        barrinhaQuerida.setToolTipText("Seu progresso");
        getContentPane().add(barrinhaQuerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 1070, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    String pivo = "";
    boolean coisinha = true;
    ImageIcon image = new ImageIcon("/home/benjamim/Desktop/certo.png");
    ImageIcon wrong = new ImageIcon("/home/benjamim/Desktop/xvermelho.png");

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        //Não repare
        if (lblPergunta.getText().equals(pergunta1)) pivo = alternativa_certa1;
        if (lblPergunta.getText().equals(pergunta2)) pivo = alternativa_certa2;
        if (lblPergunta.getText().equals(pergunta3)) pivo = alternativa_certa3;
        if (lblPergunta.getText().equals(pergunta4)) pivo = alternativa_certa4;
        if (lblPergunta.getText().equals(pergunta5)) pivo = alternativa_certa5;
        if (lblPergunta.getText().equals(pergunta6)) pivo = alternativa_certa6;
        if (lblPergunta.getText().equals(pergunta7)) pivo = alternativa_certa7;
        if (lblPergunta.getText().equals(pergunta8)) pivo = alternativa_certa8;
        if (lblPergunta.getText().equals(pergunta9)) pivo = alternativa_certa9;
        if (lblPergunta.getText().equals(pergunta10)) pivo = alternativa_certa10;
        if (lblPergunta.getText().equals(pergunta11)) pivo = alternativa_certa11;
        if (lblPergunta.getText().equals(pergunta12)) pivo = alternativa_certa12;
        if (lblPergunta.getText().equals(pergunta13)) pivo = alternativa_certa13;
        if (lblPergunta.getText().equals(pergunta14)) pivo = alternativa_certa14;
        if (lblPergunta.getText().equals(pergunta15)) pivo = alternativa_certa15;

        if (chkAlt1.isSelected()) {
            if (chkAlt1.getText().equals(pivo)) {
                chkAlt1.setSelected(false);
                chkAlt1.setForeground(Color.green);
                acertos++;
                barrinhaQuerida.setValue(acertos);
                if (!(pergunta15.equals(lblPergunta.getText())))
                    JOptionPane.showMessageDialog(null, "Ir para Próxima", "Correto", JOptionPane.INFORMATION_MESSAGE, image);
                else JOptionPane.showMessageDialog(null, "Resultado: ", "Correto", JOptionPane.INFORMATION_MESSAGE);

                if (lblPergunta.getText().equals(pergunta15)) {
                    telafinal.erro(Integer.toString(erros));
                    telafinal.setVisible(true);
                    dispose();
                }

                if (lblPergunta.getText().equals(pergunta14)) {
                    lblPergunta.setText(pergunta15);
                    chkAlt3.setText(alternativa3_15);
                    chkAlt2.setText(alternativa_certa15);
                    chkAlt1.setText(alternativa2_15);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta13)) {
                    lblPergunta.setText(pergunta14);
                    chkAlt3.setText(alternativa2_14);
                    chkAlt2.setText(alternativa_certa14);
                    chkAlt1.setText(alternativa3_14);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta12)) {
                    lblPergunta.setText(pergunta13);
                    chkAlt3.setText(alternativa3_13);
                    chkAlt2.setText(alternativa2_13);
                    chkAlt1.setText(alternativa_certa13);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta11)) {
                    lblPergunta.setText(pergunta12);
                    chkAlt3.setText(alternativa3_12);
                    chkAlt2.setText(alternativa_certa12);
                    chkAlt1.setText(alternativa2_12);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta10)) {
                    lblPergunta.setText(pergunta11);
                    chkAlt3.setText(alternativa_certa11);
                    chkAlt2.setText(alternativa2_11);
                    chkAlt1.setText(alternativa3_11);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);

                }

                if (lblPergunta.getText().equals(pergunta9)) {
                    lblPergunta.setText(pergunta10);
                    chkAlt3.setText(alternativa_certa10);
                    chkAlt2.setText(alternativa2_10);
                    chkAlt1.setText(alternativa3_10);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta8)) {
                    lblPergunta.setText(pergunta9);
                    chkAlt3.setText(alternativa2_9);
                    chkAlt2.setText(alternativa_certa9);
                    chkAlt1.setText(alternativa3_9);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta7)) {
                    lblPergunta.setText(pergunta8);
                    chkAlt3.setText(alternativa2_8);
                    chkAlt2.setText(alternativa3_8);
                    chkAlt1.setText(alternativa_certa8);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta6)) {
                    lblPergunta.setText(pergunta7);
                    chkAlt3.setText(alternativa2_7);
                    chkAlt2.setText(alternativa_certa7);
                    chkAlt1.setText(alternativa3_7);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta5)) {
                    lblPergunta.setText(pergunta6);
                    chkAlt3.setText(alternativa_certa6);
                    chkAlt2.setText(alternativa2_6);
                    chkAlt1.setText(alternativa3_6);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta4)) {
                    lblPergunta.setText(pergunta5);
                    chkAlt3.setText(alternativa2_5);
                    chkAlt2.setText(alternativa_certa5);
                    chkAlt1.setText(alternativa3_5);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta3)) {
                    lblPergunta.setText(pergunta4);
                    chkAlt3.setText(alternativa_certa4);
                    chkAlt2.setText(alternativa2_4);
                    chkAlt1.setText(alternativa3_4);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta2)) {
                    lblPergunta.setText(pergunta3);
                    chkAlt3.setText(alternativa3_3);
                    chkAlt2.setText(alternativa2_3);
                    chkAlt1.setText(alternativa_certa3);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta1)) {
                    lblPergunta.setText(pergunta2);
                    chkAlt3.setText(alternativa_certa2);
                    chkAlt2.setText(alternativa3_2);
                    chkAlt1.setText(alternativa2_2);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

            } else {
                chkAlt1.setForeground(Color.red);
                erros++;
                /*if (pivo.equals(chkAlt1.getText())) chkAlt1.setForeground(Color.green);
                 *if (pivo.equals(chkAlt2.getText())) chkAlt2.setForeground(Color.green);
                 *if (pivo.equals(chkAlt3.getText())) chkAlt3.setForeground(Color.green);
                 */
                JOptionPane.showMessageDialog(null, "Tente Novamente", "Incorreta", JOptionPane.ERROR_MESSAGE, wrong);
            }

            chkAlt1.setSelected(false);
        }
        if (chkAlt2.isSelected()) {
            if (chkAlt2.getText().equals(pivo)) {
                chkAlt2.setForeground(Color.green);
                acertos++;
                barrinhaQuerida.setValue(acertos);
                if (!(pergunta15.equals(lblPergunta.getText())))
                    JOptionPane.showMessageDialog(null, "Ir para Próxima", "Correto", JOptionPane.INFORMATION_MESSAGE, image);
                else JOptionPane.showMessageDialog(null, "Resultado: ", "Correto", JOptionPane.INFORMATION_MESSAGE);
                chkAlt2.setSelected(false);
                if (lblPergunta.getText().equals(pergunta15)) {
                    telafinal.erro(Integer.toString(erros));
                    telafinal.setVisible(true);

                    dispose();
                    //TODO encerrar UM jogo
                }

                if (lblPergunta.getText().equals(pergunta14)) {
                    lblPergunta.setText(pergunta15);
                    chkAlt3.setText(alternativa3_15);
                    chkAlt2.setText(alternativa2_15);
                    chkAlt1.setText(alternativa_certa15);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta13)) {
                    lblPergunta.setText(pergunta14);
                    chkAlt3.setText(alternativa_certa14);
                    chkAlt2.setText(alternativa2_14);
                    chkAlt1.setText(alternativa3_14);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta12)) {
                    lblPergunta.setText(pergunta13);
                    chkAlt3.setText(alternativa3_13);
                    chkAlt2.setText(alternativa2_13);
                    chkAlt1.setText(alternativa_certa13);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }


                if (lblPergunta.getText().equals(pergunta11)) {
                    lblPergunta.setText(pergunta12);
                    chkAlt3.setText(alternativa3_12);
                    chkAlt2.setText(alternativa2_12);
                    chkAlt1.setText(alternativa_certa12);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta10)) {
                    lblPergunta.setText(pergunta11);
                    chkAlt3.setText(alternativa_certa11);
                    chkAlt2.setText(alternativa2_11);
                    chkAlt1.setText(alternativa3_11);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta9)) {
                    lblPergunta.setText(pergunta10);
                    chkAlt3.setText(alternativa_certa10);
                    chkAlt2.setText(alternativa2_10);
                    chkAlt1.setText(alternativa3_10);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta8)) {
                    lblPergunta.setText(pergunta9);
                    chkAlt3.setText(alternativa2_9);
                    chkAlt2.setText(alternativa_certa9);
                    chkAlt1.setText(alternativa3_9);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta7)) {
                    lblPergunta.setText(pergunta8);
                    chkAlt3.setText(alternativa2_8);
                    chkAlt2.setText(alternativa3_8);
                    chkAlt1.setText(alternativa_certa8);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta6)) {
                    lblPergunta.setText(pergunta7);
                    chkAlt3.setText(alternativa2_7);
                    chkAlt2.setText(alternativa_certa7);
                    chkAlt1.setText(alternativa3_7);
                }

                if (lblPergunta.getText().equals(pergunta5)) {
                    lblPergunta.setText(pergunta6);
                    chkAlt3.setText(alternativa_certa6);
                    chkAlt2.setText(alternativa2_6);
                    chkAlt1.setText(alternativa3_6);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta4)) {
                    lblPergunta.setText(pergunta5);
                    chkAlt3.setText(alternativa3_5);
                    chkAlt2.setText(alternativa2_5);
                    chkAlt1.setText(alternativa_certa5);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta3)) {
                    lblPergunta.setText(pergunta4);
                    chkAlt3.setText(alternativa2_4);
                    chkAlt2.setText(alternativa_certa4);
                    chkAlt1.setText(alternativa3_4);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta2)) {
                    lblPergunta.setText(pergunta3);
                    chkAlt3.setText(alternativa_certa3);
                    chkAlt2.setText(alternativa2_3);
                    chkAlt1.setText(alternativa3_3);
                }

                if (lblPergunta.getText().equals(pergunta1)) {
                    lblPergunta.setText(pergunta2);
                    chkAlt3.setText(alternativa3_2);
                    chkAlt2.setText(alternativa2_2);
                    chkAlt1.setText(alternativa_certa2);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

            } else {
                chkAlt2.setForeground(Color.red);
                erros++;
                telafinal.erro(Integer.toString(erros));
                /*if (pivo.equals(chkAlt1.getText())) chkAlt1.setForeground(Color.green);
                 *if (pivo.equals(chkAlt2.getText())) chkAlt2.setForeground(Color.green);
                 *if (pivo.equals(chkAlt3.getText())) chkAlt3.setForeground(Color.green);
                 */
                JOptionPane.showMessageDialog(null, "Tente Novamente", "Incorreta", JOptionPane.ERROR_MESSAGE, wrong);
            }
            chkAlt2.setSelected(false);
        }
        if (chkAlt3.isSelected()) {
            if (chkAlt3.getText().equals(pivo)) {
                chkAlt3.setForeground(Color.green);
                acertos++;
                barrinhaQuerida.setValue(acertos);
                if (!(pergunta15.equals(lblPergunta.getText())))
                    JOptionPane.showMessageDialog(null, "Ir para Próxima", "Correto", JOptionPane.INFORMATION_MESSAGE, image);
                else JOptionPane.showMessageDialog(null, "Resultado: ", "Correto", JOptionPane.INFORMATION_MESSAGE);
                chkAlt3.setSelected(false);
                if (lblPergunta.getText().equals(pergunta15)) {
                    telafinal.erro(Integer.toString(erros));
                    telafinal.setVisible(true);

                    dispose();
                }

                if (lblPergunta.getText().equals(pergunta14)) {
                    lblPergunta.setText(pergunta15);
                    chkAlt3.setText(alternativa3_15);
                    chkAlt2.setText(alternativa_certa15);
                    chkAlt1.setText(alternativa2_15);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta13)) {
                    lblPergunta.setText(pergunta14);
                    chkAlt3.setText(alternativa_certa14);
                    chkAlt2.setText(alternativa2_14);
                    chkAlt1.setText(alternativa3_14);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta12)) {
                    lblPergunta.setText(pergunta13);
                    chkAlt3.setText(alternativa3_13);
                    chkAlt2.setText(alternativa2_13);
                    chkAlt1.setText(alternativa_certa13);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }


                if (lblPergunta.getText().equals(pergunta11)) {
                    lblPergunta.setText(pergunta12);
                    chkAlt3.setText(alternativa3_12);
                    chkAlt2.setText(alternativa2_12);
                    chkAlt1.setText(alternativa_certa12);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta10)) {
                    lblPergunta.setText(pergunta11);
                    chkAlt3.setText(alternativa_certa11);
                    chkAlt2.setText(alternativa2_11);
                    chkAlt1.setText(alternativa3_11);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta9)) {
                    lblPergunta.setText(pergunta10);
                    chkAlt3.setText(alternativa_certa10);
                    chkAlt2.setText(alternativa2_10);
                    chkAlt1.setText(alternativa3_10);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta8)) {
                    lblPergunta.setText(pergunta9);
                    chkAlt3.setText(alternativa_certa9);
                    chkAlt2.setText(alternativa2_9);
                    chkAlt1.setText(alternativa3_9);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta7)) {
                    lblPergunta.setText(pergunta8);
                    chkAlt3.setText(alternativa2_8);
                    chkAlt2.setText(alternativa3_8);
                    chkAlt1.setText(alternativa_certa8);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta6)) {
                    lblPergunta.setText(pergunta7);
                    chkAlt3.setText(alternativa_certa7);
                    chkAlt2.setText(alternativa2_7);
                    chkAlt1.setText(alternativa3_7);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta5)) {
                    lblPergunta.setText(pergunta6);
                    chkAlt3.setText(alternativa3_6);
                    chkAlt2.setText(alternativa2_6);
                    chkAlt1.setText(alternativa_certa6);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta4)) {
                    lblPergunta.setText(pergunta5);
                    chkAlt3.setText(alternativa2_5);
                    chkAlt2.setText(alternativa_certa5);
                    chkAlt1.setText(alternativa3_5);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta3)) {
                    lblPergunta.setText(pergunta4);
                    chkAlt3.setText(alternativa_certa4);
                    chkAlt2.setText(alternativa2_4);
                    chkAlt1.setText(alternativa3_4);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta2)) {
                    lblPergunta.setText(pergunta3);
                    chkAlt3.setText(alternativa2_3);
                    chkAlt2.setText(alternativa_certa3);
                    chkAlt1.setText(alternativa3_3);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }

                if (lblPergunta.getText().equals(pergunta1)) {
                    lblPergunta.setText(pergunta2);
                    chkAlt3.setText(alternativa_certa2);
                    chkAlt2.setText(alternativa2_2);
                    chkAlt1.setText(alternativa3_2);
                    chkAlt1.setForeground(Color.black);
                    chkAlt2.setForeground(Color.black);
                    chkAlt3.setForeground(Color.black);
                }
            } else {
                chkAlt3.setForeground(Color.red);
                erros++;
                /*if (pivo.equals(chkAlt1.getText())) chkAlt1.setForeground(Color.green);
                 *if (pivo.equals(chkAlt2.getText())) chkAlt2.setForeground(Color.green);
                 *if (pivo.equals(chkAlt3.getText())) chkAlt3.setForeground(Color.green);
                 */
                JOptionPane.showMessageDialog(null, "Tente Novamente", "Incorreta", JOptionPane.ERROR_MESSAGE, wrong);
            }
            chkAlt3.setSelected(false);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnVerificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseEntered
        btnVerificar.setBackground(java.awt.Color.green);

    }//GEN-LAST:event_btnVerificarMouseEntered


    private void btnVerificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseExited
        btnVerificar.setBackground(new java.awt.Color(13, 164, 1));
    }//GEN-LAST:event_btnVerificarMouseExited

    private void chkAlt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlt2ActionPerformed
        chkAlt1.setSelected(false);
        chkAlt3.setSelected(false);
    }//GEN-LAST:event_chkAlt2ActionPerformed

    private void chkAlt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlt1ActionPerformed
        chkAlt2.setSelected(false);
        chkAlt3.setSelected(false);
    }//GEN-LAST:event_chkAlt1ActionPerformed

    private void chkAlt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlt3ActionPerformed
        chkAlt1.setSelected(false);
        chkAlt2.setSelected(false);
    }//GEN-LAST:event_chkAlt3ActionPerformed

    private void chkAlt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt1MouseEntered
        if (!(chkAlt2.isSelected()) && (!(chkAlt3.isSelected()))) {
            chkAlt1.setForeground(java.awt.Color.blue);
        }
    }//GEN-LAST:event_chkAlt1MouseEntered

    private void chkAlt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt2MouseExited
        chkAlt2.setForeground(new java.awt.Color(48, 48, 48));
    }//GEN-LAST:event_chkAlt2MouseExited

    private void chkAlt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt2MouseEntered
        if (!(chkAlt1.isSelected()) && (!(chkAlt3.isSelected()))) {
            chkAlt2.setForeground(java.awt.Color.blue);
        }
    }//GEN-LAST:event_chkAlt2MouseEntered

    private void chkAlt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt1MouseExited
        chkAlt1.setForeground(new java.awt.Color(48, 48, 48));
    }//GEN-LAST:event_chkAlt1MouseExited

    private void chkAlt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt3MouseEntered
        if (!(chkAlt2.isSelected()) && (!(chkAlt1.isSelected()))) {
            chkAlt3.setForeground(java.awt.Color.blue);
        }
    }//GEN-LAST:event_chkAlt3MouseEntered

    private void chkAlt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAlt3MouseExited
        chkAlt3.setForeground(new java.awt.Color(48, 48, 48));
        // jLabel3.setBorder(null);
    }//GEN-LAST:event_chkAlt3MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited

    }//GEN-LAST:event_jLabel1MouseExited

    private void lblPerguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerguntaMouseEntered

    }//GEN-LAST:event_lblPerguntaMouseEntered

    private void lblPerguntaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerguntaMouseExited

    }//GEN-LAST:event_lblPerguntaMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        if ((!chkAlt1.isSelected()) && (!chkAlt2.isSelected()) && (!chkAlt3.isSelected())) {
            btnVerificar.setEnabled(false);
            coisinha = false;
        } else {
            btnVerificar.setEnabled(true);
            coisinha = true;
        }
    }//GEN-LAST:event_formMouseEntered

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Object[] options = {"Ok", "Cancelar"};
        int a = JOptionPane.showOptionDialog(null, "Você perderá todo seu progresso", "Sair?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println(a);

        if (a == 0) {
            JanelaSaoLuis voltar = new JanelaSaoLuis();
            voltar.setVisible(true);
            System.err.println("entrou");
            dispose();
        } else {
            erros = 0;
            System.out.println("hu");
        }
    }//GEN-LAST:event_btnExitActionPerformed


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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoEmSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoEmSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoEmSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoEmSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoEmSi().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrinhaQuerida;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnVerificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkAlt1;
    private javax.swing.JCheckBox chkAlt2;
    private javax.swing.JCheckBox chkAlt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPergunta;
    // End of variables declaration//GEN-END:variables
}
