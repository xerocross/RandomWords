# RandomWord

This command-line utility contains a large dictionary of words (using a rather loose definition of what qualifies as a "word"). The program randomly chooses n words from the dictionary. It accepts the number `n` as input using the `-n` option.

If this line is still here, the project is not yet in a functioning state.

## Requirements

Minimizing the code footprint is not a priority here. I'm practicing the Spring framework and certain related programming techniques and good practices. These are the requirements.

* It works as expected, in an unsurprising way, transparently to the user.
* It handles errors gracefully and robustly.
* The code, while not small in footprint, still makes sense and is transparent and readable.

## As a Spring Project

This is a Spring project I created specifically to practice various techniques. It is **not intended to represent the way I would write a production app**. Some choices were made for no reason but simply to practice a technique.

* I'm quite aware that using the Spring Boot framework here is overkill in the style of using a rocket launcher to kill a spider. I could easily have written a single Java class to perform all of the functionality this program provides with no dependencies other than the standard Java API. I am practicing the Spring framework itself to learn it, and also practicing division of logic into distinct logical layers, and extracting configuration data into configuration files. Even so, I hold myself to the standard that the program should function correctly and transparently from the point of view of the user, even if it is a larger program than it needed to be.
* I specifically chose to use XML configuration, for practice, even though that is unusual in a Spring Boot project and, some would argue, bad style.