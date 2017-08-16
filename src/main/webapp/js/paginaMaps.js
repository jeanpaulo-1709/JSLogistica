	var infoWindow = null;
	var map = null;
	var markersArray = [];
	

	initialize();

	function initialize() {

		var xmlhttp = new XMLHttpRequest();
		var url = "http://192.168.1.25:8085/js/latlon.jsp";

		xmlhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				var myArr = JSON.parse(this.responseText);
				
				var myLatlng = new google.maps.LatLng(myArr.lat,myArr.lon); 
				
				var myOptions = {
						zoom : 20,
						center : myLatlng,
						mapTypeId : google.maps.MapTypeId.ROADMAP
						
					}
				
				map = new google.maps.Map(document.getElementById("map_canvas"),myOptions);
				var trafficLayer = new google.maps.TrafficLayer();
				trafficLayer.setMap(map);

				var pink_parks = [];
				map.setOptions({styles : pink_parks	});

				directionsDisplay = new google.maps.DirectionsRenderer();
				directionsDisplay.setMap(map);

				infoWindow = new google.maps.InfoWindow;
			}
		};
		
		xmlhttp.open("GET", url, true);
		xmlhttp.send();
		
		updateMaps();
		window.setInterval(updateMaps, 5000);
	}

	function updateMaps() {
		
		var xmlhttp = new XMLHttpRequest();
		var url = "http://192.168.1.25:8085/js/latlon.jsp";

		xmlhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				var myArr = JSON.parse(this.responseText);
				
				var latlng = new google.maps.LatLng(myArr.lat,myArr.lon);

				if (markersArray.length > 0)
			    {
			        marker = markersArray[0];
			    } else
			    {
			        marker = new google.maps.Marker({
			            position: latlng,
			            map: map,
			            icon: "icones/carr.png"
			        });
			    }
				
				marker.animateTo(latlng, { duration: 5000 });

			    markersArray.push(marker);
				
			}
			
		};
		
		xmlhttp.open("GET", url, true);
		xmlhttp.send();
		
	}


