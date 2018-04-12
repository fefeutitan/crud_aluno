package com.apisys.aluno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column
	private String cd_curso;	
	@Column
	private String nm_curso;	
	@Column	
	private String nm_instituicao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCd_curso() {
		return cd_curso;
	}
	public void setCd_curso(String cd_curso) {
		this.cd_curso = cd_curso;
	}
	public String getNm_curso() {
		return nm_curso;
	}
	public void setNm_curso(String nm_curso) {
		this.nm_curso = nm_curso;
	}
	public String getNm_instituicao() {
		return nm_instituicao;
	}
	public void setNm_instituicao(String nm_instituicao) {
		this.nm_instituicao = nm_instituicao;
	}
	public Curso(String cd_curso, String nm_curso, String nm_instituicao) {
		super();
		this.cd_curso = cd_curso;
		this.nm_curso = nm_curso;
		this.nm_instituicao = nm_instituicao;
	}
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", cd_curso=" + cd_curso + ", nm_curso=" + nm_curso + ", nm_instituicao="
				+ nm_instituicao + "]";
	}
	
	

}
