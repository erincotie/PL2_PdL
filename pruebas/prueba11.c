/* Programa 11 Prueba Ampliacion 1: Bucle for, modulo % y tipo char */
void main(void) {
    int i;
    char salto;
    char letra;

    salto = '\n';
    letra = 'a';

    for (i = 0; i < 10; i = i + 1) {
        if (i % 2 == 0) {
            output(i);
        }
    }
}