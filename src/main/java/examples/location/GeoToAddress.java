package examples.location;

import weibo4j.Location;
import examples.oauth2.Log;
import weibo4j.model.Geos;
import weibo4j.model.WeiboException;

import java.util.List;

public class GeoToAddress {

	public static void main(String[] args) {
		String access_token = args[0];
		String coordinate = args[1];
		Location l = new Location(access_token);
		try {
			List<Geos> list = l.geoToAddress(coordinate);
			for (Geos g : list) {
				Log.logInfo(g.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
