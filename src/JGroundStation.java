/*
Java Ground Station
Stephen Flores
CanSat 2018
For all you Windows users out there

Requires RXTX Library for development (see rxtx folder)
Running on Java version 1.8.0_131
*/

// ***** Imports
import java.io.*;
import java.util.*;
import gnu.io.*;
import gnu.io.CommPortIdentifier;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// ***** Main Class
public class JGroundStation {

    // ***** Main function
    public static void main(String[] args) {
        System.out.println("JGroundStation: Starting up");

        // Setup main frame and sub-panels
        JFrame mainFrame = new JFrame("Main Frame");

        // Create two subpanels:
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // Make it visible
        mainFrame.setSize(800, 600);
        mainFrame.setVisible(true);

        // Test array
        CSPort port = new CSPort();
        String[] ports = port.availablePorts();
        System.out.println("Checking available ports");
        for (int i = 0; i < ports.length; i++) {
            System.out.println(ports[i]);
        }
        System.out.println("Done");
    }

    // *****
}
