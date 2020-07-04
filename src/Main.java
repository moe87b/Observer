import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public static void main(String[] args) {

		Panneau p = new Panneau();
		Fenetre f = new Fenetre();
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("menu");
		JMenuItem item = new JMenuItem("Increment");

		menubar.add(item);
		f.setJMenuBar(menubar);
		f.getContentPane().add(p);

		f.addObserver(p);

		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.notifyObservers();
			}
		});

		f.pack();
		f.setResizable(false);
		f.setVisible(true);

	}

}
