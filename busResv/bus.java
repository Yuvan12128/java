class bus {
    private int busno;
    private boolean ac;
    private int capacity; // get and set metho;

    bus(int no, boolean ac, int cap) {
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public boolean getac() {
        return ac;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public int getBusNo() {
        return busno;
    }

    public void displayBusInfo() {
        System.out.println("------------------------------------");
        System.out.println("Bus NO : " + busno);
        System.out.println("Ac : " + ac);
        System.out.println("Total Capacity : " + capacity);
        System.out.println("------------------------------------");
    }
}
