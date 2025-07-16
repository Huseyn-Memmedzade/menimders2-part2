package yenipabka;


import java.util.Scanner;

public class AtmPulCixarilmasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Zəhmət olmasa adınızı daxil edin: ");
        String name = input.nextLine();


        System.out.print("Salam " + name + "! Hazırki balansınızı daxil edin: ");
        double balance = input.nextDouble();


        System.out.print("Çıxarmaq istədiyiniz məbləği daxil edin: ");
        double amount = input.nextDouble();


        if (amount <= 0) {
            System.out.println("Yanlış məbləğ! Zəhmət olmasa müsbət rəqəm daxil edin. 🔴");
        } else if (amount > balance) {
            System.out.println("Yetersiz vəsait! ❌");
        } else {

            if (amount > 1000) {
                System.out.println("Böyük əməliyyat aşkarlandı! Menecer təsdiqi tələb olunur. 🚨");
            }

            if (amount == balance) {
                System.out.println("Əminsiniz? Hesabınız boş qalacaq! 🚧");
            }


            balance -= amount;
            System.out.println("Əməliyyat uğurla başa çatdı. ✅");


            System.out.println("Yeni balansınız: $" + balance);


            if (balance < 20) {
                System.out.println("Aşağı balans xəbərdarlığı! ⚠️");
            }
        }
        input.close();
    }
}

// Layihə Məlumatı: "ATM Nağd Pul Çıxarma Sistemi"
// Bu layihə bir az daha çətinlik səviyyəsindədir. Tələbələrdən istifadəçinin balansını yoxlayan, nağd pul çıxaran və overdraft (yəni balansdan artıq pul çıxarma) hallarının qarşısını alan bir sistem yazmaları tələb olunur.
//
// 🏆Layihənin Xüsusiyyətləri və Çağırışları
// 1️⃣İstifadəçi məlumatları (Input):
// İstifadəçidən adını daxil etməsi istənilir (dəyişəndə saxlanılır).
// Hesabındakı mövcud balansı daxil etməsi istənilir (rəqəm olaraq saxlanılır).
//
// 2 Pul çıxarma prosesi:
//– İstifadəçidən nə qədər pul çıxarmaq istədiyi soruşulur.
//– Əgər çıxarılacaq məbləğ balansdan çoxdursa: "Yetersiz vəsait! ❌"
//– Əgər məbləğ 0 və ya mənfidirsə: "Yanlış məbləğ! Zəhmət olmasa müsbət rəqəm daxil edin. 🔴"
//– Əgər balans kifayət edirsə, məbləğ balansdan çıxarılır və yeni balans göstərilir.
//
// 3️⃣ Böyük məbləğ yoxlaması:
//– Əgər çıxarılan məbləğ $1000-dən çoxdursa: "Böyük əməliyyat aşkarlandı! Menecer təsdiqi tələb olunur. 🚨"
//– Əks halda əməliyyat normal davam edir.
//
// 4️⃣ Xüsusi hallar (Edge Cases):
//– Əgər çıxarışdan sonra balans $20-dən az olarsa: "Aşağı balans xəbərdarlığı! ⚠️"
//– Əgər istifadəçi tam balansı çıxarmaq istəyərsə: "Əminsiniz? Hesabınız boş qalacaq! 🚧"