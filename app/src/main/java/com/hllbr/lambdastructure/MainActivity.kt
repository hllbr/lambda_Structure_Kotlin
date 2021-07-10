package com.hllbr.lambdastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        LAMBDA EXPRESSIONS/Lambda Gösterimleri
        OOP temelleri ile çok alakası yok fakat Kotlinde fazlasıyla kullanılan(Kullanılabilen)
        Ve Diğer OOP Dillerindede karşılaşılan bir konu bir teknik olarak ifade edilebilir.
        Internet ile işlemler yaparken Firebase ile Parse ile çalışırken ....karşılacağım kullanmam gereken bir yapı
        **Neden Kullanıyoruz?/Lambda Gösterimleri nedir¿ ==
        Lambda gösterimi tek bir fonksdiyonu tek bir satırda yazmak için geliştirilmiş bir gösterimdir.
        Fonksiyonu body olarak değilde inputunu alıp outputunu döndüreceği şeyi vermeye yarayan olanak sağlar.
        Çok fazla kullanım amacı bulunmaktadır.

         */
        fun printString(Mystring :String){
            println(Mystring)
        }
        printString("My Test String")
        /*
        Lambda gösterimiyle alakası yok inputu verdim çıktıyı aldım şeklindeki fadeyi anlamak için yaptım.
        Bunu Lambda olarak yazarsam ....
         */
        val testString = {objects : String -> println(objects)}
        /*
        testString adında bir sabit oluşturdum içerisinde object olarak ifade ettiğim bir input oluşturdum bu benden istenecek
        ve println ile benden istenilen bu şey yazdırılacak
        testString dediğimde Unit bir sınıfla karşılaşıyorum Unit boşluk anlamına gelmektedir.Void gibi hiçbirşey döndürmüyor.
        Bu yapıda geriye birşey döndürülmüyor yazdırlıyor.
        Geriye bir integer yada String yada Boolean da döndürebilirdim fakat ben birşey yazdırıyorum
         */
        testString("MY LAMBDA STRİNG")
        
        
        val multipleLambda = {a:Int,b:Int,c: Int-> a*b*c}
        //multipleLambda Unit değil Int bir ifade olarak karşıma çıkıyor.
        println(multipleLambda(5,4,1))
        //Lambda ifadelerin ikinci bir tanımlama şekli alt satırlarda bulunmaktadır.
        val multipleLambda2 :(Int,Int,Int) -> Int = {a,b,c->a+b+c}
        println(multipleLambda2(5,4,9))

        val operationLambda : (Double,Double,Double,Double)->Double = {a,b,c,d ->a*b-d+c}
        println(operationLambda(5.5,6.6,8.8,9.9))


        /*
        Lambda işlemleri genelde internetten bir veri indirirken,internetteki işlemlerle çalışırken kullanılır.
        Asynchrnous --Asenkron
        Senkronize olmayan bir şekilde işlem yaptığımızda genelde bir işlem uzun sürerken onu beklemeyip diğer işlemlerin devam edebilmesi için bu işlemi yaparız
        İnternertten bir veri indirileceğini varsayarsak bir resim çektiğimizi ve boyutunun 10 mb olduğunuda düşünürsek bu işlem sırasında kullanıcı arayüzünde (interface) te aşağı yukarı gitmek başka bir sayfada gezmek gibi activiteler yapmak istiyorsa
        Eğer ben indirme işlemini asenkron olarak yapmazsam arkaplanda kullanıcı arayüzünü kitlerim işlemin sıra sıra değil farklı seviyelerde aynı anda arkaplanda bu işlemi çalıştırmam gerekir.
        Bu işlemler(İnternettten veri çekme) tamamlandığında ne yapılacağını yazdığımız bazı fonksiyonlar vardır.
        Bu fonksiyonların birçok adı olabilir.
        ****callback function -> bir işlem yaptın sonucunda birşey geldi
        Listener function sadece bu işler için kullanılmaz fakat bu işler içinde kullanılabilir. işlemin bittiğini dinleyen fonksiyon diyebiliriz.
        completion function işlem bitti tamamlanma fonksiyonu bununle ne yapacağız fonksiyonu
        completion function kullanmak daha iyi bu durumlar için çünkü diğer kullanımlar diğerleri farklı anlamlarada geliyor.

         */
        fun downloadMusicians(url:String,completion : () -> Unit){
            /*
            completion boşbirşey boşbirşey döndürsün :)
            indirme bitmedi diyelim benim bir yapı bulmam lazımki bittiğinde bana haber versin işte bunun için yukarıdaki Unir yapıdan faydalanıyorum
            Bu bir lambda gösterimi örneğidir.
            çalışma prensibi url gittim yükleme işlemini gerçekleştirdim onbdan sonra completion devreye girecerk(çağrılacak)
            1---url->Download
            2---data
            3---completion
             */
            completion()

        }
        downloadMusicians("hllbr.com",{
            println("completed && ready")
        })

    }
}