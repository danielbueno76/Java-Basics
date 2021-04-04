import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;
	JTextArea areaDeTextoSuperior;
	JTextArea areaDeTextoInferior;
	public void configuracionVentanaChat() {
		this.setTitle("Chat de la practica 10 de DAD");
		this.setSize(530, 450);
		this.setLayout(new FlowLayout());
		areaDeTextoSuperior = new JTextArea();
		areaDeTextoSuperior.setPreferredSize(new Dimension(500,375));
		areaDeTextoSuperior.setLineWrap(true);
		areaDeTextoSuperior.setEditable(false);
		areaDeTextoSuperior.setBackground(Color.LIGHT_GRAY);
		
		areaDeTextoInferior = new JTextArea();
		areaDeTextoInferior.setPreferredSize(new Dimension(500,18));
		areaDeTextoInferior.setLineWrap(true);	
		areaDeTextoSuperior.setEditable(false);
		areaDeTextoInferior.setBackground(Color.pink);
		areaDeTextoInferior.addKeyListener(this);
		
		this.add(areaDeTextoSuperior);	
		this.add(areaDeTextoInferior);	
		this.setVisible(true);
	}
	public void escribirEnAreaDeTextoSuperior(String mensaje) {
		areaDeTextoSuperior.append(mensaje+"\n");
		
		
	}
	public void keyPressed(KeyEvent pulsacion) {
		if(pulsacion.getKeyCode()==KeyEvent.VK_ENTER) {
			String mensaje = areaDeTextoInferior.getText();
			System.out.println(mensaje);
			areaDeTextoInferior.setText(null);
			pulsacion.consume();
		}
		
	}
	@Override
	public void keyTyped(KeyEvent pulsacion) {

		
	}
	@Override
	public void keyReleased(KeyEvent pulsacion) {

		
	}
	
	

}