import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GUIsort extends JFrame {

	public static void main(String[] args) throws IOException{

		FileReader file = new FileReader("inventory.txt");
		BufferedReader data = new BufferedReader(file);

		String[] dataInsert = new String[10]; 
		String[] dataMerge = new String[10]; 
		String[] dataQuick = new String[10]; 

		
		for (int i = 0; i < dataInsert.length; i++){
			dataInsert[i] = data.readLine();
		}
		dataMerge = dataInsert;
		dataQuick = dataInsert;

      
	   long startTime = System.nanoTime();
      InsertionSort.Sort(dataInsert, 10);
		long insertTime = System.nanoTime() - startTime;

		MergeSort.Sort(dataMerge);
		long mergeTime = System.nanoTime() - insertTime;

		QuickSort.Sort(dataQuick);
		long quickTime = System.nanoTime() - mergeTime;
      
      
      JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Sorting Algorithm Comparison");
		frame.setResizable(false);
      
		JPanel panel = new JPanel();

		JButton button1 = new JButton("Insertion Sort");
		JButton button2 = new JButton("Merge Sort");
		JButton button3 = new JButton("Quick Sort");

		button1.setPreferredSize(new Dimension(125, 75));
		button2.setPreferredSize(new Dimension(125, 75));
		button3.setPreferredSize(new Dimension(125, 75));

		JTextArea textArea = new JTextArea(25, 50);
		textArea.setText("");

		JScrollPane scrollBar1 = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		frame.add(panel);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
 
		class listenForButton implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button1){
					textArea.append("\nThe Insertion Sort elapsed: " + insertTime);
				}
			}
		}

		class listenForButton2 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button2){
					textArea.append("\nThe Merge Sort elapsed: " + mergeTime);
				}
			}
		}

		class listenForButton3 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button3){
					textArea.append("\nThe Quick Sort elapsed: " + quickTime);

				}
			}
		}

		listenForButton insortButton = new listenForButton();
		listenForButton2 mergeButton = new listenForButton2();
		listenForButton3 quickButton = new listenForButton3();


		button1.addActionListener(insortButton);
		button2.addActionListener(mergeButton);
		button3.addActionListener(quickButton);

		panel.add(scrollBar1);

		frame.setVisible(true);

	}



}
