public class App {
    public static void main(String[] args) throws Exception {
        String getNumber = System.console().readLine("Forneça um número X para a exibição de sua tabuada: ");
        int x = Integer.parseInt(getNumber);

        System.out.println("\nTabela de multiplicação de " + x + "\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
