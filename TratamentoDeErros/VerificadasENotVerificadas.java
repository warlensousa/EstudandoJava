package TratamentoDeErros;
import java.io.*;

// relançamento de exerções





public class VerificadasENotVerificadas {
    public static void main(String[] args) {
        // ! Exceções:

        // ! Erros Verificados
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // ! Não Verificadas
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // ! Throws em Métodos
        try {
            processarArquivo("");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // ! Encadeamento de Exceções
        try {
            abrirArquivo(null);
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
        }

        // ! Relançar Exceções
        try {
            processarDados(null);
        } catch (Exception e) {
            System.out.println("Outra coisa");
            System.out.println("Pilha de execução: " + e.getStackTrace());
        }
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {
        if (caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho inválido");
        }

        File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }

        System.out.println("Arquivo encontrado com sucesso!");
    }

    public static void abrirArquivo(String caminho2) {
        try {
            if (caminho2 == null) {
                throw new NullPointerException("Caminho Nulo.");
            }

            throw new FileNotFoundException("Arquivo não encontrado");
        } catch (FileNotFoundException e) {
            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");
            npe.initCause(e);
            throw npe;
        }
    }

    public static void processarDados(String dados) throws Exception {
        try {
            if (dados == null) {
                throw new NullPointerException("Os dados são nulos.");
            }
        } catch (Exception e) {
            System.out.println("Tratamento, criação de log etc...");
            throw e;
        }
    }
}
