package com.videolibrary.mediamgr.model;

import java.util.List;

public class MediaResponse {
	public List<Media>  allMedia;
	public Boolean isfilestorefull;
	public Integer totalfilestoresize;
    public String  baseUrl;
	public List<Media> getAllMedia() {
		return allMedia;
	}
	public void setAllMedia(List<Media> allMedia) {
		this.allMedia = allMedia;
	}
	public Boolean getIsfilestorefull() {
		return isfilestorefull;
	}
	public void setIsfilestorefull(Boolean isfilestorefull) {
		this.isfilestorefull = isfilestorefull;
	}
	public Integer getTotalfilestoresize() {
		return totalfilestoresize;
	}
	public void setTotalfilestoresize(Integer totalfilestoresize) {
		this.totalfilestoresize = totalfilestoresize;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
    
}
