/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 * Richiamo origine progetto.
 */
package climatemonitoring;
/**
 * Importazione del separatore dalla classe main 'ClimateMonitor'
 */
import static climatemonitoring.ClimateMonitor.sep;
/**
 * Richiamo Librerie di Java
 */
import java.awt.Dimension;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author 753546 Badrous Giorgio William
 * @author 753540 Casati Simone
 * @author 754772 Biavaschi Raffaele
 * @author 755531 Bonacina Davide
 */
public class CentroMonitoraggio extends javax.swing.JDialog {
    /**
     * Creo oggetto statico di nome 'hh' di tipo 'Home' 
     */
    static Home hh;
    /**
    * Dichirazione dettagli per la connessione al Database
    */
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/ClimateMonitoring";
    private static final String DB_USER = "postgres";
    private static final String DB_PASS = "password";
    /**
     * Costruttore <strong>parametrizzato</strong> per bloccare la finestra sottostante e creare il form di inserimento
     * @param hh oggetto, di tipo 'Home'
     * @param ck boolean, da classe finestra home 'base'
     */
    public CentroMonitoraggio(Home hh, boolean ck) {
        /**
         * 'Super' per puntare alla classe genitore, da cui eredito metodi e parametri
         */
        super(hh, ck);
        /**
         * 'This' per puntare al riferimento di una oggetto presente nella classe corrente
         */
        this.hh=hh;
        /**
         * Metodo base di Netbeans (Swing designer, parte grafica) per inizializzare il componente
         */
        initComponents();
        /**
         * Metodo per recuperare la dimensione del display, per creare una finestra coerente
         */
        Dimension dim = getToolkit().getScreenSize();
        /**
         * Metodo per posizione la finestra
         */
        this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        /**
         * 'This' per puntare al riferimento di una metodo presente nella classe corrente (setto titolo)
         */
        this.setTitle("Inserisci Centro");
        /**
         * Metodo per rendere visibile la finestra
         */
        setVisible(true);
        /**
         * Metodo per bloccare la possibilità di ridimensionare la finestra
         */
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCentro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        indirizzo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inserisci = new javax.swing.JButton();
        area = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inserimento Centri Monitoraggio");

        jLabel2.setText("Nome Centro Monitoraggio");

        jLabel3.setText("Indirizzo fisico");

        jLabel4.setText("Elenco aree di interesse");

        inserisci.setBackground(new java.awt.Color(255, 153, 0));
        inserisci.setText("Inserisci");
        inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciActionPerformed(evt);
            }
        });

        area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                areaFocusGained(evt);
            }
        });

        jLabel5.setText("Separa con virgola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserisci)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indirizzo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(nomeCentro)
                            .addComponent(area))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(inserisci)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo che al click del bottone esegue l'inserimennto del centro di monitoraggio (richiama metodo 'registraCentroAree')
     * verifica se mancano parte delle credenziali richieste
     * @param evt click del bottone
     * @throws IOException eccezzione per mancanza file, directory errata
     */
    private void inserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciActionPerformed
        /**
         * Variabili impostate su valore iniziale
         */
        boolean check=true; ArrayList<String> errore=new ArrayList<String>();int c=0;
        /**
         * Controlla se nomeCentro uguale a ' ' (vuoto), se vuoto check su valore 'falso'
         */
        if(nomeCentro.getText().equals("")){check=false;errore.add("Nome Centro Monitoraggio");c++;}
        /**
         * Controlla se indirizzo uguale a ' ' (vuoto), se vuoto check su valore 'falso'
         */
        if(indirizzo.getText().equals("")){check=false;errore.add("Indirizzo fisico");c++;}
        /**
         * Controlla se area uguale a ' ' (vuoto), se vuoto check su valore 'falso'
         */
        if(area.getText().equals("")){check=false;errore.add("Elenco aree di interesse");c++;}
        /**
         * Controlla se check diverso da vero, se uguale a vero prosegue 
         * mostrando l'errore se falso invece prosegue con l'inserimento
         */
        if(!check){
            /**
             * Variabili stringa f, vuota
             */
            String f = "";
            for(String s : errore){ f+="\n-"+s ;}
            /**
             * Generazione finestra di errore con specifica dell'errore (parametro mancante)
             */
            JOptionPane.showMessageDialog(null, "Non hai inserito: " +f,"Errore!", JOptionPane.ERROR_MESSAGE);
        }else{
            /**
             * Esegue il metodo d'inserimento, controllato per evitare innalzamento di eccezioni
             */
            try {
                /**
                 * Richiamo funzione registraCentroAree
                 */
                registraCentroAree();
                /**
                 * Chiusura finestra corrente a inserimento eseguito
                 */
                this.dispose();
            } catch (IOException ex) {
                /**
                 * Cattura errore in caso di mancato funzionamento del metodo 'registraCentroAree'
                 */
                Logger.getLogger(Registrazione.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_inserisciActionPerformed
    /**
     * Metodo non utilizzato
     */
    private void areaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaFocusGained
        // ...
    }//GEN-LAST:event_areaFocusGained

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
            java.util.logging.Logger.getLogger(CentroMonitoraggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroMonitoraggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroMonitoraggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroMonitoraggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /**
         * Creazione e visualizzazione del form di inserimento (per inserimento valori) 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CentroMonitoraggio dialog = new CentroMonitoraggio(hh, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    /**
     * Metodo per l'inserimento, forniti i parametri dall'utente
     * inserisce all'interno del file 'CentroMonitoraggio.dati' 
     * con implementazione dell'eccezioni (se presenti)
     * Senza parametri perché recuperati dalle TextField
     * @throws IOException eccezione per mancanza file, directory errata
     */
    public void registraCentroAree() throws IOException{
        boolean check = true;
        ArrayList<String> errore = new ArrayList<String>();
        int c = 0;

        if (nomeCentro.getText().equals("")) {
            check = false;
            errore.add("Nome Centro Monitoraggio");
            c++;
        }

        if (indirizzo.getText().equals("")) {
            check = false;
            errore.add("Indirizzo fisico");
            c++;
        }

        if (area.getText().equals("")) {
            check = false;
            errore.add("Elenco aree di interesse");
            c++;
        }

        if (!check) {
            String f = "";
            for (String s : errore) {
                f += "\n-" + s;
            }
            JOptionPane.showMessageDialog(null, "Non hai inserito: " + f, "Errore!", JOptionPane.ERROR_MESSAGE);
        } else {
            Connection conn = null;
            PreparedStatement stmt = null;

            try {
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

                String query = "INSERT INTO centromonitoraggio (nome, indirizzo, areainteresse) VALUES (?, ?, ?)";
                stmt = conn.prepareStatement(query);
                stmt.setString(1, nomeCentro.getText());
                stmt.setString(2, indirizzo.getText());
                stmt.setString(3, area.getText());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Centro di monitoraggio inserito con successo!");

                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(CentroMonitoraggio.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CentroMonitoraggio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JTextField indirizzo;
    private javax.swing.JButton inserisci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeCentro;
    // End of variables declaration//GEN-END:variables
}
