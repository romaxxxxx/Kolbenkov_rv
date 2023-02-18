package RequestFilm;

import com.google.gson.Gson;
import model.ResponseDBCreateFilm;
import model.ResponseDBGetFilmErrorText;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Java11HttpFilm {

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public int sendGet() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/films/1"))
                .setHeader("Accept", "*/*")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ResponseDBCreateFilm data = new Gson().fromJson(response.body(),ResponseDBCreateFilm.class);

        return response.statusCode();

    }

    public ResponseDBGetFilmErrorText sendGet9999Film() throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:8080/films/9999"))
                .setHeader("Accept", "*/*")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ResponseDBGetFilmErrorText data = new Gson().fromJson(response.body(), ResponseDBGetFilmErrorText.class);

        return data;

    }

    public ResponseDBCreateFilm sendPost(String body) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create("http://localhost:8080/films"))
                .setHeader("Content-Type", "application/json") // add request header
                .setHeader("Accept", "*/*")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ResponseDBCreateFilm data = new Gson().fromJson(response.body(),ResponseDBCreateFilm.class);

        return data;

    }

    public ResponseDBCreateFilm sendPut(String body) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create("http://localhost:8080/films"))
                .setHeader("Content-Type", "application/json") // add request header
                .setHeader("Accept", "*/*")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ResponseDBCreateFilm data = new Gson().fromJson(response.body(),ResponseDBCreateFilm.class);

        return data;

    }

    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        System.out.println(builder.toString());
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }

}