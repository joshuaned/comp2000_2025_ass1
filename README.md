## Game outline
I turned the given project into a farming game using inheritance, interfaces, and generics.\
You start with $10 and are able to select crops and place them on their respective tile type.\
Some tiles will give a growth multipler to the plants. The tiles and plants will display various information when hovered over.\
Plants take time to grow, hovering over them will show how long is left. Plants can be collected and sold by clicking the collect button. At the top right of the window next to money, your current click mode will be shown.\
The actors are there for decoration purposes. In a future version of the game they may have worked as scarecrows.

## How I utilised Inheritence and Interfaces
I created three main abstract classes that allow the efficent use of inheritence for easily adding new plants to the game, and new kinds of tiles.\
The superclass Tile, which is set as abstract for the reason it is not to be directly used as an object itself, has a few children in this project, being Water.java, Grass.java, and Farmland.java.\
Since the children of Tile.java will all be very similar, just with little changes, cell can instead of containing all the variables and methods of the tiles, can create new objects instead.

Plant.java implements PlantInterface.java as all Plant classes must contain the method grow(), as all plants in this game are expected to grow, this makes sure that if I or anyone else worked on the project again, it is easily understood that if more Plant superclasses are to be made, for example if the plants were to have different functions and we needed to create WaterPlant.java SandPlant.java, ect... they must all have grow if they are to implement PlantInterface.java.