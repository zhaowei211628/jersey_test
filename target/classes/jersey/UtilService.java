package jersey;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jersey.service.iface.IMessageService;
import model.Message;

@Controller
@Path("/util")
public class UtilService {
	
	@Autowired(required=true)
	private IMessageService messageService;

	@Path("/hello")
    @GET
    @Produces({ MediaType.TEXT_PLAIN })
    public String hello() {
		System.out.println("welcome!");
        return "Welcome!";
    }
	

	@Path("/chat")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)  
    @Produces(MediaType.APPLICATION_JSON)
	public Message chat(Message msg){
	
		return messageService.convertMessage(msg);
	}


	
	
}
