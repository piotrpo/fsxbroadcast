package pl.com.digita.fsx;

import pl.com.digita.fsx.model.Location;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Piotr on 2015-04-15.
 *
 *
 *
 */



@Path("/api")
public class LocationService
{
    @GET
    @Path("/location")
    @Produces("application/json")
    public Location getLastLocation()
    {
        return new Location();
    }


    @POST
    @Path("/location")
    @Consumes(MediaType.APPLICATION_JSON)
    public void setLocation(Location pLocation)
    {

    }
}
