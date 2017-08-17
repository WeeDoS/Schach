package GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame{

public GameWindow() {
JPanel testPanel = new JPanel();
testPanel.setPreferredSize(new Dimension(500, 500));

registerWindowListener();

createMenu();

add(testPanel);

pack();

setTitle("Chess with Dices");
setLocation(10, 10);
setResizable(true);

setVisible(true);
}

private void registerWindowListener() {
addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) { 
System.exit(0); 
}
@Override
public void windowDeactivated(WindowEvent e) {
// hier werden wir später unser Spiel pausieren                
}
@Override
public void windowActivated(WindowEvent e) {
// hier werden wir später unser Spiel wieder fortsetzen
}
});
}

private void createMenu() {

JMenuBar menuBar = new JMenuBar();
this.setJMenuBar(menuBar);

JMenu fileMenu = new JMenu("File");
JMenu gameMenu = new JMenu("Game");
JMenu prefMenu = new JMenu("Preferences");

menuBar.add(fileMenu);
menuBar.add(gameMenu);
menuBar.add(prefMenu);

addFileMenuItems(fileMenu);

}

private void addFileMenuItems(JMenu fileMenu) {

JMenuItem quitItem = new JMenuItem("Quit");
fileMenu.add(quitItem);
quitItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}); 
}
}