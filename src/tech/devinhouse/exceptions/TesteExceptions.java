package tech.devinhouse.exceptions;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteExceptions {

    public static void main(String[] args) {

        String nome = null;

        try {
            nome.toUpperCase();
            Integer nro = 5;
            Integer resultado = nro / 0;
            Files.size(Paths.get("sapato"));
        } catch (NullPointerException | ArithmeticException | IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Ocorreu um erro, procure o admin do sistema");
        } catch (FileAlreadyExistsException e) {
            System.out.println("O arquivo nao existia");
        } catch (IOException e) {
            System.out.println("Deu IOException");
        }

        try {
            testar();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Continua execucao do sistema");

    }

    private static void testar() throws IOException {
        System.out.println("Tô no metodo testar");
        try {
            int resultado = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("por zero nao vale");
            throw new IOException(); // checked
        }
    }

}
