/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usach.lab3punto1;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author nico4
 */
public class VentanaRemoteRepo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRemoteRepo
     */
    public VentanaRemoteRepo() {
        initComponents();
        setDefaultCloseOperation(NueArcVent.DISPOSE_ON_CLOSE);
        
        int largo = VariablesGlobales.repo.remote.listaCommits.size();
        
        if (VariablesGlobales.repo.remote.listaCommits.isEmpty()){
            lst1.setVisible(false);
            lst2.setVisible(false);
            lst3.setVisible(false);
            
        }        
        
        if (VariablesGlobales.repo.remote.listaCommits.size() == 1){
            lst2.setVisible(false);
            lst3.setVisible(false);
            
           
            
            lst1.removeAll();
            DefaultListModel<String> model = new DefaultListModel<>();
            lst1.setModel(model);

            List<TextoArchivo> listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 1).getArchivos();

            txt1.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "autor"));
            txt2.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "comentario"));
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }
        }
        
        if (VariablesGlobales.repo.remote.listaCommits.size() == 2){
            lst3.setVisible(false);
            
            lst1.removeAll();
            DefaultListModel<String> model = new DefaultListModel<>();
            lst1.setModel(model);

            List<TextoArchivo> listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 1).getArchivos();

            txt1.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "autor"));
            txt2.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "comentario"));
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }

            lst2.removeAll();
            model = new DefaultListModel<>();
            lst2.setModel(model);

            listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 2).getArchivos();

            txt3.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 2).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 2), "autor"));
            txt4.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 2).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 2), "comentario"));            
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }            
            
            
        }        

        if (VariablesGlobales.repo.remote.listaCommits.size() > 2){

            lst1.removeAll();
            DefaultListModel<String> model = new DefaultListModel<>();
            lst1.setModel(model);

            List<TextoArchivo> listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 1).getArchivos();

            txt1.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "autor"));
            txt2.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 1).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 1), "comentario"));
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }

            lst2.removeAll();
            model = new DefaultListModel<>();
            lst2.setModel(model);

            listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 2).getArchivos();

            txt3.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 2).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 2), "autor"));
            txt4.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 2).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 2), "comentario"));            
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }            
            
            lst3.removeAll();
            model = new DefaultListModel<>();
            lst3.setModel(model);

            listarArchivos = VariablesGlobales.repo.remote.listaCommits.get(largo - 3).getArchivos();

            txt5.setText("El autor del ultimo commit creado es " + VariablesGlobales.repo.remote.listaCommits.get(largo - 3).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 3), "autor"));
            txt6.setText(" con el comentario " + VariablesGlobales.repo.remote.listaCommits.get(largo - 3).datoGet(VariablesGlobales.repo.remote.listaCommits.get(largo - 3), "comentario"));
            
            for(int i = 0 ; i < listarArchivos.size() ; i++)
            {
                model.addElement(listarArchivos.get(i).nombre);
            }             
            
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst3 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst1 = new javax.swing.JList<>();
        txt6 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Los ultimos 3 commits son:");

        lst3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst3);

        lst2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst2);

        lst1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lst1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaRemoteRepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRemoteRepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRemoteRepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRemoteRepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRemoteRepo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lst1;
    private javax.swing.JList<String> lst2;
    private javax.swing.JList<String> lst3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    // End of variables declaration//GEN-END:variables
}
