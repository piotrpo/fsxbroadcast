package pl.com.digita.fsx.model;

/**
 * Created by Piotr on 2015-04-15.
 *
 *
 */




public class Location
{
    double longitude;
    double latitude;
    double altitude;

    public Location()
    {
    }

    public Location(double pLongitude, double pLatitude, double pAltitude)
    {
        longitude = pLongitude;
        latitude = pLatitude;
        altitude = pAltitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(double pLongitude)
    {
        longitude = pLongitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(double pLatitude)
    {
        latitude = pLatitude;
    }

    public double getAltitude()
    {
        return altitude;
    }

    public void setAltitude(double pAltitude)
    {
        altitude = pAltitude;
    }
}
