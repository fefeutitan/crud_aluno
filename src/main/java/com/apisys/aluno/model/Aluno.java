package com.apisys.aluno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;		
	@Column
	private String nm_aluno;	
	@Column	
	private Curso cd_curso;		
	@Column
	private int nu_matricula;	
	@Column	
	private int nu_semestre;
	
	public enum ds_status{ matriculado , trancado , jubilado }; ; 
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNm_aluno() {
		return nm_aluno;
	}
	public void setNm_aluno(String nm_aluno) {
		this.nm_aluno = nm_aluno;
	}
	public Curso getCd_curso() {
		return cd_curso;
	}
	public void setCd_curso(Curso cd_curso) {
		this.cd_curso = cd_curso;
	}
	public int getNu_matricula() {
		return nu_matricula;
	}
	public void setNu_matricula(int nu_matricula) {
		this.nu_matricula = nu_matricula;
	}
	public int getNu_semestre() {
		return nu_semestre;
	}
	public void setNu_semestre(int nu_semestre) {
		this.nu_semestre = nu_semestre;
	}
	
	public Aluno(String nm_aluno, Curso cd_curso, int nu_matricula, int nu_semestre) {
		super();
		this.nm_aluno = nm_aluno;
		this.cd_curso = cd_curso;
		this.nu_matricula = nu_matricula;
		this.nu_semestre = nu_semestre;
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nm_aluno=" + nm_aluno + ", cd_curso=" + cd_curso + ", nu_matricula="
				+ nu_matricula + ", nu_semestre=" + nu_semestre + "]";
	}
	
	


}