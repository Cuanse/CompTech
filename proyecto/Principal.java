/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    ALCircular ArrCircular = new ALCircular();
    ArrayList ArrList = new ArrayList();
    Cola Tail = new Cola();
    linkedList LinkList = new linkedList();
    Pilas Pila = new Pilas();
    nodo_binario node;
    Tree myTree = new Tree();
    Hash hash = new Hash(499979);
    String lin[][];
    
    public String insercion_Pila(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Pila.insert(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String insercion_Cola(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Tail.enqueue(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String insercion_LinkList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            LinkList.add(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String insercion_ArrList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrList.push(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String insercion_ArrCircular(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrCircular.add(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String insercion_Hash(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            hash.insert(lin[i][8],lin[i][1]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String insercion_Tree(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            node = myTree.insert(node,lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Inserción ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    
    
    
    
    
    
    public String Busqueda_Pila(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Pila.Search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Busqueda_Cola(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Tail.search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String Busqueda_LinkList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            LinkList.search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String Busqueda_ArrList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrList.search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Busqueda_ArrCircular(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrCircular.search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Busqueda_Hash(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            hash.search(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String Busqueda_Tree(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            myTree.search(node,lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Busqueda ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    
    
    
    
    
    
    
    
    public String Borrado_Pila(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Pila.remove();
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Borrado_Cola(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            Tail.dequeue();
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String Borrado_LinkList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            LinkList.popFront();
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    public String Borrado_ArrList(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrList.pop();
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Borrado_ArrCircular(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            ArrCircular.delete(0);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public String Borrado_Hash(int cantidad) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        for(int i =0; i < cantidad; i++){
            hash.delete(lin[i][8]);
        }
        
        
        time_end = System.currentTimeMillis(); 
        String result = "Borrado ha tomado: " + (time_end - time_start) + " millisegundos \n";
        System.out.println(result);
        return result;
    }
    
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPTECH");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pixlr-bg-result (2) (1).png"))); // NOI18N
        jLabel8.setText(" GPU");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/memory-33549_960_720 (1).png"))); // NOI18N
        jLabel4.setText("RAM");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/4776131 (1).png"))); // NOI18N
        jLabel5.setText("CPU");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pixlr-bg-result (1).png"))); // NOI18N
        jLabel6.setText("FUENTE");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pixlr-bg-result.png"))); // NOI18N
        jLabel7.setText("BOARD");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setText("¿Cómo usar este prototipo?");

        jLabel3.setText("Presione un icono de la izquierda para importar el JSON");

        jLabel10.setText("Permita al programa ejecutar y añadir los datos en la tabla inferior");

        jLabel11.setText("Luego se medirá automáticamente el tiempo de ejecucion de procesos CRUD para estructuras de datos predeterminadas");

        jLabel12.setText("Los resultados de la medicion aparecerán en la parte superior");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(97, 97, 97))
                    .addComponent(jLabel12)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("COMPTECH");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(552, 552, 552)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(731, 731, 731))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        

        DefaultTableModel coso = (DefaultTableModel) jTable1.getModel();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
           
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\Users\\tique\\Downloads\\procesador.json");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea = br.readLine();
            String lina[] = linea
                    .replace("{", "")
                    .replace("}", "")
                    .replace("[", "")
                    .replace("]", "")
                    .split(",");
            
            lin = new String[lina.length][11];
            
            int i = 0;
            int j = 0;
            int k = 0;
            while (j < lina.length) {
                if (i == 11) {
                    i = 0;
                    lin[k][i] = lina[j + i].split(":")[1];
                    j += 11;
                    k += 1;
                } else {
                    lin[k][i] = lina[j + i].split(":")[1];
                }
                i = i + 1;
            }
            /*for(i = 0; i < lina.length;i++){
             System.out.println(lina[i]);
            }*/
            String lina2[] = new String[11];
            for (i = 0; i < 11; i++) {
                lina2[i] = lina[i].split(":")[0];
            }
            coso.setColumnCount(0);
            coso.setRowCount(0);
            coso.setColumnCount(8);
            coso.setColumnIdentifiers(lina2);

            for (i = 0; i < k; i++) {
                for (j = 0; j < 11; j++) {
                    System.out.println(lin[i][j]);
                }
                coso.addRow(lin[i]);
            }
            /*while((linea=br.readLine())!=null)
            System.out.println(linea);*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        JLabel label1 = new JLabel("aaaa");
        JLabel label2 = new JLabel("sss");
        JLabel label3 = new JLabel("ss)");
        JLabel label4 = new JLabel("Tdfb 2");
        JLabel label5 = new JLabel("Tab b1");
        JLabel label6 = new JLabel("Tab 3452642");
        JLabel label7 = new JLabel("Tab ,,,,,1");
        
        label1.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label2.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label3.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label4.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label5.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label6.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        label7.setFont(new java.awt.Font("Roboto Medium", 0, 12));
        
        
        label1.setText(insercion_Pila(100000)+"<html><p>"+Busqueda_Pila(100)+Borrado_Pila(100000));
        label2.setText(insercion_Cola(100000)+"<html><p>"+Busqueda_Cola(100)+Borrado_Cola(100000));
        label3.setText(insercion_ArrList(100000)+"<html><p>"+Busqueda_ArrList(100)+Borrado_ArrList(100000));
        label4.setText(insercion_ArrCircular(100000)+"<html><p>"+Busqueda_ArrCircular(100)+Borrado_ArrCircular(100000));
        label5.setText(insercion_LinkList(100000)+"<html><p>"+Busqueda_LinkList(100)+Borrado_LinkList(100000));
        label6.setText(insercion_Tree(100000)+"<html><p>"+Busqueda_Tree(100));     
        label7.setText(insercion_Hash(100000)+"<html><p>"+Busqueda_Hash(10000)+Borrado_Hash(100000));
        
        
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        panel6.add(label6);
        panel7.add(label7);

        jTabbedPane1.add("Pila", panel1);
        jTabbedPane1.add("Cola", panel2);
        jTabbedPane1.add("ArrayList", panel3);
        jTabbedPane1.add("AlCircular", panel4);
        jTabbedPane1.add("LinkedList", panel5);
        jTabbedPane1.add("Arboles", panel6);
        jTabbedPane1.add("HASH", panel7);
        //jTabbedPane1.setBorder(new EmptyBorder(10, 10, 10, 10)); 
        //jTabbedPane1.setVisible(true);
        System.out.println("funciona");
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
