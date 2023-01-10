# Connect Android device in Wireless debugging mode:

Enable Developers options in android device and enable below:

USB debugging
Wireless debugging
 

In Terminal type:

Step 1) adb kill-server

Step 2) Connect UDB cable with Android device

Step 3) adb start-server

Step 4) adb tcpip 5555

Step 5) adb connect <your device IP>:5555

Step 6) Disconnect usb cable and now your device is on wireless debugging mode.

Step 7) adb devices -l

This command will show like:

10.1.24.149:5555

 

Add above value in test script under “deviceName” parameter and run.
