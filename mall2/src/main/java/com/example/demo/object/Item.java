package com.example.demo.object;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	@Id
	@NotNull
	private String name;
	@NotNull
	private String descript;
	@NotNull
	private int price;
	@NotNull
	private String img;
	@NotNull
	private String origin;
	@NotNull
	private int weight;
	@NotNull
	private String unit;
}
