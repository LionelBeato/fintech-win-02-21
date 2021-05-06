package com.tts.behavorial.command;

public class LightOnCommand extends Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.on();
    }
}
