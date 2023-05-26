[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/1aNX3-7e)

[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11160238&assignment_repo_type=AssignmentRepo)

# Climate Pulse

A web application to explore temperature data with precision & ease.

## Table of Contents
- [Building & Running the code](#building--running-the-code)
  - [Running the Main web server](#running-the-main-web-server)
  - [Running the Helper Program](#running-the-helper-program)
  - [Development Container](#development-container)
- [Project Structure](#project-structure)
- [Dataset](#dataset)
- [Libraries](#libraries)
- [Authors](#authors)
- [Acknowledgments](#acknowledgments)

## Project Structure

```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂app
 ┃ ┃ ┃ ┣ 📂controllers    (Javalin controller classes)
 ┃ ┃ ┃ ┣ 📂helpers        (Helper classes)
 ┃ ┃ ┃ ┣ 📂models         (Data model classes)
 ┃ ┃ ┃ ┣ 📜App.java       (Main webserver program)
 ┃ ┃ ┃ ┗ 📜Constants.java (Constants used throughout the project)
 ┃ ┣ 📂resources
 ┃ ┃ ┣ 📂static           (Static Files)
 ┃ ┃ ┗ 📂templates        (Thymeleaf templates)
 ```

## Dataset

Global Climate Change Data from 1750-2013

* https://data.worldbank.org/indicator/SP.POP.TOTL
* https://www.kaggle.com/berkeleyearth/climate-change-earth-surface-temperature-data

## Building & Running the code
There are two places code can be run from
1. The **main** web server program
2. the **optional** helper program to use JDBC to load SQLite database from the CSVs using Java

### Running the Main web server
You can run the main webserver program similar to the project workshop activities
1. Open this project within VSCode
2. Allow VSCode to read the pom.xml file
 - Allow the popups to run and "say yes" to VSCode configuring the build
 - Allow VSCode to download the required Java libraries
3. To Build & Run
 - Open the ``src/main/java/app/App.java`` source file, and select "Run" from the pop-up above the main function
4. Go to: http://localhost:7001

### Running the Helper Program
The helper program in ``src/main/java/helper/ProcessCSV.java`` can be run separetly from the main webserver. 

You can run the optional helper program by
1. Open this ``src/main/java/helper/ProcessCSV.java`` source file
2. Select "Debug" from the pop-up above the main function (or "Debug Java" from the top-right dropdown)
3.. Allow the program to run

### Development Container
- For [Dev Containers](https://aka.ms/vscode-remote/download/containers), use the **Dev Containers: Clone Repository in Container Volume...** command which creates a Docker volume for better disk I/O on macOS and Windows.
     - If you already have VS Code and Docker installed, you can also click [here](https://vscode.dev/redirect?url=vscode://ms-vscode-remote.remote-containers/cloneInVolume?url=https://github.com/microsoft/vscode) to get started. This will cause VS Code to automatically install the Dev Containers extension if needed, clone the source code into a container volume, and spin up a dev container for use.
- For Codespaces, install the [GitHub Codespaces](https://marketplace.visualstudio.com/items?itemName=GitHub.codespaces) extension in VS Code, and use the **Codespaces: Create New Codespace** command.

Docker / the Codespace should have at least **4 Cores and 6 GB of RAM (8 GB recommended)** to run full build. See the [development container README](.devcontainer/README.md) for more information.

**🚨 DO NOT MODIFY THE CONTENTS OF THIS FOLDER. 🚨**


## Dependencies
* org.xerial.sqlite-jdbc (SQLite JDBC library)
* javalin (lightweight Java Webserver)
* thymeleaf (HTML template) - https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html

## Authors
* Liviru Nagahawatta
* Aqil Zaneefer

## Acknowledgments
* RMIT School of Computing Technologies
* Dr. Timothy Wiley
* Prof. Santha Sumanasekara
