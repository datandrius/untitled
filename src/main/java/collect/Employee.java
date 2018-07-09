package collect;

//Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo laukas ir Double tipo laukas
//reiškiantis išmokėtą atlyginimą.
//Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai) ir aprašykite
//tokius veiksmus naudojant duomenų srautus/vamzdynus:
//1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka pagal išmokėtą sumą:
//vardas - išmokėta suma
//2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra kiekvienam darbuotojui ir
//atspausdinkite: vardas - kiek kartų išmokėta

import java.util.Objects;

public class Employee {

  private String firstName;
  private String lastName;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(firstName, employee.firstName) &&
        Objects.equals(lastName, employee.lastName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
