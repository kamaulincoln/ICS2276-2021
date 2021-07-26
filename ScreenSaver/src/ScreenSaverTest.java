import javax.swing.JFrame;

public class ScreenSaverTest{

	public static void main(String[] args) {
		ScreenDraw screen = new ScreenDraw();
		JFrame app = new JFrame("Screen Saver...ish");
		app.add(screen);
		app.setSize(300,300);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
