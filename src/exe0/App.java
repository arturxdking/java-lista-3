package exe0;
public class App {
    public static void main(String[] args) throws Exception {
        Endereco objEndereco = new Endereco(1, 1234, "Av. Principal", "Centro", "12345-678", "Franca", "Brasil");
        Cliente objCliente = new Cliente(1, "Anderson", "123456789-SP", "453.987.123-01", objEndereco);
        
        System.out.println(objCliente.toString());
        
        Endereco objEndereco2 = new Endereco(2, 5678, "Av. Alternativa", "Centro", "12345-679", "Franca", "Brasil");
        Fornecedor objFornecedor = new Fornecedor(1, "Eagle Pharma", "Eagle", "12.345.678/0001-90", objEndereco2);

        System.out.println(objFornecedor.toString());
    }
}
