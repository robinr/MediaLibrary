package com.videolibrary.mediamgr.dao;

import java.util.List;

import com.videolibrary.mediamgr.model.*;
public interface MediaManagerDao {
	
	public MediaResponse GetMediaListAll(Integer id);
	
	public Boolean PushMediaObject(MediaRequest request);
	
	public PlayListResponse PreparePlayList(Integer id, PlayList list);
	
	public List<PlayList> ShowPlayList(Integer id);
	
	public PlayListResponse RemovePlayList(String name);

	public MediaResponse DeleteMediaObject(String name);
}
