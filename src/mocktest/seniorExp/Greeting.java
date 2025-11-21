import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@FunctionalInterface
 interface WorldMore {
    void sayHello(String name);

}

interface MyIntf {
    private void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

public static void main(String[] args) throws IOException, InterruptedException {


   WorldMore greet = (name) -> System.out.println("Hello" + name);
  //  greet.sayHello("  Ngawang");


//  List<String>  lists =  Arrays.asList("Ngawang", "Yeshi", "Dolma", "Dawa", "Sonam", "Karma");
//    lists.stream().filter(n->n.startsWith("N"))
//            .map(String::toUpperCase)
//            .forEach(System.out::println);
//

//
//  LocalDate date = LocalDate.now();
//
//  LocalTime time = LocalTime.now();
//
//  LocalDateTime dateTime = LocalDateTime.now();
//
//    System.out.println(dateTime);
//

//    List<String> names = List.of("Alice", "Bob", "Charlie");
//    names.stream().forEach(System.out::println);


//    System.out.println(" ".isBlank());         // true
//    System.out.println("Hello\nWorld".lines().count()); // 2


//    System.out.println("   Hello   ".strip());   // trims whitespace
//    System.out.println("Line1\nLine2".lines().count());  // 2
//    System.out.println( "".isBlank());   // true


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.example.com"))
            .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());




}