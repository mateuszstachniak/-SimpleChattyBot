    public static void main(String[] args) {
        greet("Raybot", "2021");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What Windows version is newest?");
        String windowsXp = "1. Windows XP";
        String windows7 = "2. Windows 7";
        String windows10 = "3. Windows 10";
        String windows11 = "4. Windows 11";
        int answer;
        int right = 4;
        int i = 0;
        System.out.println(windowsXp);
        System.out.println(windows7);
        System.out.println(windows10);
        System.out.println(windows11);
        do {
            answer = scanner.nextInt();
            i++;
        } while (answer != right);
    }


    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
