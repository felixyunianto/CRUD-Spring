package OOP2.B.FelixYunianto.AplikasiLaundry.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laundry {
    @Id
    @Getter @Setter
    private String id;

    @Getter @Setter
    private String nama_pelanggan;

    @Getter @Setter
    private String no_hp_pelanggan;

    @Getter @Setter
    private String jumlah_laundry;

    @Getter @Setter
    private String harga_per_kg;

    @Getter @Setter
    private String total_harga;
}
