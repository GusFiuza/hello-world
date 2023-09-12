package br.com.fiuzaexplica;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@DefaultValue("Fiuza") @QueryParam("name") String name) {
        return "Hello " + name + "! Wellcome to the Java world!";
    }
}
