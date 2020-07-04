import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import observer.Observer;

public class Panneau extends JPanel implements Observer {

	private JLabel valeur = new JLabel("0");
	private JButton incrementer = new JButton("+1");

	public Panneau() {
		add(valeur);
		add(incrementer);
		incrementer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				incrementer();
			}
		});

	}

	private void incrementer() {
		int i = Integer.parseInt(valeur.getText());
		i++;
		valeur.setText(String.valueOf(i));
	}

	@Override
	public void update() {
		incrementer();

	}

}
