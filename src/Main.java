import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
    /*
    Clase 4 - archivos
    2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
      contener números. El programa debe escribir por consola la suma de esos números
      a. Al programa anterior agreguele un parámetro para que la operación pueda ser
      suma o multiplicación
     */

        String rutaDelArchivo = "C:\\Users\\Sofi\\Documents\\ArchivoDePractica.txt";

       // for(String LineaDelArchivo : Files.readAllLines(Paths.get(rutaDeArchivo))) {

            //String campos[] = LineaDelArchivo.split(" "); //Array de string, cada vez que encuentra un espacio
            /*
            Mi archivo es 1 5 10 20 35 70..Le pido un split cada vez que encuentra un espacio

            Ahora en campos[0] tendre el 1

            En campos [1] el 5.

            En campos[3] el 20 y asi..
             */
            //int acumulador=0;

            //for(int i=0;i< campos.length;i++) {
                //Para recorrer el array de string de campos[]
                //acumulador+=Integer.parseInt(campos[i]);
                /*
                ParseInt para poder utilizar el acumulador que es tipo entero y asi poder
                sumar los numeros que se encuentran en el archivo
                 */
                //System.out.println(campos[i]);

           //Hicimos lo mismo que arriba pero en una funcion
        /*
        [15,20,30,50,200]
         */
             operacionDeArchivo(rutaDelArchivo,'+'); //Sumara los numeros del archivos porque le pase el operador +
             operacionDeArchivo(rutaDelArchivo,'*'); //Multiplicara los numeros del archivo
            }




    private static void operacionDeArchivo(String rutaDeArchivo,char operador) throws IOException {
        int acumulador = 0;
        int multiplicacion = 1;

        for(String lineaDelArchivo : Files.readAllLines(Paths.get(rutaDeArchivo))) {
            String campos[] = lineaDelArchivo.split(" ");



            for(int i=0; i < campos.length;i++) {
                if(operador == '+') {

                    acumulador += Integer.parseInt(campos[i]);
                }
                if(operador == '*') {


                    multiplicacion= multiplicacion * (Integer.parseInt(campos[i]));

                }
            }
        }
        if(operador == '+') {
            System.out.println("La suma de los numeros es de: " + acumulador);
        }
        else if(operador == '*') {
            System.out.println("El producto de los numeros es de: " + multiplicacion);
        }
    }
}