package by.jnetworks.reduced_page_numbers;

import javax.ws.rs.*;


@Path("/reducedPageNumbers")
public class ReducedPageNumbersResources {

    @GET
    @Produces ("text/plain")
    public String getPageNumbers (@QueryParam ("rawPageNumbers") String str) {
        String res;
        try {
            res = Util.reducedPageNumbers (str);
        } catch (NumberFormatException e){
            res = e.toString ();
        }
        return res;
    }
}
