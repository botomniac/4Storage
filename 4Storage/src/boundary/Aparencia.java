/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

import javax.swing.UIManager;


public class Aparencia {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new GraphiteLookAndFeel());
			new TelaInicial().setVisible(true);

		} catch (Exception e) {

		}

	}

}
