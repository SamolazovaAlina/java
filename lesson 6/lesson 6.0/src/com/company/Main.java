package com.company;

public class Main {

    public static void main(String[] args) {
	 Animal[] a = {new Cat("Barsik"),new Dog("bobik"),new Horse("Burka")};

        for (int i = 0; i <a.length ; i++) {
            a[i].run(80.0f);
            if (!a[i].isOnDistance()) continue;
            a[i].jump(0.5f);
            if (!a[i].isOnDistance()) continue;
            a[i].swim(5.0f);
            if (!a[i].isOnDistance()) continue;
            a[i].run(250.0f);

        }

        for (int i = 0; i < a.length; i++) {
          if(a[i].isOnDistance())
              a[i].showWin();
        }
    }
}
