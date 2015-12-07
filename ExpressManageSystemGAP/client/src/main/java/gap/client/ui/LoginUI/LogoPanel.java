package gap.client.ui.LoginUI;

import gap.client.ui.UITools.ColorAndFonts;
import gap.client.ui.UITools.RenderSetter;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class LogoPanel extends JPanel {
	float alpha = 0;
	String bayMax = LoginConfig.bayMax;

	public LogoPanel() {
		setBounds(0, 0, LoginConfig.width, LoginConfig.animationHeight);
		setOpaque(false);
		addMouseListener(new Listener());
		// addMouseListener(new MoveListener(LoginFrame.getFrame()));
	}

	public void startAnimation() {
		new LogoAnimation().start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D graphics2d = RenderSetter.OpenRender(g);
		if (alpha < 1f) {
			AlphaComposite composite = AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, alpha);
			graphics2d.setComposite(composite);
		}

		graphics2d.setFont(ColorAndFonts.getChinese(25));

		graphics2d.setColor(new Color(0, 0, 0, 100));
		int diff = 2;
		int x1 = 110;
		int y1 = 130;
		int x2 = 165;
		int y2 = 90;
		graphics2d.drawString(LoginConfig.softwareName, x1 + diff, y1 + diff);
		graphics2d.drawString(bayMax, x2 + diff, y2 + diff);

		graphics2d.setColor(Color.white);
		graphics2d.drawString(LoginConfig.softwareName, x1, y1);
		graphics2d.drawString(bayMax, x2, y2);

	}

	class LogoAnimation extends Thread {

		float step = 0.05f;
		long idle = 30;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			alpha = 0;
			while (alpha < 0.99) {
				alpha += step;
				repaint();
				try {
					Thread.sleep(idle);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			alpha = 0.99f;

		}
	}

	class Listener implements MouseListener {

		int count = 0;
		int dizzNum = 3;

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if (count <= dizzNum) {
				bayMax = LoginConfig.bayMaxBlink;
			}
			count++;
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			if (count <= dizzNum) {
				bayMax = LoginConfig.bayMax;
			} else {
				bayMax = LoginConfig.bayMaxDizz;
			}
			repaint();
		}

	}
}
