package by.jnetworks.reduced_page_numbers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/reducedPageNumbers")
public class ReducedPageNumbersResources {

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public String getPageNumbers (@QueryParam ("rawPageNumbers") String str) {

        String res;
        try {
            res = "{\n\t\"original\": "+str+"\n\t\"reduced\": "+Util.reducedPageNumbers (str)+"\n}";
        } catch (NumberFormatException e){
            Response.status (500).build ();
            res = e.toString ();
        }
        return res;
    }
}
