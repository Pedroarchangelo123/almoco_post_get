package com.restaurante.almoco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurante {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nome;
	    private String fibra;
	    private String proteina;
	    private String carboidrato;
	    private String gordura;
	    private String sobremesa;
	    private String bebida;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getFibra() {
			return fibra;
		}
		public void setFibra(String fibra) {
			this.fibra = fibra;
		}
		public String getProteina() {
			return proteina;
		}
		public void setProteina(String proteina) {
			this.proteina = proteina;
		}
		public String getCarboidrato() {
			return carboidrato;
		}
		public void setCarboidrato(String carboidrato) {
			this.carboidrato = carboidrato;
		}
		public String getGordura() {
			return gordura;
		}
		public void setGordura(String gordura) {
			this.gordura = gordura;
		}
		public String getSobremesa() {
			return sobremesa;
		}
		public void setSobremesa(String sobremesa) {
			this.sobremesa = sobremesa;
		}
		public String getBebida() {
			return bebida;
		}
		public void setBebida(String bebida) {
			this.bebida = bebida;
		}

	    // Getters e Setters

	}

