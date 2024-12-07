# Drawing Program
## Code Execution
### Download JFrame into Codespace
1. Do the following to setup:
a. sudo apt-get update
b. sudo apt-get install -y tightvncserver
c. sudo apt-get install -y novnc websockify

2. Run the following code to start a vnc server: \
vncserver :1

3. Create a password

### Connect to Server and Run
1. run the server with: \
websockify --web=/usr/share/novnc/ 6080 localhost:5901
2. Then open in the new browser tab; navigate to that tab, click on vnc.html, and connect with your password. Since there is no GUI program running it will say there is nothing to display. That is okay.
3. Compile samplecode/*.java
4. Change directory into samplecode folder
5. Run "export DISPLAY=: 1"
6. Execute DrawingProgram

## Code Modification
### Program Architecture (MVC)
1. class View: Represents the GUI and splits window into panels like button panel and drawing panel. (View and Controller of MVC)
2. interface UIContext: Ensures subclasses implement methods such as drawLine and drawLabel. 
3. class NewSwingUI: Implements UIContext and contains the actual drawing methods of labels and lines into the GUI. (Raw method definitions for drawing)
4. class Model: Contains *item* (lines, shapes, selected objects), basically the *model* of MVC. (Model of MVC)
5. abstract class Command: Updates model by creating and calling on methods within item subclasses. (Controller of MVC)
6. class UndoManager: Calls on *command* subclass methods like *execute* to add to model and remove. (Controller of MVC)
7. Button classes: The button classes call for *Command* subclasses to trigger item methods. (View of MVC)

### Adding New Shape
1. Define new shape by extending *item*.
2. Define how to draw shape in *NewSwingUI*.
3. Define new command by extending *Command*.
4. Define new button by extending *JButton*.
5. Create new button instance and add it to button panel in *View*.
