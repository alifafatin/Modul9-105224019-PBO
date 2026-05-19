package Modul9.Pretest.src;


//membuat class harddisk
public class Harddisk{
    Private String merk;
    Private int kapasitasHarddisk;

    public Harddisk(String merk, int kapasitasHarddisk){
        this.merk = merk;
        this.kapasitasHarddisk = kapasitasHarddisk;
    }
}

//membuat class monitor
public class Monitor{
    Private String merk;
    private int ukuranMonitor;

    public Monitor(String merk, int ukuranMonitor){
        this.merk = merk;
        this.ukuranMonitor = ukuranMonitor;
    }
}

//membuat class komputer server

public class KomputerServer{
    private String namaServer;
    private String ipAddress;

    public KomputerServer(String namaServer, String ipAddress){
        this.namaServer = namaServer;
        this.ipAddress = ipAddress;
    }
}


