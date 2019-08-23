# KotlinLearn
Repozytorium przeznaczone dla najmłodszych do nauki programowania


## Konfiguracja programu IntelliJ


### Pobieranie

Program należy pobrać z linku 
* [Intellij] - Kompilator - <a href="https://www.jetbrains.com/idea/download/#section=windows/">Pobierz Oprogramowanie</a>


### Pierwsze uruchomienie, stworzenie projektu

Po uruchomieniu stwórz nowy projekt:

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/1_1.PNG" alt="Main Screen 1"/>
</p>

Wybierz język Kotlin

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/1_2.PNG" alt="Main Screen 1"/>
</p>

Wprowadź nazwę projektu (w przypadku braku SDK należy pobrać z : <a href="https://www.oracle.com/technetwork/es/java/javasebusiness/downloads/index.html">Pobierz SDK</a>
lub postępować według wskazówek programu IntelliJ

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/1_3.PNG" alt="Main Screen 1"/>
</p>


### Przygotowanie środowiska pracy

Stwórz nową klase/plik, w określonej lokalizacji, zgodnei z grafika poniżej

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/2_1.jpg" alt="Main Screen 1"/>
</p>

Wprowadź nazwę pliku oraz rodzaj

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/2_2.jpg" alt="Main Screen 1"/>
</p>


### Tworzenie programu

Komentarze w programie wyglądają następująco

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/3_2.jpg" alt="Main Screen 1"/>
</p>

Napisz podstawową funkcję main (instrukcja poniżej)

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/3_1.jpg" alt="Main Screen 1"/>
</p>

Wprowadź funkcję oraz logikę programu który będziesz realizował

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/3_3.jpg" alt="Main Screen 1"/>
</p>


### Uruchamianie projektu

Z menu kontekstowego u góry wybierz 'Run' a następnie 'Run...' lub użyj skrótu Alt+Shift+F10

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/4_1.jpg" alt="Main Screen 1"/>
</p>

Z wyświetlonego dialogu wybierz Twoją główną funkcję main

<p align="center">
<img src="https://github.com/Szpansky/KotlinLearn/blob/master/img/4_2.jpg" alt="Main Screen 1"/>
</p>


## Podstawowe informacje


### Funkcja Main

Główna funkcja programu, musi dokładnie być zadeklarowana w ten sposób
* (skrót main + tab)
* To w niej tworzymy:
* Logikę programu

```
fun main(args: Array<String>) {
    
}
```


### Zmienne

* Zmienna
* Zaczynamy słowem var lub val
* val - stała (przypisujemy wartość jeden raz)
* var - zmienna (możemy zmieniać przypisaną wartość)     
```
var liczba = 5
val mnożnik = 2

//liczba = 6 <- możemy zmienić wartość
//mnożnik = 5 <- błąd, już nie możemy zmienić wartości
```


### Funkcje

* Funkcja służy do wykonywania jednego konkretnego działania
* Nazwę rozpoczynamy z małej litery oraz musi ona opisywać co dana funkcja realizuje
```
fun wyświetlNapis() {
        print("Hello World")
    }
```

* Dodawanie dwóch liczba i wyświetlenie
* ln na końcu print powoduje dodanie przejścia do nowej linii 
```
fun dodaj() {
        return println("Suma dwóch liczb to: $liczba + $liczba = ${liczba + liczba}")
    }
```    

* Mnożenie dwóch liczba i wyświetlenie
```
fun mnożenie() {
        return println("Iloczyn dwóch liczb to: $liczba * $mnożnik = ${liczba * mnożnik}")
    }
```

* Dodawanie dwóch liczba i wyświetlenie
* ln na końcu print powoduje dodanie przejścia do nowej linii
```
fun dodaj(pierwsza: Int, druga: Int) {
        return println("Suma dwóch liczb to: $pierwsza + $druga = ${pierwsza + druga}")
    }
```


## Podstawowe operacje


### Wyświetlanie

* Wyświetlanie napisu w konsoli
```
print("Hello World")
```
 
Korzystanie z funkcji
```
  wyświetlNapis()
  dodaj()
  mnożenie()
  dodaj(10, 20)
```


### Pętle

* Petle
* for() - pętla z warunkiem sprawdzanym na początku oraz licznikiem
* while() - pętla z warunkiem sprawdzanym na początku   
```
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
```


### Losowanie

* Losowanie liczby z pośród 100
* Funkcja zwraca wartość liczbową. typ zwracanej wartości piszemy po ':'
* Każda funkcja która zwraca wartość musi ją zwracać. Zwracamy słowem 'return'
* Random() - jest to obiekt który posiada funkcje losującą nextInt(parametr), 
* parametr - zakres wylosowanej liczby     
```
fun losuj(): Int {
      val losowaWartość = Random().nextInt(100)
      return losowaWartość
}
```

* Używając println oraz naszej funkcji losującej wyświetlimy wartość liczby
* Podczas wyświetlania zmiennych używamy znaku '$' 
* Dodatkowo by wyświetlić zwracaną wartość funkcji umieszczamy ją w klamrach '${}'
```
println("Nasza wylosowana liczba to : ${losuj()}")
```


### Wprowadzanie danych

* Pobieranie danych od użytkownika
* By pobrać dane z klawiatury używamy readLine()
* Oczywiście musimy gdzieś tę wartość przypisać np do stałej val
* !! - na końcu powodują że jesteśmy pewni że coś wprowadzimy
```
print("Wprowadź liczbę : ")
val wpisanaLiczba = readLine()!!
```
     
### Warunki
     
* Warunek when - sprawdza czy któraś nasza odpowiedz pasuje do przekazanego szablonu
 ```
when (wpisanaLiczba) {
   "1" -> println("(when) To na pewno jest 1")
   "2" -> println("(when) To na pewno jest 2")
   else -> println("(when) Nie wiem co to może myć")
}
```
     
* Funkcja if - jeżeli
* Warunek logiczny
* contentEquals() - wbudowana funkcja która sprawdza czy w ciągu znaków jest wprowadzony przesłany podciąg
```
print("Wprowadź język pl lub en : ")
val wprowadzonyJęzyk = readLine()!!

if (wprowadzonyJęzyk.contentEquals("pl")) {
    println("(if) PL - Witaj świecie")
} else if (wprowadzonyJęzyk.contentEquals("en")) {
    println("(if) EN - Hello World")
} else {
    println("(if)Nie wiem jaki to język")
}
 ```


## Narzędzia

* [Kotlin] - Język
* [Intellij] - Kompilator - <a href="https://www.jetbrains.com/idea/download/#section=windows/">Pobierz Oprogramowanie</a>
* [Kotlin w przeglądarce] - <a href="https://try.kotlinlang.org/">Wypróbuj w przeglądarce</a>


## Authors

* **Marcin Kacik** - *got2know*
