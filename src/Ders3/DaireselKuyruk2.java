package Ders3;

public class DaireselKuyruk2 {
    private int[] kuyruk;
    private int front, rear, kapasite, boyut;

    public DaireselKuyruk2(int kapasite) {
        this.kapasite = kapasite;
        kuyruk = new int[kapasite];
        front = -1;
        rear = -1;
        boyut = 0;
    }

    // Kuyruğa eleman ekleme
    public boolean ekle(int veri) {
        if (dolduMu()) {
            System.out.println("Kuyruk dolu. Eleman eklenemiyor.");
            return false;
        }
        // Eğer kuyruk boşsa, front ve rear sıfırlanır
        if (bosMu()) {
            front = 0;
            rear = 0;
        } else {
            // rear dairesel olacak şekilde ayarlanır
            rear = (rear + 1) % kapasite;
        }
        kuyruk[rear] = veri;
        boyut++;
        return true;
    }

    // Kuyruktan eleman çıkarma
    public int cikar() {
        if (bosMu()) {
            System.out.println("Kuyruk boş. Çıkarılacak eleman yok.");
            return -1;
        }
        int veri = kuyruk[front];
        if (front == rear) {
            // Kuyrukta tek eleman varsa, çıkarıldıktan sonra sıfırlanır
            front = -1;
            rear = -1;
        } else {
            // front dairesel olacak şekilde ayarlanır
            front = (front + 1) % kapasite;
        }
        boyut--;
        return veri;
    }

    // Kuyruğun dolu olup olmadığını kontrol etme
    public boolean dolduMu() {
        return boyut == kapasite;
    }

    // Kuyruğun boş olup olmadığını kontrol etme
    public boolean bosMu() {
        return boyut == 0;
    }

    // Kuyruktaki mevcut eleman sayısını alma
    public int boyut() {
        return boyut;
    }

    // Kuyruğun içeriğini yazdırma
    public void yazdir() {
        if (bosMu()) {
            System.out.println("Kuyruk boş.");
            return;
        }
        System.out.println("Kuyruktaki elemanlar:");
        for (int i = 0; i < boyut; i++) {
            System.out.print(kuyruk[(front + i) % kapasite] + " ");
        }
        System.out.println();
    }
}
