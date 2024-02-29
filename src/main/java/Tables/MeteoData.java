/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author perol
 */
@Entity
@Table(name = "DATA")
@NamedQueries({
    @NamedQuery(name = "MeteoData.findAll", query = "SELECT d FROM Data d"),
    @NamedQuery(name = "MeteoData.findByCityname", query = "SELECT d FROM Data d WHERE d.cityname = :cityname"),
    @NamedQuery(name = "MeteoData.findByDatetime", query = "SELECT d FROM Data d WHERE d.datetime = :datetime"),
    @NamedQuery(name = "MeteoData.findByTempC", query = "SELECT d FROM Data d WHERE d.tempC = :tempC"),
    @NamedQuery(name = "MeteoData.findByHumidity", query = "SELECT d FROM Data d WHERE d.humidity = :humidity"),
    @NamedQuery(name = "MeteoData.findByWindspeedkmph", query = "SELECT d FROM Data d WHERE d.windspeedkmph = :windspeedkmph"),
    @NamedQuery(name = "MeteoData.findByWeatherdesc", query = "SELECT d FROM Data d WHERE d.weatherdesc = :weatherdesc")})
public class MeteoData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CITYNAME")
    private String cityname;
    @Basic(optional = false)
    @Column(name = "DATETIME")
    @Temporal(TemporalType.DATE)
    private Date datetime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEMP_C")
    private Float tempC;
    @Column(name = "HUMIDITY")
    private Integer humidity;
    @Column(name = "WINDSPEEDKMPH")
    private String windspeedkmph;
    @Column(name = "WEATHERDESC")
    private String weatherdesc;
    @JoinColumn(name = "CITYNAME", referencedColumnName = "NAME", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private City city;

    public MeteoData() {
    }

    public MeteoData(String cityname) {
        this.cityname = cityname;
    }

    public MeteoData(String cityname, Date datetime) {
        this.cityname = cityname;
        this.datetime = datetime;
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
