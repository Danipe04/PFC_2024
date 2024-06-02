using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AplicacionPFC
{
    public partial class Principal : Form
    {
        public Principal(Usuario usuario)
        {
            InitializeComponent();
            label1.Text = "Bienvenido " + usuario.nombre;
            button2.Enabled = usuario.roles.Contains("ADMINISTRADOR") ? true : false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            AnadirTickets anadir = new AnadirTickets();
            anadir.Show();
        }
    }
}
