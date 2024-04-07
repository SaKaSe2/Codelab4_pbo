package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;
//membenahi ShootAb menjadi ShootAble
public class Tank extends Kendaraan implements ShootAble{
    //    this.getName() diubah menjadi getModel()
    @Override
    public void Start() {
        System.out.println("Menyalakan " + getModel() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + getModel());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    //memperbaiki typo pada vehi menjadi vehicle
    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
