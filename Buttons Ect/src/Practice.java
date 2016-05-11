import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Practice extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static String name;
		static int test1;
		static JFrame frame = new JFrame();
		public static void main(String[] args)
		{
			name = JOptionPane.showInputDialog("What is your name?");
			JOptionPane.showMessageDialog(frame, "Hello, "+name);
			Object[] age = {18, 21, 31, 41,51,61,71,81};
			test1 = JOptionPane.showOptionDialog(frame, "What is your age? Or the closest one to it.",
					"Your Age",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, age, age[0]
					);
			switch (test1)
			{
				case 0:
						{
							JOptionPane.showMessageDialog(frame, "Ok, a young one, get a parents permission before continuing");
							break;
						}
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Go out and have fun tonight!");
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Good luck");
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Alright");
							break;
						}
				case 4:
						{
							JOptionPane.showMessageDialog(frame, "OK");
							break;
						}
				case 5:
						{
							JOptionPane.showMessageDialog(frame, "Viv please end my life");
							break;
						}
				case 6:
						{
							JOptionPane.showMessageDialog(frame, "OK again");
							break;
						}
				case 7:
						{
							JOptionPane.showMessageDialog(frame, "You shouldn't be spending the last few days of your life on this program.");
							break;
						}
			}
					
		}
		
	}
