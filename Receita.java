public class Receita {
    private double valor;
    private String descriçao;
    private String categoria;
    private Date data;

    public Receita(double valor, String descriçao, String categoria, Date data){
        this.valor = valor;
        this.descriçao = descriçao;
        this.categoria = categoria;
        this.data = data;
    }
}