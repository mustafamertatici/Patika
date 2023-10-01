package patika.Employee;

public class Employee {
    String name;
    double salary;

    int workHours;

    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     double tax(){
        if (salary >1000) {

            return salary*0.03;
        }
        else {
            return salary;
        }
    }

     double bonus(){
        if (workHours >40) {
         double   extraHours=workHours-40;
         return  extraHours*30;
        }
        else return 0;
    }
     double raiseSalary(){
       double yearsOfWork=2021-hireYear;
        if (yearsOfWork<10) {
        return  salary*0.05;
        } else if (yearsOfWork<20) {
            return salary*0.10;
        } else   {
            return salary*0.15;
        }

    }

    @Override
    public String toString() {
        double totalSalary=salary-tax()+bonus()+raiseSalary();
        return "Employee{" +
                "\nAdı:'" + name + '\'' +
                ",\n Maaşı:" + salary +
                ",\n Çalışma Saati:" + workHours +
                ",\n Başlangıç Yılı:" + hireYear +
                ",\n Vergi :" + tax() +
                ",\n Bonus  :" + bonus()+
                ",\n Maaş Artışı :" + raiseSalary()+
                ",\n Vergi ve Bonuslar ile birlikte maaş :" + totalSalary+
                ",\n Toplam Maaş : :" + totalSalary;

    }

    public Employee() {
    }
}
