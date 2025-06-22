# 🎮 Text Adventure Game (Game Lab)

A Java-based text adventure game featuring room exploration, inventory management, NPCs, and puzzle-solving mechanics. Built with a custom GUI interface and comprehensive game state management, including save/load functionality.

## 🎯 What I Built
- **Interactive Text Adventure**: Navigate through connected rooms using directional commands
- **Inventory System**: Collect, manage, and use items throughout the game
- **NPC Interactions**: Talk to non-player characters for story progression
- **Puzzle Mechanics**: Solve challenges like pin codes and locked doors
- **Save/Load System**: Persistent game state using Java serialization
- **GUI Interface**: Custom Swing-based interface for enhanced user experience

## ✨ Key Features
- 🗺️ **Room Navigation**: Move between connected rooms using cardinal directions (n, s, e, w, u, d)
- 🎒 **Dynamic Inventory**: Take, use, and examine items with persistent storage
- 🔐 **Lock & Key System**: Rooms and items can be locked, requiring specific keys or actions
- 💬 **NPC Dialogue**: Interactive conversations with game characters
- 🧩 **Puzzle Elements**: Pin code challenges and item combination mechanics
- 💾 **Game Persistence**: Save current progress and load previous sessions
- 📖 **File-Based Content**: Room descriptions loaded from external text files
- 🎨 **Custom Commands**: Intuitive text commands for all game interactions

## 🏗️ Game Architecture
```
Game Engine Components:
├── Game.java           # Main game loop and command processing
├── World.java          # Game world construction and room connections
├── Room.java           # Individual room properties and connections
├── Item.java           # Interactive objects and their behaviors
├── NPC.java            # Non-player character interactions
├── GameUserInterface.java  # GUI wrapper for text display
└── Room Descriptions   # External file with room narrative content
```

## 🎮 Gameplay Commands
- **Movement**: `n`, `s`, `e`, `w`, `u`, `d` - Navigate between rooms
- **Inventory**: `i` - View current inventory contents
- **Items**: `take [item]`, `use [item]`, `look [item]`, `open [item]`
- **NPCs**: `talk [character]` - Interact with game characters
- **Game State**: `save`, `load` - Preserve/restore game progress
- **Special**: `pin [code]` - Solve puzzle challenges
- **Info**: `location` - Display current room details

## 🔧 Technical Implementation
- **Command Parsing**: String tokenization and switch-case command routing
- **Data Structures**: HashMaps for room mapping, ArrayLists for inventory management
- **File I/O**: External file reading for room descriptions and game content
- **Object Serialization**: Complete game state persistence using Java serialization
- **OOP Design**: Modular class structure with separate concerns for game elements
- **Exception Handling**: Robust error handling for file operations and user input

## 📖 Learning Outcomes
This project demonstrates advanced Java programming skills:
- **Game Development Patterns**: State management, command processing, and game loops
- **Data Structure Usage**: Effective use of collections for game state management
- **File System Operations**: Reading external content files and binary serialization
- **Object-Oriented Design**: Clean separation of game entities and their behaviors
- **User Interface Development**: Integration of console logic with GUI components
- **Complex Logic Implementation**: Puzzle mechanics, conditional room access, and item interactions

## 🎲 Game Features Highlights
- **Story-Driven Adventure**: Navigate through "The Gate of Infinite Curses" and other atmospheric locations
- **Item-Based Puzzles**: Special items like "Gold_Cursed_Chest" and "Sacred Dagger" with unique mechanics
- **Character Progression**: Collect powerful items like "Sukuna's heart" through puzzle solving
- **Atmospheric Design**: Rich room descriptions and immersive narrative elements

---
**Part of my programming portfolio** | (https://github.com/AGButt04) | https://www.linkedin.com/in/abdul-ghani-butt-290056338/
