package Control;
import Ventanas.VentanaContraseña;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
public class ControlContraseña implements MouseListener, KeyListener {
    private VentanaContraseña vista;
    public ControlContraseña(VentanaContraseña vista){
        this.vista = vista;
        this.vista.getBtnLogin().addMouseListener(this);
        this.vista.getTxtPassword().addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            validarAcceso();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.getBtnLogin()){
            validarAcceso();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void validarAcceso(){
        String usuario = vista.getTxtUsername().getText();
        String password = vista.getTxtPassword().getText();

        if (usuario.equals("Alexx") && password.equals("1972")) {
            JOptionPane.showMessageDialog(vista, "¡Carga Realizada!");
        } else {
            JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}