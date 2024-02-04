### Q50.java
    - Entry to the Program 
    - Initializes glfw with glfwInit() 
    - Main while loop in function Rk() 

### MJ0.java 
    - Appears to be window manager 
    - ne0 member is a GLFWwindow* window

### Oj.java
    - Appears to be ui display 
    - has other players WX.java object stored in js0.eG0.qb.ND 
    - chat messages at js0.MH0.

### mc.java
    - Button ui element for battle gui

### js.java
    - main gui

### JG0.java 
    holds 

### aY.java
    - h8() 
        - initalizes input pulling and callbacks
    jF0 is the window manager
    Jf0.ne0 is the window: GLFWwindow* window
    
    - ko() appears to reset the input polling ?
    - gt0() returns boolean on state of right mouse click
    - f() appears to map key codes maybe to switch keybinds



### Xb0.java
    - Implements the update() function in the mainlook of Rk()
    - update() function handles music processing
    - music class to handle audio


### Y7.java 
    - extends GLFWKeyCallBack, handles Key inputs
    - initalized with instance of aY 
    - Bk member is instance of aY

### WX.java 
    - Online player identification    


### Mp.java
    Has member Xb0.java
    Implements a thread
    Handles music

### j40.java 
    -Loaded pokemon 
    -UD0.java 
        -pokemon detailed general knowledge that can be displayed
        -
    -Q90.java 
        -pokemon stats, abiliy pps stored here
        - field rl0 holds the pps
        - field  ko0 holds the evs
        - field Yq0 holds owner's name
        - field COm1 of type aq0 is current party status of pokemon
        - field od is pokemon level
        - field Hq0 is pokemon health


### Oj.java 
    - Renders Display
    - field js0 of type js is main gui 


    - field K7 of type vH holds battle event information
        - field AJ0 of type No0 marks if battle gui is present 
        - field P2 of type Gp0 holds battle states 
            -field i0 is the type of terrain battle started
            -field rx is type of battle (horde single)
            -field ta0 of type QZ[] appears to hold trainers data
            -field cl of type hm0[2][] holds the enemies/wild pokemon data
                - hm0[0][i] holds your current pokemon(s) outside as a hm0 list
                    -K0 holds current pokemon battling data
                        - field hp0 is the pokemons hp
                        - field ta is the Q90 object, the pokemons stats 
                - hm0[1][i] holds the enemy/wild pokemon(s) outside

### kf.java (battle gui)
    -rX of type f.WD[] holds attack move stats
    -Js of type f.Hj[][] holds the two pokemons outside on the field
    -Y2, Uq0 of type f.mc[] holds attack move names
    -AD of type f.Gp0 holds battle environment info / state


### Ap.java
    - Buttons for main login screen 



### mc.java 
    - Buttons for battle gui 
    - field com9 is title for button

