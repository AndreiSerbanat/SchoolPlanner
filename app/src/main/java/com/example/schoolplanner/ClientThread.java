package com.example.schoolplanner;

import android.util.Log;
import android.widget.TextView;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread {

    private String sendMsg;

    public ClientThread(String sendMsg) {

        this.sendMsg = sendMsg;
    }

    @Override
    public void run() {
        try {
            int port = 8000;
            String ipAddress = "172.25.48.1";
            Socket clientSocket = new Socket(ipAddress, port);

            PrintWriter printWriter = Helper.getWriter(clientSocket);
            printWriter.println(sendMsg+"\r\n");
            Log.e(Constants.TAG,"before readline");

            BufferedReader bufferedReader = Helper.getReader(clientSocket);
            final String result = bufferedReader.readLine();

        } catch (UnknownHostException unknownHostException) {
            Log.e(Constants.TAG, unknownHostException.getMessage());
            if (Constants.DEBUG) {
                unknownHostException.printStackTrace();
            }
        } catch (IOException ioException) {
            Log.e(Constants.TAG, ioException.getMessage());
            if (Constants.DEBUG) {
                ioException.printStackTrace();
            }
        }
    }
}
