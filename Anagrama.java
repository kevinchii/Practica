public class Anagrama {

    public static void main(String[] args) {
        
        char[] palabra1 = {'A', 'M', 'O', 'R'};
        char[] palabra2 = {'R', 'O', 'M', 'A'};

        int contador = 0;
        int long_palabra1 = palabra1.length;
        int long_palabra2 = palabra2.length;

        for (int i = 0; i<long_palabra1; i++) {

            for (int j = 0; i<long_palabra2; j++) {

                if (palabra1[i] == palabra2[j]) {
                    
                    contador++;
                    palabra2[j]=' ';
                    break;

                }
            }

        }
            if (contador == long_palabra1){
                System.out.println("son anagrama");

            } else {
                System.out.println("no es anagrama");
            }
        

    }

}