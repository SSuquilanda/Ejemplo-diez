/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.vista;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaCrearPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaCrearPersona
     */
    public VentanaCrearPersona() {
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

        panelPersona = new javax.swing.JPanel();
        lblCedulaCrearPersona = new javax.swing.JLabel();
        lblFechaNacimientoCrearPersona = new javax.swing.JLabel();
        lblNombreCrearPersona = new javax.swing.JLabel();
        txtCedulaCrearPersona = new javax.swing.JTextField();
        txtNombreCrearPersona = new javax.swing.JTextField();
        txtFechaNacimientoCrearPersona = new javax.swing.JTextField();
        btnAceptarCrearPersona = new javax.swing.JButton();
        btnCancelarCrearPersona = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelPersona.setBackground(new java.awt.Color(204, 204, 255));
        panelPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Nueva Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18))); // NOI18N
        panelPersona.setToolTipText("Crear Nueva Persona");

        lblCedulaCrearPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblCedulaCrearPersona.setText("Cedula:");

        lblFechaNacimientoCrearPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblFechaNacimientoCrearPersona.setText("Fecha de Nacimiento:");

        lblNombreCrearPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblNombreCrearPersona.setText("Nombre:");

        txtCedulaCrearPersona.setToolTipText("Ingrese la cedula de la nueva persona");
        txtCedulaCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCrearPersonaActionPerformed(evt);
            }
        });

        txtNombreCrearPersona.setToolTipText("Ingrese el nombre de la nueva persona");
        txtNombreCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCrearPersonaActionPerformed(evt);
            }
        });

        txtFechaNacimientoCrearPersona.setToolTipText("Ingrese la fecha de nacimiento de la nueva persona (01/01/2004)");
        txtFechaNacimientoCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoCrearPersonaActionPerformed(evt);
            }
        });

        btnAceptarCrearPersona.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAceptarCrearPersona.setText("Aceptar");
        btnAceptarCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCrearPersonaActionPerformed(evt);
            }
        });

        btnCancelarCrearPersona.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelarCrearPersona.setText("Cancelar");
        btnCancelarCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCrearPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonaLayout = new javax.swing.GroupLayout(panelPersona);
        panelPersona.setLayout(panelPersonaLayout);
        panelPersonaLayout.setHorizontalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimientoCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCedulaCrearPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombreCrearPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                        .addGap(37, 37, 37)
                        .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedulaCrearPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(txtNombreCrearPersona)
                            .addComponent(txtFechaNacimientoCrearPersona)))
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnAceptarCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCancelarCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelPersonaLayout.setVerticalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addComponent(lblCedulaCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addComponent(txtCedulaCrearPersona)
                        .addGap(18, 18, 18)))
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNacimientoCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarCrearPersonaActionPerformed

    private void btnCancelarCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCrearPersonaActionPerformed

    private void txtCedulaCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCrearPersonaActionPerformed

    private void txtNombreCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCrearPersonaActionPerformed

    private void txtFechaNacimientoCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoCrearPersonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCrearPersona;
    private javax.swing.JButton btnCancelarCrearPersona;
    private javax.swing.JLabel lblCedulaCrearPersona;
    private javax.swing.JLabel lblFechaNacimientoCrearPersona;
    private javax.swing.JLabel lblNombreCrearPersona;
    private javax.swing.JPanel panelPersona;
    private javax.swing.JTextField txtCedulaCrearPersona;
    private javax.swing.JTextField txtFechaNacimientoCrearPersona;
    private javax.swing.JTextField txtNombreCrearPersona;
    // End of variables declaration//GEN-END:variables
}
