package Tables;

import java.io.Serializable;
import java.util.Date;


public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String location;

    private String code;

    private String latitude;

    private String logitude;

    private String airportCode;

    private Integer apperance;

    private Date search;

    private MeteoData data;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLogitude() {
        return logitude;
    }

    public void setLogitude(String logitude) {
        this.logitude = logitude;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Integer getApperance() {
        return apperance;
    }

    public void setApperance(Integer apperance) {
        this.apperance = apperance;
    }

    public Date getSearch() {
        return search;
    }

    public void setSearch(Date search) {
        this.search = search;
    }

    public MeteoData getData() {
        return data;
    }

    public void setData(MeteoData data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tables.City[ name=" + name + " ]";
    }
    
}
