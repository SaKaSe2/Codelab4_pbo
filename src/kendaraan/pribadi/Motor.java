package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    //    Menambahkan method abstract Start yang di class Kendaraan
//    this.getName() diubah menjadi getModel()
    @Override
    public void Start(){
        System.out.println("Motor " + getModel() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + getModel() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
