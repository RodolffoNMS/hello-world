public class Main {
    /*
    * 1 - System.out.println: Forma mais comum de imprimir.
    * 2 - System.out.print: Similar ao println, mas sem quebra de linha automática.
    * 3 - System.out.printf: Permite formatação de strings.
    * 4 - Loop for: Demonstra o uso de loops para imprimir.
    * 5 - Array de caracteres: Constrói a mensagem a partir de um array de caracteres.
    *
    * Existem mais formas, eu sei, mas eu ainda não sei usar hahahahah
    */
    public static void main(String[] args) {
        // 1. Usando System.out.println
        System.out.println("Hello World!");

        // 2. Usando System.out.print, o \n faz às vezes de quebra de linha
        System.out.print("Hello World!\n");

        // 3. Usando System.out.printf (pra quem tem saudades do C.)
        System.out.printf("Hello World!%n");

        // 4. Usando um loop for
        for (int i = 0; i < 1; i++) {
            System.out.println("Hello World!");
        }

        // 5. Usando um array de caracteres
        char[] helloWorldArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        System.out.println(new String(helloWorldArray));

    }
}