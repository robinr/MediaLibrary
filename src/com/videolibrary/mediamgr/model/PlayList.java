package com.videolibrary.mediamgr.model;

import java.util.List;

public class PlayList {
	String     name;
	Integer    id;
	List<Item> playlist;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Item> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Item> playlist) {
		this.playlist = playlist;
	}
	

}
