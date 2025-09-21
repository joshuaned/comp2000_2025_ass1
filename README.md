## Game outline
I wanted to do something a little different from the standard expansion, which is probably going to be just moving characters and picking up items, so I made a farming game.

I turned the given project into a farming game using inheritance, interfaces, and generics.\
You start with $10 and are able to select crops and place them on their respective tile type.\
Some tiles will give a growth multiplier to the plants. The tiles and plants will display various information when hovered over.\
Plants take time to grow; hovering over them will show how long is left. Plants can be collected and sold by clicking the collect button. At the top right of the window, next to 'Money', your current click mode will be displayed.\
You must have enough money to purchase and sow the plant.\
The actors are there for decoration purposes. In a future version of the game, they may have worked as scarecrows.

### Design choices
I created an auto-generated landscapes system\
I added items in the game in the form of plants that can be sown and harvested\
And I finished up the basic game loop with a couple of crops to choose from, it should be quite expandable

### How to run my program
This program was designed in Java 21. You can run the program from main.\
Game instructions are above ^^^

## How I utilised Inheritance and Interfaces
I created three main abstract classes that allow the efficient use of inheritance for easily adding new plants to the game, new kinds of tiles, and new buttons.\
The superclass Tile, which is set as abstract for the reason that it is not to be directly used as an object itself, has a few children in this project, being Water.java, Grass.java, and Farmland.java.\
Since the children of Tile.java will all be very similar, just with little changes, the cell can, instead of containing all the variables and methods of the tiles, create new objects instead.\
I created a Button abstract superclass because the buttons would be slightly different from the cells, and since they are to be reused as objects with similar functions, this was the best approach.\
Since the button also uses x, y, width and height, I simply extended Rectangle to inherit its variables. I could also use its pre-existing contains method for checking if the player is hovering over the button.\
I created a Plant abstract superclass, as all the plants will also be very similar; this is the general idea of inheritance.
If I want to add more plants, buttons, or tile variants, I don't have to rewrite a lot of code, as I only really need to use the parent's constructor through super(), then input the variables I want.\
So by using Inheritance in my project, I have made it almost infinitely expandable, with the need to write very little code to do so.

#### How Inheritance supports good design
In my program, by utilising inheritance and creating objects that inherit from a so-called super class, being my abstract classes, allows me to avoid rewriting code for every single land tile I want to create; this is the same with the plants and buttons.\
Since they are all very similar, they can reuse the same code, and just super(data) into the abstract class's constructor. They can also directly set variables that don't always need to be set.

Plant.java implements PlantInterface.java as all Plant classes must contain the method grow(), as all plants in this game are expected to grow, this makes sure that if I or anyone else worked on the project again, it is easily understood that if more Plant superclasses are to be made, for example if the plants were to have different functions and we needed to create WaterPlant.java SandPlant.java, ect... they must all have grow if they are to implement PlantInterface.java.

#### How Interfaces Support Good Design
Interfaces allow a developer to enforce methods into a class, with the design of my project I didn't use many interfaces as they weren’t necessary with what needed to be achieved, however I did create a PlantInterface.java, which by implementing it into Plant.java sets an expectation that Plant should have the method grow, this is useful since all plants should have this function, as to grow.\
If I created more abstract plant classes, I could continue to use this interface to ensure they all implement grow(), which also provides other developers with information about the class at a glance; in this case, they will see that all plants must grow.

## How I utilised Generics
Within many of my classes, I tend to use generics instead of using the exact type.\
For example, in Plant.java, my abstract class, I make the cell use Rectangle instead of Cell, because it allows more room for what I put into it.\
Since Cell inherits from Rectangle, it allows me to not only put rectangles into cell but also Cell.\
This is useful for my program and future design implementations, for example, in the Button.java abstract class, I want to get information and data from a particular plant; however, the button is not a Cell, which could cause issues if the type were only Cell. But since Button extends Rectangle, it allows me to also create a 'dummy' plant to get the info from for my button, and can take the simple x, y, positioning from the object as it is a rectangle.
Additionally, generics also provide a kind of safety next for using similar types. When I initially used Cell cell, instead of Rectangle cell, I had errors when passing in a rectangle, as the children of Button are not Cells.

#### How Generics support good design
In my project, Generics allow me to input a variety of fields/objects into my variables. For example, instead of being limited to a variable that can only hold an ArrayList, I can use the generic List, allowing me to create a different kind of list if needed.
This allows flexibility in programming for the developer.
