/* Programa 13 Ampliacion Prueba 3: Integracion completa */
void main(void) {
    int n;
    char c;
    bool flag;

    c = 'x';
    flag = true;

    for (n = 1; n <= 15; n = n + 1) {
        if ((n % 3 == 0) && flag) {
            output(n);
        }
    }
}