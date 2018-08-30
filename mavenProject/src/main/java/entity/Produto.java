package entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProduto;
	@Column
	private String nomeProd;
	@Column(unique=true)
	private Double precoProd;
	@Column
	private Integer quantProd;
	
	public Produto() {
	}

	public Produto(Integer idProduto, String nomeProd, Double precoProd, Integer quantProd) {
		super();
		this.idProduto = idProduto;
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
		this.quantProd = quantProd;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProd=" + nomeProd + ", precoProd=" + precoProd
				+ ", quantProd=" + quantProd + "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public Double getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}

	public Integer getQuantProd() {
		return quantProd;
	}

	public void setQuantProd(Integer quantProd) {
		this.quantProd = quantProd;
	}
	
	
	
	
	
	
	
}
