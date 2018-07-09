package collect;

//Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo laukas ir Double tipo laukas
//reiškiantis išmokėtą atlyginimą.
//Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai) ir aprašykite
//tokius veiksmus naudojant duomenų srautus/vamzdynus:
//1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka pagal išmokėtą sumą:
//vardas - išmokėta suma
//2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra kiekvienam darbuotojui ir
//atspausdinkite: vardas - kiek kartų išmokėta

public class Salary {

  private Double payment;
  private Employee employee;

  Salary(Double payment, Employee employee) {
    this.payment = payment;
    this.employee = employee;
  }

  public Double getPayment() {
    return payment;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setPayment(Double payment) {
    this.payment = payment;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
