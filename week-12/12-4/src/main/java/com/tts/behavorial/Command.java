package com.tts.behavorial;

// code from here: https://refactoring.guru/design-patterns/command/java/example

public abstract class Command {

    public Editor editor;
    // this variable represents a previous state of your text
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // this is more or less a setter
    void backup() {
//        backup = editor.textField.getText();
    }

    // here we invoke textField's setter and pass in the value of our backup
    public void undo() {
        // this method is setting back the text to the previous state
//        editor.textField.setText(backup);
    }

    public abstract boolean execute();

}
