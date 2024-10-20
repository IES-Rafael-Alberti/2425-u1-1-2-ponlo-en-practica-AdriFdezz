#include <stdio.h>

int main() {
    char nombre[100];

    printf("Cual es tu nombre: ");
    scanf("%s", nombre);

    printf("Hola %s. Este programa esta hecho en el lenguaje de programacion: C\n", nombre);
}
