public class Persona {
    private String Nombre;
    private String Cedula;
    private String FechaNacimiento;
    private String Correo;
    private String CiudadResidencia;
    private String CiudadOrigen;
    private Cancion[] cancionesFavoritas = new Cancion[3];
    private int contador;
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCiudadResidencia(String CiudadResidencia) {
        this.CiudadResidencia = CiudadResidencia;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public void agregarCancion(Cancion cancion) {
        if (contador < cancionesFavoritas.length) {
            cancionesFavoritas[contador++] = cancion;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Cedula: " + Cedula);
        System.out.println("Fecha de Nacimiento: " + FechaNacimiento);
        System.out.println("Correo: " + Correo);
        System.out.println("Ciudad de Residencia: " + CiudadResidencia);
        System.out.println("Ciudad de Origen: " + CiudadOrigen);
        System.out.println("Canciones Favoritas:");
        for (Cancion cancion : cancionesFavoritas) {
            if (cancion != null) {
                cancion.mostrarCancion();
            }
        }
    }
}
