package Utilitario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ControlObjetos {
    public void BloquearObjetosRegistrar(JTextField ID, JTextField Name, JTextField RegDate, JTextField Birth, 
    JTextField TelF, JTextField TelM, JTextField Email, JButton botonBuscar, JButton botonReg) {
        ID.setEditable(true);
        Name.setEditable(false);
        RegDate.setEditable(false);
        Birth.setEditable(false);
        TelF.setEditable(false);
        TelM.setEditable(false);
        Email.setEditable(false);
        botonBuscar.setEnabled(true);
        botonReg.setEnabled(false);
    }
    
    public void DesbloquearObjetosRegistrar(JTextField ID, JTextField Name, JTextField RegDate, JTextField Birth, 
    JTextField TelF, JTextField TelM, JTextField Email, JButton botonBuscar, JButton botonReg) {
        ID.setEditable(false);
        Name.setEditable(true);
        RegDate.setEditable(true);
        Birth.setEditable(true);
        TelF.setEditable(true);
        TelM.setEditable(true);
        Email.setEditable(true);
        botonBuscar.setEnabled(false);
        botonReg.setEnabled(true);
    }
    
    public void LimpiarTextosRegistrar(JTextField ID, JTextField Name, JComboBox Dir, JTextField RegDate, JTextField Birth, 
    JComboBox Cat, JTextField TelF, JTextField TelM, JTextField Email) {
        ID.setText("");
        Name.setText("");
        Dir.setSelectedIndex(0);
        RegDate.setText("");
        Birth.setText("");
        Cat.setSelectedIndex(0);
        TelF.setText("");
        TelM.setText("");
        Email.setText("");
        ID.requestFocus();
    }
    
    public void CargarCbCategoria(JComboBox box) {
        box.addItem("Personal");
        box.addItem("Compañero");
        box.addItem("Trabajo");
        box.addItem("Confidencial");
    }
    
    public void BloquearObjetosConsultar(JTextField ID, JTextField Name, JTextField Dir, JTextField RegDate, JTextField Birth, 
    JTextField Cate, JTextField TelF, JTextField TelM, JTextField Email) {
        ID.setEditable(true);
        Name.setEditable(false);
        Dir.setEditable(false);
        RegDate.setEditable(false);
        Birth.setEditable(false);
        Cate.setEditable(false);
        TelF.setEditable(false);
        TelM.setEditable(false);
        Email.setEditable(false);
    }
    
    public void LimpiarTextosConsultar(JTextField ID, JTextField Name, JTextField Dir, JTextField RegDate, JTextField Birth, 
    JTextField Cate, JTextField TelF, JTextField TelM, JTextField Email) {
        ID.setText("");
        Name.setText("");
        Dir.setText("");
        RegDate.setText("");
        Birth.setText("");
        Cate.setText("");
        TelF.setText("");
        TelM.setText("");
        Email.setText("");
        ID.requestFocus();
    }
    
    public void BloquearObjetosEliminar(JTextField ID, JButton BotonBuscar, JButton BotonDel, JComboBox CbContactos) {
        ID.setEditable(true);
        BotonBuscar.setEnabled(true);
        BotonDel.setEnabled(false);
        CbContactos.setEnabled(true);
    }
    
    public void DesbloquearObjetosEliminar(JTextField ID, JButton BotonBuscar, JButton BotonDel, JComboBox CbContactos) {
        ID.setEditable(false);
        BotonBuscar.setEnabled(false);
        BotonDel.setEnabled(true);
        CbContactos.setEnabled(false);
    }
    
    public void LimpiarTextosRegistrarU(JTextField Username, JTextField Password, JTextField Name, JTextField ID, JTextField Email, JTextField RegDate) {
        Username.setText("");
        Password.setText("");
        Name.setText("");
        ID.setText("");
        Email.setText("");
        RegDate.setText("");
        Username.requestFocus();
    }
    
    public void BloquearObjetosEliminarU(JTextField ID, JButton BotonBuscar, JButton BotonDel) {
        ID.setEditable(true);
        BotonBuscar.setEnabled(true);
        BotonDel.setEnabled(false);
    }
    
    public void CargarNivelesUsuarios(JComboBox box) {
        box.addItem("Administrador");
        box.addItem("Operacional");
        box.addItem("Final");
    }
    
    public int EspacioEnBlanco(String texto) {
        int blankspc=0;
        for (int i=0; i<texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                blankspc++;
                break;
            }
        }
        return blankspc;
    }
    
    public int ContraseñasMalas(String texto) {
        texto = texto.toLowerCase();
        int contramala=0; 
        String contrasmalas[] = {"password", "123456", "123456789", "guest", "qwerty", "12345678", "111111", "col123456", "123123",
        "1234567", "1234567890", "0123456789", "012345", "000000", "555555", "222222", "333333", "444444", "666666", "777777", "888888", "999999",
        "123321", "654321", "543210", "012210", "7777777", "d1lakiss", "110110jp", "dragon", "987654321", "9876543210", "000000000000", "111111111111",
        "222222222222", "333333333333", "444444444444", "555555555555", "666666666666", "77777777777", "888888888888", "999999999999", "qwerty123456",
        "qwerty012345", "ytrewq", "654321ytrewq", "ytrewq654321", "baseball", "abc123", "football", "monkey", "letmein", "shadow", "master", "696969",
        "michael", "mustang", "1234...890", "pussy", "superman", "1qaz2wsx", "qazwsx", "fuckyou", "jordan", "killer", "trustno1", "hunter", "buster",
        "asdfgh", "batman", "soccer", "tigger", "charlie", "q1w2e3r4", "q1w2e3", "qweasdzxc", "asdfasdf", "qwer1234"};
        for (int i=0; i<contrasmalas.length; i++) {
            if (texto.equals(""+contrasmalas[i])) {
                contramala++;
            }
        }
        return contramala;
    }
    
    public void LimpiarTextosConsultarU(JTextField user, JTextField pass, JTextField name, JTextField id, JTextField correo,
    JTextField userlvl, JTextField regdate) {
        user.setText("");
        pass.setText("");
        name.setText("");
        id.setText("");
        correo.setText("");
        userlvl.setText("");
        regdate.setText("");
        user.requestFocus();
    }
    
    public void BloquearObjetosModificarU(JTextField user, JTextField pass, JTextField name, JTextField id, JTextField correo,
    JTextField regdate, JButton buscar, JButton modificar) {
        user.setEditable(true);
        pass.setEditable(false);
        name.setEditable(false);
        id.setEditable(false);
        correo.setEditable(false);
        regdate.setEditable(false);
        buscar.setEnabled(true);
        modificar.setEnabled(false);
    }
    
    public void DesbloquearObjetosModificarU(JTextField user, JTextField pass, JTextField name, JTextField id, JTextField correo,
    JTextField regdate, JButton buscar, JButton modificar) {
        user.setEditable(false);
        pass.setEditable(true);
        name.setEditable(true);
        id.setEditable(true);
        correo.setEditable(true);
        regdate.setEditable(true);
        buscar.setEnabled(false);
        modificar.setEnabled(true);
    }
}