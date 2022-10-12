class person
{
    String name;
    birthday bday;
    person(String name,birthday bday)
    {
        this.name=name;
        this.bday=bday;
    }
    public void printdata()
    {
        System.out.println("Customer Name :"+name);
        bday.printBirthDay();
    }
}
class birthday {
    int day, month, year;

    birthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printBirthDay() {
        System.out.println("Birthday : " + day + "/" + month + "/" + year);
    }
}
class finalinfobday
{
    public static void main(String args[])
    {
        birthday bday=new birthday(01,01,2000);
        person pinfo=new person("Dinesh",bday);
        pinfo.printdata();
    }
}