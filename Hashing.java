import java.util.Hashtable;
public class Hashing extends javax.swing.JFrame {

/** Creates new form Hashing */
public Hashing() 
{
   initComponents();
}

@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() 
{

   word = new javax.swing.JTextField();
   add = new javax.swing.JButton();
   searchKey = new javax.swing.JTextField();
   search = new javax.swing.JButton();
   output = new javax.swing.JLabel();

   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

   add.setText("Add word to the hashtable");
   add.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) 
{
   addActionPerformed(evt);
}
});

search.setText("Search word from the hashtable");
search.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
searchActionPerformed(evt);
}
});

output.setText(" ");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(39, 39, 39)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(search))
.addGroup(layout.createSequentialGroup()
.addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
.addGroup(layout.createSequentialGroup()
.addGap(231, 231, 231)
.addComponent(output)))
.addContainerGap(62, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(56, 56, 56)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(add))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(search))
.addGap(40, 40, 40)
.addComponent(output)
.addContainerGap(50, Short.MAX_VALUE))
);

pack();
}
// </editor-fold>

private void addActionPerformed(java.awt.event.ActionEvent evt) 
{
// TODO add your handling code here:
   hash.put(word.getText(), Integer.valueOf((int)(Math.random()*100)));
}

private void searchActionPerformed(java.awt.event.ActionEvent evt) 
{
   // TODO add your handling code here:
   Integer n = hash.get(searchKey.getText());
   if (n != null)
      output.setText("found");
   else
      output.setText("not found");
}

/**
* @param args the command line arguments
*/
public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
   try 
   {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
      {
         if ("Nimbus".equals(info.getName())) 
         {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
         }
      }
   } 
   
catch (ClassNotFoundException ex) 
{
   java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 
catch (InstantiationException ex) 
{
   java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 
catch (IllegalAccessException ex) 
{
   java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} 

catch (javax.swing.UnsupportedLookAndFeelException ex) 
{
   java.util.logging.Logger.getLogger(Hashing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() 
{

   @Override
   public void run() 
   {
      new Hashing().setVisible(true);
   }
});
}

private javax.swing.JButton add;
private javax.swing.JLabel output;
private javax.swing.JButton search;
private javax.swing.JTextField searchKey;
private javax.swing.JTextField word;
// End of variables declaration

Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
}