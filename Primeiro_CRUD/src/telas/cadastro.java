/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class cadastro extends javax.swing.JFrame {

    private PreparedStatement statement;

    /**
     * Creates new form cadastro
     */
    public cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_insert_nome = new javax.swing.JTextField();
        txt_insert_cpf = new javax.swing.JTextField();
        txt_insert_id = new javax.swing.JTextField();
        Inserir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_insert_number = new javax.swing.JTextField();
        Novo_Inserir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome_atualizar = new javax.swing.JTextField();
        id_atualizar = new javax.swing.JTextField();
        cpf_atualizar = new javax.swing.JTextField();
        atualizar = new javax.swing.JButton();
        Novo_Update = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        numero_atualizar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        id_apagar = new javax.swing.JTextField();
        Excluir = new javax.swing.JButton();
        Novo_Excluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF");

        txt_insert_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_insert_nomeActionPerformed(evt);
            }
        });

        txt_insert_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_insert_cpfActionPerformed(evt);
            }
        });

        txt_insert_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_insert_idActionPerformed(evt);
            }
        });

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Número");

        txt_insert_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_insert_numberActionPerformed(evt);
            }
        });

        Novo_Inserir.setBackground(new java.awt.Color(204, 255, 102));
        Novo_Inserir.setText("Novo");
        Novo_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_InserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(Novo_Inserir)
                        .addGap(18, 18, 18)
                        .addComponent(Inserir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_insert_number, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_insert_id, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txt_insert_nome)
                                    .addComponent(txt_insert_cpf))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_insert_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_insert_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_insert_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_insert_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inserir)
                    .addComponent(Novo_Inserir))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CPF");

        nome_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_atualizarActionPerformed(evt);
            }
        });

        id_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_atualizarActionPerformed(evt);
            }
        });

        cpf_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_atualizarActionPerformed(evt);
            }
        });

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        Novo_Update.setBackground(new java.awt.Color(204, 255, 102));
        Novo_Update.setText("Novo");
        Novo_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_UpdateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Número");

        numero_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(nome_atualizar)
                            .addComponent(cpf_atualizar)
                            .addComponent(numero_atualizar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Novo_Update)
                        .addGap(18, 18, 18)
                        .addComponent(atualizar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nome_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpf_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(numero_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo_Update)
                    .addComponent(atualizar))
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("ID");

        id_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_apagarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Novo_Excluir.setBackground(new java.awt.Color(204, 255, 153));
        Novo_Excluir.setText("Novo");
        Novo_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(Novo_Excluir)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Excluir)
                    .addComponent(Novo_Excluir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("INSERIR");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("EXCLUIR");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("ATUALIZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(579, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(123, 123, 123)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel10)
                    .addContainerGap(418, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_insert_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_insert_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_insert_nomeActionPerformed

    private void txt_insert_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_insert_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_insert_cpfActionPerformed

    private void nome_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_atualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_atualizarActionPerformed

    private void id_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_atualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_atualizarActionPerformed

    private void cpf_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_atualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_atualizarActionPerformed

    private void id_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_apagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_apagarActionPerformed

    private void txt_insert_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_insert_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_insert_idActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_escola", "mykaeltest", "123456");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO aluno (id,nome,cpf,numero) VALUES ("
                    +this.txt_insert_id.getText()+", "
                    +this.txt_insert_nome.getText()+", "
                    +this.txt_insert_cpf.getText()+", "
                    +this.txt_insert_number.getText()+")");
            JOptionPane.showMessageDialog(rootPane, "Aluno Inserido");
        } catch (SQLException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InserirActionPerformed

    private void txt_insert_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_insert_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_insert_numberActionPerformed

    private void Novo_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_InserirActionPerformed
        Connection conexao = null;
        //PreparedStatement statement = null;
        
        try {

            String url = "jdbc:mysql://localhost:3308/db_escola";
            String usuario = "mykaeltest";
            String senha = "123456";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "INSERT INTO aluno(nome, cpf, numero) VALUES(?, ?, ?)";
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, txt_insert_nome.getText());
            statement.setInt(2, Integer.parseInt(txt_insert_cpf.getText()));
            statement.setInt(3, Integer.parseInt(txt_insert_number.getText()));
            
            int linhasAfetadas = statement.executeUpdate();
            
            if(linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(rootPane, "Dados inseridos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum dado inserido!");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro de inserção de dado!");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(statement != null) {
                    statement.close();
                }
                if(conexao != null) {
                    conexao.close();
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro de fechamento!");
            }
        }
    }//GEN-LAST:event_Novo_InserirActionPerformed

    private void Novo_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_UpdateActionPerformed
        PreparedStatement statement = null;
        Connection conexao = null;
        
        String url = "jdbc:mysql://localhost:3308/db_escola";
        String usuario = "mykaeltest";
        String senha = "123456";
        
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        String sql = "UPDATE aluno SET nome = ?, numero = ?, cpf = ? where id = ?";
        
        statement = conexao.prepareStatement(sql);
        statement.setString(1, nome_atualizar.getText());
        statement.setString(2, numero_atualizar.getText());
        statement.setString(3, cpf_atualizar.getText());
        statement.setString(4, id_atualizar.getText());
        
        int linhasAfetadas = statement.executeUpdate();
        
        if (linhasAfetadas > 0){
            System.out.println("Dados atualizar com sucesso!");
        } else {
            System.out.println("Nenhum dado atualizado.");
        }
        } catch (SQLException e){
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null){
                    conexao.close();
                }
            } catch (SQLException e){
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_Novo_UpdateActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_escola", "mykaeltest", "123456");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE aluno SET nome='"
                    +this.nome_atualizar.getText() + "', numero ='"
                    +this.numero_atualizar.getText() + "', cpf ='"
                    +this.cpf_atualizar.getText()
                    +"'WHERE id = '" + id_atualizar.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "Aluno atualizar");
        } catch (SQLException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_atualizarActionPerformed

    private void numero_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_atualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_atualizarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        try {
            PreparedStatement statement = null;
            Connection conexao = null;
            
            String url = "jdbc:mysql://localhost:3308/db_escola";
            String usuario = "mykaeltest";
            String senha = "123456";
            
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            java.sql.Statement st = conn.createStatement();
            
            st.executeUpdate("DELETE FROM aluno WHERE id ='" + this.id_apagar.getText() + "'");
            
            JOptionPane.showMessageDialog(rootPane, "Aluno excluido");
        } catch (SQLException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void Novo_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_ExcluirActionPerformed
            PreparedStatement statement = null;
            Connection conexao = null;
            try {
                        
            String url = "jdbc:mysql://localhost:3308/db_escola";
            String usuario = "mykaeltest";
            String senha = "123456";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "DELETE FROM aluno WHERE id = ?";
            
            statement = conexao.prepareStatement(sql);
            statement.setString(1, id_apagar.getText());
            
            int linhasAfetadas = statement.executeUpdate();
            
            if (linhasAfetadas > 0){
                System.out.println("Dados atualizar com sucesso!");
            } else {
                System.out.println("Nenhum dado atualizado.");
            }
        } catch (SQLException e){
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null){
                    conexao.close();
                }
            } catch (SQLException e){
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_Novo_ExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Inserir;
    private javax.swing.JButton Novo_Excluir;
    private javax.swing.JButton Novo_Inserir;
    private javax.swing.JButton Novo_Update;
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField cpf_atualizar;
    private javax.swing.JTextField id_apagar;
    private javax.swing.JTextField id_atualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nome_atualizar;
    private javax.swing.JTextField numero_atualizar;
    private javax.swing.JTextField txt_insert_cpf;
    private javax.swing.JTextField txt_insert_id;
    private javax.swing.JTextField txt_insert_nome;
    private javax.swing.JTextField txt_insert_number;
    // End of variables declaration//GEN-END:variables
}
