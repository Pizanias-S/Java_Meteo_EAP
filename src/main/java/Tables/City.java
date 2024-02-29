/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CITY")
@NamedQueries({
    @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c"),
    @NamedQuery(name = "City.findByName", query = "SELECT c FROM City c WHERE c.name = :name"),
    @NamedQuery(name = "City.findByLocation", query = "SELECT c FROM City c WHERE c.location = :location"),
    @NamedQuery(name = "City.findByCode", query = "SELECT c FROM City c WHERE c.code = :code"),
    @NamedQuery(name = "City.findByLatitude", query = "SELECT c FROM City c WHERE c.latitude = :latitude"),
    @NamedQuery(name = "City.findByLogitude", query = "SELECT c FROM City c WHERE c.logitude = :logitude"),
    @NamedQuery(name = "City.findByAirportCode", query = "SELECT c FROM City c WHERE c.airportCode = :airportCode"),
    @NamedQuery(name = "City.findByApperance", query = "SELECT c FROM City c WHERE c.apperance = :apperance"),
    @NamedQuery(name = "City.findBySearch", query = "SELECT c FROM City c WHERE c.search = :search")})
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "CODE")
    private String code;
    @Column(name = "LATITUDE")
    private String latitude;
    @Column(name = "LOGITUDE")
    private String logitude;
    @Column(name = "Airport Code")
    private String airportCode;
    @Column(name = "APPERANCE")
    private Integer apperance;
    @Column(name = "SEARCH")
    @Temporal(TemporalType.DATE)
    private Date search;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "city")
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
