package mastermind.distributed.dispatchers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import mastermind.models.Color;
import mastermind.types.Error;

public class TCPIP extends utils.TCPIP {

    public static TCPIP createClientSocket() {
        try {
            Socket socket = new Socket("localhost", 2020);
            System.out.println("Cliente> Establecida conexion");
            return new TCPIP(socket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TCPIP createServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(2020);
            System.out.println("Servidor> Esperando conexion...");
            Socket socket = serverSocket.accept();
            System.out.println("Servidor> Recibida conexion de " + socket.getInetAddress().getHostAddress() + ":"
                    + socket.getPort());
            return new TCPIP(serverSocket, socket);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public TCPIP(Socket socket) {
        super(socket);
    }

    public TCPIP(ServerSocket serverSocket, Socket socket) {
        super(serverSocket, socket);
    }

    public void send(Color color) {
        if (color == null) {
            this.send("null");
        }else {
            this.send(color.name());
        }
    }

    public Color receiveColor() {
        String color = this.receiveLine();
        if (color.equals("null")) {
            return null;
        }
        return Color.valueOf(color);
    }

    public void close() {
        this.send(FrameType.CLOSE.name());
        super.close();
    }

}
