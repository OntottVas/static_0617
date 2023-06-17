# Elméleti háttér

## Hol használható a static kulcsszó?
- metódusokban
- fieldeknél



## static metódusok
Egy metódus static kulcsszóval jelölve osztályszintű
metódussá válik, ami azt jelenti,
hogy a metódus meghívható az osztály nevével,
nem pedig egy példányon keresztül.

Például:
```
public class MathUtils {
  public static int add(int a, int b) {
    return a + b;
  }
}
  

int result = MathUtils.add(5, 3); // Az add() metódus osztályszinten hívható meg.
```

## static változók
Egy változó static kulcsszóval jelölve osztályszintű változóvá válik,
amely ugyanazt az értéket tartalmazza minden osztály példányára vonatkozóan.


Például:
```
public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

Counter c1 = new Counter();
Counter c2 = new Counter();
int totalCount = Counter.getCount(); // A getCount() metódust osztályszinten hívjuk meg, és az aktuális példányok számát adja vissza.
```

***
## Szorgalmi jegyzet
## static blokkok
Egy static blokkot a static kulcsszóval jelölünk, és ezek a blokkok az osztály betöltésekor futnak le,
még az osztály példányainak létrehozása előtt. 

Például:
```
public class InitializationExample {
    private static int number;

    static {
        // Ezt a blokkot az osztály betöltésekor hajtjuk végre.
        number = 42;
        System.out.println("Static block executed.");
    }
}
```
