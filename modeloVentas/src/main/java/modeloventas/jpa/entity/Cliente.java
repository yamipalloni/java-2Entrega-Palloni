package modeloventas.jpa.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name= "CLIENTE")
public class Cliente {

        public Cliente () {}

        public Cliente(int id, String nombre, String apellido, int dni) {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.dni = dni;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "NOMBRE")
        private String nombre;

        @Column(name = "APELLIDO")
        private String apellido;

        @Column(name = "DNI")
        private int dni;

        @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<ventas> ventas;



        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public int getDni() {
                return dni;
        }

        public void setDni(int dni) {
                this.dni = dni;
        }

        public List getVenta() {
                return venta;
        }

        public void setVenta(List venta) {
                this.venta = venta;
        }
}



