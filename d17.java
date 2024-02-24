import java.util.Scanner;
public class d17 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    String[] phone = new String[6];
    String[] name = new String[6];
    String[] surname = new String[6];
    String[] date = new String[6];
    String[] gender = new String[6];
    for (int x = 1; x > 0; x++) {
      listMenu();
      int a = sc.nextInt();
      if (a == 1) {
        weatherIndicators();
      }
      if (a == 2) {
        calculation(sc);
      }
      if (a == 3) {
        weekDay();
      }
      if (a == 4) {
        heightWeight(sc);
      }
      if (a == 5) {
        break;
      }
      if (a == 6) {
        if (getFreeSpace(phone) != -1)
          addNameNumber(sc, phone, name, surname, date, gender);
        else
          System.out.println("No free space found");
      }
      if (a == 7) {
        showNameNumber(phone, name, surname, date, gender);
      }
      if (a == 8) {
        factorialWithout(10);
      }
      if (a == 9) {
        factorialWith(10);
        System.out.println(factorialWith(10));
      }
    }
  }
  public static void listMenu() {
    System.out.println("List:");
    System.out.println("1. Weather indicators");
    System.out.println("2. Calculator");
    System.out.println("3. Day of the week");
    System.out.println("4. Height and Weight");
    System.out.println("5. Come out");
    System.out.println("6. Add a surname, name, phone number, date of birth and gender");
    System.out.println("7. Show surname, name, phone number, date of birth and gender");
    System.out.println("8. Factorial of a number without return");
    System.out.println("9. Factorial of a number with return");
  }
  public static void weatherIndicators() {
    int[] array = {
      12,
      15,
      10,
      6,
      9,
      20,
      10
    };
    for (int i: array) {
      System.out.println(i);
    }
  }
  public static void calculation(Scanner sc) {
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("Choose one is operations");
    System.out.println("1. *");
    System.out.println("2. +");
    System.out.println("3. -");
    System.out.println("4. /");
    int d = sc.nextInt();
    if (d == 1) {
      int k = b * c;
      System.out.println(k);
    }

    if (d == 2) {
      int l = b + c;
      System.out.println(l);
    }

    if (d == 3) {
      int m = b - c;
      System.out.println(m);
    }

    if (d == 4) {
      int p = b / c;
      System.out.println(p);
    }

  }
  public static void weekDay() {
    System.out.println("Monday");
  }
  public static void heightWeight(Scanner sc) {
    System.out.println("Enter height");
    int d = sc.nextInt();
    System.out.println("Enter weight");
    int f = sc.nextInt();

    int x = d - f;

    if (x == 100) {
      System.out.println("Normal weight");
    } else if (x > 100) {
      System.out.println("Underweight " + ((d - f) - 100) + "kq");
    } else if (x < 100) {
      System.out.println("Overweight " + (100 - (d - f)) + "kq");
    }
  }
  public static void addNameNumber(Scanner sc, String[] phone, String[] name, String[] surname, String[] date, String[] gender) {
    System.out.println("Enter the surname");
    sc.nextLine();
    String sn = sc.nextLine();
    System.out.println("Enter the name");
    String nm = sc.nextLine();
    System.out.println("Enter the number:");
    String num = sc.nextLine();
    for (int i = 0; i < phone.length; i++) {
      if (sn.equals(phone[i]) && nm.equals(phone[i]) && num.equals(phone[i])) {
        System.out.println("Surname, name or number dublicates");
        return;
      }
    }
    System.out.println("Enter date of birth");
    String dt = sc.nextLine();

    int idx3 = getFreeSpace(date);
    if (idx3 == -1) {
      System.out.println("No emptly space found in date array");
    }

    System.out.println("Enter gender");
    String gd = sc.nextLine();

    int idx4 = getFreeSpace(gender);
    if (idx4 == -1) {
      System.out.println("No emptly space found in gender array");
    }

    int idx2 = getFreeSpace(surname);
    if (idx2 == -1) {
      System.out.println("No emptly space found in surname array");
    }

    for (int i = 0; i < name.length; i++) {
      if (nm.equals(name[i])) {
        System.out.println("Name duplicates");
        return;
      }
    }
    int idx1 = getFreeSpace(name);
    if (idx1 == -1) {
      System.out.println("No emptly space found in name array");
    } else {}

    for (int i = 0; i < phone.length; i++) {
      if (num.equals(phone[i])) {
        System.out.println("Phone number dublicates");
        return;
      }
    }
    System.out.println("Surname, name, phone number, date of birth and gender added");
    int idx = getFreeSpace(phone);
    if (idx == -1) {
      System.out.println("No emptly space found");
    } else {
      phone[idx] = num;
      name[idx] = nm;
      surname[idx] = sn;
      date[idx] = dt;
      gender[idx] = gd;
      System.out.println("Surname, name,phone number, date of birth and gender added   " + sn + " " + nm + " " + num + " " + dt + " " + gd);
    }
  }
  public static void showNameNumber(String[] phone, String[] name, String[] surname, String[] date, String[] gender) {
    for (int i = 0; i < phone.length; i++)
      System.out.println(surname[i] + " - " + name[i] + " - " + phone[i] + " - " + date[i] + " - " + gender[i]);
  }
  public static int getFreeSpace(String[] phone) {
    for (int i = 0; i < phone.length; i++) {
      if (phone[i] != null) {
        if (phone[i].equals(" ")) {
          return i;
        }
      } else {
        return i;
      }
    }
    return -1;
  }
  public static void factorialWithout(int a) {
    if (a == 0)
      return;
    System.out.println(a);
    factorialWithout(a - 1);
  }
  public static int factorialWith(int x) {
    if (x == 1) {
      return 10;
    }
    return x * factorialWith(x - 1);

  }
} 
