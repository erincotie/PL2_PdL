/* Programa 12 Ampliacion Prueba 2: Tipo bool y operadores logicos */
void main(void) {
    bool esValido;
    bool tienePermiso;
    int edad;

    edad = 20;
    tienePermiso = true;
    esValido = (edad >= 18) && tienePermiso;

    if (!esValido || false) {
        output(0);
    } else {
        output(1);
    }
}