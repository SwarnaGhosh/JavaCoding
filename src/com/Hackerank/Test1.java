package com.Hackerank;

import java.net.*;
import java.net.SocketException;
import java.util.*;

public class Test1 {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for(NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
    }
    static void displayInterfaceInformation(NetworkInterface netint) {

        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();

        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            System.out.println("Display name: " + netint.getDisplayName());
            System.out.println("InetAddress: " + inetAddress.getHostAddress());
        }

    }
}
