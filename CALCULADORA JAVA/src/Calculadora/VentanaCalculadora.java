package Calculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author juanm
 */
public class VentanaCalculadora extends javax.swing.JFrame 
{
    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean punto = true;
    
    public VentanaCalculadora() 
    {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNumeros = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        botonRaizCuadrada = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonMasmenos = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        barramenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        CalculadoraEstandar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        panel.setForeground(new java.awt.Color(204, 255, 204));
        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNumeros.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNumeros.setText("0");
        etiquetaNumeros.setToolTipText("");
        etiquetaNumeros.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(etiquetaNumeros, gridBagConstraints);

        botonC.setBackground(new java.awt.Color(255, 255, 255));
        botonC.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonC, gridBagConstraints);

        botonRaizCuadrada.setBackground(new java.awt.Color(255, 255, 255));
        botonRaizCuadrada.setForeground(new java.awt.Color(255, 255, 255));
        botonRaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/raizCuadrada.jpg"))); // NOI18N
        botonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRaizCuadrada, gridBagConstraints);

        botonDividir.setBackground(new java.awt.Color(255, 255, 255));
        botonDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dividir.jpg"))); // NOI18N
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonDividir, gridBagConstraints);

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar.jpg"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setBackground(new java.awt.Color(204, 204, 204));
        boton7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setBackground(new java.awt.Color(204, 204, 204));
        boton8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setBackground(new java.awt.Color(204, 204, 204));
        boton9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        boton4.setBackground(new java.awt.Color(204, 204, 204));
        boton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setBackground(new java.awt.Color(204, 204, 204));
        boton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setBackground(new java.awt.Color(204, 204, 204));
        boton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setBackground(new java.awt.Color(204, 204, 204));
        boton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        botonMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        botonMultiplicacion.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMultiplicacion.setText("X");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMultiplicacion, gridBagConstraints);

        botonResta.setBackground(new java.awt.Color(255, 255, 255));
        botonResta.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botonResta.setText("-");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonResta, gridBagConstraints);

        botonSuma.setBackground(new java.awt.Color(255, 255, 255));
        botonSuma.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonSuma, gridBagConstraints);

        botonMasmenos.setBackground(new java.awt.Color(255, 255, 255));
        botonMasmenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/masMenos.jpg"))); // NOI18N
        botonMasmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasmenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMasmenos, gridBagConstraints);

        boton0.setBackground(new java.awt.Color(204, 204, 204));
        boton0.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton0, gridBagConstraints);

        botonPunto.setBackground(new java.awt.Color(255, 255, 255));
        botonPunto.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonPunto, gridBagConstraints);

        botonIgual.setBackground(new java.awt.Color(255, 255, 255));
        botonIgual.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonIgual, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        CalculadoraEstandar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CalculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.jpg"))); // NOI18N
        CalculadoraEstandar.setText("Calculadora Estandar");
        CalculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(CalculadoraEstandar);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir.jpg"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barramenu.add(menu);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraEstandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalculadoraEstandarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        if(activado == true)
        {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros+" / ");
            cadenaNumeros = "";
            operacion = "dividir";
            
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "7";
        }
        else
        {
            cadenaNumeros += "7";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
       
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "5";
        }
        else
        {
            cadenaNumeros += "5";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "1";
        }
        else
        {
            cadenaNumeros += "1";  
        }
        
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "2";
        }
        else
        {
            cadenaNumeros += "2";  
        }
        
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "3";
        }
        else
        {
            cadenaNumeros += "3";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "6";
        }
        else
        {
            cadenaNumeros += "6";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "8";
        }
        else
        {
            cadenaNumeros += "8";  
        }
 
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "9";
        }
        else
        {
            cadenaNumeros += "9";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
       
        if(etiquetaNumeros.getText() == "0")
        {
            cadenaNumeros = "4";
        }
        else
        {
            cadenaNumeros += "4";  
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
       if(cadenaNumeros != "")
       {
           if(etiquetaNumeros.getText() == "0")
                {
                    cadenaNumeros = "0";
                }
           else
                {
                    cadenaNumeros += "0";  
                }
           etiquetaNumeros.setText(cadenaNumeros);
       }
       activado = true;
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
       
        if(activado == true)
        {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros+" + ");
            cadenaNumeros = "";
            operacion = "sumar";
            
            activado = false;
            punto = true;
        } 
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        
       double numero2;
       
        if (operacion.equals("nula"))
        {
            etiquetaNumeros.setText(cadenaNumeros);
        }
        else if(operacion.equals("sumar"))
        {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 + numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("restar"))
        {
           numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 - numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula"; 
        }
        else if(operacion.equals("multiplicar"))
        {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 * numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";        
        }
        else if(operacion.equals("dividir"))
        {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 / numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";        
        }
        
        etiquetaMuestra.setText("");
        activado = true;
        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
       
        if(punto == true)
        {
            if(cadenaNumeros == "")
        {
            cadenaNumeros = "0.";
        }
        else
        {
            cadenaNumeros += ".";
        }
             etiquetaNumeros.setText(cadenaNumeros);
             
             punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonMasmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasmenosActionPerformed
       
        if(cadenaNumeros.charAt(0) != '-')
        {
            cadenaNumeros = "-"+cadenaNumeros;
        }
        else
        {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonMasmenosActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        
        int tamaño = cadenaNumeros.length();
        
        if(tamaño > 0)
        {
            if(tamaño == 1)
            {
                cadenaNumeros = "0";
            }
            else
            {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            }
            
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        if(activado == true)
        {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros+" - ");
            cadenaNumeros = "";
            operacion = "restar";
            
            activado = false;
            punto = true;
        } 
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
        if(activado == true)
        {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros+" x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            
            activado = false;
            punto = true;
        } 
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadradaActionPerformed
 
        numero1 = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(numero1);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
            
            punto = true; 
    }//GEN-LAST:event_botonRaizCuadradaActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        cadenaNumeros = "";
        operacion = "nula";
        activado = true; 
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CalculadoraEstandar;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMasmenos;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaizCuadrada;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
