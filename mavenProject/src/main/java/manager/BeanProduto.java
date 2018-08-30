package manager;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entity.Produto;
import persistence.ProdutoDao;

@ManagedBean(name = "mb")
@RequestScoped
public class BeanProduto {

	private Produto produto;
	private List<Produto> produtos;
	private ProdutoDao dao;

	public BeanProduto() {
		dao = new ProdutoDao();
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void gravar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			dao.create(produto);
			produto = new Produto();
			fc.addMessage(null, new FacesMessage("Produto Gravado ..."));
		} catch (Exception ex) {
			fc.addMessage(null, new FacesMessage("Error :" + ex.getMessage()));
		}
	}

	public List<Produto> getProdutos() {
		produtos = dao.findAll();
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
