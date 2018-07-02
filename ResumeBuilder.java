import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResumeBuilder
{
	protected static final String[] ImportWords = null;
	JFrame f;
	ResumeBuilder()
	{
		f=new JFrame("Resume Score");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(320,100);
		JButton browsejob=new JButton("Browse Resume");
		browsejob.setBounds(70,175,200,25);
		JButton Initiate=new JButton("Initiate Check");
		Initiate.setBounds(70,220,200,25);
		JButton b=new JButton("Store");
		b.setBounds(200,100,75,20);
		String JobType[]= {"Project Management","Procurement Agent"};
		final JComboBox cb=new JComboBox(JobType);
		cb.setBounds(50,100,150,20);
		f.add(cb); f.add(label); f.add(b); f.add(browsejob); f.add(Initiate);
		f.setLayout(null);
		f.setSize(350,350);
		f.setVisible(true); 
		String[] myArray = new String[10];
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String data = "Job Type Selected: " + cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
				String typeofjob = (String) cb.getSelectedItem();
				
				System.out.println(typeofjob + " was selected! Now Browse for your Resume!");
				
				if (typeofjob == "Project Management")
				{
					myArray[0] = "Project Management";
					myArray[1] = "Risk Analysis";
					myArray[2] = "Earned Value Metrics";
					myArray[3] = "Agile";
					myArray[4] = "PMP";
					myArray[5] = "Change Management";
					myArray[6] = "BCWS";
					myArray[7] = "BCWP";
					myArray[8] = "Program Manager";
					myArray[9] = "Cost Analysis";
				}
				
				if (typeofjob == "Procurement Agent")
				{
					myArray[0] = "Procurement Agent";
					myArray[1] = "Parts List";
					myArray[2] = "Procurement Cycle";
					myArray[3] = "Supply Chain Management";
					myArray[4] = "Contracting";
					myArray[5] = "NetWorks Procurement";
					myArray[6] = "Data Analysis";
					myArray[7] = "Contract";
					myArray[8] = "Delivery Management";
					myArray[9] = "Material  Management";
				}
				System.out.println(Arrays.deepToString(myArray));
			}
		});
		 
		browsejob.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(fc);
				if (returnVal == JFileChooser.APPROVE_OPTION)
				{
					System.out.println	("Resume Uploaded");
				}
				else
				{
					System.out.println("User clicked CANCEL");
					System.exit(1);
				}
			}
		});
		
		Initiate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			
			
			}	
		});
	}	
	public static void main(String[] args)
	{
		new ResumeBuilder();
	}
}