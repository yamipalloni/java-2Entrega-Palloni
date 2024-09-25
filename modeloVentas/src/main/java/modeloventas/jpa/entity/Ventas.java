package modeloventas.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "VENTAS")

 public class Ventas {

    public Ventas () {}

    public Ventas(String cliente, int monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    @Column(name = "CLIENTE")
    private String cliente;

    @Column(name = "MONTO")
    private int monto;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
