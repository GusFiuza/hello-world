package br.com.fiuzaexplica;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@DefaultValue("Fiuza") @QueryParam("name") String name) {
        if (name.equals("Fiuza")) {
            return "Hello " + name + "! Wellcome to the Java world!";
        } else if (name.equals("Gustavo")) {
            return "Hello " + name + "!";
        } else {
            return "Olá " + name + "!";
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{language}")
    public String helloTranslation(@DefaultValue("Fiuza") @QueryParam("name") String name, @PathParam("language") String language) {
        if (language.equals("English")) {
            return "Hello " + name + "! Wellcome to the Java world!";
        } else if (language.equals("Portuguese")) {
            return "Olá " + name + "! Bem vindo ao mundo Java!";
        } else {
            return "Hello " + name + "! I don't speak your language.";
        }
    }
}
