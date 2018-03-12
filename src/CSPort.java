/*
Custom Serial Port wrapper
Stephen Flores
CanSat 2018

Model as singleton? Or pass to constructors?
*/

// ***** Imports
import java.io.*; // Exceptions, etc
import java.util.*;
import gnu.io.CommPortIdentifier;
import gnu.io.*; // RXTX

class CSPort {
    // Data vars
    SerialPort port;
    
    // Constructor 
    public CSPort() {
        
    }
    
    // List available ports
    public String[] availablePorts() {
        ArrayList<String> list = new ArrayList<String>();
        java.util.Enumeration<CommPortIdentifier> portEnum = CommPortIdentifier.getPortIdentifiers();
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier pIdentifier = portEnum.nextElement();
            list.add(pIdentifier.getName());
        }
        
        // Cast to Array and return
        String[] temp = new String[list.size()];
        return list.toArray(temp);
    }
    
    // Connect to a port given a string
    public void connect(String str) {
        
    }
}
