package com.skilldistillery.film.entities;

import java.util.List;

public class Film {
	private int id;
	private String title;
	private String description;
	private int releaseYear;
	private String language;
	private String rentalDuration;
	private double rentalRate;
	private String length;
	private double replacementCost;
	private String rating;
	private String specitalFeatures;
	private List<Actor> cast;
	private List<Category> categories;

	
	
	public Film() {
		super();
	}

	public Film(int id, String title, String description, int releaseYear, String language, String rentalDuration,
			double rentalRate, String length, double replacementCost, String rating, String specitalFeatures,
			List<Actor> cast, List<Category> categories) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.language = language;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specitalFeatures = specitalFeatures;
		this.cast = cast;
		this.categories = categories;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Actor> getCast() {
		return cast;
	}

	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(String rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecitalFeatures() {
		return specitalFeatures;
	}

	public void setSpecitalFeatures(List<String> sFeatList) {
		String sFeatures = "";
		for (int i = 0; i < sFeatList.size(); i++) {
			System.out.println("in sFeat for loop");
			if (i != 0 ) {
				sFeatures = sFeatures + "," + sFeatList.get(i);			
			} else {
				sFeatures = sFeatList.get(i);
			}
		}
		System.out.println("after sFeat for loop");
		this.specitalFeatures = sFeatures;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-----------------------------------------------------------------------------\n");
		sb.append("\nFilm id: " + id + ", Title: " + title);
		sb.append("\nDescription: " + description);
		sb.append("\nReleased: " + releaseYear + ", Language: " + language);
		sb.append("\nRental Duration in Days: " + rentalDuration + ", Rental Rate: $" + rentalRate);
		sb.append("\nLength min: " + length + ", Replacement Cost: $" + replacementCost);
		sb.append("\nRating: " + rating + ", Special Features: " + specitalFeatures + "\n");
		sb.append("Cast: ");
		if (cast != null) {
			for (int i = 0; i < cast.size(); i++) {
				sb.append(cast.get(i));
				if (i != cast.size() - 1) {
					sb.append(", ");
				}
				if (i > 0 & i % 3 == 0) {
					sb.append("\n");
				}
			}
		}
		sb.append("\n");
		if (categories != null) {
			for (int i = 0; i < categories.size(); i++) {
				sb.append(categories.get(i));
				if (i != categories.size() - 1) {
					sb.append(", ");
				}
				if (i > 0 & i % 3 == 0) {
					sb.append("\n");
				}
			}
		}

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cast == null) ? 0 : cast.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + releaseYear;
		result = prime * result + ((rentalDuration == null) ? 0 : rentalDuration.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rentalRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(replacementCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((specitalFeatures == null) ? 0 : specitalFeatures.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Film other = (Film) obj;
		if (cast == null) {
			if (other.cast != null)
				return false;
		} else if (!cast.equals(other.cast))
			return false;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		if (rentalDuration == null) {
			if (other.rentalDuration != null)
				return false;
		} else if (!rentalDuration.equals(other.rentalDuration))
			return false;
		if (Double.doubleToLongBits(rentalRate) != Double.doubleToLongBits(other.rentalRate))
			return false;
		if (Double.doubleToLongBits(replacementCost) != Double.doubleToLongBits(other.replacementCost))
			return false;
		if (specitalFeatures == null) {
			if (other.specitalFeatures != null)
				return false;
		} else if (!specitalFeatures.equals(other.specitalFeatures))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
