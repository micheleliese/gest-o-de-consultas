
package appjava;

import BancoDeDados.ConectaBD;
import Javabeans.ModeloTabela;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Tela_Secretaria extends javax.swing.JFrame {
    ConectaBD conecta = new ConectaBD();
    PreparedStatement pstmt;
    int grau_emergencia;
    
    public Tela_Secretaria() {
        initComponents();
        conecta.conexão();
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }
    

    private void limparCampos(){
        jTcep.setText("");
        jTcidade.setText("");
        jTcontato.setText("");
        jTemail.setText("");
        jTcpf.setText("");
        jTendereco.setText("");
        jTnascimento.setText("");
        jTnaturalidade.setText("");
        jTnumeroCasa.setText("");
        jTnome.setText("");
        jTrg.setText("");
        jTsintomas.setText("");
        jTuf.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox4.setSelected(false);
        jComboBoxSEXO.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Inicio = new javax.swing.JButton();
        jBatendimentoPreferencial = new javax.swing.JButton();
        jBatendimentoGeral = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanelSecretaria = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLnomeC = new javax.swing.JLabel();
        jLnascC = new javax.swing.JLabel();
        jLendC = new javax.swing.JLabel();
        jLrgC = new javax.swing.JLabel();
        jLcepC = new javax.swing.JLabel();
        jLnC = new javax.swing.JLabel();
        jLcpfC = new javax.swing.JLabel();
        jLcadastrarPaciente = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jTnumeroCasa = new javax.swing.JTextField();
        jLsexo = new javax.swing.JLabel();
        jComboBoxSEXO = new javax.swing.JComboBox<>();
        jLsintomas = new javax.swing.JLabel();
        jTsintomas = new javax.swing.JTextField();
        jLuf = new javax.swing.JLabel();
        jTuf = new javax.swing.JTextField();
        jLnaturalidade = new javax.swing.JLabel();
        jTnaturalidade = new javax.swing.JTextField();
        jLemail = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLcontato = new javax.swing.JLabel();
        jLgrauEmergencia = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jBcadastrar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jLcidade = new javax.swing.JLabel();
        jTcidade = new javax.swing.JTextField();
        jTnascimento = new javax.swing.JFormattedTextField();
        jTcpf = new javax.swing.JFormattedTextField();
        jTcontato = new javax.swing.JFormattedTextField();
        jTrg = new javax.swing.JFormattedTextField();
        jTcep = new javax.swing.JFormattedTextField();
        jPanelAtendimentoP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAP = new javax.swing.JTable();
        jPanelAtendimentoGeral = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAG = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jBatendimentoGeral.setIconTextGap(8);
        jBatendimentoGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatendimentoGeralActionPerformed(evt);
            }
        });

        jBsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBsair.setForeground(new java.awt.Color(0, 0, 51));
        jBsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_Gnome-Application-Exit-48_55222.png"))); // NOI18N
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jLnomeC.setText("Nome:");

        jLnascC.setText("Data de nascimento:");

        jLendC.setText("Endereço:");

        jLrgC.setText("RG:");

        jLcepC.setText("Cep:");

        jLnC.setText("Nº:");

        jLcpfC.setText("Cpf:");

        jLcadastrarPaciente.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLcadastrarPaciente.setText("Cadastrar paciente:");
        jLcadastrarPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTnome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTnome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnomeKeyTyped(evt);
            }
        });

        jTendereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTendereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTnumeroCasa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTnumeroCasa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLsexo.setText("Sexo:");

        jComboBoxSEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione abaixo-", "Feminino", "Masculino" }));

        jLsintomas.setText("Sintomas:");

        jTsintomas.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTsintomas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLuf.setText("UF:");

        jTuf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTuf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLnaturalidade.setText("Naturalidade:");

        jTnaturalidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTnaturalidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLemail.setText("Email:");

        jTemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLcontato.setText("Contato:");

        jLgrauEmergencia.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLgrauEmergencia.setText("Grau de Emergência:");

        jCheckBox1.setText("Preferencial");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Geral");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Urgência");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jBcadastrar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        jBcadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seta.png"))); // NOI18N
        jBcadastrar.setText("Cadastrar");
        jBcadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBcadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBcadastrar.setIconTextGap(6);
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jBcancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 11)); // NOI18N
        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconfinder_Close_1891023.png"))); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBcancelar.setIconTextGap(8);
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jLcidade.setText("Cidade:");

        jTcidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            jTnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTnascimento.setToolTipText("");

        try {
            jTcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTcpf.setToolTipText("");

        try {
            jTcontato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelSecretariaLayout = new javax.swing.GroupLayout(jPanelSecretaria);
        jPanelSecretaria.setLayout(jPanelSecretariaLayout);
        jPanelSecretariaLayout.setHorizontalGroup(
            jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLcadastrarPaciente))
                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                .addComponent(jLgrauEmergencia)
                                .addGap(35, 35, 35)
                                .addComponent(jCheckBox1)
                                .addGap(46, 46, 46)
                                .addComponent(jCheckBox2)
                                .addGap(45, 45, 45)
                                .addComponent(jCheckBox4))
                            .addComponent(jLnascC)
                            .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSecretariaLayout.createSequentialGroup()
                                    .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLendC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLrgC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLemail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLnaturalidade)
                                        .addComponent(jLsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLnomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTnaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                        .addComponent(jLcontato)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTcontato))
                                                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                        .addComponent(jLcidade)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jTsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                        .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                                .addComponent(jLcpfC)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                                .addComponent(jLcepC)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jTcep))))
                                                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                        .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLsexo)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTcpf)
                                                            .addComponent(jComboBoxSEXO, 0, 115, Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                                                        .addComponent(jLnC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTnumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecretariaLayout.createSequentialGroup()
                                                        .addComponent(jLuf)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTuf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                    .addGap(0, 332, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 429, Short.MAX_VALUE)))
        );
        jPanelSecretariaLayout.setVerticalGroup(
            jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcadastrarPaciente)
                .addGap(18, 18, 18)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnomeC)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnascC)
                    .addComponent(jLsexo)
                    .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendC)
                    .addComponent(jLcepC)
                    .addComponent(jLnC)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcep, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLrgC)
                    .addComponent(jLcpfC)
                    .addComponent(jLuf)
                    .addComponent(jTuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnaturalidade)
                    .addComponent(jTnaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcidade)
                    .addComponent(jTcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemail)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcontato)
                    .addComponent(jTcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLsintomas)
                    .addComponent(jTsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgrauEmergencia)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanelSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSecretariaLayout.createSequentialGroup()
                    .addGap(0, 176, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 177, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanelSecretaria, "inicio");

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
        jScrollPane2.setViewportView(jTableAP);

        javax.swing.GroupLayout jPanelAtendimentoPLayout = new javax.swing.GroupLayout(jPanelAtendimentoP);
        jPanelAtendimentoP.setLayout(jPanelAtendimentoPLayout);
        jPanelAtendimentoPLayout.setHorizontalGroup(
            jPanelAtendimentoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtendimentoPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAtendimentoPLayout.setVerticalGroup(
            jPanelAtendimentoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtendimentoPLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelAtendimentoP, "AtendimentoPreferencial");

        jTableAG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableAG);

        javax.swing.GroupLayout jPanelAtendimentoGeralLayout = new javax.swing.GroupLayout(jPanelAtendimentoGeral);
        jPanelAtendimentoGeral.setLayout(jPanelAtendimentoGeralLayout);
        jPanelAtendimentoGeralLayout.setHorizontalGroup(
            jPanelAtendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtendimentoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAtendimentoGeralLayout.setVerticalGroup(
            jPanelAtendimentoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtendimentoGeralLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelAtendimentoGeral, "AtendimentoGeral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBatendimentoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBatendimentoPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Inicio.getAccessibleContext().setAccessibleName("inicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBatendimentoPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatendimentoPreferencialActionPerformed
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "AtendimentoPreferencial");
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }//GEN-LAST:event_jBatendimentoPreferencialActionPerformed

    private void jBatendimentoGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatendimentoGeralActionPerformed
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "AtendimentoGeral");
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }//GEN-LAST:event_jBatendimentoGeralActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(op == JOptionPane.YES_OPTION){
            Menu_IniciaL inicial = new Menu_IniciaL();
            inicial.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jBsairActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox1.isSelected()){
            jCheckBox1.setSelected(false);
        }
        if(jCheckBox2.isSelected()){
            jCheckBox2.setSelected(false);
        }
        grau_emergencia = 2;
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox1.isSelected()){
            jCheckBox1.setSelected(false);
        }
        if(jCheckBox4.isSelected()){
            jCheckBox4.setSelected(false);
        }
        grau_emergencia = 1;
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox2.isSelected()){
            jCheckBox2.setSelected(false);
        }
        if(jCheckBox4.isSelected()){
            jCheckBox4.setSelected(false);
        }
        grau_emergencia = 2;
    }//GEN-LAST:event_jCheckBox1ActionPerformed

     private boolean validaOsCampos(){
        if(jTnome.getText().isEmpty()){
            return false;
        }
        if(jTnascimento.getText().isEmpty()){
            return false;
        }
        if(jTendereco.getText().isEmpty()){
            return false;
        }
        if(jTcep.getText().isEmpty()){
            return false;
        }
        if(jTcontato.getText().isEmpty()){
            return false;
        }
        if(jTnaturalidade.getText().isEmpty()){
            return false;
        }  
        if(jTcidade.getText().isEmpty()){
            return false;
        }  
        if(jTnumeroCasa.getText().isEmpty()){
            return false;
        }  
        if(jTrg.getText().isEmpty()){
            return false;
        }
        if(jTsintomas.getText().isEmpty()){
            return false;
        }  
        if(jTuf.getText().isEmpty()){
            return false;
        }  
        if(jTcpf.getText().isEmpty()){
            return false;
        }
        if(jTemail.getText().isEmpty()){
            return false;
        }
        if(jComboBoxSEXO.getSelectedIndex() == 0){
            return false;
        }
        if((jCheckBox1.getSelectedObjects()==null) && (jCheckBox2.getSelectedObjects()==null) && (jCheckBox4.getSelectedObjects()== null)){
            return false;
        }
        
        return true;
    }
    
    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Cancelar cadastro?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.NO_OPTION);
        if(op == JOptionPane.YES_OPTION){
            limparCampos();
        }            
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        CardLayout card = (CardLayout) jPanel1.getLayout();
        card.show(jPanel1, "inicio");
        preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
        preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
    }//GEN-LAST:event_InicioActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        if(validaOsCampos()){
            try {
                pstmt = conecta.conn.prepareStatement("insert into paciente(nome, data_nascimento, endereco, rg, cpf, naturalidade, email, sintomas, sexo, cep, numero_casa, uf, cidade, contato, grau_emergencia)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstmt.setString(1, jTnome.getText());
                pstmt.setString(2, jTnascimento.getText());
                pstmt.setString(3, jTendereco.getText());
                pstmt.setString(4, jTrg.getText());
                pstmt.setString(5, jTcpf.getText());
                pstmt.setString(6, jTnaturalidade.getText());
                pstmt.setString(7, jTemail.getText());
                pstmt.setString(8, jTsintomas.getText());
                pstmt.setString(9, (String) jComboBoxSEXO.getSelectedItem());
                pstmt.setString(10, jTcep.getText());
                pstmt.setString(11, jTnumeroCasa.getText());
                pstmt.setString(12, jTuf.getText());
                pstmt.setString(13, jTcidade.getText());
                pstmt.setString(14, jTcontato.getText());
                pstmt.setInt(15, grau_emergencia);
                pstmt.execute();
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                preencherTabelaAP("select * from paciente where grau_emergencia = "+ 2);
                preencherTabelaAG("select * from paciente where grau_emergencia = "+ 1);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Todos os campos devem ser preenchidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jTnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomeKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_jTnomeKeyTyped
    
    
    
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBatendimentoGeral;
    private javax.swing.JButton jBatendimentoPreferencial;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBsair;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBoxSEXO;
    private javax.swing.JLabel jLcadastrarPaciente;
    private javax.swing.JLabel jLcepC;
    private javax.swing.JLabel jLcidade;
    private javax.swing.JLabel jLcontato;
    private javax.swing.JLabel jLcpfC;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLendC;
    private javax.swing.JLabel jLgrauEmergencia;
    private javax.swing.JLabel jLnC;
    private javax.swing.JLabel jLnascC;
    private javax.swing.JLabel jLnaturalidade;
    private javax.swing.JLabel jLnomeC;
    private javax.swing.JLabel jLrgC;
    private javax.swing.JLabel jLsexo;
    private javax.swing.JLabel jLsintomas;
    private javax.swing.JLabel jLuf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAtendimentoGeral;
    private javax.swing.JPanel jPanelAtendimentoP;
    private javax.swing.JPanel jPanelSecretaria;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAG;
    private javax.swing.JTable jTableAP;
    private javax.swing.JFormattedTextField jTcep;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JFormattedTextField jTcontato;
    private javax.swing.JFormattedTextField jTcpf;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JFormattedTextField jTnascimento;
    private javax.swing.JTextField jTnaturalidade;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTnumeroCasa;
    private javax.swing.JFormattedTextField jTrg;
    private javax.swing.JTextField jTsintomas;
    private javax.swing.JTextField jTuf;
    // End of variables declaration//GEN-END:variables
}
