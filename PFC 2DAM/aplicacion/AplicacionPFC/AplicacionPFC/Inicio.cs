using System.Diagnostics;
using System.Security.Cryptography;
using System.Text;

namespace AplicacionPFC
{
    public partial class Inicio : Form
    {
        public Inicio()
        {
            InitializeComponent();
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            byte[] bytesTexto = Encoding.UTF8.GetBytes(textBox2.Text);

            // Calcular el hash SHA256
            byte[] hashBytes;
            using (SHA256 sha256 = SHA256.Create())
            {
                hashBytes = sha256.ComputeHash(bytesTexto);
            }

            // Convertir el hash a una cadena hexadecimal
            StringBuilder sb = new StringBuilder();
            foreach (byte b in hashBytes)
            {
                sb.Append(b.ToString("x2"));
            }
            string hashSHA256 = sb.ToString();
            Usuario usuario = await ConexionAPI.iniciarSesion(textBox1.Text, hashSHA256);
            if(usuario.id_usuario != 0)
            {
                Principal principal = new Principal(usuario);
                principal.Show();
            }
        }
    }
}
