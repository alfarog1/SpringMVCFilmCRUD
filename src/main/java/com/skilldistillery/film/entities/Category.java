package com.skilldistillery.film.entities;

public class Category {

	private int filmId;
	private String categoryName;
	
	public Category(int categoryId, String categoryName) {
		super();
		this.filmId = categoryId;
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return filmId;
	}
	public void setCategoryId(int categoryId) {
		this.filmId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + filmId;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (filmId != other.filmId)
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Category: " + categoryName);
		return sb.toString();
	}
	
	
	
}
