import Control.ControlContraseña;
import Control.ControlPrincipal;
import Ventanas.VentanaContraseña;
import Ventanas.VentanaPrincipal;
public class Main {
    static void main() {
        //VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        //VentanaPrincipal VentanaPrincipal = new VentanaPrincipal();
        //ControlPrincipal controlador = new ControlPrincipal(VentanaPrincipal);
        VentanaContraseña ventanaPassword = new VentanaContraseña();
        ControlContraseña controladorPassword = new ControlContraseña(ventanaPassword);
    }

}