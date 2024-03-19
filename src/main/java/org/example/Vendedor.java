package org.example;
import java.util.Date;

public class Vendedor extends Funcionario {
    private int TotalItensVendido;
    private float ComissaoPorItem;

    public Vendedor () {
        super();
    }

    public float calcularSalario () {
        return super.getSalario() + (this.ComissaoPorItem * TotalItensVendido );
    }

    public int getTotalItensVendido() {
        return TotalItensVendido;
    }

    public void setTotalItensVendido(int totalItensVendido) {
        TotalItensVendido = totalItensVendido;
    }

    public float getComissaoPorItem() {
        return ComissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        ComissaoPorItem = comissaoPorItem;
    }
}
