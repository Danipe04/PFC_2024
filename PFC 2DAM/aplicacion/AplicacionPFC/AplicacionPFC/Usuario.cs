using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace AplicacionPFC
{
    public class Usuario
    {
        public int id_usuario {  get; set; }
        public string nombre {get; set;}
        public string apellidos { get; set; }
        public List<string> roles { get; set; }

        public Usuario(int id_usuario, string nombre, string apellidos, List<string> roles)
        {
            this.id_usuario = id_usuario;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.roles = roles;
        }
        public override string ToString()
        {
            return $"Nombre: {nombre}, apellidos: {apellidos}, roles: {roles}";
        }
    }
}
