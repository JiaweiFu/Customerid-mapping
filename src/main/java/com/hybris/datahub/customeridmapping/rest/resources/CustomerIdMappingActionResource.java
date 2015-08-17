package com.hybris.datahub.customeridmapping.rest.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({"application/xml", "application/json"})
@Consumes({"application/xml", "application/json"})
@Path("/customerid-mapping")
public class CustomerIdMappingActionResource {

  private ServicesDemo servicesDemo;	
	
	
  @GET
  public Response getAllDataFeeds()
  {  
	  
 
   List<Cow> cows = servicesDemo.newCow();
   
   List<CowData> cowDatas = new ArrayList<CowData>(cows.size());
   
   for(Cow cow:cows){
	   CowData cowData = new CowData();
	   cowData.setFeedId(cow.getFeedId());
	   cowData.setName(cow.getName());
	   cowDatas.add(cowData);
   }
   

   
   return Response.status(200).entity(cowDatas).header(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON).build();
  }

  
  public void setServicesDemo(ServicesDemo servicesDemo) {
	this.servicesDemo = servicesDemo;
  }	
  
  
  
}
