import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaDeConexao {

    private static Connection conexao;
    public static void conectar() {
        try {
            if (conexao == null) {
                String url = "jdbc:postgresql://localhost:5432/postgres";
                Properties props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", "postgres");
                conexao = DriverManager.getConnection(url, props);
                System.out.println("Conectado com sucesso!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static  Connection getConexao() {
        return conexao;
    }
}