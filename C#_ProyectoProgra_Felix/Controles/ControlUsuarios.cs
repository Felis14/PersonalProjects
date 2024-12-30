using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cotidiano3_Felix.Controles
{
    class ControlUsuarios
    {
        //En esta clase estan los controles para bloquear y limpiar los campos en los diferentes formularios de usuarios
        public void LimpiarRegistrar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1, PictureBox pb1, PictureBox pb2)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt2.PasswordChar = '*'; //vuelve a ocultar el texto del campo contraseña
            btn1.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open; //vuelve a poner la imagen por defecto del boton para mostrar contraseña
            pb1.Image = null; //quita las imagenes de las picture box que muestran los checks o la x
            pb2.Image = null;
        }
        public void LimpiarConsultar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7, TextBox txt8, Button btn1)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt7.Text = "";
            txt8.Text = "";
            txt2.PasswordChar = '*';
            btn1.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open;
        }
        public void LimpiarModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, PictureBox pb1, Button btn1)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            btn1.Image = global::Cotidiano3_Felix.Properties.Resources.White_Eye_Open;
            pb1.Image = null;
        }
        public void BloquearObjetosModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1, Button btn2, Button btn3)
        {
            txt1.Enabled = true;
            txt2.Enabled = false;
            txt3.Enabled = false;
            txt4.Enabled = false;
            txt5.Enabled = false;
            btn1.Enabled = true;
            btn2.Enabled = false;
            btn3.Enabled = false;
        }
        public void DesbloquearObjetosModificar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, Button btn1, Button btn2, Button btn3)
        {
            txt1.Enabled = false;
            txt2.Enabled = true;
            txt3.Enabled = true;
            txt4.Enabled = true;
            txt5.Enabled = true;
            btn1.Enabled = false;
            btn2.Enabled = true;
            btn3.Enabled = true;
        }
        public void LimpiarActivar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, Button btn1)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            btn1.Text = "Cambiar";
        }
        public void LimpiarEliminar(TextBox txt1, TextBox txt2, TextBox txt3, TextBox txt4, TextBox txt5, TextBox txt6, TextBox txt7)
        {
            txt1.Text = "";
            txt2.Text = "";
            txt3.Text = "";
            txt4.Text = "";
            txt5.Text = "";
            txt6.Text = "";
            txt7.Text = "";
        }
    }
}
