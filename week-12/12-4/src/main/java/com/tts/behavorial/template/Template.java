package com.tts.behavorial.template;


// below is a template for any classes that need to
// implement behaviors and inherit properties
public abstract class Template {

    private Long id;
    private String name;

    public abstract void doThing();


    public Template(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
