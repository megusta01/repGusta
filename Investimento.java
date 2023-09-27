import java.util.Date;

public class Investimento {
    private double valor;
    private Date data;

    public Investimento (double valor, Date data){
        this.valor = valor;
        this.data = data;
    }

    public double getValor(){
        return valor;
    }

    public Date getdata(){
        return data;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setData(Date data){
        this.data = data;
    }
}