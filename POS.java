import java.io.StreamCorruptedException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
public class POS
{
   public static void main(String[] args) throws IOException, ClassNotFoundException
   {
      ProgramOfStudy ps = new ProgramOfStudy();
      ProgramOfStudy s = ps.load("ProgramOfStudy");
      ProgramOfStudy pn = new ProgramOfStudy();
      System.out.println("Original record: \n"+s);
      Iterator<Course> t = s.iterator();
      while(t.hasNext())
      {
         Course now = t.next();
         if(!now.getGrade().equals(""))
         {
            pn.addCourse(now);
         }
         
      }
      System.out.println("New record: \n"+pn);
     }
 }
 