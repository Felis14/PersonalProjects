using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Controles
{
    class ControlMovimientos
    {
        //En esta clase estan los controles para bloquear y limpiar los campos en los diferentes formularios de movimientos
        public void BloquearObjetosRegistrar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, DateTimePicker dtp1, ComboBox cb3, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            cb2.Enabled = false;
            txt2.Enabled = false;
            dtp1.Enabled = false;
            cb3.Enabled = false;
            txt3.Enabled = false;
            txt4.Enabled = false;
            txt5.Enabled = false;
            btn1.Enabled = false;
        }
        public void DesbloquearObjetosRegistrar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, DateTimePicker dtp1, ComboBox cb3, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = true;
            txt2.Enabled = true;
            dtp1.Enabled = false;
            cb3.Enabled = false;
            txt3.Enabled = false;
            txt4.Enabled = false;
            txt5.Enabled = false;
            btn1.Enabled = false;
        }
        public void DesbloquearTodoRegistrar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, DateTimePicker dtp1, ComboBox cb3, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            dtp1.Enabled = true;
            cb3.Enabled = true;
            txt3.Enabled = true;
            txt4.Enabled = true;
            txt5.Enabled = true;
            btn1.Enabled = true;
        }
        public void LimpiarTodoRegistrar(TextBox txt1, ComboBox cb1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            cb1.Items.Clear();
        }
        public void LimpiarRegistrar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
        }
        public void BuscandoClienteConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, ComboBox cb3, TextBox txt3, Button btn1, Button btn2, Button btn3, Button btn4, Button btn5)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            btn1.Enabled = true;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn2.Enabled = false;
            cb3.Enabled = false;
            txt3.Enabled = false;
            btn3.Enabled = false;
            btn4.Enabled = false;
            btn5.Enabled = false;
        }
        public void BuscandoCuentaConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, ComboBox cb3, TextBox txt3, Button btn1, Button btn2, Button btn3, Button btn4, Button btn5)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            btn1.Enabled = false;
            cb2.Enabled = true;
            txt2.Enabled = true;
            btn2.Enabled = true;
            cb3.Enabled = false;
            txt3.Enabled = false;
            btn3.Enabled = false;
            btn4.Enabled = true;
            btn5.Enabled = false;
        }
        public void BuscandoMovimientoConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, ComboBox cb3, TextBox txt3, Button btn1, Button btn2, Button btn3, Button btn4, Button btn5)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            btn1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn2.Enabled = false;
            cb3.Enabled = true;
            txt3.Enabled = true;
            btn3.Enabled = true;
            btn4.Enabled = true;
            btn5.Enabled = false;
        }
        public void BloquearTodoConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, ComboBox cb3, TextBox txt3, Button btn1, Button btn2, Button btn3, Button btn4, Button btn5)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            btn1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn2.Enabled = false;
            cb3.Enabled = false;
            txt3.Enabled = false;
            btn3.Enabled = false;
            btn4.Enabled = true;
            btn5.Enabled = true;
        }
        public void LimpiarCuentaConsultar(TextBox txt1, ComboBox cb1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7)
        {
            txt1.Text = "";
            cb1.Items.Clear(); //borra los items de un combo box
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt7.Text = "";
        }
        public void LimpiarMovimientoConsultar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
        }
        public void LimpiarTodoConsultar(TextBox txt1, ComboBox cb1, TextBox txt2, ComboBox cb2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7, TextBox txt8)
        {
            txt1.Text = "";
            cb1.Items.Clear(); //borra los items del combo box
            txt2.Text = "";
            cb2.Items.Clear();
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt7.Text = "";
            txt8.Text = "";
        }
    }
}
