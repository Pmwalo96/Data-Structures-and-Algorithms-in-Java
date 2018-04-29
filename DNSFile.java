import java.io.IOException;
import javax.swing.JFrame;
public class DNSFile
{
   public static void main(String[] args) throws IOException
   {
      JFrame z = new JFrame("This will display the file and save it.");
      z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      z.getContentPane().add(new DNS());
      z.pack();
      z.setVisible(true);
   }
}