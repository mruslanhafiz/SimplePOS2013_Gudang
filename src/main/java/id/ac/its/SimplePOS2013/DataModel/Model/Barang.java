package id.ac.its.SimplePOS2013.DataModel.Model;

import java.util.Set;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BARANG")
public class Barang {
    
	@Id
	@Column(name="ID_BARANG")
	private String idBarang;
	
	@Column(name="NAMA_BARANG")
	private String namaBarang;
	
	@Column(name="HARGA_BELI")
	private int hargaBeli;
	
	@Column(name="HARGA_JUAL")
	private int hargaJual;
	
	@Column(name="STOK_TOTAL_BARANG")
	private int stokTotalBarang;
	
	@Column(name="TANGGAL_KADALUARSA")
	private Date tanggalKadaluarsa;
	
	@OneToMany(mappedBy="barang")
	private Set<StokToko> stokToko;
	
	public Barang(){
	
	}

		public Barang(String idBarang, String namaBarang, int hargaBeli,
			int hargaJual, int stokTotalBarang, Date tanggalKadaluarsa,
			Set<StokToko> stokToko) {
		super();
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
		this.stokTotalBarang = stokTotalBarang;
		this.tanggalKadaluarsa = tanggalKadaluarsa;
		this.stokToko = stokToko;
	}



	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public int getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public int getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}

	public int getStokTotalBarang() {
		return stokTotalBarang;
	}

	public void setStokTotalBarang(int stokTotalBarang) {
		this.stokTotalBarang = stokTotalBarang;
	}

	public Date getTanggalKadaluarsa() {
		return tanggalKadaluarsa;
	}

	public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
		this.tanggalKadaluarsa = tanggalKadaluarsa;
	}

	public Set<StokToko> getStokToko() {
		return stokToko;
	}

	public void setStokToko(Set<StokToko> stokToko) {
		this.stokToko = stokToko;
	}

	
}
