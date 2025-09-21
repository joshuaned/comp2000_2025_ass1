## Game outline
I wanted to do something a little different then whats probably going to be just moving characters and picking up items, so I made a farming game.

I turned the given project into a farming game using inheritance, interfaces, and generics.\
You start with $10 and are able to select crops and place them on their respective tile type.\
Some tiles will give a growth multipler to the plants. The tiles and plants will display various information when hovered over.\
Plants take time to grow, hovering over them will show how long is left. Plants can be collected and sold by clicking the collect button. At the top right of the window next to money, your current click mode will be shown.\
The actors are there for decoration purposes. In a future version of the game they may have worked as scarecrows.

### Design choices
I created an auto generated landscapes system\
I added items in the game in the form of plants that can be sown and harvested\
And I finished up the basic game loop with a couple crops to choose from, it should be quite expandable

### How to run my program
This program was designed in Java 21, you can run the program from main.\
Game instructions are above ^^^

## How I utilised Inheritence and Interfaces
I created three main abstract classes that allow the efficent use of inheritence for easily adding new plants to the game, and new kinds of tiles.\
The superclass Tile, which is set as abstract for the reason it is not to be directly used as an object itself, has a few children in this project, being Water.java, Grass.java, and Farmland.java.\
Since the children of Tile.java will all be very similar, just with little changes, cell can instead of containing all the variables and methods of the tiles, can create new objects instead.

Plant.java implements PlantInterface.java as all Plant classes must contain the method grow(), as all plants in this game are expected to grow, this makes sure that if I or anyone else worked on the project again, it is easily understood that if more Plant superclasses are to be made, for example if the plants were to have different functions and we needed to create WaterPlant.java SandPlant.java, ect... they must all have grow if they are to implement PlantInterface.java.

## How I utilised Generics
Within many of my classes I tend to use generics instead of using the exact type.\
For example, in Plant.java my abstract class, I make cell use Rectangle instead of Cell, because it allows more room with what I put into it.\
Since Cell inherits from Rectangle, it allows me to not allow put rectangles into cell but also Cell.\
This is useful for my program and future design implementations as for example, in the Button.java abstract class, I want to get information and data from a perticular plant, however the button is not a Cell, which could cause issues if the type was only Cell cell. But since Button extends Rectangle, it allows me to also create a 'dummy' plant to get the info from for my button, and can take the simple x, y, positioning from the object as it is a rectangle.