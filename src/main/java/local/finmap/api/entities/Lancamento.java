package local.finmap.api.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import local.finmap.api.enums.TagEnum;
import local.finmap.api.enums.TipoEnum;

@Entity
@Table(name = "lancamento")
public class Lancamento {

	private int id;
	private Date data;
	private Double valor;
	private String descricao;
	private TipoEnum tipo;
	private TagEnum tag;
	private Meta meta;
	private Usuario usuario;
	
	public Lancamento() {
		
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "data", nullable = false)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "valor", nullable = false)
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo", nullable = false)
	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tag", nullable = false)
	public TagEnum getTag() {
		return tag;
	}

	public void setTag(TagEnum tag) {
		this.tag = tag;
	}

	@OneToOne
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@ManyToOne
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", data=" + data + ", valor=" + valor
				+ ", descricao=" + descricao + ", tipo=" + tipo + ", tag=" + tag 
				+ ", meta=" + meta + ", usuario=" + usuario + "]";
	}
}
