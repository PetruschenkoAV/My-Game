import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Okno extends JPanel {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JPanel L;
		Image img = new ImageIcon("/MyGame/src/room.jpg").getImage();
		public Okno() {
			L = new JPanel();
			add(L);
		}
		public void paint(Graphics g){
			g = (Graphics2D) g;
			g.drawImage(img, 0, 0, null);
			
		}
}