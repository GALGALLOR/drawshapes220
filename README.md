# DrawShapes
## Basic shape drawing program for Java

## Questions for students
* Explain the class hierarchy for shapes
Ishape --> the interface and at the top of the hierarchy
Abstract shape --> The implementation of the Ishape class
Circle, Rectangle, Square, SelectionRectangle --> Extensions of Abstract shape

* How does clicking and dragging to select a shape work?
when the mouse key is held down, a drag method is activated which draws a select box which selects all scenes within the coordinates of the region from the start point to the mouse location. 

## Core features for students to add
* Save a scene to a file
* Load a scene from a file
* Undo the last action

The DrawShapes code you have been given is for version 1.

Add features to DrawShapes for version 2 (Complete)
Add easy features from class (rectangle, new colors)(Complete), I added Green
Add more complex features from class (move shapes, scale up/down) (Complete)
Save a scene to a text file(Complete)
Load a scene from a text file(Complete)
Undo operation(Complete)
Plus TWO (2) interesting new features that are at approximately the same level of complexity as these features
What constitutes an "interesting" feature? Something approximately at the same level of detail as the bullet points above. Some ideas might be changing the order of the shapes, being able to click and drag to move a single shape, change the selected shapes in some other way, hovering over an image can bring up a menu to change something about the image, and so on.
There will be a Part B of this assignment where you test each other's code

(Complete)- 
We can now remove user by selecting shapes and clicking 'r'
We can now change colors of objects by selecting shapes and using the option "change color"