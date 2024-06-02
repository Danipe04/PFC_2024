using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace AplicacionPFC
{
    public partial class AnadirTickets : Form
    {
        public AnadirTickets()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            anadirPostreAsync();
        }
        public async Task anadirPostreAsync()
        {
            if (!string.IsNullOrEmpty(textBox4.Text) && !string.IsNullOrEmpty(textBox1.Text) && !string.IsNullOrEmpty(textBox6.Text))
            {
                string respuesta = "";
                if (await ConexionAPI.anadirPostre(textBox4.Text, Int32.Parse(textBox1.Text), Int32.Parse(textBox6.Text)))
                {
                    respuesta = "insercion correcta";
                }

                MessageBox.Show(respuesta);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            anadirComidaAsync();
        }
        public async Task anadirComidaAsync()
        {
            if (!string.IsNullOrEmpty(textBox2.Text) && !string.IsNullOrEmpty(textBox1.Text) && !string.IsNullOrEmpty(textBox5.Text))
            {
                string respuesta = "";
                if (await ConexionAPI.anadirComida(textBox2.Text, Int32.Parse(textBox1.Text), Int32.Parse(textBox5.Text)))
                {
                    respuesta = "insercion correcta";
                }

                MessageBox.Show(respuesta);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            anadirBebidaAsync();
        }
        public async Task anadirBebidaAsync()
        {
            if (!string.IsNullOrEmpty(textBox3.Text) && !string.IsNullOrEmpty(textBox1.Text) && !string.IsNullOrEmpty(textBox6.Text))
            {
                string respuesta = "";
                if (await ConexionAPI.anadirBebida(textBox3.Text, Int32.Parse(textBox1.Text), Int32.Parse(textBox6.Text)))
                {
                    respuesta = "insercion correcta";
                }

                MessageBox.Show(respuesta);
            }
        }
    }
}
