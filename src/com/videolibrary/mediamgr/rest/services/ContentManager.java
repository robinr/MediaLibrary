package com.videolibrary.mediamgr.rest.services;

import java.util.List;
import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.videolibrary.mediamgr.model.MediaResponse;
import com.videolibrary.mediamgr.model.PlayList;
import com.videolibrary.mediamgr.model.PlayListResponse;


public interface ContentManager {
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/GetMediaListAll/{id}")
	public MediaResponse GetMediaListAll(@PathParam("id") Integer id);
	
	@POST
	@Path("/PushMediaObject/")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response PushMediaObject(List<Attachment> attachments, @Context HttpServletRequest request);

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/PreparePlayList/{id}")
	public PlayListResponse PreparePlayList(@PathParam("id") Integer id,PlayList list);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/ShowPlayList/{id}")
	public List<PlayList> ShowPlayList(@PathParam("id") Integer id);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/RemovePlayList/{name}")
	public PlayListResponse RemovePlayList(@PathParam("name") String name);
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/RemoveMediaObject/{name}")
	public MediaResponse DeleteMediaObject(@PathParam("name") String name);
	
	@POST
	@Path("/UpdateMediaObject/")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response UpdateMediaObject(List<Attachment> attachments, @Context HttpServletRequest request);

	
}
