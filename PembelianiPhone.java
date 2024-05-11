package ujiantengahsemester;

/**
 *
 * @author briandparmana 2201010659
 * TGL: 2024-05-07
 */
public class PembelianiPhone {
    private String serialNumber;
    private String model;
    private double harga;

    public PembelianiPhone() {
    }

    public PembelianiPhone(String serialNumber, String model, double harga) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.harga = harga;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Serial Number: " + serialNumber + ", Model: " + model + ", Harga: " + harga;
    }
}