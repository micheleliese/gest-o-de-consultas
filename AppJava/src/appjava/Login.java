/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava;

import BancoDeDados.ConectaBD;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Michele Liese
 */
public class Login extends javax.swing.JFrame {
    ConectaBD conecta = new ConectaBD();
   
    public Login() {
        initComponents();
        conecta.conexão();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLuserLogin = new javax.swing.JLabel();
        jTuserLogin = new javax.swing.JTextField();
        jLsenhaLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLtitulomedicouser = new javax.swing.JLabel();
        jBentrar = new javax.swing.JButton();
        jLtextcadastro = new javax.swing.JLabel();
        jBcadastrarloginmedico = new javax.swing.JButton();
        jTsenhaLogin = new javax.swing.JPasswordField();
        jBvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelLogin.setBackground(new java.awt.Color(0, 0, 153));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_doctor_63121.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLuserLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLuserLogin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLuserLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLuserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLuserLogin.setText("Usuário:");

        jLsenhaLogin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLsenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLsenhaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLsenhaLogin.setText("Senha:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N

        jLtitulomedicouser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLtitulomedicouser.setForeground(new java.awt.Color(0, 0, 102));
        jLtitulomedicouser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulomedicouser.setText("LOGIN ");
        jLtitulomedicouser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLtitulomedicouser, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLtitulomedicouser, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jBentrar.setBackground(new java.awt.Color(153, 153, 255));
        jBentrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBentrar.setForeground(new java.awt.Color(0, 0, 102));
        jBentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        jBentrar.setText("Entrar");
        jBentrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 153), null, new java.awt.Color(0, 0, 204)));
        jBentrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBentrarActionPerformed(evt);
            }
        });

        jLtextcadastro.setBackground(new java.awt.Color(255, 255, 255));
        jLtextcadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLtextcadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLtextcadastro.setText("Não tem uma conta?");

        jBcadastrarloginmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBcadastrarloginmedico.setForeground(new java.awt.Color(255, 255, 255));
        jBcadastrarloginmedico.setText("Cadastre-se.");
        jBcadastrarloginmedico.setBorder(null);
        jBcadastrarloginmedico.setBorderPainted(false);
        jBcadastrarloginmedico.setContentAreaFilled(false);
        jBcadastrarloginmedico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBcadastrarloginmedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBcadastrarloginmedicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBcadastrarloginmedicoMouseExited(evt);
            }
        });
        jBcadastrarloginmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarloginmedicoActionPerformed(evt);
            }
        });

        jBvoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltarr.png"))); // NOI18N
        jBvoltar.setText("Voltar");
        jBvoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 255), null, null));
        jBvoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBvoltar.setIconTextGap(8);
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jLsenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTsenhaLogin))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jLuserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTuserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBentrar)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLtextcadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBcadastrarloginmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBvoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLuserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTuserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLsenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTsenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jBentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtextcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBcadastrarloginmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel2.getAccessibleContext().setAccessibleName("jPtitulousermedico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadastrarloginmedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcadastrarloginmedicoMouseEntered
        jBcadastrarloginmedico.setForeground(Color.white);
        jBcadastrarloginmedico.setFont(new Font("Tahoma", Font.BOLD|Font.ITALIC, 14));
    }//GEN-LAST:event_jBcadastrarloginmedicoMouseEntered

    private void jBcadastrarloginmedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcadastrarloginmedicoMouseExited
        jBcadastrarloginmedico.setForeground(Color.white);
        jBcadastrarloginmedico.setFont(new Font("Tahoma", Font.BOLD, 12));
    }//GEN-LAST:event_jBcadastrarloginmedicoMouseExited

    private void jBcadastrarloginmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarloginmedicoActionPerformed
        Cadastro cad = new Cadastro();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBcadastrarloginmedicoActionPerformed

    private void jBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBentrarActionPerformed
        try{
            conecta.executaSQL("select * from login where user = '" + jTuserLogin.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("senha").equals(jTsenhaLogin.getText())){
                conecta.executaSQL("select * from medico where usuario = '" + jTuserLogin.getText()+"'");
                conecta.rs.first();
                int id_medico = Integer.parseInt(conecta.rs.getString("idmedico"));
                Tela_Medico tl = new Tela_Medico(id_medico);
                tl.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
                jTuserLogin.requestFocus();
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBentrarActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        Menu_IniciaL menu = new Menu_IniciaL();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastrarloginmedico;
    private javax.swing.JButton jBentrar;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLsenhaLogin;
    private javax.swing.JLabel jLtextcadastro;
    private javax.swing.JLabel jLtitulomedicouser;
    private javax.swing.JLabel jLuserLogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jTsenhaLogin;
    private javax.swing.JTextField jTuserLogin;
    // End of variables declaration//GEN-END:variables
}
