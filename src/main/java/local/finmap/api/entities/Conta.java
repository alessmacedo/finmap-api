package local.finmap.api.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import local.finmap.api.enums.TagEnum;

@Entity
@Table(name = "meta")
public class Conta {

	private int id;
	private String descricao;
	private Double valorTotal;
	private Date dataEmissao;
	private int numParcelas;
	private TagEnum tag;
	private List<Parcela>parcelas;
	private Usuario usuario;
	
	public Conta() {
		
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "valorTotal", nullable = false)
	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Column(name = "dataEmissao", nullable = false)
	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@Column(name = "parcelas", nullable = false)
	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tag", nullable = false)
	public TagEnum getTag() {
		return tag;
	}

	public void setTag(TagEnum tag) {
		this.tag = tag;
	}

	@OneToMany(mappedBy = "conta", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	@ManyToOne
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String toString() {
		return "Conta [id=" + id + ", descricao=" + descricao + ", valotTotal=" + valorTotal 
				+ ", dataEmissao=" + dataEmissao + ", numParcelas=" + numParcelas 
				+ ", tag=" + tag + ", usuario=" + usuario + "]";
	}
	
}
