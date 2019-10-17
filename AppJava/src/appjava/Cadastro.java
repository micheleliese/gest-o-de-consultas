/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava;

import BancoDeDados.ConectaBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Michele Liese
 */
public class Cadastro extends javax.swing.JFrame {
    ConectaBD conecta =  new ConectaBD();
    PreparedStatement pstmt;
    
    public Cadastro() {
        initComponents();
        conecta.conexão(); 
    }

    private void insereLogin(){
        try {
            pstmt = conecta.conn.prepareStatement("insert into login(user, senha)VALUES(?,?)");
            pstmt.setString(1, jTusuarioMedico.getText());
            pstmt.setString(2, jTsenhaMed.getText());
            pstmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    private boolean insereMedico(){
        try {
            pstmt = conecta.conn.prepareStatement("insert into medico(nome_medico, data_nascimento, contato, email, usuario, senha)VALUES(?,?,?,?,?,?)");
            pstmt.setString(1, jTnomeCadastroMedico.getText());
            pstmt.setString(2, jTdataNascimento.getText());
            pstmt.setString(3, jTcontatoCadastroM.getText());
            pstmt.setString(4, jTemailM.getText());
            pstmt.setString(5, jTusuarioMedico.getText());
            pstmt.setString(6, jTsenhaMed.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private int selecionaMedico(){
        int id_medico = 0;
        try {
            conecta.executaSQL("select * from medico where usuario = '" + jTusuarioMedico.getText()+"'");
            conecta.rs.first();
            id_medico = Integer.parseInt(conecta.rs.getString("idmedico"));
            return id_medico;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    private int verificaMedico(){
        int id_medico = 0;
        try {
            conecta.executaSQL("select * from medico where usuario = '" + jTusuarioMedico.getText()+"'");
            conecta.rs.first();
            id_medico = Integer.parseInt(conecta.rs.getString("idmedico"));
            JOptionPane.showMessageDialog(this, "Ja existe um usuario chamado "+jTusuarioMedico.getText(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return id_medico;
        } catch (SQLException ex) {
            System.out.println("tudo ok");
            return 0;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPcadastroM = new javax.swing.JPanel();
        jPtituloCadastroM = new javax.swing.JPanel();
        jLtituloMedicoCadastro = new javax.swing.JLabel();
        jLnascimento = new javax.swing.JLabel();
        jLnomeCadastroM1 = new javax.swing.JLabel();
        jLcontato = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLusuarioM = new javax.swing.JLabel();
        jLsenhaM = new javax.swing.JLabel();
        jLsenhaM1 = new javax.swing.JLabel();
        jTemailM = new javax.swing.JTextField();
        jTusuarioMedico = new javax.swing.JTextField();
        jLobri4 = new javax.swing.JLabel();
        jLobri3 = new javax.swing.JLabel();
        jLobri2 = new javax.swing.JLabel();
        jLobri1 = new javax.swing.JLabel();
        jLobri = new javax.swing.JLabel();
        jLaviso = new javax.swing.JLabel();
        jBcadastre = new javax.swing.JButton();
        jTsenhaMed = new javax.swing.JPasswordField();
        jTsenhaMedicoC = new javax.swing.JPasswordField();
        jTnomeCadastroMedico = new javax.swing.JTextField();
        jTcontatoCadastroM = new javax.swing.JFormattedTextField();
        jTdataNascimento = new javax.swing.JFormattedTextField();
        jBvolta = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPcadastroM.setBackground(new java.awt.Color(0, 0, 102));

        jPtituloCadastroM.setBackground(new java.awt.Color(255, 255, 255));
        jPtituloCadastroM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(204, 204, 255), null, new java.awt.Color(0, 0, 204)));

        jLtituloMedicoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jLtituloMedicoCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLtituloMedicoCadastro.setForeground(new java.awt.Color(0, 0, 102));
        jLtituloMedicoCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtituloMedicoCadastro.setText("CADASTRO MÉDICO");
        jLtituloMedicoCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(51, 51, 255), null, new java.awt.Color(204, 204, 255)));
        jLtituloMedicoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPtituloCadastroMLayout = new javax.swing.GroupLayout(jPtituloCadastroM);
        jPtituloCadastroM.setLayout(jPtituloCadastroMLayout);
        jPtituloCadastroMLayout.setHorizontalGroup(
            jPtituloCadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLtituloMedicoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPtituloCadastroMLayout.setVerticalGroup(
            jPtituloCadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLtituloMedicoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jLnascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLnascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLnascimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLnascimento.setText("Data de nascimento:");

        jLnomeCadastroM1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLnomeCadastroM1.setForeground(new java.awt.Color(255, 255, 255));
        jLnomeCadastroM1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLnomeCadastroM1.setText("Nome:");

        jLcontato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLcontato.setForeground(new java.awt.Color(255, 255, 255));
        jLcontato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLcontato.setText("Contato:");

        jLemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLemail.setForeground(new java.awt.Color(255, 255, 255));
        jLemail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLemail.setText("Email:");

        jLusuarioM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLusuarioM.setForeground(new java.awt.Color(255, 255, 255));
        jLusuarioM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLusuarioM.setText("Usuário:");

        jLsenhaM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLsenhaM.setForeground(new java.awt.Color(255, 255, 255));
        jLsenhaM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLsenhaM.setText("Senha:");

        jLsenhaM1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLsenhaM1.setForeground(new java.awt.Color(255, 255, 255));
        jLsenhaM1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLsenhaM1.setText("Repita a senha:");

        jLobri4.setForeground(new java.awt.Color(255, 0, 0));
        jLobri4.setText("*");
        jLobri4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLobri3.setForeground(new java.awt.Color(255, 0, 0));
        jLobri3.setText("*");
        jLobri3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLobri2.setForeground(new java.awt.Color(255, 0, 0));
        jLobri2.setText("*");
        jLobri2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLobri1.setForeground(new java.awt.Color(255, 0, 0));
        jLobri1.setText("*");
        jLobri1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLobri.setForeground(new java.awt.Color(255, 0, 0));
        jLobri.setText("*");
        jLobri.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLaviso.setForeground(new java.awt.Color(255, 255, 255));
        jLaviso.setText("É obrigatório o preenchimento dos campos marcados com *");

        jBcadastre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBcadastre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        jBcadastre.setText("Cadastrar");
        jBcadastre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 255), null, null));
        jBcadastre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBcadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastreActionPerformed(evt);
            }
        });

        try {
            jTcontatoCadastroM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTdataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBvolta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBvolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_Cancel_132620.png"))); // NOI18N
        jBvolta.setText("Cancelar");
        jBvolta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 255), null, null));
        jBvolta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBvolta.setIconTextGap(8);
        jBvolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcadastroMLayout = new javax.swing.GroupLayout(jPcadastroM);
        jPcadastroM.setLayout(jPcadastroMLayout);
        jPcadastroMLayout.setHorizontalGroup(
            jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroMLayout.createSequentialGroup()
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroMLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLaviso)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPtituloCadastroM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroMLayout.createSequentialGroup()
                                .addComponent(jLcontato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTcontatoCadastroM, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPcadastroMLayout.createSequentialGroup()
                                .addComponent(jLnascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcadastroMLayout.createSequentialGroup()
                                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                                        .addComponent(jLemail)
                                        .addGap(31, 31, 31)
                                        .addComponent(jTemailM, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                                        .addComponent(jLnomeCadastroM1)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTnomeCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLobri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLobri1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBvolta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroMLayout.createSequentialGroup()
                                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLusuarioM)
                                    .addComponent(jLsenhaM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTusuarioMedico)
                                    .addComponent(jTsenhaMed, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                                        .addComponent(jLobri3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                        .addComponent(jBcadastre))
                                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                                        .addComponent(jLobri4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPcadastroMLayout.createSequentialGroup()
                                .addComponent(jLsenhaM1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTsenhaMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLobri2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPcadastroMLayout.setVerticalGroup(
            jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPtituloCadastroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLaviso)
                .addGap(18, 18, 18)
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLnomeCadastroM1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTnomeCadastroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLobri))
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcontatoCadastroM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTemailM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLobri1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPcadastroMLayout.createSequentialGroup()
                            .addComponent(jTusuarioMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addGap(2, 2, 2))
                        .addComponent(jLusuarioM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addComponent(jLobri3)
                        .addGap(9, 9, 9)))
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcadastroMLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLsenhaM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTsenhaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLobri4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addComponent(jLobri2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBcadastre)
                            .addComponent(jBvolta)))
                    .addGroup(jPcadastroMLayout.createSequentialGroup()
                        .addGroup(jPcadastroMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLsenhaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTsenhaMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPcadastroM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPcadastroM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastreActionPerformed
        if(validaCampos()){
            if(validaSenha()){
                if(verificaMedico() == 0){
                    insereLogin();
                    if(insereMedico()){
                        Tela_Medico medico = new Tela_Medico(selecionaMedico());
                        medico.setVisible(true);
                        this.dispose();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this,"As senhas não conferem!", "Atenção", JOptionPane.WARNING_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(this,"Os campos com * devem ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jBcadastreActionPerformed

    private void jBvoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltaActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBvoltaActionPerformed
    private boolean validaSenha(){
        if(jTsenhaMed.getText().equals(jTsenhaMedicoC.getText())){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean validaCampos(){
        if(jTnomeCadastroMedico.getText().isEmpty()){
            return false;
        }
        if(jTemailM.getText().isEmpty()){
            return false;
        }
        if(jTusuarioMedico.getText().isEmpty()){
            return false;
        }
        if(jTsenhaMed.getText().isEmpty()){
            return false;
        }
        if(jTsenhaMedicoC.getText().isEmpty()){
            return false;
        }  
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jBvolta;
    private javax.swing.JLabel jLaviso;
    private javax.swing.JLabel jLcontato;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLnascimento;
    private javax.swing.JLabel jLnomeCadastroM1;
    private javax.swing.JLabel jLobri;
    private javax.swing.JLabel jLobri1;
    private javax.swing.JLabel jLobri2;
    private javax.swing.JLabel jLobri3;
    private javax.swing.JLabel jLobri4;
    private javax.swing.JLabel jLsenhaM;
    private javax.swing.JLabel jLsenhaM1;
    private javax.swing.JLabel jLtituloMedicoCadastro;
    private javax.swing.JLabel jLusuarioM;
    private javax.swing.JPanel jPcadastroM;
    private javax.swing.JPanel jPtituloCadastroM;
    private javax.swing.JFormattedTextField jTcontatoCadastroM;
    private javax.swing.JFormattedTextField jTdataNascimento;
    private javax.swing.JTextField jTemailM;
    private javax.swing.JTextField jTnomeCadastroMedico;
    private javax.swing.JPasswordField jTsenhaMed;
    private javax.swing.JPasswordField jTsenhaMedicoC;
    private javax.swing.JTextField jTusuarioMedico;
    // End of variables declaration//GEN-END:variables
}
