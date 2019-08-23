import java.util.*

/**
 * Repozytorium przeznaczone dla najmłodszych do nauki programowania
 */


/**
 * Główna funkcja programu, musi dokładnie być zadeklarowana w ten sposób
 * (skrót main + tab)
 * To w niej tworzymy:
 * - Logikę programu
 */
fun main(args: Array<String>) {
    /**
     * Zmienna
     * Zaczynamy słowem var lub val
     * val - stała (przypisujemy wartość jeden raz)
     * var - zmienna (możemy zmieniać przypisaną wartość)
     */
    var liczba = 5
    val mnożnik = 2

    //liczba = 6 <- możemy zmienić wartość

    //mnożnik = 5 <- błąd, już nie możemy zmienić wartości


    /**
     * Funkcja służy do wykonywania jednego konkretnego działania
     * Nazwę rozpoczynamy z małej litery oraz musi ona opisywać co dana funkcja realizuje
     *
     */

    /**
     * Wyświetlanie napisu
     */
    fun wyświetlNapis() {
        print("Hello World")
    }


    /**
     * Dodawanie dwóch liczba i wyświetlenie
     * ln na końcu print powoduje dodanie przejścia do nowej linii
     */
    fun dodaj() {
        return println("Suma dwóch liczb to: $liczba + $liczba = ${liczba + liczba}")
    }


    /**
     * Mnożenie dwóch liczba i wyświetlenie
     */
    fun mnożenie() {
        return println("Iloczyn dwóch liczb to: $liczba * $mnożnik = ${liczba * mnożnik}")
    }


    /**
     * Dodawanie dwóch liczba i wyświetlenie
     * ln na końcu print powoduje dodanie przejścia do nowej linii
     */
    fun dodaj(pierwsza: Int, druga: Int) {
        return println("Suma dwóch liczb to: $pierwsza + $druga = ${pierwsza + druga}")
    }


    /**
     * Wyświetlanie napisu w konsoli
     *
     */
    print("Hello World")


    /**
     * Jak kożystać z naszych funkcji
     */
    wyświetlNapis()
    dodaj()
    mnożenie()
    dodaj(10, 20)


    /**
     * Petle
     * for() - pętla z warunkiem sprawdzanym na początku oraz licznikiem
     * while() - pętla z warunkiem sprawdzanym na początku
     */


    var start = 0
    val stop = 10
    for (licznik in start until stop) {
        println("(for) nasz licznik teraz to : $licznik")
    }


    start = 0
    while (start < stop) {
        start = start + 1
        println("(while) nasza zmienna po zwiększeniu o 1 to : $start")
    }


    /**
     * Losowanie liczby z pośród 100
     * Funkcja zwraca wartość liczbową. typ zwracanej wartości piszemy po ':'
     * Każda funkcja która zwraca wartość musi ją zwracać. Zwracamy słowem 'return'
     * Random() - jest to obiekt który posiada funkcje losującą nextInt(),
     * z parametrem jakim jest zakres wylosowanej liczby
     */


    fun losuj(): Int {
        val losowaWartość = Random().nextInt(100)
        return losowaWartość
    }


    /**
     * Używając println oraz naszej funkcji losującej wyświetlimy wartość liczby
     * Podczas wyświetlania zmiennych używamy znaku '$'
     * dodatkowo by wyświetlić zwracaną wartość funkcji umieszczamy ją w klamrach '${}'
     */


    println("Nasza wylosowana liczba to : ${losuj()}")


    /**
     * Pobieranie danych od użytkownika
     * By pobrać dane z klawiatury używamy readLine()
     * Oczywiście musimy gdzieś tę wartość przypisać np do stałej val
     * !! - na końcu powodują że jesteśmy pewni że coś wprowadzimy
     */


    print("Wprowadź liczbę : ")
    val wpisanaLiczba = readLine()!!


    /**
     * Warunek when - sprawdza czy któraś nasza odpowiedz
     * pasuje do przekazanego szablonu
     */


    when (wpisanaLiczba) {
        "1" -> println("(when) To na pewno jest 1")
        "2" -> println("(when) To na pewno jest 2")
        else -> println("(when) Nie wiem co to może myć")
    }


    print("Wprowadź język pl lub en : ")
    val wprowadzonyJęzyk = readLine()!!


    /**
     * Funkcja if - jeżeli
     * Warunek logiczny
     * contentEquals() - wbudowana funkcja która sprawdza
     * czy w ciągu znaków jest wprowadzony przesłany podciąg
     */


    if (wprowadzonyJęzyk.contentEquals("pl")) {
        println("(if) PL - Witaj świecie")
    } else if (wprowadzonyJęzyk.contentEquals("en")) {
        println("(if) EN - Hello World")
    } else {
        println("(if)Nie wiem jaki to język")
    }

}