package com.chetan.cshoppingcart;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.chetan.cshoppingcart.adapter.BrandAdapter;

import java.io.Serializable;
import java.util.ArrayList;

public class BrandlistActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Brand> list1 = new ArrayList<Brand>();
    ArrayList<Phone> applePhones = new ArrayList<Phone>();
    ArrayList<Phone> samsungPhones = new ArrayList<Phone>();
    ArrayList<Phone> miPhones = new ArrayList<Phone>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brandlist);


        Phone iphonese = new Phone();
        iphonese.setModelName("Iphone SE");
        iphonese.setPrice("20000");
        iphonese.setRating("6.0");
        iphonese.setYear("2015");
        iphonese.setInfo("Release date\t\t:\tMarch 2016\n" +
                "Form factor\t\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t123.80 x 58.60 x 7.66\n" +
                "Weight(g)\t:\t113.00\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tSilver, Gold, Space Grey, Rose Gold\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t4.00\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t640x1136 pixels\n" +
                "Pixels per inch (PPI)\t:\t326\n" +
                "HARDWARE\n" +
                "Processor make\t:\tA9\n" +
                "RAM\t:\t2GB\n" +
                "Internal storage\t:\t16GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tYes\n" +
                "Front camera\t:\t1.2-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tiOS 9.3\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.20\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tNo\n" +
                "Temperature sensor\t:\tNo");
        iphonese.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/41XIa0HZVpL.jpg");
        applePhones.add(iphonese);

        Phone iphone6s = new Phone();
        iphone6s.setModelName("Iphone 6S");
        iphone6s.setPrice("30000");
        iphone6s.setRating("7.0");
        iphone6s.setYear("2016");
        iphone6s.setImageUrl("http://www.timesoflahore.com/tol-admin/uploads/6039084a-9464-4ae4-881f-748a2b3f4820_1.8df005f488a4f5538d9d79a8d66a8a96.jpeg");
        iphone6s.setInfo("Release date\t:\tSeptember 2015\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t138.30 x 67.10 x 7.10\n" +
                "Weight (g)\t:\t143.00\n" +
                "Battery capacity (mAh)\t:\t1715\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tSilver, Gold, Space Grey, Rose Gold\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t4.70\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t750x1334 pixels\n" +
                "Pixels per inch (PPI)\t:\t326\n" +
                "HARDWARE\n" +
                "Processor make\t:\tA9\n" +
                "RAM\t:\t2GB\n" +
                "Internal storage\t:\t16GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tYes\n" +
                "Front camera\t:\t5-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tiOS 9\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\tYes\n" +
                "Bluetooth\t:\tYes, v 4.20\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        applePhones.add(iphone6s);

        Phone iphone7 = new Phone();
        iphone7.setModelName("Iphone 7");
        iphone7.setPrice("55000");
        iphone7.setRating("8.0");
        iphone7.setYear("2017");
        iphone7.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/31W5oN-0NJL.jpg");
        iphone7.setInfo("Release date\t:\tSeptember 2016\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t138.30 x 67.10 x 7.10\n" +
                "Weight (g)\t:\t138.00\n" +
                "Battery capacity (mAh)\t:\t1960\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tRed, Rose Gold, Gold, Silver, Black, Jet Black\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t4.70\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t750x1334 pixels\n" +
                "Pixels per inch (PPI)\t:\t326\n" +
                "HARDWARE\n" +
                "Processor\t:\tquad-core\n" +
                "Processor make\t:\tApple A10 Fusion\n" +
                "RAM\t:\t2GB\n" +
                "Internal storage\t:\t32GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t7-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tiOS 10\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.20\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        applePhones.add(iphone7);


        Phone iphone8 = new Phone();
        iphone8.setModelName("Iphone 8");
        iphone8.setPrice("60000");
        iphone8.setRating("8.0");
        iphone8.setYear("2018");
        iphone8.setImageUrl("https://image.darty.com/telephonie/telephone_mobile_seul/iphone/apple_iph8_64gb_sg_t1709154360940A_173551648.jpg");
        iphone8.setInfo("Release date\t:\tSeptember 2017\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t138.40 x 67.30 x 7.30\n" +
                "Weight (g)\t:\t148.00\n" +
                "Battery capacity (mAh)\t:\t1821\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tSilver, Space Gray, Gold\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t4.70\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t750x1334 pixels\n" +
                "Pixels per inch (PPI)\t:\t326\n" +
                "HARDWARE\n" +
                "Processor\t:\thexa-core\n" +
                "Processor make\t:\tApple A11 Bionic\n" +
                "RAM\t:\t2GB\n" +
                "Internal storage\t:\t64GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t7-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tiOS 11\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 5.00\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        applePhones.add(iphone8);

        Phone iphoneX = new Phone();
        iphoneX.setModelName("Iphone X");
        iphoneX.setPrice("95000");
        iphoneX.setRating("9.0");
        iphoneX.setYear("2018");
        iphoneX.setInfo("Release date\t:\tSeptember 2017\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t143.60 x 70.90 x 7.70\n" +
                "Weight (g)\t:\t174.00\n" +
                "Battery capacity (mAh)\t:\t2716\n" +
                "Removable battery\t:\tNo\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.80\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1125x2436 pixels\n" +
                "HARDWARE\n" +
                "Processor\t:\thexa-core\n" +
                "Processor make\t:\tApple A11 Bionic\n" +
                "RAM\t:\t3GB\n" +
                "Internal storage\t:\t64GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t7-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tiOS 11\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 5.00\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tNo\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        iphoneX.setImageUrl("http://top-tech.lv/image/data/iPhone/iX.jpg");
        applePhones.add(iphoneX);


        Brand brand = new Brand();
        brand.setName("Apple");
        brand.setImageUrl("https://itc.ua/wp-content/uploads/2016/02/og-2-1-770x545.jpg");
        brand.setPhone(applePhones);
        list1.add(brand);


        Phone galaxys5 = new Phone();
        galaxys5.setModelName("SAMSUNG GALAXY S5");
        galaxys5.setPrice("21000");
        galaxys5.setRating("8.5");
        galaxys5.setYear("2015");
        galaxys5.setInfo("Alternate names\t:\tSM-G900H\n" +
                "Release date\t:\tApril 2014\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t142.00 x 72.50 x 8.10\n" +
                "Weight (g)\t:\t145.00\n" +
                "Battery capacity (mAh)\t:\t2800\n" +
                "Removable battery\t:\tYes\n" +
                "Colours\t:\tWhite, Black\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.10\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1080x1920 pixels\n" +
                "Pixels per inch (PPI)\t:\t432\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.9GHz octa-core\n" +
                "Processor make\t:\tExynos Octa 5420\n" +
                "RAM\t:\t2GB\n" +
                "Internal storage\t:\t16GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t128\n" +
                "CAMERA\n" +
                "Rear camera\t:\t16-megapixel\n" +
                "Rear Flash\tLED\n" +
                "Front camera\t:\t2.1-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 4.4.2\n" +
                "Skin\t:\tTouchWiz\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.00\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tYes\n" +
                "USB OTG\t:\tNo\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tMicro-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tNo\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        galaxys5.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71IqtZajX7L._SY550_.jpg");
        samsungPhones.add(galaxys5);

        Phone galaxys7 = new Phone();
        galaxys7.setModelName("SAMSUNG GALAXY S7");
        galaxys7.setPrice("25000");
        galaxys7.setRating("7.5");
        galaxys7.setYear("2016");
        galaxys7.setInfo("\n" +
                "Release date\t:\tFebruary 2016\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t142.40 x 69.60 x 7.90\n" +
                "Weight (g)\t:\t152.00\n" +
                "Battery capacity (mAh)\t:\t3000\n" +
                "Removable battery\t:\tNo\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.10\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1440x2560 pixels\n" +
                "Pixels per inch (PPI)\t:\t577\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.6GHz octa-core\n" +
                "RAM\t:\t4GB\n" +
                "Internal storage\t:\t32GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t200\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tYes\n" +
                "Front camera\t:\t5-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 6.0\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.20\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        galaxys7.setImageUrl("https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/samsung-galaxy-s7/black/Samsung_Galaxy_S7_Black_front@3x.png.transform/pdpCarousel/image.jpg");
        samsungPhones.add(galaxys7);

        Phone galaxyOn7 = new Phone();
        galaxyOn7.setModelName("SAMSUNG GALAXY On7");
        galaxyOn7.setPrice("34000");
        galaxyOn7.setRating("9.5");
        galaxyOn7.setYear("2017");
        galaxyOn7.setInfo("Release date\t:\tOctober 2015\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t151.80 x 77.50 x 8.20\n" +
                "Weight (g)\t:\t172.00\n" +
                "Battery capacity (mAh)\t:\t3000\n" +
                "Removable battery\t:\tYes\n" +
                "Colours\t:\tWhite, Gold\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.50\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t720x1280 pixels\n" +
                "Pixels per inch (PPI)\t:\t267\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.2GHz quad-core\n" +
                "Processor make\t:\tSnapdragon 410\n" +
                "RAM\t:\t1.5GB\n" +
                "Internal storage\t:\t8GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t128\n" +
                "CAMERA\n" +
                "Rear camera\t:\t13-megapixel\n" +
                "Rear Flash\t:\tLED\n" +
                "Front camera\t:\t5-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 5.1.1\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 b/g/n\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.10\n" +
                "NFC\t:\tNo\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tYes\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tMicro-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t\n" +
                "SIM Type\t:\tMicro-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tNo\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tNo\n" +
                "Gyroscope\t:\tNo\n" +
                "Barometer\t:\tNo\n" +
                "Temperature sensor\t:\tNo\n");
        galaxyOn7.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81mKtZOvUmL._SL1500_.jpg");
        samsungPhones.add(galaxyOn7);

        Phone galaxys8 = new Phone();
        galaxys8.setModelName("SAMSUNG GALAXY S8");
        galaxys8.setPrice("57000");
        galaxys8.setRating("8.5");
        galaxys8.setYear("2017");
        galaxys8.setInfo("Release date\t:\tMarch 2017\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t148.90 x 68.10 x 8.00\n" +
                "Weight (g)\t:\t155.00\n" +
                "Battery capacity (mAh)\t:\t3000\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tMidnight Black, Orchid Gray, Arctic Silver, Coral Blue, Maple Gold\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.80\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1440x2960 pixels\n" +
                "Pixels per inch (PPI)\t:\t570\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.9GHz octa-core\n" +
                "Processor make\t:\tSamsung Exynos 8895\n" +
                "RAM\t:\t4GB\n" +
                "Internal storage\t:\t64GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t256\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t8-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 7.0\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tNo\n" +
                "USB OTG\t:\tNo\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t:\t\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tNo\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tNo\n" +
                "Temperature sensor\t:\tNo");
        galaxys8.setImageUrl("https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5770/5770905cv20d.jpg");
        samsungPhones.add(galaxys8);

        Phone galaxys9 = new Phone();
        galaxys9.setModelName("SAMSUNG GALAXY S9");
        galaxys9.setPrice("87000");
        galaxys9.setRating("8.5");
        galaxys9.setYear("2018");
        galaxys9.setInfo("Release date\t:\tMarch 2018\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t147.70 x 68.70 x 8.50\n" +
                "Weight (g)\t:\t163.00\n" +
                "Battery capacity (mAh)\t:\t3000\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tLilac Purple, Midnight Black, Coral Blue\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.80\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1440x2960 pixels\n" +
                "Pixels per inch (PPI)\t:\t568\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.7GHz octa-core\n" +
                "Processor make\t:\tSamsung Exynos 9810\n" +
                "RAM\t:\t4GB\n" +
                "Internal storage\t:\t64GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t400\n" +
                "CAMERA\n" +
                "Rear camera\t:\t12-megapixel\n" +
                "Rear Flash\t:\tLED\n" +
                "Front camera\t:\t8-megapixel\n" +
                "Front Flash\t:\tNo\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 8.0\n" +
                "Skin\t:\tExperience 9.0\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 5.00\n" +
                "NFC\t:\tYes\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes");
        galaxys9.setImageUrl("https://www.tigershop.it/wp-content/uploads/2018/03/s9-plus-purple-ok.jpg");
        samsungPhones.add(galaxys9);

        Brand brand2 = new Brand();
        brand2.setName("Samsung");
        brand2.setImageUrl("https://www.seeklogo.net/wp-content/uploads/2013/05/samsung-no-limit-vector-logo-400x400.png");
        brand2.setPhone(samsungPhones);
        list1.add(brand2);

        Phone mi4 = new Phone();
        mi4.setModelName("MI 4");
        mi4.setPrice("7999");
        mi4.setRating("6.5");
        mi4.setYear("2017");
        mi4.setInfo("Release date\t:\tJuly 2014\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t139.20 x 68.50 x 8.90\n" +
                "Weight (g)\t:\t156.00\n" +
                "Battery capacity (mAh)\t:\t3080\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tWhite\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.00\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1080x1920 pixels\n" +
                "HARDWARE\n" +
                "Processor\t:\t2.5GHz quad-core\n" +
                "Processor make\t:\tQualcomm Snapdragon 801\n" +
                "RAM\t:\t3GB\n" +
                "Internal storage\t:\t16GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t13-megapixel\n" +
                "Rear Flash\t:\tLED\n" +
                "Front camera\t:\t8-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 4.4\n" +
                "Skin\t:\tMIUI 6\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.00\n" +
                "NFC\t:\tNo\n" +
                "Infrared\t:\tYes\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tYes\n" +
                "Number of SIMs\t:\t1\n" +
                "SIM 1\t:\t\n" +
                "SIM Type\t:\tMicro-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tNo\n" +
                "Supports 4G in India (Band 40)\t:\tNo\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        mi4.setImageUrl("https://static.toiimg.com/photo/54077739/Greenberry-Mi4.jpg");
        miPhones.add(mi4);


        Phone mi5 = new Phone();
        mi5.setModelName("MI 5");
        mi5.setPrice("8999");
        mi5.setRating("7.5");
        mi5.setYear("2017");
        mi5.setInfo("Release date\t:\tFebruary 2016\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t144.50 x 69.20 x 7.25\n" +
                "Weight (g)\t:\t129.00\n" +
                "Battery capacity (mAh)\t:\t3000\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tBlack, White, Gold\n" +
                "SAR value\t:\t0.33\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.15\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1080x1920 pixels\n" +
                "Pixels per inch (PPI)\t428\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.3GHz quad-core\n" +
                "Processor make\t:\tQualcomm Snapdragon 820\n" +
                "RAM\t:\t3GB\n" +
                "Internal storage\t:\t32GB\n" +
                "Expandable storage\t:\tNo\n" +
                "CAMERA\n" +
                "Rear camera\t:\t16-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t4-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 6.0\n" +
                "Skin\t:\tMIUI 7\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n/ac\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.20\n" +
                "NFC\t:\tYes\n" +
                "Infrared\t:\tYes\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tNo\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tYes\n" +
                "Temperature sensor\t:\tNo");
        mi5.setImageUrl("http://st1.bgr.in/wp-content/uploads/2016/02/d256559d143031c5b018bf3ffeb9ca6f_375x500_1.jpg");
        miPhones.add(mi5);

        Phone miY1 = new Phone();
        miY1.setModelName("MI Y1");
        miY1.setPrice("10,999");
        miY1.setRating("7.5");
        miY1.setYear("2017");
        miY1.setInfo("Release date\t:\tNovember 2017\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t153.00 x 76.20 x 7.70\n" +
                "Weight (g)\t:\t153.00\n" +
                "Battery capacity (mAh)\t:\t3080\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tGold, Dark Grey\n" +
                "SAR value\t:\t1.09\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.50\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t720x1280 pixels\n" +
                "HARDWARE\n" +
                "Processor\t:\t1.4GHz octa-core\n" +
                "Processor make\t:\tQualcomm Snapdragon 435\n" +
                "RAM\t:\t3GB\n" +
                "Internal storage\t:\t32GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t128\n" +
                "CAMERA\n" +
                "Rear camera\t:\t13-megapixel\n" +
                "Rear Flash\t:\tLED\n" +
                "Front camera\t:\t16-megapixel\n" +
                "Front Flash\t:\tYes\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 7.0\n" +
                "Skin\t:\tMIUI 9\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 b/g/n\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.10\n" +
                "NFC\t:\tNo\n" +
                "Infrared\t:\tYes\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tYes\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tNo\n" +
                "Temperature sensor\t:\tNo");
        miY1.setImageUrl("https://4.imimg.com/data4/XJ/HO/ANDROID-27432827/product-500x500.jpeg");
        miPhones.add(miY1);

        Phone miNote4 = new Phone();
        miNote4.setModelName("Mi Note 4");
        miNote4.setPrice("9999");
        miNote4.setRating("9.0");
        miNote4.setYear("2017");
        miNote4.setInfo("Release date\t:\tAugust 2016\n" +
                "Form factor\t:\tTouchscreen\n" +
                "Dimensions (mm)\t:\t151.00 x 76.00 x 8.30\n" +
                "Weight (g)\t:\t175.00\n" +
                "Battery capacity (mAh)\t:\t4100\n" +
                "Removable battery\t:\tNo\n" +
                "Colours\t:\tGold, Grey, Matte Black\n" +
                "DISPLAY\n" +
                "Screen size (inches)\t:\t5.50\n" +
                "Touchscreen\t:\tYes\n" +
                "Resolution\t:\t1080x1920 pixels\n" +
                "Pixels per inch (PPI)\t:\t401\n" +
                "HARDWARE\n" +
                "Processor\t:\t2GHz octa-core\n" +
                "Processor make\t:\tQualcomm Snapdragon 625\n" +
                "RAM\t:\t4GB\n" +
                "Internal storage\t:\t64GB\n" +
                "Expandable storage\t:\tYes\n" +
                "Expandable storage type\t:\tmicroSD\n" +
                "Expandable storage up to (GB)\t:\t128\n" +
                "CAMERA\n" +
                "Rear camera\t:\t13-megapixel\n" +
                "Rear Flash\t:\tDual LED\n" +
                "Front camera\t:\t5-megapixel\n" +
                "SOFTWARE\n" +
                "Operating System\t:\tAndroid 6.0\n" +
                "Skin\t:\tMIUI 8\n" +
                "CONNECTIVITY\n" +
                "Wi-Fi\t:\tYes\n" +
                "Wi-Fi standards supported\t:\t802.11 a/b/g/n\n" +
                "GPS\t:\tYes\n" +
                "Bluetooth\t:\tYes, v 4.10\n" +
                "NFC\t:\tNo\n" +
                "Infrared\t:\tYes\n" +
                "USB OTG\t:\tYes\n" +
                "Headphones\t:\t3.5mm\n" +
                "FM\t:\tYes\n" +
                "Number of SIMs\t:\t2\n" +
                "SIM 1\t\n" +
                "SIM Type\t:\tMicro-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SIM 2\t:\t\n" +
                "SIM Type\t:\tNano-SIM\n" +
                "GSM/CDMA\t:\tGSM\n" +
                "3G\t:\tYes\n" +
                "4G/ LTE\t:\tYes\n" +
                "Supports 4G in India (Band 40)\t:\tYes\n" +
                "SENSORS\n" +
                "Compass/ Magnetometer\t:\tYes\n" +
                "Proximity sensor\t:\tYes\n" +
                "Accelerometer\t:\tYes\n" +
                "Ambient light sensor\t:\tYes\n" +
                "Gyroscope\t:\tYes\n" +
                "Barometer\t:\tNo\n" +
                "Temperature sensor\t:\tNo");

        miNote4.setImageUrl("https://www.91-img.com/pictures/xiaomi-redmi-note-4-32gb-mobile-phone-large-1.jpg");
        miPhones.add(miNote4);


        Brand brand3 = new Brand();
        brand3.setName("Xiaomi");
        brand3.setImageUrl("http://logok.org/wp-content/uploads/2014/12/Xiaomi-logo.png");
        brand3.setPhone(miPhones);
        list1.add(brand3);

        lv = (ListView) findViewById(R.id.listview1);

        BrandAdapter adapter = new BrandAdapter(BrandlistActivity.this, list1);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj = lv.getItemAtPosition(position);
                int i = (int) obj;
                Brand brand = (Brand) list1.get(i);
                ArrayList<Phone> phones = new ArrayList<>();
                phones = brand.phone;
                Intent intent = new Intent(BrandlistActivity.this, ProductslistActivity.class);
                intent.putExtra("PHONES", brand.phone);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        SharedPreferences preferences =getSharedPreferences("MYUSERDATA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
        finish();

        Intent intent=new Intent(BrandlistActivity.this,LoginActivity.class);
        startActivity(intent);
        return(super.onOptionsItemSelected(item));
    }

    public class Brand implements Serializable {

        String ImageUrl;
        String name;

        public ArrayList<Phone> getPhone() {
            return phone;
        }

        public void setPhone(ArrayList<Phone> phone) {
            this.phone = phone;
        }

        ArrayList<Phone> phone;

        public String getImageUrl() {
            return ImageUrl;
        }

        public void setImageUrl(String imageUrl) {
            ImageUrl = imageUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Phone implements Serializable {

        String ImageUrl;
        String modelName;
        String Price;
        String Rating;
        String Info;
        String Year;

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getImageUrl() {
            return ImageUrl;
        }

        public void setImageUrl(String imageUrl) {
            ImageUrl = imageUrl;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String price) {
            Price = price;
        }

        public String getRating() {
            return Rating;
        }

        public void setRating(String rating) {
            Rating = rating;
        }

        public String getInfo() {
            return Info;
        }

        public void setInfo(String info) {
            Info = info;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String year) {
            Year = year;
        }
    }
}



