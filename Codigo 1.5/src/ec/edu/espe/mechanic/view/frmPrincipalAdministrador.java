/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.view;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallerautomotriz.ArchivoRepuestos;
import tallerautomotriz.ArchivoVehiculos;
import tallerautomotriz.Repuesto;
import tallerautomotriz.Vehiculo;

public class frmPrincipalAdministrador extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    ArchivoVehiculos arcVehiculo = new ArchivoVehiculos();
    ArchivoRepuestos arcRepuestos = new ArchivoRepuestos();
    ArrayList<Vehiculo> lista = new ArrayList<>();
    ArrayList<Repuesto> listaR = new ArrayList<>();
    Vehiculo v1 = new Vehiculo();
    Repuesto r1 = new Repuesto();
    /**
     * Creates new form frmPrincipalAdministrador
     */
    public frmPrincipalAdministrador() {
        initComponents();
        jpnlRegistroVehiculos.setVisible(false);
        jpnlRegistroRepuesto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnlRegistroVehiculos = new javax.swing.JPanel();
        pnlRegistroVehiculo = new javax.swing.JPanel();
        lblVentaMarca = new javax.swing.JLabel();
        lblVentaModelo = new javax.swing.JLabel();
        lblVentaTipoMotor = new javax.swing.JLabel();
        lblVentaCilindraje = new javax.swing.JLabel();
        lblVentaPuertas = new javax.swing.JLabel();
        lblVentaAnioFabricacion = new javax.swing.JLabel();
        lblVentaPlaca = new javax.swing.JLabel();
        lblVentaChasis = new javax.swing.JLabel();
        txtRegistroMarca = new javax.swing.JTextField();
        txtRegistroModelo = new javax.swing.JTextField();
        txtRegistroPlaca = new javax.swing.JTextField();
        txtRegistroMotor = new javax.swing.JTextField();
        txtRegistroChasis = new javax.swing.JTextField();
        txtRegistroCilindraje = new javax.swing.JTextField();
        txtRegistroPuertas = new javax.swing.JTextField();
        txtRegistroFabricacion = new javax.swing.JTextField();
        lblVentaColor = new javax.swing.JLabel();
        lblVentaTransmision = new javax.swing.JLabel();
        lblVentaTapiceria = new javax.swing.JLabel();
        lblVentaLlantas = new javax.swing.JLabel();
        lblVentaAros = new javax.swing.JLabel();
        lblVentaPrecio = new javax.swing.JLabel();
        txtRegistroColor = new javax.swing.JTextField();
        txtRegistroTransmision = new javax.swing.JTextField();
        txtRegistroTapiceria = new javax.swing.JTextField();
        txtRegistroLlantas = new javax.swing.JTextField();
        txtRegistroAros = new javax.swing.JTextField();
        txtRegistroPrecio = new javax.swing.JTextField();
        lblRegistroMatricula = new javax.swing.JLabel();
        txtRegistroMatricula = new javax.swing.JTextField();
        lblVentaPrecio1 = new javax.swing.JLabel();
        txtRegistroTipoV = new javax.swing.JTextField();
        lblRegistroVehiculo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaVehiculos = new javax.swing.JTable();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnModificarVehiculo = new javax.swing.JButton();
        btnSeleccionarVehiculo = new javax.swing.JButton();
        lblRespuestaBoton = new javax.swing.JLabel();
        jpnlRegistroRepuesto = new javax.swing.JPanel();
        pnlRepuesto = new javax.swing.JPanel();
        btnAgregarRepuesto = new javax.swing.JButton();
        btnEliminarRepuesto = new javax.swing.JButton();
        btnModificarRepuesto = new javax.swing.JButton();
        lblNombreRepuestoR = new javax.swing.JLabel();
        lblCantidadRepuestoR = new javax.swing.JLabel();
        lblMarcaRegistroR = new javax.swing.JLabel();
        lblPrecioRepuestoR = new javax.swing.JLabel();
        txtRepuestoNombreR = new javax.swing.JTextField();
        txtRepuestoMarcaR = new javax.swing.JTextField();
        txtRepuestoCantidadR = new javax.swing.JTextField();
        txtRepuestoPrecioR = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtblListaRepuesto = new javax.swing.JTable();
        lblRegistroBotonRepuesto = new javax.swing.JLabel();
        btnSeleccionarRepuesto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        pnlRegistroVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo"));

        lblVentaMarca.setText("Marca");

        lblVentaModelo.setText("Modelo");

        lblVentaTipoMotor.setText("Tipo de motor");

        lblVentaCilindraje.setText("Cilindraje");

        lblVentaPuertas.setText("Número de Puertas ");

        lblVentaAnioFabricacion.setText("Año de Fabricación");

        lblVentaPlaca.setText("Placa");

        lblVentaChasis.setText("Chasis");

        txtRegistroMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroMarcaActionPerformed(evt);
            }
        });

        lblVentaColor.setText("Color");

        lblVentaTransmision.setText("Tipo de transmisión");

        lblVentaTapiceria.setText("Tapicería");

        lblVentaLlantas.setText("Tipo de LLantas");

        lblVentaAros.setText("Tipo de Aros");

        lblVentaPrecio.setText("Precio");

        lblRegistroMatricula.setText("Año de Matriculación");

        lblVentaPrecio1.setText("Tipo de Vehiculo");

        lblRegistroVehiculo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlRegistroVehiculoLayout = new javax.swing.GroupLayout(pnlRegistroVehiculo);
        pnlRegistroVehiculo.setLayout(pnlRegistroVehiculoLayout);
        pnlRegistroVehiculoLayout.setHorizontalGroup(
            pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addComponent(lblRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVentaPlaca)
                            .addComponent(lblVentaTipoMotor)
                            .addComponent(lblVentaChasis)
                            .addComponent(lblVentaCilindraje)
                            .addComponent(lblVentaPuertas)
                            .addComponent(lblVentaAnioFabricacion)
                            .addComponent(lblVentaAros)
                            .addComponent(lblVentaColor)
                            .addComponent(lblVentaTransmision)
                            .addComponent(lblVentaTapiceria)
                            .addComponent(lblRegistroMatricula)
                            .addComponent(lblVentaLlantas)
                            .addComponent(lblVentaPrecio)
                            .addComponent(lblVentaPrecio1)
                            .addComponent(lblVentaMarca)
                            .addComponent(lblVentaModelo))
                        .addGap(126, 126, 126)
                        .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistroTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegistroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRegistroMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                        .addComponent(txtRegistroModelo)
                                        .addComponent(txtRegistroPlaca)
                                        .addComponent(txtRegistroMotor)
                                        .addComponent(txtRegistroChasis)
                                        .addComponent(txtRegistroCilindraje)
                                        .addComponent(txtRegistroPuertas)
                                        .addComponent(txtRegistroFabricacion)
                                        .addComponent(txtRegistroColor)
                                        .addComponent(txtRegistroTransmision)
                                        .addComponent(txtRegistroTapiceria)
                                        .addComponent(txtRegistroLlantas)
                                        .addComponent(txtRegistroAros))
                                    .addComponent(txtRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))))))
        );
        pnlRegistroVehiculoLayout.setVerticalGroup(
            pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegistroVehiculoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtRegistroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaModelo)
                    .addComponent(txtRegistroModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaPlaca)
                    .addComponent(txtRegistroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTipoMotor)
                    .addComponent(txtRegistroMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaChasis)
                    .addComponent(txtRegistroChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVentaCilindraje)
                    .addComponent(txtRegistroCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaPuertas)
                    .addComponent(txtRegistroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaAnioFabricacion)
                    .addComponent(txtRegistroFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaColor)
                    .addComponent(txtRegistroColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTransmision)
                    .addComponent(txtRegistroTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaTapiceria)
                    .addComponent(txtRegistroTapiceria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaLlantas)
                    .addComponent(txtRegistroLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVentaAros)
                    .addComponent(txtRegistroAros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistroMatricula)
                    .addComponent(txtRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVentaPrecio1)
                    .addComponent(txtRegistroTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlRegistroVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVentaPrecio)))
        );

        tblListaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListaVehiculos);

        btnAgregarVehiculo.setText("Agregar");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setText("Eliminar");
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });

        btnModificarVehiculo.setText("Modificar");
        btnModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVehiculoActionPerformed(evt);
            }
        });

        btnSeleccionarVehiculo.setText("Seleccionar");
        btnSeleccionarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlRegistroVehiculosLayout = new javax.swing.GroupLayout(jpnlRegistroVehiculos);
        jpnlRegistroVehiculos.setLayout(jpnlRegistroVehiculosLayout);
        jpnlRegistroVehiculosLayout.setHorizontalGroup(
            jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAgregarVehiculo)
                        .addGap(57, 57, 57)
                        .addComponent(btnModificarVehiculo)
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminarVehiculo))
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnSeleccionarVehiculo))
                            .addComponent(lblRespuestaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jpnlRegistroVehiculosLayout.setVerticalGroup(
            jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlRegistroVehiculosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpnlRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarVehiculo)
                            .addComponent(btnEliminarVehiculo)
                            .addComponent(btnModificarVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRespuestaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeleccionarVehiculo)))
                .addContainerGap(720, Short.MAX_VALUE))
        );

        jPanel1.add(jpnlRegistroVehiculos, "card3");

        pnlRepuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Repuesto"));

        btnAgregarRepuesto.setText("Agregar");
        btnAgregarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRepuestoActionPerformed(evt);
            }
        });

        btnEliminarRepuesto.setText("Eliminar");
        btnEliminarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRepuestoActionPerformed(evt);
            }
        });

        btnModificarRepuesto.setText("Modificar");
        btnModificarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRepuestoActionPerformed(evt);
            }
        });

        lblNombreRepuestoR.setText("Nombre:");

        lblCantidadRepuestoR.setText("Cantidad:");

        lblMarcaRegistroR.setText("Marca");

        lblPrecioRepuestoR.setText("Precio");

        txtRepuestoMarcaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoMarcaRActionPerformed(evt);
            }
        });

        jtblListaRepuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jtblListaRepuesto);

        btnSeleccionarRepuesto.setText("Seleccionar");
        btnSeleccionarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRepuestoLayout = new javax.swing.GroupLayout(pnlRepuesto);
        pnlRepuesto.setLayout(pnlRepuestoLayout);
        pnlRepuestoLayout.setHorizontalGroup(
            pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRepuestoLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlRepuestoLayout.createSequentialGroup()
                        .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRepuestoLayout.createSequentialGroup()
                                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreRepuestoR)
                                    .addComponent(lblPrecioRepuestoR)
                                    .addComponent(lblMarcaRegistroR))
                                .addGap(39, 39, 39)
                                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRepuestoMarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepuestoPrecioR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepuestoNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepuestoCantidadR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCantidadRepuestoR)
                            .addComponent(lblRegistroBotonRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarRepuesto)
                            .addComponent(btnEliminarRepuesto)
                            .addComponent(btnModificarRepuesto)
                            .addComponent(btnSeleccionarRepuesto))
                        .addGap(29, 29, 29))))
        );
        pnlRepuestoLayout.setVerticalGroup(
            pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRepuesto)
                    .addComponent(lblNombreRepuestoR)
                    .addComponent(txtRepuestoNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaRegistroR)
                    .addComponent(txtRepuestoMarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarRepuesto))
                .addGap(14, 14, 14)
                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCantidadRepuestoR)
                        .addComponent(txtRepuestoCantidadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRepuestoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnEliminarRepuesto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRepuestoLayout.createSequentialGroup()
                        .addGroup(pnlRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioRepuestoR)
                            .addComponent(txtRepuestoPrecioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRegistroBotonRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRepuestoLayout.createSequentialGroup()
                        .addComponent(btnSeleccionarRepuesto)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnlRegistroRepuestoLayout = new javax.swing.GroupLayout(jpnlRegistroRepuesto);
        jpnlRegistroRepuesto.setLayout(jpnlRegistroRepuestoLayout);
        jpnlRegistroRepuestoLayout.setHorizontalGroup(
            jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistroRepuestoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1463, Short.MAX_VALUE))
        );
        jpnlRegistroRepuestoLayout.setVerticalGroup(
            jpnlRegistroRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlRegistroRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(957, Short.MAX_VALUE))
        );

        jPanel1.add(jpnlRegistroRepuesto, "card2");

        jMenu1.setText("Catálogos");

        jMenuItem1.setText("Vehículos");
        jMenuItem1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuItem1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Repuestos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1019, 1019, 1019))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        jpnlRegistroVehiculos.setVisible(true);
        jpnlRegistroRepuesto.setVisible(false);
        mostrarDatos();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuItem1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1AncestorAdded

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jpnlRegistroVehiculos.setVisible(false);
        jpnlRegistroRepuesto.setVisible(true);
        mostrarDatosRepuestos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed
        v1.setMarca(txtRegistroMarca.getText());
        v1.setModelo(txtRegistroModelo.getText());
        v1.setPlaca(txtRegistroPlaca.getText());
        v1.setTipoMotor(txtRegistroMotor.getText());
        v1.setChasis(txtRegistroChasis.getText());
        v1.setCilindraje(Integer.parseInt(txtRegistroCilindraje.getText()));
        v1.setNumeroPuerta(Integer.parseInt(txtRegistroPuertas.getText()));
        v1.setAñoFabricacion(Integer.parseInt(txtRegistroFabricacion.getText()));
        v1.setColor(txtRegistroColor.getText());
        v1.setTipoTransmision(txtRegistroTransmision.getText());
        v1.setMaterialInterior(txtRegistroTapiceria.getText());
        v1.setTipoLLanta(txtRegistroLlantas.getText());
        v1.setTipoAros(txtRegistroAros.getText());
        v1.setPrecio(Float.parseFloat(txtRegistroPrecio.getText()));
        v1.setAñoMatricula(Integer.parseInt(txtRegistroMatricula.getText()));
        v1.setTipoVehiculo(txtRegistroTipoV.getText());
        v1.setDisponibilidad(true);
        if(arcVehiculo.validarVehiculo(txtRegistroChasis.getText(),txtRegistroPlaca.getText())){
          arcVehiculo.adicionarVehiculo(v1); 
          for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
            }
          lblRespuestaBoton.setText("EL VEHICULO HA SIDO AGREGADO");
          mostrarV();
        }else{
            lblRegistroVehiculo.setText("La placa o el chasis se encuentran repetidos");
        }
        
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void txtRegistroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroMarcaActionPerformed
        
    }//GEN-LAST:event_txtRegistroMarcaActionPerformed

    private void txtRepuestoMarcaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoMarcaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoMarcaRActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed
        v1.setMarca(txtRegistroMarca.getText());
        v1.setModelo(txtRegistroModelo.getText());
        v1.setPlaca(txtRegistroPlaca.getText());
        v1.setTipoMotor(txtRegistroMotor.getText());
        v1.setChasis(txtRegistroChasis.getText());
        v1.setCilindraje(Integer.parseInt(txtRegistroCilindraje.getText()));
        v1.setNumeroPuerta(Integer.parseInt(txtRegistroPuertas.getText()));
        v1.setAñoFabricacion(Integer.parseInt(txtRegistroFabricacion.getText()));
        v1.setColor(txtRegistroColor.getText());
        v1.setTipoTransmision(txtRegistroTransmision.getText());
        v1.setMaterialInterior(txtRegistroTapiceria.getText());
        v1.setTipoLLanta(txtRegistroLlantas.getText());
        v1.setTipoAros(txtRegistroAros.getText());
        v1.setPrecio(Float.parseFloat(txtRegistroPrecio.getText()));
        v1.setAñoMatricula(Integer.parseInt(txtRegistroMatricula.getText()));
        v1.setTipoVehiculo(txtRegistroTipoV.getText());
        v1.setDisponibilidad(true);
        arcVehiculo.eliminarVehiculo(v1);
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        mostrarV();
        lblRespuestaBoton.setText("EL HA SIDO ELIMIDADO CON EXITO");
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnSeleccionarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarVehiculoActionPerformed
            int fila=tblListaVehiculos.getSelectedRow();
        if(fila>=0){
            String a = String.valueOf(modelo.getValueAt(fila, 0));
            Vehiculo v1 = arcVehiculo.buscarVehiculoChasis(a);
            txtRegistroMarca.setText(v1.getMarca());
            txtRegistroModelo.setText(v1.getModelo());
            txtRegistroPlaca.setText(v1.getPlaca());
            txtRegistroMotor.setText(v1.getTipoMotor());
            txtRegistroChasis.setText(v1.getChasis());
            txtRegistroColor.setText(v1.getColor());
            txtRegistroTransmision.setText(v1.getTipoTransmision());
            txtRegistroTapiceria.setText(v1.getMaterialInterior());
            txtRegistroLlantas.setText(v1.getTipoLLanta());
            txtRegistroAros.setText(v1.getTipoAros());
            txtRegistroMatricula.setText(String.valueOf(v1.getAñoMatricula()));
            txtRegistroCilindraje.setText(String.valueOf(v1.getCilindraje()));
            txtRegistroPuertas.setText(String.valueOf(v1.getNumeroPuerta()));
            txtRegistroFabricacion.setText(String.valueOf(v1.getAñoFabricacion()));
            txtRegistroTipoV.setText(v1.getTipoVehiculo());
            txtRegistroPrecio.setText(String.valueOf(v1.getPrecio()));
            lblRespuestaBoton.setText("EL VEHICULO HA SIDO SELECCIONADO");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar una fila");
        }
    }//GEN-LAST:event_btnSeleccionarVehiculoActionPerformed

    private void btnModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVehiculoActionPerformed
        v1.setMarca(txtRegistroMarca.getText());
        v1.setModelo(txtRegistroModelo.getText());
        v1.setPlaca(txtRegistroPlaca.getText());
        v1.setTipoMotor(txtRegistroMotor.getText());
        v1.setChasis(txtRegistroChasis.getText());
        v1.setCilindraje(Integer.parseInt(txtRegistroCilindraje.getText()));
        v1.setNumeroPuerta(Integer.parseInt(txtRegistroPuertas.getText()));
        v1.setAñoFabricacion(Integer.parseInt(txtRegistroFabricacion.getText()));
        v1.setColor(txtRegistroColor.getText());
        v1.setTipoTransmision(txtRegistroTransmision.getText());
        v1.setMaterialInterior(txtRegistroTapiceria.getText());
        v1.setTipoLLanta(txtRegistroLlantas.getText());
        v1.setTipoAros(txtRegistroAros.getText());
        v1.setPrecio(Float.parseFloat(txtRegistroPrecio.getText()));
        v1.setAñoMatricula(Integer.parseInt(txtRegistroMatricula.getText()));
        v1.setTipoVehiculo(txtRegistroTipoV.getText());
        v1.setDisponibilidad(true);
        arcVehiculo.modificarVehiculo(v1);
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        mostrarV();
        lblRespuestaBoton.setText("EL VEHICULO HA SIDO MODIFICADO");
    }//GEN-LAST:event_btnModificarVehiculoActionPerformed

    private void btnAgregarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRepuestoActionPerformed
        r1.setNombreP(txtRepuestoNombreR.getText());
        r1.setMarcaP(txtRepuestoMarcaR.getText());
        r1.setCantidad(Long.parseLong(txtRepuestoCantidadR.getText()));
        r1.setPrecioP(Double.parseDouble(txtRepuestoPrecioR.getText()));
        if(arcRepuestos.validarRepuesto(txtRepuestoNombreR.getText())){
        arcRepuestos.adicionarRepuesto(r1);   
          for (int i = modelo3.getRowCount() - 1; i >= 0; i--) {
            modelo3.removeRow(i);
            }
          lblRegistroBotonRepuesto.setText("EL REPUESTO HA SIDO AGREGADO");
          mostrarR();
        }else{
            lblRegistroVehiculo.setText("La nombre se encuentran repetido");
        }
    }//GEN-LAST:event_btnAgregarRepuestoActionPerformed

    private void btnSeleccionarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRepuestoActionPerformed
         int fila=jtblListaRepuesto.getSelectedRow();
        if(fila>=0){
            String a = String.valueOf(modelo3.getValueAt(fila, 0));
            Repuesto r1 = arcRepuestos.buscarRepuestoNombre(a);
            txtRepuestoNombreR.setText(r1.getNombreP());
            txtRepuestoMarcaR.setText(r1.getMarcaP());
            txtRepuestoPrecioR.setText(String.valueOf(r1.getPrecioP()));
            txtRepuestoCantidadR.setText(String.valueOf(r1.getCantidad()));
            lblRegistroBotonRepuesto.setText("EL VEHICULO HA SIDO SELECCIONADO");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccionar una fila");
        }
    }//GEN-LAST:event_btnSeleccionarRepuestoActionPerformed

    private void btnModificarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRepuestoActionPerformed
        r1.setNombreP(txtRepuestoNombreR.getText());
        r1.setMarcaP(txtRepuestoMarcaR.getText());
        r1.setPrecioP(Double.parseDouble(txtRepuestoPrecioR.getText()));
        r1.setCantidad(Long.parseLong(txtRepuestoCantidadR.getText()));
        arcRepuestos.modificarRepuesto(r1);
           for (int i = modelo3.getRowCount() - 1; i >= 0; i--) {
            modelo3.removeRow(i);
        }
        mostrarR();
        lblRegistroBotonRepuesto.setText("EL REPUESTO HA SIDO MODIFICADO");
        
    }//GEN-LAST:event_btnModificarRepuestoActionPerformed

    private void btnEliminarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRepuestoActionPerformed
        r1.setNombreP(txtRepuestoNombreR.getText());
        r1.setMarcaP(txtRepuestoMarcaR.getText());
        r1.setCantidad(Long.parseLong(txtRepuestoCantidadR.getText()));
        r1.setPrecioP(Double.parseDouble(txtRepuestoPrecioR.getText()));
        arcRepuestos.eliminarRepuesto(r1);
              for (int i = modelo3.getRowCount() - 1; i >= 0; i--) {
        modelo3.removeRow(i);
        }
        mostrarR();
        lblRegistroBotonRepuesto.setText("EL REPUESTO HA SIDO ELIMINADO");
        
    }//GEN-LAST:event_btnEliminarRepuestoActionPerformed
   public void mostrarDatos(){
        modelo.addColumn("CHASIS");
        modelo.addColumn("MODELO");
        modelo.addColumn("MARCA");
        modelo.addColumn("PRECIO");
        tblListaVehiculos.setModel(modelo);
        String [] datos = new String [4];
        lista = arcVehiculo.obtenerVehiculo();
        Iterator it = lista.iterator();
        while(it.hasNext()){
            v1 = (Vehiculo) it.next();
            datos[0] = v1.getChasis();
            datos[1] = v1.getModelo();
            datos[2] = v1.getMarca();
            datos[3] = String.valueOf(v1.getPrecio());
            modelo.addRow(datos);
        }
    }
   public void mostrarV(){
        lista = arcVehiculo.obtenerVehiculo();
        Iterator it = lista.iterator();
        String [] datos = new String [4];
        while(it.hasNext()){
            v1 = (Vehiculo) it.next();
            datos[0] = v1.getChasis();
            datos[1] = v1.getModelo();
            datos[2] = v1.getMarca();
            datos[3] = String.valueOf(v1.getPrecio());
            modelo.addRow(datos);
        }
    }
    public void mostrarR(){
        listaR = arcRepuestos.obtenerRepuesto();
        Iterator it = listaR.iterator();
        String [] datos = new String [4];
        while(it.hasNext()){
            r1 = (Repuesto) it.next();
            datos[0] = r1.getNombreP();
            datos[1] = r1.getMarcaP();
            datos[2] = String.valueOf(r1.getCantidad());
            datos[3] = String.valueOf(r1.getPrecioP());
            modelo3.addRow(datos);
        }
    }
      public void mostrarDatosRepuestos(){
        modelo3.addColumn("NOMBRE");
        modelo3.addColumn("MARCA");
        modelo3.addColumn("CANTIDAD");
        modelo3.addColumn("PRECIO");
        jtblListaRepuesto.setModel(modelo3);
        String [] datos = new String [4];
        listaR = arcRepuestos.obtenerRepuesto();
        Iterator it = listaR.iterator();
        while(it.hasNext()){
            r1 = (Repuesto) it.next();
            datos[0] = r1.getNombreP();
            datos[1] = r1.getMarcaP();
            datos[2] = String.valueOf(r1.getCantidad());
            datos[3] = String.valueOf(r1.getPrecioP());
            modelo3.addRow(datos);
        }
    }
 
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
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRepuesto;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnEliminarRepuesto;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnModificarRepuesto;
    private javax.swing.JButton btnModificarVehiculo;
    private javax.swing.JButton btnSeleccionarRepuesto;
    private javax.swing.JButton btnSeleccionarVehiculo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jpnlRegistroRepuesto;
    private javax.swing.JPanel jpnlRegistroVehiculos;
    private javax.swing.JTable jtblListaRepuesto;
    private javax.swing.JLabel lblCantidadRepuestoR;
    private javax.swing.JLabel lblMarcaRegistroR;
    private javax.swing.JLabel lblNombreRepuestoR;
    private javax.swing.JLabel lblPrecioRepuestoR;
    private javax.swing.JLabel lblRegistroBotonRepuesto;
    private javax.swing.JLabel lblRegistroMatricula;
    private javax.swing.JLabel lblRegistroVehiculo;
    private javax.swing.JLabel lblRespuestaBoton;
    private javax.swing.JLabel lblVentaAnioFabricacion;
    private javax.swing.JLabel lblVentaAros;
    private javax.swing.JLabel lblVentaChasis;
    private javax.swing.JLabel lblVentaCilindraje;
    private javax.swing.JLabel lblVentaColor;
    private javax.swing.JLabel lblVentaLlantas;
    private javax.swing.JLabel lblVentaMarca;
    private javax.swing.JLabel lblVentaModelo;
    private javax.swing.JLabel lblVentaPlaca;
    private javax.swing.JLabel lblVentaPrecio;
    private javax.swing.JLabel lblVentaPrecio1;
    private javax.swing.JLabel lblVentaPuertas;
    private javax.swing.JLabel lblVentaTapiceria;
    private javax.swing.JLabel lblVentaTipoMotor;
    private javax.swing.JLabel lblVentaTransmision;
    private javax.swing.JPanel pnlRegistroVehiculo;
    private javax.swing.JPanel pnlRepuesto;
    private javax.swing.JTable tblListaVehiculos;
    private javax.swing.JTextField txtRegistroAros;
    private javax.swing.JTextField txtRegistroChasis;
    private javax.swing.JTextField txtRegistroCilindraje;
    private javax.swing.JTextField txtRegistroColor;
    private javax.swing.JTextField txtRegistroFabricacion;
    private javax.swing.JTextField txtRegistroLlantas;
    private javax.swing.JTextField txtRegistroMarca;
    private javax.swing.JTextField txtRegistroMatricula;
    private javax.swing.JTextField txtRegistroModelo;
    private javax.swing.JTextField txtRegistroMotor;
    private javax.swing.JTextField txtRegistroPlaca;
    private javax.swing.JTextField txtRegistroPrecio;
    private javax.swing.JTextField txtRegistroPuertas;
    private javax.swing.JTextField txtRegistroTapiceria;
    private javax.swing.JTextField txtRegistroTipoV;
    private javax.swing.JTextField txtRegistroTransmision;
    private javax.swing.JTextField txtRepuestoCantidadR;
    private javax.swing.JTextField txtRepuestoMarcaR;
    private javax.swing.JTextField txtRepuestoNombreR;
    private javax.swing.JTextField txtRepuestoPrecioR;
    // End of variables declaration//GEN-END:variables
}
