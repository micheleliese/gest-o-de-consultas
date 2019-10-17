/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava;

import BancoDeDados.ConectaBD;
import Javabeans.ModeloTabela;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Michele Liese
 */
public class Tela_Medico extends javax.swing.JFrame {
    ConectaBD conecta = new ConectaBD();
    PreparedStatement pstmt;
    int flag1 = 0, flag2 = 0;
    int id_medico;
    
    public Tela_Medico(int id_medico){
        initComponents();
        conecta.conexão();
        this.id_medico = id_medico;
        jTcontatomedico.setEnabled(false);
        jTemailmedico.setEnabled(false);
        jTuser.setEnabled(false);
        jTsenhamedico.setEnabled(false);
        mostraDados();
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }

    private void mostraDados(){
        try {
            conecta.executaSQL("select * from medico where idmedico = " + id_medico);
            conecta.rs.first();
            jLnomeDoutor.setText(conecta.rs.getString("nome_medico"));
            jLidadedoutor.setText(conecta.rs.getString("data_nascimento"));
            jTcontatomedico.setText(conecta.rs.getString("contato"));
            jTemailmedico.setText(conecta.rs.getString("email"));
            jTuser.setText(conecta.rs.getString("usuario"));
            jTsenhamedico.setText(conecta.rs.getString("senha"));
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPmedico = new javax.swing.JPanel();
        jPinicio = new javax.swing.JPanel();
        jLmedicoInverte = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLdoutor = new javax.swing.JLabel();
        jLnomeDoutor = new javax.swing.JLabel();
        jLcontato = new javax.swing.JLabel();
        jLemaildoutor = new javax.swing.JLabel();
        jLidade = new javax.swing.JLabel();
        jLidadedoutor = new javax.swing.JLabel();
        jLusuario = new javax.swing.JLabel();
        jLsenha = new javax.swing.JLabel();
        jLinfo = new javax.swing.JLabel();
        jLinfouser = new javax.swing.JLabel();
        jBeditarinfouser = new javax.swing.JButton();
        jBeditarinfo = new javax.swing.JButton();
        jTemailmedico = new javax.swing.JTextField();
        jTuser = new javax.swing.JTextField();
        jTcontatomedico = new javax.swing.JFormattedTextField();
        jTsenhamedico = new javax.swing.JPasswordField();
        jPatenPref = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAP = new javax.swing.JTable();
        jBatualizatabP = new javax.swing.JButton();
        jBremoverPacienteP = new javax.swing.JButton();
        jPatendimentoGeral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAG = new javax.swing.JTable();
        jBatualizartabG = new javax.swing.JButton();
        jBremoverPacienteG = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        jBatendimentoPreferencial = new javax.swing.JButton();
        jBatendimentoGeral = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPmedico.setLayout(new java.awt.CardLayout());

        jLmedicoInverte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLmedicoInverte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/medicoInvertido.png"))); // NOI18N
        jLmedicoInverte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Bem-vindo!");

        jLdoutor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLdoutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLdoutor.setText("Doutor(a):");

        jLnomeDoutor.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLnomeDoutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLcontato.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLcontato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLcontato.setText("Contato:");

        jLemaildoutor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLemaildoutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLemaildoutor.setText("Email:");

        jLidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLidade.setText("Data de Nascimento:");

        jLidadedoutor.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLidadedoutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLusuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLusuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLusuario.setText("Usuário:");

        jLsenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLsenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLsenha.setText("Senha:");

        jLinfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLinfo.setText("Informações para Contato");
        jLinfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLinfouser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLinfouser.setText("Informações para Login");
        jLinfouser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBeditarinfouser.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jBeditarinfouser.setForeground(new java.awt.Color(51, 51, 255));
        jBeditarinfouser.setText("Editar");
        jBeditarinfouser.setBorder(null);
        jBeditarinfouser.setBorderPainted(false);
        jBeditarinfouser.setContentAreaFilled(false);
        jBeditarinfouser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBeditarinfouser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBeditarinfouser.setInheritsPopupMenu(true);
        jBeditarinfouser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBeditarinfouserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBeditarinfouserMouseExited(evt);
            }
        });
        jBeditarinfouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarinfouserActionPerformed(evt);
            }
        });

        jBeditarinfo.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jBeditarinfo.setForeground(new java.awt.Color(51, 51, 255));
        jBeditarinfo.setText("Editar");
        jBeditarinfo.setBorder(null);
        jBeditarinfo.setBorderPainted(false);
        jBeditarinfo.setContentAreaFilled(false);
        jBeditarinfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBeditarinfo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBeditarinfo.setInheritsPopupMenu(true);
        jBeditarinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBeditarinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBeditarinfoMouseExited(evt);
            }
        });
        jBeditarinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarinfoActionPerformed(evt);
            }
        });

        jTuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTuserActionPerformed(evt);
            }
        });

        try {
            jTcontatomedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPinicioLayout = new javax.swing.GroupLayout(jPinicio);
        jPinicio.setLayout(jPinicioLayout);
        jPinicioLayout.setHorizontalGroup(
            jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinicioLayout.createSequentialGroup()
                .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPinicioLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPinicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLmedicoInverte, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTsenhamedico))
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTuser))
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLemaildoutor)
                                .addGap(18, 18, 18)
                                .addComponent(jTemailmedico))
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLcontato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcontatomedico))
                            .addComponent(jLinfouser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLidadedoutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPinicioLayout.createSequentialGroup()
                                .addComponent(jLdoutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLnomeDoutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBeditarinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBeditarinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPinicioLayout.setVerticalGroup(
            jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLmedicoInverte, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPinicioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLnomeDoutor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdoutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLidadedoutor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBeditarinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLinfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcontato)
                            .addComponent(jTcontatomedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLemaildoutor)
                            .addComponent(jTemailmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLinfouser)
                            .addComponent(jBeditarinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTuser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLsenha)
                            .addComponent(jTsenhamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPmedico.add(jPinicio, "inicio");

        jTableAP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAP);

        jBatualizatabP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jBatualizatabP.setText("Atualizar tabela");
        jBatualizatabP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBatualizatabP.setIconTextGap(13);
        jBatualizatabP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizatabPActionPerformed(evt);
            }
        });

        jBremoverPacienteP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jBremoverPacienteP.setText("Remover paciente atendido");
        jBremoverPacienteP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBremoverPacienteP.setIconTextGap(13);
        jBremoverPacienteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverPacientePActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPatenPrefLayout = new javax.swing.GroupLayout(jPatenPref);
        jPatenPref.setLayout(jPatenPrefLayout);
        jPatenPrefLayout.setHorizontalGroup(
            jPatenPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPatenPrefLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPatenPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(jPatenPrefLayout.createSequentialGroup()
                        .addComponent(jBatualizatabP, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBremoverPacienteP, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPatenPrefLayout.setVerticalGroup(
            jPatenPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPatenPrefLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPatenPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBatualizatabP)
                    .addComponent(jBremoverPacienteP))
                .addContainerGap())
        );

        jPmedico.add(jPatenPref, "AtendimentoPreferencial");

        jTableAG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableAG);

        jBatualizartabG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jBatualizartabG.setText("Atualizar tabela");
        jBatualizartabG.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBatualizartabG.setIconTextGap(13);
        jBatualizartabG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizartabGActionPerformed(evt);
            }
        });

        jBremoverPacienteG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jBremoverPacienteG.setText("Remover paciente atendido");
        jBremoverPacienteG.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBremoverPacienteG.setIconTextGap(13);
        jBremoverPacienteG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoverPacienteGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPatendimentoGeralLayout = new javax.swing.GroupLayout(jPatendimentoGeral);
        jPatendimentoGeral.setLayout(jPatendimentoGeralLayout);
        jPatendimentoGeralLayout.setHorizontalGroup(
            jPatendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPatendimentoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPatendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(jPatendimentoGeralLayout.createSequentialGroup()
                        .addComponent(jBatualizartabG, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBremoverPacienteG, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPatendimentoGeralLayout.setVerticalGroup(
            jPatendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPatendimentoGeralLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPatendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBremoverPacienteG)
                    .addComponent(jBatualizartabG))
                .addContainerGap())
        );

        jPmedico.add(jPatendimentoGeral, "AtendimentoGeral");

        Inicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Inicio.setForeground(new java.awt.Color(0, 0, 51));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/home.png"))); // NOI18N
        Inicio.setText("Inicio");
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Inicio.setIconTextGap(18);
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        jBatendimentoPreferencial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBatendimentoPreferencial.setForeground(new java.awt.Color(0, 0, 51));
        jBatendimentoPreferencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/preferencial.png"))); // NOI18N
        jBatendimentoPreferencial.setText("Atendimento Preferencial");
        jBatendimentoPreferencial.setIconTextGap(8);
        jBatendimentoPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatendimentoPreferencialActionPerformed(evt);
            }
        });

        jBatendimentoGeral.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBatendimentoGeral.setForeground(new java.awt.Color(0, 0, 51));
        jBatendimentoGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_Tilda_Icons_1ed_group_3586366.png"))); // NOI18N
        jBatendimentoGeral.setText("Atendimento Geral");
        jBatendimentoGeral.setIconTextGap(6);
        jBatendimentoGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatendimentoGeralActionPerformed(evt);
            }
        });

        jBsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBsair.setForeground(new java.awt.Color(0, 0, 51));
        jBsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_Gnome-Application-Exit-48_55222.png"))); // NOI18N
        jBsair.setText("Sair");
        jBsair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBsair.setIconTextGap(6);
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBatendimentoPreferencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBatendimentoGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBatendimentoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBatendimentoPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPmedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        CardLayout card = (CardLayout) jPmedico.getLayout();
        card.show(jPmedico, "inicio");
    }//GEN-LAST:event_InicioActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(op == JOptionPane.YES_OPTION){
            Menu_IniciaL inicial = new Menu_IniciaL();
            inicial.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBatendimentoGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatendimentoGeralActionPerformed
        CardLayout card = (CardLayout) jPmedico.getLayout();
        card.show(jPmedico, "AtendimentoGeral");
    }//GEN-LAST:event_jBatendimentoGeralActionPerformed

    private void jBatendimentoPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatendimentoPreferencialActionPerformed
        CardLayout card = (CardLayout) jPmedico.getLayout();
        card.show(jPmedico, "AtendimentoPreferencial");
    }//GEN-LAST:event_jBatendimentoPreferencialActionPerformed

    private void jTuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTuserActionPerformed

    private void jBeditarinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeditarinfoMouseEntered
        jBeditarinfo.setForeground(Color.red);
        jBeditarinfo.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 11));
    }//GEN-LAST:event_jBeditarinfoMouseEntered

    private void jBeditarinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeditarinfoMouseExited
        jBeditarinfo.setForeground(Color.blue);
        jBeditarinfo.setFont(new Font("Arial", Font.PLAIN|Font.ITALIC, 11));
    }//GEN-LAST:event_jBeditarinfoMouseExited

    private void jBeditarinfouserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeditarinfouserMouseEntered
        jBeditarinfouser.setForeground(Color.red);
        jBeditarinfouser.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 11));
    }//GEN-LAST:event_jBeditarinfouserMouseEntered

    private void jBeditarinfouserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBeditarinfouserMouseExited
        jBeditarinfouser.setForeground(Color.blue);
        jBeditarinfouser.setFont(new Font("Arial", Font.PLAIN|Font.ITALIC, 11));
    }//GEN-LAST:event_jBeditarinfouserMouseExited

    private void jBeditarinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarinfoActionPerformed
        if(flag1 == 0){
            jTcontatomedico.setEnabled(true);
            jTemailmedico.setEnabled(true);
            jBeditarinfo.setText("Salvar");
            flag1 = 1;
        }else{
            jTcontatomedico.setEnabled(false);
            jTemailmedico.setEnabled(false);
            jBeditarinfo.setText("Editar");
            flag1 = 0;
            
            try {
                pstmt = conecta.conn.prepareStatement("update medico set contato = ?, email = ? where idmedico = ?");
                pstmt.setString(1, jTcontatomedico.getText());
                pstmt.setString(2, jTemailmedico.getText());
                pstmt.setInt(3, id_medico);
                pstmt.execute();
                JOptionPane.showMessageDialog(this, "Alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jBeditarinfoActionPerformed

    private void jBeditarinfouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarinfouserActionPerformed
        if(flag1 == 0){
            jTuser.setEnabled(true);
            jTsenhamedico.setEnabled(true);
            jBeditarinfouser.setText("Salvar");
            flag1 = 1;
        }else{
            jTuser.setEnabled(false);
            jTsenhamedico.setEnabled(false);
            jBeditarinfouser.setText("Editar");
            flag1 = 0;
            
            //atera no banco
        }
    }//GEN-LAST:event_jBeditarinfouserActionPerformed

    private void jBatualizatabPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizatabPActionPerformed
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }//GEN-LAST:event_jBatualizatabPActionPerformed

    private void jBremoverPacientePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverPacientePActionPerformed
        if(jTableAP.getSelectedRow() != -1){
            int linha =  jTableAP.getSelectedRow();
            try {
                pstmt = conecta.conn.prepareStatement("delete from paciente where idpaciente = "+jTableAP.getValueAt(linha, 0));
                pstmt.execute();
                preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBremoverPacientePActionPerformed

    private void jBatualizartabGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizartabGActionPerformed
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }//GEN-LAST:event_jBatualizartabGActionPerformed

    private void jBremoverPacienteGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoverPacienteGActionPerformed
        if(jTableAG.getSelectedRow() != -1){
            int linha =  jTableAG.getSelectedRow();
            try {
                pstmt = conecta.conn.prepareStatement("delete from paciente where idpaciente = "+jTableAG.getValueAt(linha, 0));
                pstmt.execute();
                preencherTabelaAG("select * from paciente where grau_emergencia = "+ 2);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBremoverPacienteGActionPerformed
    private void preencherTabelaAP(String SQL){
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID","Nome","Data nascimento","Endereço","RG","CPF","Naturalidade","Email","Sintomas","sexo","CEP","Nº", "UF", "Cidade", "Contato"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{ 
                    conecta.rs.getInt("idpaciente"),
                    conecta.rs.getString("nome"),
                    conecta.rs.getString("data_nascimento"),
                    conecta.rs.getString("endereco"),
                    conecta.rs.getString("rg"),
                    conecta.rs.getString("cpf"),
                    conecta.rs.getString("naturalidade"),
                    conecta.rs.getString("email"),
                    conecta.rs.getString("sintomas"),
                    conecta.rs.getString("sexo"),
                    conecta.rs.getString("cep"),
                    conecta.rs.getString("numero_casa"),
                    conecta.rs.getString("uf"),
                    conecta.rs.getString("cidade"),
                    conecta.rs.getString("contato")
                });
            }while(conecta.rs.next());
        } 
        catch(SQLException ex){
        }
        
        ModeloTabela array = new ModeloTabela(dados, Colunas);
        jTableAP.setModel(array);
        jTableAP.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableAP.getColumnModel().getColumn(0).setResizable(true);
        jTableAP.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAP.getColumnModel().getColumn(1).setResizable(true);
        jTableAP.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableAP.getColumnModel().getColumn(2).setResizable(true);
        jTableAP.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(3).setResizable(true);
        jTableAP.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(4).setResizable(true);
        jTableAP.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(5).setResizable(true);
        jTableAP.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(6).setResizable(true);
        jTableAP.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(7).setResizable(true);
        jTableAP.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(8).setResizable(true);
        jTableAP.getColumnModel().getColumn(9).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(9).setResizable(true);
        jTableAP.getColumnModel().getColumn(10).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(10).setResizable(true);
        jTableAP.getColumnModel().getColumn(11).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(11).setResizable(true);
        jTableAP.getColumnModel().getColumn(12).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(12).setResizable(true);
        jTableAP.getColumnModel().getColumn(13).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(13).setResizable(true);
        jTableAP.getColumnModel().getColumn(14).setPreferredWidth(100);
        jTableAP.getColumnModel().getColumn(14).setResizable(true);
        jTableAP.getTableHeader().setReorderingAllowed(false);
        jTableAP.setAutoResizeMode(jTableAP.AUTO_RESIZE_ALL_COLUMNS);
        jTableAP.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void preencherTabelaAG(String SQL){
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID","Nome","Data nascimento","Endereço","RG","CPF","Naturalidade","Email","Sintomas","sexo","CEP","Nº", "UF", "Cidade", "Contato"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{ 
                    conecta.rs.getInt("idpaciente"),
                    conecta.rs.getString("nome"),
                    conecta.rs.getString("data_nascimento"),
                    conecta.rs.getString("endereco"),
                    conecta.rs.getString("rg"),
                    conecta.rs.getString("cpf"),
                    conecta.rs.getString("naturalidade"),
                    conecta.rs.getString("email"),
                    conecta.rs.getString("sintomas"),
                    conecta.rs.getString("sexo"),
                    conecta.rs.getString("cep"),
                    conecta.rs.getString("numero_casa"),
                    conecta.rs.getString("uf"),
                    conecta.rs.getString("cidade"),
                    conecta.rs.getString("contato")
                });
            }while(conecta.rs.next());
        } 
        catch(SQLException ex){
        }
        
        ModeloTabela array = new ModeloTabela(dados, Colunas);
        jTableAG.setModel(array);
        jTableAG.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableAG.getColumnModel().getColumn(0).setResizable(true);
        jTableAG.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAG.getColumnModel().getColumn(1).setResizable(true);
        jTableAG.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableAG.getColumnModel().getColumn(2).setResizable(true);
        jTableAG.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(3).setResizable(true);
        jTableAG.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(4).setResizable(true);
        jTableAG.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(5).setResizable(true);
        jTableAG.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(6).setResizable(true);
        jTableAG.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(7).setResizable(true);
        jTableAG.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(8).setResizable(true);
        jTableAG.getColumnModel().getColumn(9).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(9).setResizable(true);
        jTableAG.getColumnModel().getColumn(10).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(10).setResizable(true);
        jTableAG.getColumnModel().getColumn(11).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(11).setResizable(true);
        jTableAG.getColumnModel().getColumn(12).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(12).setResizable(true);
        jTableAG.getColumnModel().getColumn(13).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(13).setResizable(true);
        jTableAG.getColumnModel().getColumn(14).setPreferredWidth(100);
        jTableAG.getColumnModel().getColumn(14).setResizable(true);
        jTableAG.getTableHeader().setReorderingAllowed(false);
        jTableAG.setAutoResizeMode(jTableAG.AUTO_RESIZE_ALL_COLUMNS);
        jTableAG.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JButton jBatendimentoGeral;
    private javax.swing.JButton jBatendimentoPreferencial;
    private javax.swing.JButton jBatualizartabG;
    private javax.swing.JButton jBatualizatabP;
    private javax.swing.JButton jBeditarinfo;
    private javax.swing.JButton jBeditarinfouser;
    private javax.swing.JButton jBremoverPacienteG;
    private javax.swing.JButton jBremoverPacienteP;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcontato;
    private javax.swing.JLabel jLdoutor;
    private javax.swing.JLabel jLemaildoutor;
    private javax.swing.JLabel jLidade;
    private javax.swing.JLabel jLidadedoutor;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLinfouser;
    private javax.swing.JLabel jLmedicoInverte;
    private javax.swing.JLabel jLnomeDoutor;
    private javax.swing.JLabel jLsenha;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JPanel jPatenPref;
    private javax.swing.JPanel jPatendimentoGeral;
    private javax.swing.JPanel jPinicio;
    private javax.swing.JPanel jPmedico;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAG;
    private javax.swing.JTable jTableAP;
    private javax.swing.JFormattedTextField jTcontatomedico;
    private javax.swing.JTextField jTemailmedico;
    private javax.swing.JPasswordField jTsenhamedico;
    private javax.swing.JTextField jTuser;
    // End of variables declaration//GEN-END:variables
}
