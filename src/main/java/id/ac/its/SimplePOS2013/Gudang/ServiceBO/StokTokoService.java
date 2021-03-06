package id.ac.its.SimplePOS2013.Gudang.ServiceBO;
import java.util.List;

import id.ac.its.SimplePOS2013.DataModel.Model.*;

public interface StokTokoService {
    void tambahStokPerToko(StokToko stokToko);
    StokToko cariStok (String idStokToko);
	void suntingStokPerToko(StokToko stokToko, String idStokToko);
	
	void hapusStokToko(String idStokToko);
	List<StokToko> daftarStokToko();
}
