package codingcrack.MultiThreads.platformvsvirtualthread;

import java.io.IOException;

import java.net.http.HttpClient;

import java.util.ArrayList;
import java.util.List;

public class PlateformThreadExample {

    private static HttpClient client = HttpClient.newHttpClient();

    public PlateformThreadExample() throws IOException, InterruptedException {
    }

    public static void main(String[] args) throws InterruptedException {

        final int numberOfThreads = 10000;

        List<Thread> listThreads = new ArrayList<>();

        Runnable objRunable = new Runnable() {
            @Override
            public void run() {
                // Simulate fetching data from url
                System.out.println("Fetching data API");
                try {
                    Thread.sleep(10000);  // simulate time taken for fetching data
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Data fetched from API ");
            }
        };

        for(int i=0; i< numberOfThreads; i++){
            Thread thread = new Thread(objRunable);
            thread.setDaemon(true);
            thread.setName("Thread" + i);
            thread.start();
            String str = String.format("Thread number %s "+ i);
            System.out.println(str);
            listThreads.add(thread);
        }

        for(Thread thr: listThreads){
            thr.join();
            System.out.println(thr.getName() + " completed ");
        }
    }


    public static void callApi(){
        // Simulate fetching data from URL
        System.out.println("Fetching Data from API");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Data fetched from API");
    }


//    HttpRequest request = HttpRequest.newBuilder()
//            .uri(URI.create("https://api.publicapis.org/entries"))
//            .build();
//
//    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());



}
