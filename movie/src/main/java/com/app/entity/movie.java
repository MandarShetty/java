package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



	@Entity
	@Table(name = "Movie") // to specify table name
	//lombok annotations
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@JsonIgnoreType	

public class movie extends BaseEntity{
	
	
	
	@Column(name = "moviename", length = 20)
	private String movieName;
	
	
	@Column(name = "", length = 20)
	private Category category;
	
	
	@Column(name="releaseDate",length = 20)
	private LocalDate releaseDate;
	
	
	@Column(length = 20)
	private double cost;
	
	
	@Column(name = "director", length = 20)
	private String director ;


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", category=" + category + ", releaseDate=" + releaseDate + ", cost="
				+ cost + ", director=" + director + "]";
	}


	public movie(String movieName, Category category, LocalDate releaseDate, double cost, String director) {
		super();
		this.movieName = movieName;
		this.category = category;
		this.releaseDate = releaseDate;
		this.cost = cost;
		this.director = director;
	}


	public movie() {
		super();
		// TODO Auto-generated constructor stub
	}



}
