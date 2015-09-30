package core;
import javax.swing.*;

import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Jagex.*;
import core.Player.PlayerPreferences;
import core.engine.tools.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Loader extends JPanel implements AppletStub {

	/**
	 * Feel free to figure these as you wish
	 */
	public static final String IP = "127.0.0.1";
	public static final int WORLD = 3;
	public static final double REV = 0.02;
	public static final boolean local = false;

	/**
	 * No need to configure anything lower
	 */
	public static final String URL = "http://oldschool" + PlayerPreferences.PLAYER_WORLD + ".runescape.com/";
	public static final String CONFIG = URL + "jav_config.ws";
	public static Loader ctx;
	public static Properties parameters = new Properties();

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ctx = new Loader();
					ctx.startClient();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void startClient() {
		try {
			readParameters();
			GameClient c = new GameClient();
			c.setStub(this);
			c.init();
			c.start();
			
			JFrame clientFrame = new JFrame("OS-Enhanced - Version: " + REV + "  (World: " + PlayerPreferences.PLAYER_WORLD+")");
			clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			clientFrame.add(c);
			clientFrame.setVisible(true);
			JFrame jf = new JFrame();
			jf.add(this);
			jf.pack();
			paint(this.getGraphics());
			Insets i = jf.getInsets();

			clientFrame.setSize(765 + i.left + i.right, 503 + i.top + i.bottom);
			clientFrame.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readParameters() {
		try {
			URL url = new URL(CONFIG);

			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
			List<String> lines = new ArrayList<>();
			String in;
			while ((in = reader.readLine()) != null)
				lines.add(in);

			for (String line : lines) {
				if (line.contains("param=")) {
					line = line.replace("param=", "");

					String parameterKey = line.substring(0, line.indexOf("="));
					String parameterValue = line.substring(line.indexOf("=") + 1, line.length());
					parameters.put(parameterKey, parameterValue);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void appletResize(int dimensionX, int dimensionY) {
	}

	public String getParameter(String paramName) {
		return (String) parameters.get(paramName);
	}

	public URL getDocumentBase() {
		try {
			return new URL(local ? "http://" + IP : URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public URL getCodeBase() {
		try {
			return new URL(local ? "http://" + IP : URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public AppletContext getAppletContext() {
		return null;
	}

	public boolean isActive() {
		return true;
	}
}