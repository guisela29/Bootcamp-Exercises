package models;

import java.time.LocalDateTime;

public class Transaction {
    private Integer id;
    private String nombre;
    private Double monto;
    private LocalDateTime fechaCreacion;
    private String TipoPago;
    private String categoria;
    private String lugar;

    public Transaction(Integer id, String nombre, Double monto, LocalDateTime fechaCreacion, String tipoPago, String categoria, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
        this.fechaCreacion = fechaCreacion;
        this.TipoPago = tipoPago;
        this.categoria = categoria;
        this.lugar = lugar;
    }
// Getters and Setters
    public Integer getId() {
        return id;
    }


}
