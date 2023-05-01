package com.example.generationcodeservice.entitie;
import java.io.IOException;
import com.google.zxing.WriterException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public abstract class Code {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Code(Long id) {
		super();
		this.id = id;
	}

	public Code() {
		super();
		// TODO Auto-generated constructor stub
		}

	@Override
	public String toString() {
		return "Code [id=" + id + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public abstract void creerCode() throws IOException, WriterException;
	
}
