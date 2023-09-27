public class Despesa {
    private double valor;
    private String descrição;
    private String categoria;
    private Date data;

    public Despesa(double valor, String descriçao, String categoria, Date data){
        this.valor = valor;
        this.descriçao = descriçao;
        this.categoria = categoria;
        this.data = data;
    }
}