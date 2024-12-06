# Drawing Program
## Code Execution
### Download JFrame into Codespace
1. Do the following to setup:
sudo apt-get update
sudo apt-get install -y tightvncserver
sudo apt-get install -y novnc websockify
2. Run the following code to start a vnc server:
vncserver :1
3. Create a password

### Connect to Server and Run
1. run the server with:
websockify --web=/usr/share/novnc/ 6080 localhost:5901
2. Then open in the new browser tab; navigate to that tab, click on vnc.html, and connect with your password. Since there is no GUI program running it will say there is nothing to display. That is okay.
3. Compile samplecode/*.java
4. Change directory into samplecode folder
5. Run "export DISPLAY=: 1"
6. Execute DrawingProgram
