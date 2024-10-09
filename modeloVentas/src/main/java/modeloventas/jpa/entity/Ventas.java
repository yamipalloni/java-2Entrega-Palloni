package modeloventas.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VENTAS")

 public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CLIENTE_ID")
    private int cliente_id;

    @Column(name = "CREATED_AT")
    private int created_at;

    @Column(name = "TOTAL")
    private int total;

    @ManyToOne(fecth = FetchType.LAZY)
    private Cliente cliente;
}
