## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## How to run (Windows PowerShell)

Compile the program from the repository root and run it using the following commands in PowerShell:

```powershell
javac -d bin -sourcepath src src\App.java
java -cp bin App
```

You can also pipe an example password to the program to test it non-interactively:

```powershell
echo myP@ssw0rd | java -cp bin App
```

Sample runs:

- Input: `hello123` -> Output: `Weak` (missing special character)
- Input: `Hello@123` -> Output: `Strong`

