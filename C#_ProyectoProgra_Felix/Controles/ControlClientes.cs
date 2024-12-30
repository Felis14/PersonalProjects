using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Controles
{
    class ControlClientes
    {
        //En esta clase estan los controles para bloquear y limpiar los campos en los diferentes formularios de clientes
        public void BloquearObjetosBuscar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            txt1.Enabled = true;
            txt2.Enabled = false;
            txt3.Enabled = false;
            txt4.Enabled = false;
            txt5.Enabled = false;
            dtp1.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
        }
        public void AlternarObjetosBuscar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            txt1.Enabled = !txt1.Enabled;
            txt2.Enabled = !txt2.Enabled;
            txt3.Enabled = !txt3.Enabled;
            txt4.Enabled = !txt4.Enabled;
            txt5.Enabled = !txt5.Enabled;
            dtp1.Enabled = !dtp1.Enabled;
            btn1.Enabled = !btn1.Enabled;
            btn2.Enabled = !btn2.Enabled;
        }
        public void LimpiarObjetosBuscar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
        }
        public void LimpiarObjetosConsultar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
        }
        public void LimpiarObjetosModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
        }
        public void BloquearObjetosModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            txt1.ReadOnly = false; 
            txt2.ReadOnly = true; //Para mejor apreciación del texto, no se desactiva, pero se bloquea el poder escribir
            txt3.ReadOnly = true;
            txt4.ReadOnly = true;
            txt5.ReadOnly = true;
            dtp1.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
        }
        public void DesbloquearObjetosModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, DateTimePicker dtp1, Button btn1, Button btn2)
        {
            txt1.ReadOnly = true;
            txt2.ReadOnly = false;
            txt3.ReadOnly = false;
            txt4.ReadOnly = false;
            txt5.ReadOnly = false;
            dtp1.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = true;
        }
    }
}
