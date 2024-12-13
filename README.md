# Finite-State-Machine-with-Input-Output-Transduction-FST-
Sonlu Durum Çeviricileri (FST) için durumları, girdi/çıktı alfabelerini ve geçiş fonksiyonlarını dinamik olarak işleyen bir simülatör. Program, FST'nin formal tanımını bir dosyadan okuyarak, kullanıcı tarafından girilen girdilere göre çıktıları ve durum geçişlerini hesaplar.



1. Uygulama çalıştığında ilk olarak “FST.txt” adındaki dosyayı okumalıdır. “FST.txt” dosyasında bir FST
makinesinin formal tanımı yer almaktadır. Ödevle birlikte örnek bir dosya sisteme yüklenecektir. Kendinizin
de formata uygun farklı dosyalar oluşturup uygulamanızı test etmenizde yarar vardır.
2. Örnek dosyada boşluk ve tab karakteri ile ayrım yapılmıştır. δ geçiş fonksiyonundaki değerler birbirinden tab
karakteri ile ayrılmıştır. Örnek bir dosyanın ekran görüntüsü aşağıda yer almaktadır.
3. State’lerin sayısı, state’lerin isimleri, girdi alfabesindeki ve çıktı alfabesindeki sembollerin sayısı ve semboller
değişebilir. Yani uygulamanız bunları destekleyecek şekilde dinamik olmalıdır.
4. Program dosyayı okuduktan sonra, kullanıcıdan 2 tane input girmesini istemeli ve kullanıcının girdiği
inputlara göre FST’nin çıktılarını ve girdi işlenirken geçilen state’lerin sırasını ekrana yazmalıdır. (Örnek bir
ekran görüntüsü aşağıda verilmiştir.

Örnek bir ekran görüntüsü aşağıda verilmiştir:

FST.txt dosyası okundu.
Lütfen birinci input’u giriniz:
2212011
Durumların sırası: q1, q2, q2, q2, q2, q1, q1, q1
Çıktı: 1111000
Lütfen ikinci input’u giriniz:
202001
Durumların sırası: q1, q2, q1, q2, q1, q1, q1
Çıktı: 101000

![Otomata](https://github.com/user-attachments/assets/60ee1398-c67d-4b5a-8280-2af780ae60fb)


