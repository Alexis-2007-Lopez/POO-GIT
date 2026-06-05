package Ejemplo1;
import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
public class ComboNombres implements ComboBoxModel {
    private ArrayList<String> nombres;
    private String selectedItem;
    public ComboNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }
    public ArrayList<String> getNombres() {
        return nombres;
    }
    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }
    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (String) anItem;
    }
    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    @Override
    public int getSize() {
        return 0;
    }
    @Override
    public Object getElementAt(int index) {
        return null;
    }
    @Override
    public void addListDataListener(ListDataListener l) {

    }
    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}