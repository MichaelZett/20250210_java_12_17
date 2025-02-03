* javac HelloWindow.java
* Ergebnis samt Package-Ordnern ins tool-Verzeichnis legen
* dort: jar cfe HelloWindowApplication.jar de.zettsystems.pack.HelloWindow de/zettsystems/pack/HelloWindow.class
* Ergebnis ins tool_in Verzeichnis legen
* aus dem Hauptverzeichnis:
* jpackage --type app-image --input ./tool_in --dest ./tool_out --name HelloWindowExe --main-jar HelloWindowApplication.jar --main-class de.zettsystems.pack.HelloWindow
* lauffähige Anwendung liegt dann unter tool_out