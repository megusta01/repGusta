import java.util.Date;

public class Orçamento {
    private String descricao;
    private double valor;
    private Date data;

    public Orçamento(String descriçao, double valor, Date data){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
}