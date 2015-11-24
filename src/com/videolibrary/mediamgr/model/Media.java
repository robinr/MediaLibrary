package com.videolibrary.mediamgr.model;

public class Media {
	    private Integer Id;
		private String  Language;
		private String  Name;
		private String  Poster;
		private Integer Duration;
		private String  Synopsis;
		private String  Actors;
		private String  Director;
		
		
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getLanguage() {
			return Language;
		}
		public void setLanguage(String language) {
			Language = language;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPoster() {
			return Poster;
		}
		public void setPoster(String poster) {
			Poster = poster;
		}
		public Integer getDuration() {
			return Duration;
		}
		public void setDuration(Integer duration) {
			Duration = duration;
		}
		public String getSynopsis() {
			return Synopsis;
		}
		public void setSynopsis(String synopsis) {
			Synopsis = synopsis;
		}
		public String getActors() {
			return Actors;
		}
		public void setActors(String actors) {
			Actors = actors;
		}
		public String getDirector() {
			return Director;
		}
		public void setDirector(String director) {
			Director = director;
		}
	

}
