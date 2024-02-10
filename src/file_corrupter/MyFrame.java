package file_corrupter;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JButton button2;
	JLabel label;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		button2 = new JButton("Corrupt");
		
		this.add(button);
		this.add(button2);
		this.pack();
		this.setVisible(true);
		
		this.setResizable(false);
		this.setSize(250, 350);
		this.setLocation(700, 180);
		
		Dimension size = button2.getPreferredSize();
		this.button2.setLocation(100,100);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			
			JFileChooser filechooser = new JFileChooser();
			
			int response = filechooser.showOpenDialog(null);
			
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}

}
}
