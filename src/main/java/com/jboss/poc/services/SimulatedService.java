package com.jboss.poc.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

@Path("/")
public class SimulatedService {
	
	public SimulatedService(){}
	
	@POST
	@Path("/{org_id}/incidents")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String doResilient(@Body String data, @PathParam("org_id") String org_id){
		return data;
	}
	
	@GET
	@Path("/api/siem/offenses")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getOffenses(){
		return null;
	}
	
	@POST
	@Path("/api/siem/offenses/{offense_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postOffenses(@PathParam("offense_id") String offense_id){
		return null;
	}
	
	@GET
	@Path("/api/siem/offense_closing_reasons")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getOffensesClosingReasons(){
		return null;
	}
	
	@GET
	@Path("/api/siem/source_addresses")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getSourceAddresses(){
		return null;
	}
	
	@GET
	@Path("/api/siem/local_destination_addresses")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getLocalDestinationAddresses(){
		return null;
	}
	
	@GET
	@Path("/api/config/domain_management/domains")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getDomains(){
		return null;
	}
	
	@GET
	@Path("/api/reference_data/sets")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getSets(){
		return null;
	}
	
	@POST
	@Path("/api/reference_data/sets")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postSets(){
		return null;
	}
	
	@GET
	@Path("/api/siem/offense_types")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getOffenseTypes(){
		return null;
	}
	
	@POST
	@Path("/api/ariel/searches")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String postArielSearch(){
		return null;
	}
	
	@GET
	@Path("/api/ariel/searches")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getArielSearchId(){
		return null;
	}
	
	@GET
	@Path("/api/ariel/searches/{search_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public String getArielSearchResult(@PathParam("search_id") String search_id){
		return null;
	}
	
	
	
}
