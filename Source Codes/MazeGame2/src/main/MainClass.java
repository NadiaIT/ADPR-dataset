package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainClass {
	public static void main(String[] args) {
		setNimbus();
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		final Painter painter = new Painter();
		painter.setOpaque(false);
		
		
		JPanel controlPainter = new JPanel();
		
		// ControlPainter
		controlPainter.setLayout(new GridLayout(0, 1));
		JButton drawLevel1 = new JButton("Draw Level:1 (WoodenWall+FixedDoor)");
		JButton drawLevel2 = new JButton("Draw Level:2 (GlassWall+SlidingDoor)");
		JLabel label1 = new JLabel("Set Maze height");
		final JSlider mazeHeight = new JSlider();
		mazeHeight.setMinimum(100);
		mazeHeight.setMaximum(300);
		mazeHeight.setPaintTicks(true);
		mazeHeight.setValue(200);
		mazeHeight.setMajorTickSpacing(50);
		mazeHeight.setMinorTickSpacing(10);
		mazeHeight.setPaintLabels(true);
		JLabel label2 = new JLabel("Set Maze size");
		final JSlider mazeWidth = new JSlider();
		mazeWidth.setMinimum(100);
		mazeWidth.setMaximum(300);
		mazeWidth.setPaintTicks(true);
		mazeWidth.setValue(200);
		mazeWidth.setMajorTickSpacing(50);
		mazeWidth.setMinorTickSpacing(10);
		mazeWidth.setPaintLabels(true);
		final JLabel typelabel=new JLabel("Level 1");
		drawLevel1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				painter.setLevel(new MazeLevel1Builder());
				typelabel.setText("Level 1");
			}
		});
		drawLevel2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				painter.setLevel(new MazeLevel2Builder());
				typelabel.setText("Level 2");
			}
		});

		mazeHeight.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				painter.setMazeSize(mazeHeight.getValue(), mazeWidth.getValue());
			}
		});

		mazeWidth.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				painter.setMazeSize(mazeHeight.getValue(), mazeWidth.getValue());
			}
		});

		controlPainter.add(typelabel);
		controlPainter.add(drawLevel1);
		controlPainter.add(drawLevel2);
		controlPainter.add(label1);
		controlPainter.add(mazeHeight);
		controlPainter.add(label2);
		controlPainter.add(mazeWidth);
		frame.add(controlPainter, BorderLayout.WEST);
		
		
		frame.add(painter, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}

	public static void setNimbus() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
	}
}
