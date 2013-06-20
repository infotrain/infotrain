package webservice;

import javax.ws.rs.*;
import dao.DatabaseService;

@Path("/Test")
public class TestService extends DatabaseService {		
	
	@GET
	@Path("/TestConnection")
	@Produces("application/json")
	public String testConnection() throws Exception {
		// here's some borkaborka change
		return String.valueOf($Db().isClosed());
	}

}
