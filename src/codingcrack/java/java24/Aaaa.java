package codingcrack.java.java24;


import javax.net.ssl.*;
import java.io.*;
import java.security.KeyStore;

public class Aaaa {


        public static void main(String[] args) throws Exception {
            int port = 8443;

            // Load server keystore
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(new FileInputStream("serverkeystore.jks"), "password".toCharArray());

            // Create key manager factory and initialize with keystore
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(keyStore, "password".toCharArray());

            // Initialize SSL context
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(kmf.getKeyManagers(), null, null);

            SSLServerSocketFactory ssf = sslContext.getServerSocketFactory();
            SSLServerSocket serverSocket = (SSLServerSocket) ssf.createServerSocket(port);

            System.out.println("SSL Server started on port " + port);

            SSLSocket clientSocket = (SSLSocket) serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String inputLine = in.readLine();
            System.out.println("Received: " + inputLine);

            out.write("Hello, client!\n");
            out.flush();

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        }
    }

