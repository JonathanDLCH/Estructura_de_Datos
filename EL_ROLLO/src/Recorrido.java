
import javax.swing.JOptionPane;

public class Recorrido extends javax.swing.JFrame {   
    
    Archivo a1 = new Archivo();
    Grafo rolloG= new Grafo();
    //Grafo rolloG = a1.retornarDatosGrafo();
    GrafoUI mapa  = new GrafoUI(rolloG,a1);

    /**
     * Creates new form CheckOut
     */
    public Recorrido() {
        initComponents();
        borrar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelTipoR = new javax.swing.JLabel();
        jLabelCrearR = new javax.swing.JLabel();
        jLabelAtracciones = new javax.swing.JLabel();
        jLabelServicios = new javax.swing.JLabel();
        btnAgregarS = new javax.swing.JButton();
        btnAgregarA = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxAtracciones = new javax.swing.JComboBox<>();
        jComboBoxServicios = new javax.swing.JComboBox<>();
        jLabelLaCascada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelElRollo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabelLasOlas = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabelSurfing = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        QuitarA = new javax.swing.JButton();
        jButtonQuitarS = new javax.swing.JButton();
        try {
            jButtonMapa =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "CheckOut_jButton3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 203, 251));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elrollologo.png"))); // NOI18N

        jLabelTipoR.setText("Tipo de recorrido");

        jLabelCrearR.setText("¡Crea tu propio recorrido!");

        jLabelAtracciones.setText("Atracciones:");

        jLabelServicios.setText("Servicios");

        btnAgregarS.setText("Agregar");
        btnAgregarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSActionPerformed(evt);
            }
        });

        btnAgregarA.setText("Agregar");
        btnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tipo de recorrido", "¡Conoce todas las atracciones!", "¡Crea tu propio recorrido!", "Atracciones", "Servicios", "Niños", "Extremo", "La cascada", "Seccion \"El rollo\"", "Seccion \"Las olas\"", "Seccion \"Surfing\"" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBoxAtracciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona atraccion", "Alberca de olas", "Aquatubo", "Alberca ballena", "Alberca cascada", "Bubbatubo", "Racer", "Cancha de futbol", "Puente colgante ", "Isla Infantil", "Fosa de clavados", "Kamilancha", "MiniKamikaze", "Alberca del rio", "Alberca de las palmas ", "Río lento", "Tobogán de curas", "Isla Infantil", "Area Infantil Interactiva", "Aqualoop", "Stuka", "Kamikaze", "Toborruedas", "Tobogán de Curvas", "Tobogán Vertical Droop", "Alberca de Olas ", "5 albercas", "Tinas de Hidromasaje", "Isla Infantil", "La cubetita", "Aqua Lásser", "Area Infantil Interactiva (Las olas)", "Flowrider", "Rio con Olas", "Ola para Surfear", "Reolcadero", "Las boas ", "Cancha/ Basket-Volibol", "El péndulo", "Torbellino", "Backflash", "Mamut", "Isla Infantil", "Zona VIP" }));
        jComboBoxAtracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtraccionesActionPerformed(evt);
            }
        });

        jComboBoxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona servicio", "Articulos de playa (Seccion la cascada)", "Comida rápida (Seccion la casacada)", "Fuente de sodas (Seccion la cascada)", "Parrillas (Seccion la cascada)", "Articulos de playa (Seccion el rollo)", "Comida rápida (Seccion el rollo)", "Fuente de sodas (Seccion el rollo)", "Parrillas (Seccion el rollo)", "Restaurante \"El rollo\"", "Restaurante \"Azaleas\"", "Mini Súper", "Articulos de playa (Seccion las olas)", "Comida rápida (Seccion las olas)", "Fuente de sodas (Seccion las olas)", "Parrillas (Seccion las olas)", "Restaurante \"Las olas\"", "Articulos de playa (Seccion surfing)", "Food Court", "Comida rápida (Seccion surfing)", "Fuente de sodas (Seccion surfing)", "Parrillas (Seccion surfing)" }));
        jComboBoxServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServiciosActionPerformed(evt);
            }
        });

        jLabelLaCascada.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelLaCascada.setText("La cascada");

        jLabel7.setText("Alberca de olas");

        jLabel8.setText("Aquatubol");

        jLabel9.setText("Alberca ballena");

        jLabel10.setText(" Alberca cascada");

        jLabel11.setText("Bubbatubo");

        jLabel12.setText("Racer");

        jLabel13.setText("Cancha de futbol");

        jLabel14.setText("Puente colgante");

        jLabel15.setText("Isla infantil");

        jLabel16.setText("Articulos de playa");

        jLabel17.setText("Comida rápida");

        jLabel18.setText("Fuente de sodas");

        jLabel19.setText("Parrillas");

        jLabelElRollo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelElRollo.setText("El rollo");

        jLabel21.setText("Fosa de clavados");

        jLabel22.setText("Kamilancha");

        jLabel23.setText("MiniKamikaze");

        jLabel24.setText("Alberca del Rio");

        jLabel25.setText("Alberca Las Palmas");

        jLabel26.setText("Río lento");

        jLabel27.setText("Tobogan de curvas");

        jLabel28.setText("Isla Infantil");

        jLabel29.setText("Area Infantil Interactiva");

        jLabel30.setText("Articulos de playa");

        jLabel31.setText("Comida rápida");

        jLabel32.setText("Fuente de sodas");

        jLabel33.setText("Parrillas");

        jLabel34.setText("Restaurante \"El rollo\"");

        jLabel35.setText("Restaurante \"Azaleas\"");

        jLabel36.setText("Mini Super");

        jLabelLasOlas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelLasOlas.setText("Las olas");

        jLabel38.setText("Aqualoop");

        jLabel39.setText("Stuka");

        jLabel40.setText("Kamikaze");

        jLabel41.setText("Toborruedas");

        jLabel42.setText("Tobógan de Curvas");

        jLabel43.setText("Vertical Droop");

        jLabel44.setText("Alberca de olas");

        jLabel45.setText("5 albercas");

        jLabel46.setText("Tinas de hidromasaje");

        jLabel47.setText("Isla Infantil");

        jLabel48.setText("La cubetita");

        jLabel49.setText("Aqua Lásser");

        jLabel50.setText("Area Infantil Interactiva");

        jLabel51.setText("Articulos de playa");

        jLabel52.setText("Comida rápida");

        jLabel53.setText("Fuente de sodas");

        jLabel54.setText("Parrillas");

        jLabel55.setText("Restaurante \"Las olas\"");

        jLabelSurfing.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelSurfing.setText("Surfing");

        jLabel57.setText("Flowrider");

        jLabel58.setText("Rio con Olas");

        jLabel59.setText("Ola para Surfear");

        jLabel60.setText("Revolcadero");

        jLabel61.setText("Las boas");

        jLabel62.setText("Cancha/ Basket-Volibol");

        jLabel63.setText(" El péndulo");

        jLabel64.setText("Torbellino");

        jLabel65.setText("Backflash");

        jLabel66.setText("Mamut");

        jLabel67.setText("Isla Infantil");

        jLabel68.setText("Zona VIP");

        QuitarA.setText("Quitar");
        QuitarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarAActionPerformed(evt);
            }
        });

        jButtonQuitarS.setText("Quitar");

        jButtonMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1))
                    .addComponent(jLabelTipoR)
                    .addComponent(jLabelCrearR)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonQuitarS))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAtracciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxAtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelServicios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuitarA)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLaCascada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelElRollo)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLasOlas)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jLabel66)
                    .addComponent(jLabel65)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabelSurfing)
                    .addComponent(jButtonMapa))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoR))
                        .addGap(39, 39, 39)
                        .addComponent(jLabelCrearR)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAtracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAtracciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarA)
                            .addComponent(QuitarA))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelServicios)
                            .addComponent(jComboBoxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarS)
                            .addComponent(jButtonQuitarS)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLaCascada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelElRollo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLasOlas)
                                    .addComponent(jLabelSurfing))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel59))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel60))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel61))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel63))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel65))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel68))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(jButtonMapa))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSActionPerformed
        // TODO add your handling code here:
        Video obj = new Video();
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarSActionPerformed

    private void btnAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAActionPerformed

        dispose();
    }//GEN-LAST:event_btnAgregarAActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
           //1. TODO
        if(jComboBox1.getSelectedIndex()==1){
            jLabelElRollo.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelLasOlas.setVisible(true);
            jLabelLaCascada.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);
            jLabel16.setVisible(true);
            jLabel17.setVisible(true);
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
            jLabel21.setVisible(true);
            jLabel22.setVisible(true);
            jLabel23.setVisible(true);
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jLabel27.setVisible(true);
            jLabel28.setVisible(true);
            jLabel29.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jLabel32.setVisible(true);
            jLabel33.setVisible(true);
            jLabel34.setVisible(true);
            jLabel35.setVisible(true);
            jLabel36.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);
            jLabel43.setVisible(true);
            jLabel44.setVisible(true);
            jLabel45.setVisible(true);
            jLabel46.setVisible(true);
            jLabel47.setVisible(true);
            jLabel48.setVisible(true);
            jLabel49.setVisible(true);  
            jLabel50.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            jLabel53.setVisible(true);
            jLabel54.setVisible(true);
            jLabel55.setVisible(true);
            jLabel57.setVisible(true);
            jLabel58.setVisible(true);
            jLabel59.setVisible(true); 
            jLabel60.setVisible(true);
            jLabel61.setVisible(true);
            jLabel62.setVisible(true);
            jLabel63.setVisible(true);
            jLabel64.setVisible(true);
            jLabel65.setVisible(true);
            jLabel66.setVisible(true);
            jLabel67.setVisible(true);
            jLabel68.setVisible(true);
        }
        //Personalizado
        if(jComboBox1.getSelectedIndex()==2){
            borrar();
            jComboBoxAtracciones.setVisible(true);
            jComboBoxServicios.setVisible(true);
            QuitarA.setVisible(true);
            btnAgregarA.setVisible(true);
            btnAgregarS.setVisible(true);
            jButtonQuitarS.setVisible(true);
            jLabelCrearR.setVisible(true);
            jLabelAtracciones.setVisible(true);
            jLabelLaCascada.setVisible(true);
            jLabelServicios.setVisible(true);
            jLabelElRollo.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelLasOlas.setVisible(true);
        }
        //Atracciones
        if(jComboBox1.getSelectedIndex()==3){
            borrar();
            
            jLabelLaCascada.setVisible(true);
            jLabelElRollo.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelLasOlas.setVisible(true);
            
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);
            jLabel21.setVisible(true);
            jLabel22.setVisible(true);
            jLabel23.setVisible(true);
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jLabel27.setVisible(true);
            jLabel28.setVisible(true);
            jLabel29.setVisible(true); 
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);
            jLabel43.setVisible(true);
            jLabel44.setVisible(true);
            jLabel45.setVisible(true);
            jLabel46.setVisible(true);
            jLabel47.setVisible(true);
            jLabel48.setVisible(true);
            jLabel49.setVisible(true);  
            jLabel50.setVisible(true);
            jLabel57.setVisible(true);
            jLabel58.setVisible(true);
            jLabel59.setVisible(true);
            jLabel60.setVisible(true);
            jLabel61.setVisible(true);
            jLabel62.setVisible(true);
            jLabel63.setVisible(true);
            jLabel64.setVisible(true);
            jLabel65.setVisible(true);
            jLabel66.setVisible(true);
            jLabel67.setVisible(true);
            jLabel68.setVisible(true);
        }
        //Servicios
        if(jComboBox1.getSelectedIndex()==4){
            borrar();
            jLabelLaCascada.setVisible(true);
            jLabelElRollo.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelLasOlas.setVisible(true);
            jLabel16.setVisible(true);
            jLabel17.setVisible(true);
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jLabel32.setVisible(true);
            jLabel33.setVisible(true);
            jLabel34.setVisible(true);
            jLabel35.setVisible(true);
            jLabel36.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            jLabel53.setVisible(true);
            jLabel54.setVisible(true);
            jLabel55.setVisible(true);
        }
            //Niños
        if(jComboBox1.getSelectedIndex()==5){
            borrar();
            jLabelLaCascada.setVisible(true);
            jLabelElRollo.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelLasOlas.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);         
            jLabel22.setVisible(true);
            jLabel23.setVisible(true);
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jLabel27.setVisible(true);
            jLabel28.setVisible(true);
            jLabel29.setVisible(true);
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);
            jLabel43.setVisible(true);
            jLabel44.setVisible(true);
            jLabel45.setVisible(true);
            jLabel46.setVisible(true);
            jLabel47.setVisible(true);
            jLabel48.setVisible(true);
            jLabel49.setVisible(true);  
            jLabel50.setVisible(true);
            jLabel58.setVisible(true);
            jLabel61.setVisible(true);
            jLabel67.setVisible(true);
            jLabel68.setVisible(true);  

            jLabel16.setVisible(true);
            jLabel17.setVisible(true);
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jLabel32.setVisible(true);
            jLabel33.setVisible(true);
            jLabel34.setVisible(true);
            jLabel35.setVisible(true);
            jLabel36.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            jLabel53.setVisible(true);
            jLabel54.setVisible(true);
            jLabel55.setVisible(true);
        }
        //Extremo
        if(jComboBox1.getSelectedIndex()==6){
            borrar();
            jLabelLaCascada.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabelElRollo.setVisible(true);
            jLabel21.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabelSurfing.setVisible(true);
            jLabel57.setVisible(true);
            jLabel59.setVisible(true); 
            jLabel60.setVisible(true);
            jLabel63.setVisible(true);
            jLabel64.setVisible(true);
            jLabel65.setVisible(true);
            jLabel66.setVisible(true);
            jLabel68.setVisible(true);  
            jLabelLasOlas.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);
            
            
            
            jLabel16.setVisible(true);
            jLabel17.setVisible(true);
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jLabel32.setVisible(true);
            jLabel33.setVisible(true);
            jLabel34.setVisible(true);
            jLabel35.setVisible(true);
            jLabel36.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            jLabel53.setVisible(true);
            jLabel54.setVisible(true);
            jLabel55.setVisible(true);
        }
        //La cascada
        if(jComboBox1.getSelectedIndex()==7){
            borrar();
            jLabelLaCascada.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);
            jLabel16.setVisible(true);
            jLabel17.setVisible(true);
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
        }
        //El rollo
        if(jComboBox1.getSelectedIndex()==8){
            borrar();
            jLabelElRollo.setVisible(true);
            jLabel21.setVisible(true);
            jLabel22.setVisible(true);
            jLabel23.setVisible(true);
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jLabel27.setVisible(true);
            jLabel28.setVisible(true);
            jLabel29.setVisible(true);
            jLabel30.setVisible(true);
            jLabel31.setVisible(true);
            jLabel32.setVisible(true);
            jLabel33.setVisible(true);
            jLabel34.setVisible(true);
            jLabel35.setVisible(true);
            jLabel36.setVisible(true);
        }
        //Las olas
        if(jComboBox1.getSelectedIndex()==9){
            borrar();
            jLabelLasOlas.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);
            
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);
            jLabel43.setVisible(true);
            jLabel44.setVisible(true);
            jLabel45.setVisible(true);
            jLabel46.setVisible(true);
            jLabel47.setVisible(true);
            jLabel48.setVisible(true);
            jLabel49.setVisible(true);  
            jLabel50.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            jLabel53.setVisible(true);
            jLabel54.setVisible(true);
            jLabel55.setVisible(true);
        }
        //Surfing
        if(jComboBox1.getSelectedIndex()==10){
            borrar();
            jLabelSurfing.setVisible(true);
            jLabel57.setVisible(true);
            jLabel58.setVisible(true);
            jLabel59.setVisible(true); 
            jLabel60.setVisible(true);
            jLabel61.setVisible(true);
            jLabel62.setVisible(true);
            jLabel63.setVisible(true);
            jLabel64.setVisible(true);
            jLabel65.setVisible(true);
            jLabel66.setVisible(true);
            jLabel67.setVisible(true);
            jLabel68.setVisible(true);            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBoxAtraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtraccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtraccionesActionPerformed

    private void jComboBoxServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServiciosActionPerformed

    private void QuitarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitarAActionPerformed

    private void jButtonMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMapaActionPerformed
        if(jLabel7.isVisible()==true) System.out.println("Esta visible Atraccion");
        if(jLabel18.isVisible()==true) System.out.println("Etsa visisble Servicio");
        mapa.setVisible(true);
        repaint();
    }//GEN-LAST:event_jButtonMapaActionPerformed

     void borrar(){
            jLabelCrearR.setVisible(false);
            jLabelAtracciones.setVisible(false);
            jLabelLaCascada.setVisible(false);
            jLabelServicios.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            jLabel17.setVisible(false);
            jLabel18.setVisible(false);
            jLabel19.setVisible(false);
            jLabelElRollo.setVisible(false);
            jLabel21.setVisible(false);
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);
            jLabel24.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jLabel27.setVisible(false);
            jLabel28.setVisible(false);
            jLabel29.setVisible(false);
            jLabel30.setVisible(false);
            jLabel31.setVisible(false);
            jLabel32.setVisible(false);
            jLabel33.setVisible(false);
            jLabel34.setVisible(false);
            jLabel35.setVisible(false);
            jLabel36.setVisible(false);
            jLabelLasOlas.setVisible(false);
            jLabel38.setVisible(false);
            jLabel39.setVisible(false);
            jLabel40.setVisible(false);
            jLabel41.setVisible(false);
            jLabel42.setVisible(false);
            jLabel43.setVisible(false);
            jLabel44.setVisible(false);
            jLabel45.setVisible(false);
            jLabel46.setVisible(false);
            jLabel47.setVisible(false);
            jLabel48.setVisible(false);
            jLabel49.setVisible(false);  
            jLabel50.setVisible(false);
            jLabel51.setVisible(false);
            jLabel52.setVisible(false);
            jLabel53.setVisible(false);
            jLabel54.setVisible(false);
            jLabel55.setVisible(false);
            jLabelSurfing.setVisible(false);
            jLabel57.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
            
            jLabel60.setVisible(false);
            jLabel61.setVisible(false);
            jLabel62.setVisible(false);
            jLabel63.setVisible(false);
            jLabel64.setVisible(false);
            jLabel65.setVisible(false);
            jLabel66.setVisible(false);
            jLabel67.setVisible(false);
            jLabel68.setVisible(false);
            jComboBoxAtracciones.setVisible(false);
            jComboBoxServicios.setVisible(false);
            QuitarA.setVisible(false);
            btnAgregarA.setVisible(false);
            btnAgregarS.setVisible(false);
            jButtonQuitarS.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(Recorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recorrido().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QuitarA;
    private javax.swing.JButton btnAgregarA;
    private javax.swing.JButton btnAgregarS;
    private javax.swing.JButton jButtonMapa;
    private javax.swing.JButton jButtonQuitarS;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAtracciones;
    private javax.swing.JComboBox<String> jComboBoxServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtracciones;
    private javax.swing.JLabel jLabelCrearR;
    private javax.swing.JLabel jLabelElRollo;
    private javax.swing.JLabel jLabelLaCascada;
    private javax.swing.JLabel jLabelLasOlas;
    private javax.swing.JLabel jLabelServicios;
    private javax.swing.JLabel jLabelSurfing;
    private javax.swing.JLabel jLabelTipoR;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}