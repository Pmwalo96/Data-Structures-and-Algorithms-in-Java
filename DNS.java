import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class DNS extends JPanel
{
   private File f;
   private JTextArea a;
   
   public DNS() throws IOException
   {
      a = new JTextArea(50,50);
      JFileChooser c = new JFileChooser();
      int memo = c.showOpenDialog(null);
      if(memo != JFileChooser.APPROVE_OPTION)
      {
         a.setText("You did not select a file.");
      }
      else
      {
         f = c.getSelectedFile();
         FileReader r = new FileReader(f);
         BufferedReader fi = new BufferedReader(r);
         String q = "";
         String rl = fi.readLine();
         while(rl != null)
         {
            q += rl + "\n";
            rl = fi.readLine();
         }
         a.setText(q);
      }
      JButton sb = new JButton("This is where you save");
      sb.addActionListener(new SaveListener());
      setLayout(new BorderLayout());
      add(sb, BorderLayout.SOUTH);
      add(a, BorderLayout.CENTER);
    }
    private void sf()
    {
      if(f == null)
      {
         a.setText("The file has not been saved.");
      }
      else
      {
         try
         {
            FileWriter w = new FileWriter(f);
            BufferedWriter res = new BufferedWriter(w);
            res.write(a.getText());
            res.close();
            a.setText("The file has been saved in " + f);
         }
         catch(IOException e)
         {
            a.setText("The file has not been saved.");
         }
      }
    }
    class SaveListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
         sf();
      }
    }
 }
      
   