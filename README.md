# Arrays
* Arrays (Diziler), anlam ifade etmesi için birden fazla nesneye ihtiyaç duyabilir. Mesela, Şu an karşısında olduğunuz bilgisayar örneğini inceleyelim. Masaüstü bilgisayarlar, klavye-mouse-monitör üçlüsünü bir araya getirince anlam ifade eder. Herhangi biri olmadan bir işlem yapmanız olasıdır ama zorludur.
* Array (Dizi), dezavantajlarından biri olan hafıza problemini inceleyelim. Bilgisayar örneğimizden devam edelim. Hali hazırda bir klavye, bir mouse ve bir monitörümüz var. Yeni bir monitör aldığımızda daha büyük bir masaya ihtiyacımız var. Aynı şekilde yeni bir klavye veya mouse aldığımızda da aynı durum geçerli. Bir yerden bir yere taşırken zaman ve güç kaybına uğruyoruz.
* Dynamic Arrays (Dinamik diziler) ise yeni bir eleman için boşta yer tutmasından ötürü esnektir. Örneğin, bazı mutfak masaları açılan sürgülü bir yapıya sahiptir. Masanın küçük kaldığı durumlarda büyütmek için kullanılır. Dinamik dizilerde aynı mantığa sahiptir. Yeni elemanlar için yer tutarlar.
* Dynamic Array (Dinamik dizinin) dezavantajlarından biri ise hafızada fazladan yer kaplaması, gerçekleşecek olan bir diğer olayı engelleyebilir. Nasıl mı, hemen örnek ile kavrayalım. Masa örneğinden bahsetmiştik. Misafirleriniz bir işi çıkması durumunda fazladan yer kapladık ve hareket kabiliyetimizi kaybettik.
* Hep dezavantajlarını konuşuyorsun, e yahu bunun avantajı yok mu? Tabii ki var. Array'lerin birbirine bağlı olması ulaşılabilirliğini kolaylaştırır. Klavye-Mouse-Monitör örneğini vermiştik. Hepsi bir masada bulununca ulaşılması kolaydır. (Masa = Array, Klavye-Mouse-Monitör = Array Elemanı)

# Linked List
* Linked-List (Bağlı listeler), yan yana zorunluluğu olmadan veri tutmamızı sağlayan yapılardır. Yeni gelen eleman için hafıza'da yeni bir alan açmamız gerekmez. Array'dan farklı olarak evet elemanlar hafıza içerisinde dağılmış olabilir, fakat son gelen eleman kendinden bir önceki elemana adresini bildirmek zorundadır.
* Her bir düğüm bir sonrakinin adresini tutar. Her bir önceki eleman bir sonraki eleman ile bağlıdır.

# Array & Linked List
| Array                                                                             | Linked List                                                                                                           |
|-----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Array'in herhangi bir elemanına ulaşmak aynı srede gerçekleşir (**Random Access). | Linked List'de ulaşmak istediğimiz elemana gidebilmek için birbirine bağlı olan elemanları ziyaret etmemiz gerekiyor. |
| Array'ler sadece eleman tuttuğu içi hafızada daha az yer kaplarlar.               | Linked List'ler, eleman ile birlikte adres tuttuğundan dolayı hafıza daha fazla yer kaplarlar.                        |
| Daha çok statik (durağan) durumlarda daha fazla performans gösterir.              | Ekleme, çıkarmanın fazla olduğu durumlarda Linked List daha fazla performans gösterir.                                |

# Stack
* Stack, **LIFO** (Last in First out) (En son giren en önce çıkar) mantığına dayanan, elemanlar topluluğundan oluşan bir yapıdır. Gelin hemen örneğimize geçelim. Taşınırken topladığınız koli kutusu düşünün. İçerisinde kitaplar var ve en, boy olarak koliye tam olarak koyuluyor. Mantıken kolinin altı kapalı ve üst üste koymanız gerekmektedir. Yeni taşındığınız yerde çıkartırken en üstekinden başlarsınız. İşte stack (Yığın) da aynı mantıkta çalışıyor.
* Yığınlara eleman eklerken veya çıkartırken bazı methodlar uygulanır. Bunlardan biri **push**, diğeri ise **pop**. Push, yığının üzerine eleman eklemek için kullanılır (Koliye kitap koymak). Pop ise, yığından eleman çıkarmak için kullanılır.

# Queue
* Queue (Kuyruk), **FIFO** (First in First out) (İlk giren ilk çıkar) prensibine dayanan, girişlerde ve çıkışlarda belirli bir kurala göre çalışan yapıdır. Stack de verdiğimiz örneği kuyruğa göre uyarlayalım. Biz örnekte altı kapalı bir koli kutusunu düşünmüştük. Şimdi o koli kutusunun altı yırtılmış. Sonuç olarak ne oluyor? İlk giren ilk çıkmış oluyor.
* Queue (Kuyruk)'da eleman eklemesi yaparken enqueue methodunu kullanıyoruz. Eleman silerken ise dequeue methodunu kullanıyoruz.

# Set
* Collection interface’den kalıtım almıştır. Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez. HashSet sınıfı en yaygın olan alt sınıfıdır. Eleman tekrarının olmamasını sağlayabilmek için veri kümesi içindeki nesnelerin “equals” ve “hashCode” fonksiyonlarının tanımlı olması gerekir.
* Set interface’in alt sınıfları:
  * HashSet 
  * LinkedHashSet 
  * TreeSet

# Map
* Map Interface somut sınıflarındandır. HashMap sınıfına, karışık eşleme de denilebilir. Eşleme tablosuna eleman ekleme, çıkartma işlemlerinde ve anahtarı verilen elemanı tabloda bulma işlemlerinde oldukça etkilidir.
* Map Interface’i kullanan sınıflar aşağıdaki metodlara sahiptir;
  * **clear:** Map içinde bulunan bütün değerleri siler. 
  * **containsKey (Object key):** Belli bir anahtar daha önceden girilmiş mi sorgular. 
  * **containsValue (Object value):** Belli bir obje daha önceden girilmiş mi sorgular. 
  * **get (Object key):** Anahtara karşılık gelen objeyi döndürür. 
  * **put (Object key, Object value):** Anahtar — değer ikilisini kayıt eder. 
  * **remove (Object key):** Belli bir anahtara karşılık gelen değeri siler. 
  * **size:** O zaman kadar kayıt edilmiş anahtar — değer ikili sayısını verir.