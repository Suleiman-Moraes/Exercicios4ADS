package br.com.senaigo.restfulbasico;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/clima")
public class ClimaRESTfulService {
	private static final DateFormat df = new SimpleDateFormat("yyy-MM-dd");

	//
	// http://localhost:8080/contextPath/rest/weather/{location}/{date}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago/2016-09-27
	// http://localhost:8080/contextPath/rest/weather/hanoi/2016-09-27
	//
	@Path("{location}/{date}")
	@GET
	@Produces("application/xml")
	public String getClima_XML(@PathParam("location") String location, @PathParam("date") String date) {
		Date data = null;
		if (date == null || date.length() == 0) {
			data = new Date();
		} else {
			try {
				data = df.parse(date);
			} catch (ParseException e) {
				data = new Date();
			}
		}
		date = df.format(data);

		String[] climas = new String[] { "Hot", "Rain", "Cold" };
		int i = new Random().nextInt(3);
		String clima = climas[i];

		return String.format("<clima>"//
				+ "<date>%s</date>"//
				+ "<location>%s</location>"//
				+ "<info>%s</info>"//
				+ "</clima>", date, location, clima);
	}

	//
	// http://localhost:8080/contextPath/rest/weather/{location}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago
	// http://localhost:8080/contextPath/rest/weather/hanoi
	//
	@Path("{location}")
	@GET
	@Produces("application/xml")
	public String getClima_XML(@PathParam("location") String location) {
		return getClima_XML(location, null);
	}

	//
	// http://localhost:8080/contextPath/rest/weather/{location}/{date}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago/2016-09-27
	// http://localhost:8080/contextPath/rest/weather/hanoi/2016-09-27
	//
	@Path("{location}/{date}")
	@GET
	@Produces("application/json")
	public String getClima_JSON(@PathParam("location") String location,
			@PathParam("date") String date) {

		Date data = null;
		if (date == null || date.length() == 0) {
			data = new Date();
		} else {
			try {
				data = df.parse(date);
			} catch (ParseException e) {
				data = new Date();
			}
		}
		date = df.format(data);

		String[] weathers = new String[] { "Hot", "Rain", "Cold" };
		int i = new Random().nextInt(3);
		String weather = weathers[i];

		return "{" //
				+ "'date': '" + date + "'," //
				+ "'location': '" + location + "'," //
				+ "'info': '" + weather + "'" //
				+ "}";
	}

	//
	// http://localhost:8080/contextPath/rest/weather/{location}
	// Example:
	// http://localhost:8080/contextPath/rest/weather/chicago
	// http://localhost:8080/contextPath/rest/weather/hanoi
	//
	@Path("{location}")
	@GET
	@Produces("application/json")
	public String getClima_JSON(@PathParam("location") String location) {
		return getClima_JSON(location, null);
	}
}
