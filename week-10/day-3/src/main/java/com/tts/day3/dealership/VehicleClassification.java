package com.tts.day3.dealership;

public enum VehicleClassification {

    // these CONSTANTS can be thought of
    // as individual static instances
    // VehicleClassification NEW = new VehicleClassification(true, true)
    NEW(true, true),
    USED(false, true),
    OFF_LEASE(true, true),
    SHUTTLE(true, false),
    LOANER(false, false),
    PARTS_RUNNER( true, true);

    private boolean warranty;
    private boolean freeService;

    public boolean WarrantyOffered() {
        return warranty;
    }

    public boolean FreeServiceOffered() {
        return freeService;
    }

    VehicleClassification(boolean warranty, boolean freeService) {
        this.warranty = warranty;
        this.freeService = freeService;
    }
}
