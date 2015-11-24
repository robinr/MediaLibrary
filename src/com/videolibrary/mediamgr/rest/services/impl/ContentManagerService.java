package com.videolibrary.mediamgr.rest.services.impl;

import java.io.File;
import java.io.FileOutputStream; 
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import javax.activation.DataHandler;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.videolibrary.mediamgr.dao.MediaManagerDao;
import com.videolibrary.mediamgr.model.MediaRequest;
import com.videolibrary.mediamgr.model.MediaResponse;
import com.videolibrary.mediamgr.model.PlayList;
import com.videolibrary.mediamgr.model.PlayListResponse;
import com.videolibrary.mediamgr.rest.services.ContentManager;

public class ContentManagerService implements ContentManager {
	
	MediaManagerDao medias;

	public MediaManagerDao getMedias() {
		return medias;
	}

	public void setMedias(MediaManagerDao medias) {
		this.medias = medias;
	}

	private String getFileName(MultivaluedMap<String, String> header) {
	      String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
	      for (String filename : contentDisposition) {
	         if ((filename.trim().startsWith("filename"))) {
	            String[] name = filename.split("=");
	            String exactFileName = name[1].trim().replaceAll("\"", "");
	            return exactFileName;
	         }
	      }
	      return "unknown";
	   }
	
	private Boolean deleteMedia(String name) {
		Boolean result;
		String poster ="C:/uploads/"+name+".jpg";
		String video  ="C:/uploads/"+name+".mp4";
		
		File actor = new File("C:/uploads/Actor.txt");
		File director = new File("C:/uploads/Director.txt");
		File synopsis = new File("C:/uploads/Synopsis.txt");
		File posterfile = new File(poster);
		File videofile  = new File(video);
		
		result = actor.delete();
		result = director.delete();
		result = synopsis.delete();
		result = posterfile.delete();
		result = videofile.delete();
		
		return result;
	}
	
	
	@Override
	public MediaResponse GetMediaListAll(Integer id) {
		if((id >= 0) && (id <= 4)) {
			return (getMedias().GetMediaListAll(id));
		}
		
		return null;
	}

	@Override
	public Response PushMediaObject(List<Attachment> attachments, HttpServletRequest request){
		MediaRequest mediarequest = new MediaRequest();
		Boolean operation = false;
		for (Attachment attachment : attachments) {
	         DataHandler handler = attachment.getDataHandler();
	         try {
	            InputStream stream = handler.getInputStream();
	            MultivaluedMap<String, String> map = attachment.getHeaders();
	            System.out.println("fileName Here" + getFileName(map));
	            OutputStream out = new FileOutputStream(new File("C:/uploads/" + getFileName(map)));

	            int read = 0;
	            byte[] bytes = new byte[1024];
	            while ((read = stream.read(bytes)) != -1) {
	               out.write(bytes, 0, read);
	            }
	            stream.close();
	            out.flush();
	            out.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
		  operation = getMedias().PushMediaObject(mediarequest);
		  return Response.ok("file uploaded").build();
	}

	@Override
	public PlayListResponse PreparePlayList(Integer id,PlayList list) {
		// TODO Auto-generated method stub
		if((id >= 0) && (id <= 4)) {
			return getMedias().PreparePlayList(id, list);
			}
		return null;
	}

	@Override
	public List<PlayList> ShowPlayList(Integer id) {
		// TODO Auto-generated method stub
		if((id >= 0) && (id <= 4)) {
			return getMedias().ShowPlayList(id);
		}
		return null;
}

	@Override
	public PlayListResponse RemovePlayList(String name) {
		// TODO Auto-generated method stub
		if(name != null)
		{
			return getMedias().RemovePlayList(name);
		}
		return null;
	}

	@Override
	public MediaResponse DeleteMediaObject(String name) {
		// TODO Auto-generated method stub
		Boolean removal = false;
		String  object = name;
		if(name != null)
		{
			removal = deleteMedia(name);
			return getMedias().DeleteMediaObject(object);
		}
		return null;
	}

	@Override
	public Response UpdateMediaObject(List<Attachment> attachments, HttpServletRequest request) {
		MediaRequest mediarequest = new MediaRequest();
		Boolean operation = false;
		for (Attachment attachment : attachments) {
	         DataHandler handler = attachment.getDataHandler();
	         try {
	            InputStream stream = handler.getInputStream();
	            MultivaluedMap<String, String> map = attachment.getHeaders();
	            System.out.println("fileName Here" + getFileName(map));
	            OutputStream out = new FileOutputStream(new File("C:/uploads/" + getFileName(map)));

	            int read = 0;
	            byte[] bytes = new byte[1024];
	            while ((read = stream.read(bytes)) != -1) {
	               out.write(bytes, 0, read);
	            }
	            stream.close();
	            out.flush();
	            out.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
		  operation = getMedias().PushMediaObject(mediarequest);
		  return Response.ok("file uploaded").build();
	}

}