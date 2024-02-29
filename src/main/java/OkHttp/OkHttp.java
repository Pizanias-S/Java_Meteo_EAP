package OkHttp;

import java.io.IOException;

import okhttp3.OkHttpClient;

import okhttp3.Request;

import okhttp3.Response;



public class OkHttp {



    OkHttpClient client = new OkHttpClient();



    public String run(String url) throws IOException {

        Request request = new Request.Builder().url(url).build();



        try (Response response = client.newCall(request).execute()) {

            return response.body().string();

        }

    }



    public static void main(String[] args) throws IOException {

        OkHttp example = new OkHttp();

        String response = example.run("https://wttr.in/Athina?format=j1");

        System.out.println(response);

    }

}
