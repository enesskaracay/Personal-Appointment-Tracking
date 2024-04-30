/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Appointment;

/**
 *
 * @author EXCALIBUR
 */
import java.sql.*;

public class Conn {

    // 'loginekranı' adlı veritabanına bağlantı için gerekli nesneler
    Connection c;
    Statement s;

    // 'appointtt' adlı veritabanına bağlantı için gerekli nesneler
    Connection a;
    Statement b;

    Conn() {
        try {
            // MySQL JDBC sürücüsünü yüklüyoruz
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 'loginekranı' veritabanına bağlan
            c = DriverManager.getConnection("jdbc:mysql:///loginekranı", "root", "fsmvu1");
            s = c.createStatement();

            // 'appointtt' veritabanına bağlan
            a = DriverManager.getConnection("jdbc:mysql:///appointtt", "root", "fsmvu1");
            b = a.createStatement();//Bu Statement nesnesi, appointtt adlı veritabanına SQL sorguları göndermek ve bu sorguların sonuçlarını almak için kullanılır. 
        } catch (Exception e) {
            // Bağlantı hatası durumunda hata izleme
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {

    }

  
}
