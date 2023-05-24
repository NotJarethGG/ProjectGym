package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logic.GestionRegistroIngreso;
import logic.RegistroIngreso;

public class frmRegistroIngreso extends javax.swing.JInternalFrame {

    GestionRegistroIngreso gestionRegistroIngreso;
    RegistroIngreso registroIngreso;

    public frmRegistroIngreso() {
        initComponents();
        gestionRegistroIngreso = new GestionRegistroIngreso();
        registroIngreso = null;
        gestionRegistroIngreso.consultarIDSocios(cmbIDSocio);
        listarRegistroIngreso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winRegistroIngreso = new javax.swing.JDialog();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo2.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }}

            ;
            btnCancelar = new javax.swing.JButton();
            btnSave = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            cmbIDSocio = new javax.swing.JComboBox<>();
            jdcFecha = new com.toedter.calendar.JDateChooser();
            jLabel6 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            txtDescripcion = new javax.swing.JTextArea();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            txtHoraIngreso = new javax.swing.JTextField();
            txtHoraSalida = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            PopUpmnuRegistroIngreso = new javax.swing.JPopupMenu();
            popMnuImprimir = new javax.swing.JMenuItem();
            popMnuSalir = new javax.swing.JMenuItem();
            jPanel3 = new javax.swing.JPanel();
            jToolBar1 = new javax.swing.JToolBar();
            btnGuardar = new javax.swing.JButton();
            btnImprimir = new javax.swing.JButton();
            btnSalir = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            tblRegistroIngreso = new javax.swing.JTable();
            lblTotal = new javax.swing.JLabel();

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso a gimnasio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14))); // NOI18N

            btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
            btnCancelar.setText("Cancelar");
            btnCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelarActionPerformed(evt);
                }
            });

            btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-archivo.png"))); // NOI18N
            btnSave.setText("Guardar");
            btnSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSaveActionPerformed(evt);
                }
            });

            jPanel2.setBackground(new java.awt.Color(123, 113, 108));
            jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel2.setFocusable(false);

            cmbIDSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una opcion" }));
            cmbIDSocio.setToolTipText("");
            cmbIDSocio.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    cmbIDSocioKeyPressed(evt);
                }
            });

            jdcFecha.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jdcFechaKeyPressed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
            jLabel6.setText("Descripcion:");
            jLabel6.setFocusable(false);

            jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
            jLabel1.setText("ID Socio:");
            jLabel1.setFocusable(false);

            txtDescripcion.setColumns(20);
            txtDescripcion.setRows(5);
            txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtDescripcionKeyPressed(evt);
                }
            });
            jScrollPane2.setViewportView(txtDescripcion);

            jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
            jLabel2.setText("Fecha de hoy: ");
            jLabel2.setFocusable(false);

            jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
            jLabel3.setText("Hora de ingreso:");
            jLabel3.setFocusable(false);

            jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
            jLabel4.setText("Hora de salida:");
            jLabel4.setFocusable(false);

            txtHoraIngreso.setText(String.valueOf(LocalTime.now().getHour())+":"+String.valueOf(LocalTime.now().getMinute()));
            txtHoraIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtHoraIngresoKeyPressed(evt);
                }
            });

            txtHoraSalida.setText(String.valueOf(LocalTime.now().getHour()+(02))+":"+String.valueOf(LocalTime.now().getMinute()));
            txtHoraSalida.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtHoraSalidaKeyPressed(evt);
                }
            });

            jLabel5.setBackground(new java.awt.Color(0, 0, 0));
            jLabel5.setFont(new java.awt.Font("LogicCoach3", 2, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 0));
            jLabel5.setText("El tiempo de rutina en el gimnasio es de 2 horas ");
            jLabel5.setFocusable(false);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2)
                                .addComponent(txtHoraSalida)
                                .addComponent(txtHoraIngreso)
                                .addComponent(cmbIDSocio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbIDSocio))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(32, 32, 32))
            );

            jdcFecha.setDate(new Date());

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(280, 280, 280))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnSave)
                        .addComponent(btnCancelar))
                    .addContainerGap(82, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout winRegistroIngresoLayout = new javax.swing.GroupLayout(winRegistroIngreso.getContentPane());
            winRegistroIngreso.getContentPane().setLayout(winRegistroIngresoLayout);
            winRegistroIngresoLayout.setHorizontalGroup(
                winRegistroIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            winRegistroIngresoLayout.setVerticalGroup(
                winRegistroIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(winRegistroIngresoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            popMnuImprimir.setText("Imprimir");
            popMnuImprimir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    popMnuImprimirActionPerformed(evt);
                }
            });
            PopUpmnuRegistroIngreso.add(popMnuImprimir);

            popMnuSalir.setText("Salir");
            popMnuSalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    popMnuSalirActionPerformed(evt);
                }
            });
            PopUpmnuRegistroIngreso.add(popMnuSalir);

            setClosable(true);
            setIconifiable(true);
            setMaximizable(true);
            setResizable(true);
            setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
            setPreferredSize(new java.awt.Dimension(900, 500));

            jPanel3.setBackground(new java.awt.Color(130, 114, 103));

            jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            btnGuardar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
            btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document.png"))); // NOI18N
            btnGuardar.setText("Guardar");
            btnGuardar.setFocusable(false);
            btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btnGuardar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGuardarActionPerformed(evt);
                }
            });
            jToolBar1.add(btnGuardar);

            btnImprimir.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
            btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
            btnImprimir.setText("Imprimir");
            btnImprimir.setFocusable(false);
            btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btnImprimir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnImprimirActionPerformed(evt);
                }
            });
            jToolBar1.add(btnImprimir);

            btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
            btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
            btnSalir.setText("Salir");
            btnSalir.setFocusable(false);
            btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btnSalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalirActionPerformed(evt);
                }
            });
            jToolBar1.add(btnSalir);

            jScrollPane1.setBackground(new java.awt.Color(189, 175, 145));
            jScrollPane1.setAutoscrolls(true);
            jScrollPane1.setComponentPopupMenu(PopUpmnuRegistroIngreso);
            jScrollPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
            jScrollPane1.setOpaque(false);

            tblRegistroIngreso.setBackground(new java.awt.Color(189, 175, 145));
            tblRegistroIngreso.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
            tblRegistroIngreso.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "ID Registro ingreso", "ID Socio", "Fecha", "Hora inicio", "Hora salida", "Descripcion"
                }
            ));
            tblRegistroIngreso.setComponentPopupMenu(PopUpmnuRegistroIngreso);
            tblRegistroIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tblRegistroIngresoMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tblRegistroIngreso);

            lblTotal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
            lblTotal.setText("Total:");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGap(24, 24, 24)
                    .addComponent(lblTotal)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String msg = validarDatos();
        if (msg.equals("")) {
            registroIngreso = new RegistroIngreso();
            registroIngreso.setIdSocio(cmbIDSocio.getSelectedIndex());
            Date date;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            date = (Date) jdcFecha.getDate();
            registroIngreso.setFecha(format.format(date));
            registroIngreso.setHoraInicio(txtHoraIngreso.getText());
            registroIngreso.setHoraSalida(txtHoraSalida.getText());
            registroIngreso.setDescripcion(txtDescripcion.getText());

            if (winRegistroIngreso.getTitle().equals("Guardar")) {
                if (gestionRegistroIngreso.insertarRegistroIngreso(registroIngreso)) {
                    JOptionPane.showMessageDialog(winRegistroIngreso, "Ingreso almacenado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    winRegistroIngreso.dispose();
                    listarRegistroIngreso();
                } else {
                    JOptionPane.showMessageDialog(winRegistroIngreso, "Error al intentar guardar ingreso", "Guardar", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(winRegistroIngreso, msg, "Validando datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        winRegistroIngreso.setSize(700, 600);
        winRegistroIngreso.setTitle("Guardar");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/document.png"));
        winRegistroIngreso.setIconImage(img.getImage());
        limpiar();
        winRegistroIngreso.setLocationRelativeTo(winRegistroIngreso);
        winRegistroIngreso.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblRegistroIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroIngresoMouseClicked

    }//GEN-LAST:event_tblRegistroIngresoMouseClicked

    private void popMnuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuImprimirActionPerformed

        int fila = tblRegistroIngreso.getSelectedRow();
        if (fila != -1) {
            int idRegistroIngreso = Integer.parseInt(tblRegistroIngreso.getValueAt(fila, 0).toString());
            int resp = JOptionPane.showConfirmDialog(rootPane, "¿Desea imprimir este registro de ingreso: " + idRegistroIngreso+"?", "Imprimir", JOptionPane.YES_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                gestionRegistroIngreso.cargarReporteUnRegistroIngreso(idRegistroIngreso);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al intentar imprimir", "Imprimir", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el registro de ingreso que desea imprimir", "imprimir", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_popMnuImprimirActionPerformed

    private void popMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMnuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_popMnuSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        gestionRegistroIngreso.cargarReporteRegistroIngreso();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbIDSocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbIDSocioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cmbIDSocio.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Por favor escoja un id");
                cmbIDSocio.requestFocus();

            } else {
                btnSave.doClick();
            }
        }
    }//GEN-LAST:event_cmbIDSocioKeyPressed

    private void jdcFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcFechaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jdcFecha.getDateFormatString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una fecha");
                jdcFecha.requestFocus();

            } else {
                btnSave.doClick();
            }
        }
    }//GEN-LAST:event_jdcFechaKeyPressed

    private void txtHoraIngresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraIngresoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtHoraIngreso.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una hora");
                txtHoraIngreso.requestFocus();

            } else {
                btnSave.doClick();
            }
        }
    }//GEN-LAST:event_txtHoraIngresoKeyPressed

    private void txtHoraSalidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraSalidaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtHoraSalida.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una hora");
                txtHoraSalida.requestFocus();

            } else {
                btnSave.doClick();
            }
        }
    }//GEN-LAST:event_txtHoraSalidaKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtDescripcion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una descripción");
                txtDescripcion.requestFocus();

            } else {
                btnSave.doClick();
            }
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void listarRegistroIngreso() {
        gestionRegistroIngreso.conectarBD();
        ResultSet rs = gestionRegistroIngreso.listarRegistroIngreso();
        if (rs != null) {
            tblRegistroIngreso.setModel(gestionRegistroIngreso.cargarEnTabla(rs));
            lblTotal.setText("Total: " + tblRegistroIngreso.getRowCount());
        }
        gestionRegistroIngreso.desconectarBD();
    }

    private String validarDatos() {

        if (cmbIDSocio.getSelectedIndex() == 0) {
            cmbIDSocio.requestFocus();
            return "Por favor esocoja el id socio";
        }

        if (jdcFecha.getDateFormatString().trim().equals("")) {
            jdcFecha.requestFocus();
            return "Por favor ingrese la fecha de hoy";
        }

        if (txtHoraIngreso.getText().trim().equals("")) {
            txtHoraIngreso.requestFocus();
            return "Por favor indique la hora de ingreso";
        }
        if (txtHoraSalida.getText().trim().equals("")) {
            txtHoraSalida.requestFocus();
            return "Por favor indique la hora de salida";
        }
        if (txtDescripcion.getText().trim().equals("")) {
            txtDescripcion.requestFocus();
            return "Por favor escriba la descripción del ingreso";
        }

        return "";
    }

    private void limpiar() {
        cmbIDSocio.setSelectedIndex(0);
        jdcFecha.setDate(new Date());;
        txtHoraIngreso.setText(String.valueOf(LocalTime.now().getHour()) + ":" + String.valueOf(LocalTime.now().getMinute()));
        txtHoraSalida.setText(String.valueOf(LocalTime.now().getHour() + (02)) + ":" + String.valueOf(LocalTime.now().getMinute()));
        txtDescripcion.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPopupMenu PopUpmnuRegistroIngreso;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnSalir;
    public static javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbIDSocio;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JToolBar jToolBar1;
    public static com.toedter.calendar.JDateChooser jdcFecha;
    public static javax.swing.JLabel lblTotal;
    public static javax.swing.JMenuItem popMnuImprimir;
    public static javax.swing.JMenuItem popMnuSalir;
    public static javax.swing.JTable tblRegistroIngreso;
    public static javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtHoraIngreso;
    public static javax.swing.JTextField txtHoraSalida;
    public static javax.swing.JDialog winRegistroIngreso;
    // End of variables declaration//GEN-END:variables
}
