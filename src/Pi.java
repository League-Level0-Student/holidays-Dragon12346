import java.net.URI;

import javax.swing.JOptionPane;

public class Pi {
	public static void main(String[] args) {
		String pi = "3.1415926535897";
		// for (int i = 0; i < 4; i++) {
		// System.out.println(pi.charAt(i));
		// }
		for (int i = 0; i < pi.length(); i++) {
			String in = JOptionPane.showInputDialog("What is the next digit of pi?!?!?!?!?!?");
			char p = pi.charAt(i);
			String g = Character.toString(p);

			if (g.equals(in)) {
				JOptionPane.showMessageDialog(null, "GG, fam");
				System.out.println(in);
			} else {
				JOptionPane.showMessageDialog(null, "NIEN!");
				System.exit(0);
			}

		}
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
