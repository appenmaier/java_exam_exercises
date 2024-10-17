# Arbeiten mit diesem Repository

## Vorbereitungen

- Installiere ein [JDK](https://www.oracle.com/java/technologies/downloads/#jdk21-windows)
- Installiere [Eclipse](https://www.eclipse.org/), [BlueJ](https://www.bluej.org/index.html) oder eine andere IDE
- Installiere [Git](https://git-scm.com/downloads)

## Klone das remote Repository

- Starte die Kommandozeile (z.B. Windows PowerShell)
- Führe den Befehl `git clone https://github.com/appenmaier/java_exam_exercises "[Pfad/Der Name Deines lokalen Repositorys]"` aus, um das remote Repository zu klonen

## Binde das lokale Repository in Eclipse oder in BlueJ ein

### Option 1: Eclipse

- Starte Eclipse
- Führe die Funktion `File - Import... - General - Projects from Folder or Archive` aus und betätige die Drucktaste `Next >`
- Gib nachfolgende Informationen ein und betätige die Drucktaste `Finish`
  - Import source: `[Pfad/Der Name Deines lokalen Repositorys]`

### Option 2: BlueJ

- Starte BlueJ
- Führe die Funktion `Projekt - Fremdprojekt öffnen...` aus
- Navigiere zu `[Pfad/Der Name Deines lokalen Repositorys]` betätige die Drucktaste `Select Folder`

## Aktualisiere das lokale Repository (bei Bedarf)

- Starte die Kommandozeile (z.B. Windows PowerShell)
- Führe den Befehl `cd "[Pfad/Der Name Deines lokalen Repositorys]"` aus, um zum Arbeitsbereich Deines lokalen Repositorys zu wechseln
- Führe den Befehl `git pull` aus, um den Arbeitsbereich zu aktualisieren