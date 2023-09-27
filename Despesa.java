import java.util.Date;

public class Despesa {
    private double valor;
    private String descricao;
    private String categoria;
    private Date data;

    public Despesa(double valor, String descricao, String categoria, Date data){
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
}