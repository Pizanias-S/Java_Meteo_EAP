package Tables;

import java.io.Serializable;
import java.util.Date;


public class MeteoData implements Serializable {

    private String cityname;

    private Date datetime;

    private Float tempC;

    private Integer humidity;

    private String windspeedkmph;

    private String weatherdesc;

    private City city;


    public MeteoData(String cityname, Date datetime, float tempC, int humidity, String windspeedkmph, String weatherdesc) {
        this.cityname = cityname;
        this.datetime = datetime;
        this.tempC = tempC;
        this.humidity = humidity;
        this.windspeedkmph = windspeedkmph;
        this.weatherdesc = weatherdesc;

    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Float getTempC() {
        return tempC;
    }

    public void setTempC(Float tempC) {
        this.tempC = tempC;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getWindspeedkmph() {
        return windspeedkmph;
    }

    public void setWindspeedkmph(String windspeedkmph) {
        this.windspeedkmph = windspeedkmph;
    }

    public String getWeatherdesc() {
        return weatherdesc;
    }

    public void setWeatherdesc(String weatherdesc) {
        this.weatherdesc = weatherdesc;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityname != null ? cityname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MeteoData)) {
            return false;
        }
        MeteoData other = (MeteoData) object;
        if ((this.cityname == null && other.cityname != null) || (this.cityname != null && !this.cityname.equals(other.cityname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tables.Data[ cityname=" + cityname + " ]";
    }
    
}
