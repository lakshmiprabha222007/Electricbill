import java.util.Scanner;

class OddThread extends Thread {
int n;
OddThread(int n) {
this.n = n;
}
public void run() {
for (int i = 1; i <= n; i++) {
if (i % 2 != 0) {
System.out.println("Odd: " + i);
try {
Thread.sleep(100);
} catch (InterruptedException e) {
System.out.println("OddThread interrupted");
}
}
}
}
}

class EvenThread extends Thread {
int n;
EvenThread(int n) {
this.n = n;
}
public void run() {
for (int i = 1; i <= n; i++) {
if (i % 2 == 0) {
System.out.println("Even: " + i);
try {
Thread.sleep(100);
} catch (InterruptedException e) {
System.out.println("EvenThread interrupted");
}
}
}
}
}

public class odd {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the upper limit (n): ");
int n = scanner.nextInt();
OddThread odd = new OddThread(n);
EvenThread even = new EvenThread(n);
odd.start();
even.start();
}
}


