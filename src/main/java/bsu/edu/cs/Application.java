package bsu.edu.cs;

public class Application {
    public Application() throws IOException {
        URL url = new URL("https://en.wikipedia.org/wiki/Video_game");
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent","Revision Reporter/0.1 (ej.wade@bsu.edu)");
        InputStream inputStream = connection.getInputStream();
    }
    //See User Changes

    //See Location Changes
}
