# Red Trainer by yzsvdu
##  Public PokeMMO Bot Client
![PokeMMO Bot Client](assets/img.png)

## Features
1. **Runs while the game window is unfocused.**
2. **Auto Walk** (movement timing may be bugged sometimes, so use it in enclosed spaces)
3. **Auto Fish** (keybind 4, false swipe is necessary right now)
4. **Auto Catch** (can specify Pokémon, currently uses Pokéballs, false swipe is necessary right now)
5. **Auto Battle** (can be used for payday or level up, etc.)

## To Do List
- [ ] Add support for using other balls in Auto Catch.
- [ ] Add support for selecting for pokemons to search for. 
- [ ] Improve GUI Look and Feel 
- [ ] Add support to select move use order. 

## How to Use

### Requirements
- **Java 17 Runtime**
- [Download Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### Windows
1. Download the `windows_build` from the release.
2. Copy and paste all files from the build into `C:\Program Files\PokeMMO`.
3. Start the game with `windows_start.cmd`.
4. Start the client by running `client.jar`.

### MacOS
1. Download the `macos_build` from the release.
2. Copy and paste all files from the build into `/Users/(your-user-folder)/Library/Application Support/com.pokeemu.macos/pokemmo-client-live`.
3. Start the game by running `./macos_start.sh`.
4. Start the client by running `client.jar`.

### Warning
1. Movement key binds must be set to **WASD**.
2. Fishing Rod must be set to **4**.
3. Make sure after the client opens it says **Connected to Agent...**.
