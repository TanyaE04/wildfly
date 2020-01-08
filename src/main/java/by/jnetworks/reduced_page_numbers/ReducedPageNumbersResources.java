package by.jnetworks.reduced_page_numbers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/reducedPageNumbers")
public class ReducedPageNumbersResources {

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response getPageNumbers (@QueryParam ("rawPageNumbers") String str) {
        String result;
        int status = 200;
        try {
            result = "{\n\t\"original\": "+str+"\n\t\"reduced\": "+Util.reducedPageNumbers (str)+"\n}";
        } catch (NumberFormatException e){
            status= 500;
            result = e.toString ();
        }
        return Response.status (status).entity (result).build ();
    }
}
