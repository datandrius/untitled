package collect;

//Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo laukas ir Double tipo laukas
//reiškiantis išmokėtą atlyginimą.
//Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai) ir aprašykite
//tokius veiksmus naudojant duomenų srautus/vamzdynus:
//1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka pagal išmokėtą sumą:
//vardas - išmokėta suma
//2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra kiekvienam darbuotojui ir
//atspausdinkite: vardas - kiek kartų išmokėta

import static collect.Weekdays.antra;
import static collect.Weekdays.pirma;
import static collect.Weekdays.trecia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Weekdays> days = Arrays.asList(pirma, antra, trecia, antra, trecia, trecia);

    long dubliu = days
        .stream()
        .collect(Collectors.groupingBy(Weekdays::name, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .count();

    System.out.println(dubliu);

    Employee jonas = new Employee("Jonas", "Lukys");
    Employee onute = new Employee("Onute", "Kavaliauskaite");
    Employee prans = new Employee("Pranas", "Urniezius");
    Employee pauls = new Employee("Paulius", "Paulius");

    List<Salary> salaries = new ArrayList<>();
    salaries.add(new Salary(1823.13, jonas));
    salaries.add(new Salary(611.54, prans));
    salaries.add(new Salary(1.21, pauls));
    salaries.add(new Salary(801.14, jonas));
    salaries.add(new Salary(1194.03, jonas));
    salaries.add(new Salary(2790.00, onute));

    Function<Map.Entry, String> formatas = x -> x.getKey() + " - " + x.getValue();
    Function<Map.Entry<Employee, Double>, String> formatas2 = x -> x.getKey().getFirstName() + " - " + x
        .getValue();

//    System.out.println("Darbuotojams is viso ismoketa: (surusiuota pagal suma)");
//    salaries.stream()
//        .collect(Collectors.groupingBy(
//            Salary::getEmployee,
//            HashMap::new,
//            Collectors.reducing(0.0, Salary::getPayment, Double::sum)))
//        .entrySet()
//        .stream()
////                .sorted(Map.Entry.<Employee, Double> comparingByValue().reversed())
////                .sorted((ss,sd) -> Double.compare(ss.getValue(),sd.getValue()))
//        .sorted(Comparator.comparing(x -> -x.getValue()))
//        .map(formatas2)
//        .forEach(System.out::println);
//    System.out.println();

//    System.out.println("Darbuotojams is viso ismoketa: (surusiuota pagal pavarde)");
//    salaries.stream()
//        .collect(Collectors.groupingBy(
//            Salary::getEmployee,
//            HashMap::new,
//            Collectors.reducing(0.0, Salary::getPayment, Double::sum)))
//        .entrySet()
//        .stream()
//        .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getLastName)))
//        .map(formatas)
//        .forEach(System.out::println);
//    System.out.println();

    System.out.println("\nDarbuotojai gavo tiek ismoku:");
    salaries.stream()
        .collect(Collectors.groupingBy(Salary::getEmployee, Collectors.counting()))
        .entrySet()
        .stream()
        .map(formatas)
        .forEach(System.out::println);
  }

}
