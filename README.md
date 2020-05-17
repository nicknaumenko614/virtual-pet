# Virtual Pet

MyVirtualPet game is a no-frills application that was written as a means to practice basic Java principles: creating classes, instances, loops, methods. 
Also an attempt was made to write code that is focused, easy to read and understand, can evolve and is reusable. 
Functionality is very bare-bones, so you will not find any exception handling or user input checks.
Code consists of one class (virtualPet) and 1 instance of that class (crazyGreyCat). 
Main method resides in VirtualPetApplication.java class, and contains the game loop. 
Also in the same class are 4 other methods that handle user interaction, console outputs and checking values against a threshold.
Application's only other class, VirtualPet.java, among other items contains 4 methods to define what each interaction with a pet will do. 
It also contains a (tick) method that simply increases all needs of this virtual pet by 1 point.

This could be a good application to demonstrate basics of Java and Object Oriented Programming concepts to a coding novice.


Application creates a Virtual Pet object with 4 needs: Hunger, Thirst, Crazy level and Need for a Bathroom Break. He's a cat named crazyGreyCat.

The game's objective is to prevent the cat from "running away", which happens when any of the aforementioned needs reach 20 points.
crazyGreyCat starts out with all needs at 5 points, and users can interact with the cat by feeding him, giving him water, calming him down or letting him out for a bathroom break via keyboard inputs. 
An interaction (feeding, giving water, etc.) reduces that particular need's value by 3 points, but at the same time a game loop adds 1 point to all 4 needs.
There is also an option to do nothing, which does not reduce any needs, but adds 1 point to all 4 needs.
On top of that, some interactions adds points to other needs, for example feeding the cat makes hunger go down by 3 points, but makes Crazy Level and Bathroom Break go up by 1 point. 
Along the way, users are able to refresh their memory on how to play the game by pressing 0 (which is not considered an interaction and will not increase any needs),
or exit the game by pressing 6.

The game is a balancing act of feeding, watering, calming down and letting out the cat to make sure none of the needs reach 20 - that's when the cat "runs away" and the game ends.

Enjoy.



