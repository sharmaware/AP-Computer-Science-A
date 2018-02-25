/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class MemoryCounter extends Counter {

    private int memoryValue = 0;

    public MemoryCounter() {
        super();
    }

    public void addMemoryValue() {
        memoryValue = this.getValue();
    }

    public void resetMemoryValue() {
        memoryValue = 0;
    }

    public int getMemoryValue() {
        return memoryValue;
    }
}
