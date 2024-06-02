using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AplicacionPFC
{
    class ConexionAPI
    {
        public static string urlbase = "http://192.168.0.137:8080/api/";
        public async static Task<Usuario> iniciarSesion(string nombreUsuario, string claveAcceso)
        {
            var parametros = new
            {
                nombreUsuario,
                claveAcceso
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "iniciar-sesion";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                if (respuesta.IsSuccessStatusCode)
                {
                    string respuestaJson = await respuesta.Content.ReadAsStringAsync();
                    var objetoRespuesta = JsonConvert.DeserializeObject<dynamic>(respuestaJson);

                    List<string> roles = JsonConvert.DeserializeObject<List<string>>(objetoRespuesta.roles.ToString());


                    // Crear un nuevo objeto Usuario con los datos extraídos
                    Usuario usuario = new Usuario(
                                        Convert.ToInt32(objetoRespuesta.id_usuario),
                                        objetoRespuesta.nombre.ToString(),
                                        objetoRespuesta.apellidos.ToString(),
                                        roles
                                    );
                    return usuario;
                }
                else
                {
                    return new Usuario(0, "", "", new List<string>() { });
                }
            }
        }
        public async static Task<bool> crearComida(string nombreComida)
        {
            var parametros = new
            {
                nombre_comida = nombreComida
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "crearComida";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
        public async static Task<bool> crearPostre(string nombrePostre)
        {
            var parametros = new
            {
                nombre_postre = nombrePostre
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "crearPostre";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
        public async static Task<bool> crearBebida(string nombreBebida)
        {
            var parametros = new
            {
                nombre_bebida = nombreBebida
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "crearBebida";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
        public async static Task<bool> anadirComida(string nombreComida, int idTicket, int numcPedido)
        {
            var parametros = new
            {
                comida = nombreComida,
                id_ticket = idTicket,
                numc_pedido = numcPedido
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "comida-add";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
        public async static Task<bool> anadirBebida(string nombreBebida, int idTicket, int numbPedido)
        {
            var parametros = new
            {
                bebida = nombreBebida,
                id_ticket = idTicket,
                numb_pedido = numbPedido
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "bebida-add";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
        public async static Task<bool> anadirPostre(string nombrePostre, int idTicket, int numpPedido)
        {
            var parametros = new
            {
                postre = nombrePostre,
                id_ticket = idTicket,
                nump_pedido = numpPedido
            };

            string parametrosJson = JsonConvert.SerializeObject(parametros);

            string url = urlbase + "postre-add";

            using (HttpClient cliente = new HttpClient())
            {
                cliente.DefaultRequestHeaders.Add("Accept", "application/json");

                // Enviar los datos como JSON en el cuerpo de la solicitud POST
                var contenido = new StringContent(parametrosJson, System.Text.Encoding.UTF8, "application/json");

                HttpResponseMessage respuesta = await cliente.PostAsync(url, contenido);

                return respuesta.IsSuccessStatusCode;
            }
        }
    }
}
