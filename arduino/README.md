**Introduction to Arduino -- Blinking the light**

**Goals**
1. Understand that all electrical parts need electricity to work.
2. Realize that direct current electricity can flow in two directions.  Light emitting diodes (LEDs) need to have electricity flowing through the long leg first.
3. Learn how to make a circuit both with an Arduino and without.

**Required Materials (per group or per individual)**
1. Arduino 
2. Wires
3. Breadboard
4. 220 ohm resistor
5. Multiple LEDs
6. USB-B Cable for the Arduino
7. Computer

**Steps**

*First*, set up a breadboard as follows:

1. Connect a wire from the 5v socket of the Arduino to the red rail of the breadboard.
2. Connect a wire from the red rail to an empty row in the middle of the breadboard.
3. Connect one leg of the 220 ohm resistor to the aforementioned row, connect the other leg to another empty row in the middle of the breadboard.
4. Connect the long leg of the LED to another empty row in the middle of the breadboard.
5. Connect a wire to a hole in the same row as the short leg of the LED to a blue rail on the side of the breadboard.
6. Connect a wire from the blue rail of the breadboard to a GND socket on the Arduino.
7. Plug the USB cable into the Arduino and connect it to the computer.

If everything is set up okay, your LED should light up.  

(Teacher notes: Stress the flow of electricity.  Start with power coming from the computer, going through the Arduino, and continuing through the light until it goes back to the Arduino.  And it's okay to mess up.  Just be able to explain why things didn't work.)

*Second*, take the wire coming from the red rail of the breadboard out of the 5v socket and put it in the 13 socket.

Copy and paste this program into whatever you use to upload code to the Arduino and upload it.
https://gist.github.com/brooksware2000/3297002

See what happens.  See if they understand why the light blinks off and on.  How does it relate to the electricity getting to the LED?  
