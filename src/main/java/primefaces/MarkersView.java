package primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import DAO.mapDAO;

@ViewScoped
@ManagedBean(name = "markersView")
public class MarkersView implements Serializable {

	private static final long serialVersionUID = 1L;
	private MapModel simpleModel;
	private mapDAO mapDAO = new mapDAO();
	private String lat = "";
	private String lon = "";
	
	public MapModel getSimpleModel() {
		simpleModel = new DefaultMapModel();
		
	//	lat = mapDAO.getCoordenadas().substring(0,10);
		//lon = mapDAO.getCoordenadas().substring(11, 21);

		// Shared coordinates
		LatLng coord1 = new LatLng(Double.valueOf(lat), Double.valueOf(lon));

		// Basic marker
		simpleModel.addOverlay(new Marker(coord1, "Carro 1", null, "../js/icones/car2-icon.png"));
		// simpleModel.addOverlay(new Marker(coord2, "Carro
		// 2",null,"../icones/car2-icon.png"));
		// simpleModel.addOverlay(new Marker(coord3, "Carro
		// 3",null,"../icones/car2-icon.png"));
		// simpleModel.addOverlay(new Marker(coord4, "Kaleici"));

		return simpleModel;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}
	
	

}