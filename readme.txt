## Java Ground Station
For all you Windows users out there

Note! In order to use RXTX library:
1. Download and unzip the binaries
2. Place them in the appropriate directory (both the .jar and the .jnilib)
    a. macOS: in /Library/Java/Extensions
    b. Win*: C:\Program Files\Java\jre1.6.0_01\bin (for the .dlls)
             C:\Program Files\Java\\jre1.6.0_01\lib\ext (for the .jar)
    c. Linux: use a mac
3. Compatibility notes
    a. For macs, you'll need the 64-bit intel version of .jnilib 
        that can be found here: http://blog.iharder.net/2009/08/18/rxtx-java-6-and-librxtxserial-jnilib-on-intel-mac-os-x/
        You could also force it into 32-bit mode with the -d32 flag for 'java' command
        If there's a locking issue, then:
            sudo mkdir /var/lock
            sudo dscl . -append /groups/_uucp GroupMembership username 
            sudo chgrp uucp /var/lock 
            sudo chmod 775 /var/lock
        This will solve the PortInUseException thing