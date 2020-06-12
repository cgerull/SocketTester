import java.net.Socket;

public class SocketTester {

    public static String connectToServer(String ip, int port) {
        String result;
        try {
            Socket socket = new Socket(ip, port);
            result = "Connected";
            socket.close();
        }
        catch (Exception ex) {
            result = "Not connected, error: " + ex.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        if (2 != args.length) {
            System.out.println("Usage: java SocketTester host(ip) port");
            System.exit(1);
        }

        String targetIP = args[0];
        int port = Integer.parseInt(args[1]);

        String result = connectToServer(targetIP, port);

        System.out.printf("Test socket %s:%d is: %s.\n", targetIP, port, result);
        System.exit(0);
    }
}
