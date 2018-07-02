import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class imagefolder
{
	public imagefolder(String filepath)
	{
		SwingUtilities.invokeLater(new Runnable()
				{
				public void run()
				{
					JFrame frame = new JFrame(filepath);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					BufferedImage img = null;
				try
				{
					img = ImageIO.read(new File(filepath));
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				JLabel lbl = new JLabel();
				lbl.setIcon(new ImageIcon(img));
				frame.getContentPane().add(lbl, BorderLayout.CENTER);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				}
				});
	}
	public static void main(String[] args)
	{
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(fc);
		String filepath = null;
		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			filepath = fc.getSelectedFile().getAbsolutePath();
		}
		else
		{
			System.out.println("User clicked CANCEL");
			System.exit(1);
		}
		new imagefolder(filepath);
	}
}