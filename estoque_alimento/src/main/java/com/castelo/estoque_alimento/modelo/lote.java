package com.castelo.estoque_alimento.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class lote  implements Serializable {

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private alimento Alimento;

    private int quantidade;

    private String codigo;

    private LocalDateTime DataVencimento;

    @Deprecated
    public lote() {
    }

    public lote(alimento alimento, int quantidade, String codigo, LocalDateTime dataVencimento) {
        Alimento = alimento;
        this.quantidade = quantidade;
        this.codigo = codigo;
        DataVencimento = dataVencimento;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public alimento getAlimento() {
        return Alimento;
    }

    public void setAlimento(alimento alimento) {
        Alimento = alimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public void cadastratLote(String nome){

    }
    public void consultarLote(String nome){

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((Alimento == null) ? 0 : Alimento.hashCode());
        result = prime * result + quantidade;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((DataVencimento == null) ? 0 : DataVencimento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        lote other = (lote) obj;
        if (id != other.id)
            return false;
        if (Alimento == null) {
            if (other.Alimento != null)
                return false;
        } else if (!Alimento.equals(other.Alimento))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (DataVencimento == null) {
            if (other.DataVencimento != null)
                return false;
        } else if (!DataVencimento.equals(other.DataVencimento))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "lote [id=" + id + ", Alimento=" + Alimento + ", quantidade=" + quantidade + ", codigo=" + codigo
                + ", DataVencimento=" + DataVencimento + "]";
    }

   



    
}
