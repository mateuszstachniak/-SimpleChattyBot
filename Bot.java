class Bot implements Invariables {

    Bot() throws InterruptedException {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    void greet() {
        System.out.printf("Hello! My name is %s.\n" +
                "I was created in %s.\n" +
                "Please, remind me your name.\n", ASSISTANT_NAME, BIRTH_YEAR);
    }

    static void remindName() {
        String name = sc.nextLine();
        System.out.printf("What a great name you have, %s!\n", name);
    }

    static void guessAge() {
        System.out.printf("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.\n");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
    }

    static void count() throws InterruptedException {
        System.out.printf("Now I will prove to you that I can count to any number you want.\n");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
            Thread.sleep(TIME_ELAPSED);
        }
    }

    static void test() {
        System.out.printf("Let's test your programming knowledge.\n" +
                "What Windows version is newest?\n" +
                "1. Windows XP\n" +
                "2. Windows 7\n" +
                "3. Windows 10\n" +
                "4. Windows 11\n");
        int answer;
        do {
            answer = sc.nextInt();
        } while (answer != RIGHT_ANSWER);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
