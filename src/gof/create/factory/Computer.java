package gof.create.factory;

public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCUP();

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + ", HDD = " + this.getHDD() + ", CPU= " + this.getCUP();
    }
}
