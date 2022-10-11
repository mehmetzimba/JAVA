package uygulama9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class VeriTabanıİslemleriİmp implements VeriTabanıİslemleri{
    Baglantıİslemleri baglanti=new Baglantıİslemleri();
    static PreparedStatement preparedStatement=null;
	@Override
	public void ogrenciKaydet(Ogrenci ogrenci) {
String sorgu= "INSERT INTO ogrenci(ogrenciId,adi,soyadi,dogumYılı,okulNumarası) VALUES(?,?,?,?,?)";
		Connection connection =baglanti.baglantiyiAl();
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setInt(1,ogrenci.getOgrenciId());
			preparedStatement.setString(2, ogrenci.getAdi()); //2. ? NE KARŞILK GELEN DEĞER
			preparedStatement.setString(3, ogrenci.getSoyadi());
			preparedStatement.setString(4,ogrenci.getDogumYılı());
			preparedStatement.setInt(5,ogrenci.getOkulNumarası());
			preparedStatement.executeUpdate();
			baglanti.baglantiKapat(connection, preparedStatement, null);
			
		} catch (SQLException e) {
			System.out.println("HATA"+e);
		}
		
	}

	@Override
	public void ogrenciSil(int ogrenciId) {
	
		String sorgu= "DELETE FROM ogrenci WHERE ogrenciId =?";
		Connection connection=    baglanti.baglantiyiAl();
		   try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setInt(1,ogrenciId);
			preparedStatement.executeUpdate();
			baglanti.baglantiKapat(connection, preparedStatement, null);
			System.out.println(ogrenciId+"ıd numaralı ögrenci silindi");
			
			
		} catch (SQLException e) {
			System.out.println("hata"+e);
		}
	}

	@Override
	public void ogrenciGuncelle(Ogrenci ogrenci) {
		Connection connection=    baglanti.baglantiyiAl();
		String sorgu ="UPDATE ogrenci SET adi=?,soyadi=?,dogumYılı=?,okulNumarası =? WHERE ogrenciId=? ";
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setString(1, ogrenci.getAdi());
			preparedStatement.setString(2, ogrenci.getSoyadi());
			preparedStatement.setString(3, ogrenci.getDogumYılı());
			preparedStatement.setInt(4, ogrenci.getOkulNumarası());
			preparedStatement.setInt(5, ogrenci.getOgrenciId());
			preparedStatement.executeUpdate();
			System.out.println("güncelleme yapıldı");
			
			
			
		} catch (SQLException e) {
			System.out.println("hata"+e);
		}
	}

	@Override
	public void ogrenciListele(Ogrenci ogrenci) {
		
	}

	@Override
	public void ogrenciBul(int ogrenciId) {
		Connection connection=    baglanti.baglantiyiAl();
		String sorgu ="SELECT*FROM ogrenci WHERE ogrenciId=?";
		try {
			preparedStatement=connection.prepareStatement(sorgu);
			preparedStatement.setInt(1, ogrenciId);
			
			Resultset resultSet=(Resultset) preparedStatement.executeQuery();
			
			while(((ResultSet) resultSet).next()
					) {
				int Id=((ResultSet) resultSet).getInt("ogrenciId");
				
				
				String adi=((ResultSet) resultSet).getString("adi");
				
				String soyadi=((ResultSet) resultSet).getString("soyadi");
				
				int dogumYılı=((ResultSet) resultSet).getInt("dogumYılı");
				String okulNumarası=((ResultSet) resultSet).getString("okulNumarası");
				
				Ogrenci ogrenci=new Ogrenci(Id, adi, soyadi, okulNumarası, dogumYılı);
				System.out.println(ogrenci);
				baglanti.baglantiKapat(connection, preparedStatement, resultSet);
			}
	
		} catch (SQLException e) {
			System.out.println("hata"+e);
		}
	}

	
	
	
	
	
	
	
}
