package com.example.common.modularfilter;

public class RaptorManager {
    private PrinterManager printerManager;

    public RaptorManager(PrinterManager printerManager) {
        this.printerManager = printerManager;
    }
    public String getRaptorValue() {
        return printerManager.getRaptorValue("RaptorManager");
    }
}
