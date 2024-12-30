using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Controles
{
    class ControlCuentas
    {
        //En esta clase estan los controles para bloquear y limpiar los campos en los diferentes formularios de cuentas
        public void BloquearObjetosRegistrar(ComboBox cb1, TextBox txt1, TextBox txt2, TextBox txt3, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            txt2.Enabled = false;
            txt3.Enabled = false;
            dtp1.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
        }
        public void DesbloquearObjetosRegistrar(ComboBox cb1, TextBox txt1, TextBox txt2, TextBox txt3, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            txt2.Enabled = true;
            txt3.Enabled = true;
            dtp1.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = true;
        }
        public void LimpiarObjetosRegistrar(TextBox txt1, TextBox txt2, TextBox txt3)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
        }
        public void BloquearObjetosConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
        }
        public void DesbloquearObjetosConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = true;
            txt2.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = true;
        }
        public void BloquearTodoConsultar(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn1.Enabled = false;
            btn2.Enabled = false;
        }
        public void LimpiarConsultar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt1.DataBindings.Clear();
            txt2.DataBindings.Clear();
            txt3.DataBindings.Clear();
            txt4.DataBindings.Clear();
            txt5.DataBindings.Clear();
            txt6.DataBindings.Clear(); //para evitar que se vuelvan a escribir los datos de la anterior busqueda
        }
        public void LimpiarTodoConsultar(TextBox txt1, ComboBox cb2, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7)
        {
            txt1.Text = "";
            cb2.Items.Clear();
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt7.Text = "";
            txt2.DataBindings.Clear();
            txt3.DataBindings.Clear();
            txt4.DataBindings.Clear();
            txt5.DataBindings.Clear();
            txt7.DataBindings.Clear(); //para evitar que se vuelvan a escribir los datos de la anterior busqueda
        }
        public void BloquearObjetosCondicion(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
            btn3.Enabled = false;
        }
        public void DesbloquearObjetosCondicion(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = true;
            txt2.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = true;
            btn3.Enabled = false;
        }
        public void BloquearTodoCondicion(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            btn1.Enabled = false;
            btn2.Enabled = false;
            btn3.Enabled = true;
        }
        public void BloquearObjetosMontoLimite(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, TextBox txt3, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = true;
            txt1.Enabled = true;
            cb2.Enabled = false;
            txt2.Enabled = false;
            txt3.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
            btn3.Enabled = false;
        }
        public void DesbloquearObjetosMontoLimite(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, TextBox txt3, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = true;
            txt2.Enabled = true;
            txt3.Enabled = false;
            btn1.Enabled = false;
            btn2.Enabled = true;
            btn3.Enabled = false;
        }
        public void BloquearTodoMontoLimite(ComboBox cb1, TextBox txt1, ComboBox cb2, TextBox txt2, TextBox txt3, Button btn1, Button btn2, Button btn3)
        {
            cb1.Enabled = false;
            txt1.Enabled = false;
            cb2.Enabled = false;
            txt2.Enabled = false;
            txt3.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = false;
            btn3.Enabled = true;
        }
    }
}
