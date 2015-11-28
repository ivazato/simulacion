
package SistemaDistribuido;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan Zapata
 */
public class SimuTabla extends javax.swing.JFrame {

    //1. Creando un modelo para la tabla
    DefaultTableModel md;
    String data[][] = {};
    //String cabeza1[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
    String cabeza[] = {"NºT", "NºA", "T.E.Arribos", "T.Arribo","T.I.Serv", "NºA.", "T.Serv.", "T.F.Serv", "T.Ocio", "T.I.Serv", "NºA.", "T.Serv.", "T.F.Serv", "T.Ocio", "T.Esp"};
    
    Double max7;
    Double max12;
    
    public SimuTabla() {
        initComponents();
        md = new DefaultTableModel(data, cabeza);
        jTable1.setModel(md);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonIniciar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 52, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA DISTRIBUIDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 1040, 430));

        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, -1));

        jLabel2.setText("VARIABLES DE SALIDA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setText("Tiempo de Espera Promedio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("Porcentaje de Utilizacion de A:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, -1));

        jLabel5.setText("Porcentaje de Utilizacion de B:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        
        for(int i = 0; i < 100; i++){
            Double[] celda = new Double[md.getColumnCount()]; //obtener el nro de columnas: 15 columnas
            for(int j = 0; j< md.getColumnCount(); j++){
                
                max7 = maximoRango(obtenerRangoMenosUno(7));
                max12 = maximoRango(obtenerRangoMenosUno(12));
                
                // NºT
                if(j == 0){
                    celda[j] = new Double(i);                    
                }                
                else{
                    celda[j] = new Double(0);
                }
                
                // NºA.
                if(j == 1){ // Llenando la columna NºA
                
                        celda[j] = Math.random();
                }
                
                // T.E.Arribos
                if(j == 2){
                    if(celda[j-1] > 0 && celda[j-1] < 0.3)
                        celda[j] = 1.0;                  
                    if(celda[j-1] >= 0.3 && celda[j-1] < 0.6)
                        celda[j] = 2.0;
                    if(celda[j-1] >= 0.6 && celda[j-1] < 0.8)
                        celda[j] = 3.0;                    
                    if(celda[j-1] >= 0.8 && celda[j-1] <= 1.0)
                        celda[j] = 4.0;
                }
                
                // T.Arribo
                Double valorAnteriorTA;
                if(j == 3){ // Columna
                    if(i == 0){ // Fila
                        valorAnteriorTA = 0.0;
                    }
                    else{
                        valorAnteriorTA = (Double) md.getValueAt(i-1, j);
                        //System.out.println("valorAnteriorTA = " + valorAnteriorTA);
                        //System.out.println("Fila Nº " + md.getRowCount());
                        //System.out.println("COLUMNA Nº " + md.getColumnCount());
                        //System.out.println("celda[j-1] = " + celda[j-1]);                        
                    }                    
                    celda[j] = valorAnteriorTA + celda[j-1];
                }
                
                /**
                 * SERVIDOR A
                 */
                // T.I.Serv.
                if(j == 4){
                    /*ArrayList<Double> pruebaArray = new ArrayList<Double>();
                    pruebaArray = obtenerRangoMenosUno(7);
                    for(int index = 0; index <= pruebaArray.size()-1; index++){
                        //System.out.println("Fila " + i +" = ");                    
                    }*/                    
                    
                    System.out.println(i + " " + "max7 = " + max7);
                    if(max7 <= celda[j-1]){
                        celda[j] = celda[j-1];
                    }
                    else{
                        if(max7 <= max12){
                            celda[j] = max7;
                        }
                        else{
                            celda[j] = 0.0;
                        }
                    }
                }
                
                // NºA.
                if(j == 5){
                    if(celda[j-1] == 0){
                        celda[j] = 0.0;
                    }
                    else{
                        celda[j] = Math.random();
                    }
                }
                
                // T.Serv.
                if(j == 6){
                    if(celda[j-1] == 0){
                        celda[j] = 0.0;
                    }
                    else{
                        if(celda[j-1] > 0 && celda[j-1] < 0.25)
                        celda[j] = 2.0;                  
                    if(celda[j-1] >= 0.25 && celda[j-1] < 0.5)
                        celda[j] = 3.0;
                    if(celda[j-1] >= 0.5 && celda[j-1] < 0.7)
                        celda[j] = 4.0;                    
                    if(celda[j-1] >= 0.7 && celda[j-1] <= 1.0)
                        celda[j] = 5.0;
                    }
                }
                
                // T.F.Serv. 
                if(j == 7){
                    celda[j] = celda[j-3] + celda[j-1];
                }
                
                // T.Ocio
                Double valorAnteriorTO_A;
                if(j == 8){
                    
                    if(i == 0){ // Fila
                        valorAnteriorTO_A = 0.0;
                    }
                    else{
                        valorAnteriorTO_A = (Double) md.getValueAt(i-1, j); 
                        if(celda[j-4] == 0){
                            celda[j] = valorAnteriorTO_A;
                        }
                        else{
                            celda[j] = valorAnteriorTO_A + (celda[j-4] - max7);
                        }
                    }
                }
                
                /**
                 * SERVIDOR B
                 */
                // T.I.Serv.
                if(j == 9){
                    if(celda[j-5] > 0){
                        celda[j] = 0.0;
                    }
                    else{
                        celda[j] = maximo(celda[j-6],max12);
                    }
                }
                
                // NºA.
                if(j == 10){
                    if(celda[j-1] == 0){
                        celda[j] = 0.0;
                    }
                    else{
                        celda[j] = Math.random();
                    }
                }
                
                // T.Serv.
                if(j == 11){
                    if(celda[j-1] == 0){
                        celda[j] = 0.0;
                    }
                    else{
                        if(celda[j-1] > 0 && celda[j-1] < 0.25)
                        celda[j] = 2.0;                  
                    if(celda[j-1] >= 0.25 && celda[j-1] < 0.5)
                        celda[j] = 3.0;
                    if(celda[j-1] >= 0.5 && celda[j-1] < 0.7)
                        celda[j] = 4.0;                    
                    if(celda[j-1] >= 0.7 && celda[j-1] <= 1.0)
                        celda[j] = 5.0;
                    }
                }
                
                // T.F.Serv. 
                if(j == 12){
                    celda[j] = celda[j-3] + celda[j-1];
                }
                
                // T.Ocio
                Double valorAnteriorTO_B;
                if(j == 13){
                    if(i == 0){ // Fila
                        valorAnteriorTO_B = 0.0;
                    }
                    else{
                        valorAnteriorTO_B = (Double) md.getValueAt(i-1, j); 
                        if(celda[j-4] == 0){
                            celda[j] = valorAnteriorTO_B;
                        }
                        else{
                            celda[j] = valorAnteriorTO_B + (celda[j-4] - max12);
                        }
                    }
                }
                
                if(j == 14){
                    celda[j] = maximo(celda[j-5], celda[j-10]) - celda[j-11];
                }
            }
            md.addRow(celda);
        } 
        llenarTextFields();
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    // Obtener el rango de numeros que me interesa, hasta celda actual -1 de una columna determinada
    public ArrayList<Double> obtenerRangoMenosUno(int numeroCol){
        ArrayList<Double> coleccion = new ArrayList<Double>();
        if(numeroCol <= md.getColumnCount()){
            for(int indexRow = 0; indexRow <= md.getRowCount()-1; indexRow++){
                coleccion.add((Double)md.getValueAt(indexRow, numeroCol));
                //System.out.println("(indexRow,numeroCol)");
            }
        }
        return coleccion;
    }
    
    // Obtener el rango de numeros que me interesa, hasta celda actual de una columna determinada. Es decir, obtener todos los datos de una columna
    public ArrayList<Double> obtenerColumna(int numeroCol){
        ArrayList<Double> coleccion = new ArrayList<Double>();
        if(numeroCol <= md.getColumnCount()){
            for(int indexRow = 0; indexRow < md.getRowCount(); indexRow++){ //contador >>>posible errror al cambiar el inicio de 0 a 1 o viceversa
                coleccion.add((Double)md.getValueAt(indexRow, numeroCol));
                //System.out.println("(indexRow,numeroCol)");
            }
        }
        return coleccion;
    }
    
    // Obtener el mayor entre todos los numeros del arreglo
    public double maximoRango(ArrayList<Double> arreglo){
        double max = 0;
        for(int i = 0; i < arreglo.size(); i++){
            if(arreglo.get(i) > max)
                max = arreglo.get(i);
        }
        return max;        
    }
    
    // Obtener el mayor entre todos 2 numeros
    public double maximo(double a, double b){
        double max = 0;
        if(a>b)
            max = a;
        else
            max = b;
        return max;
    }
    
    public void llenarTextFields(){        
        String cadena1 = String.valueOf(calcularPromedio(obtenerColumna(14))); //De double a String
        jTextField1.setText(cadena1);
        
        ArrayList<Double> col_7 = new ArrayList<Double>();
        ArrayList<Double> col_12 = new ArrayList<Double>();
        col_7 = obtenerColumna(7);
        col_12 = obtenerColumna(12);
        
        double maximo_7 = maximoRango(col_7);
        double maximo_12 = maximoRango(col_12);
        
        double maximo_7_12 = maximo(maximo_7, maximo_12);
        
        double celda99_8 = (Double)md.getValueAt(99, 8);
        System.out.println("celda(99,8) = " + celda99_8);
        
        String cadena2 = String.valueOf((maximo_7_12 - celda99_8)/maximo_7_12);        
        jTextField2.setText(cadena2);
        
        double celda99_13 = (Double)md.getValueAt(99, 13);
        System.out.println("celda(99,13) = " + celda99_13);
        String cadena3 = String.valueOf((maximo_7_12 - celda99_13)/maximo_7_12);
        jTextField3.setText(cadena3);
    }
    
    public double calcularPromedio(ArrayList<Double> arreglo){
        double suma = 0;
        double prom = 0;
        for(int i = 0; i < arreglo.size(); i++){
            suma = suma + arreglo.get(i);
            prom = suma/arreglo.size();
        }
        System.out.println("TAM Arreglo" + arreglo.size());
        return prom;        
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
            java.util.logging.Logger.getLogger(SimuTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimuTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimuTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimuTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimuTabla().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private Double Double(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Hola GitHub
}
