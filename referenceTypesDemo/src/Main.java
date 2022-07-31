public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1);


        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Gökberk";
        Customer customer2 = customer;

        Person person1 = customer;
        Person person2 = new Employee();

        PersonDal personDal = new PersonDal();
        personDal.add(new Employee());
        personDal.add(new Person());
        personDal.add(new Customer());
        personDal.add(new Visitor());



        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar1 = sayilar2;
        sayilar2[0] = 30;
        System.out.println(sayilar1[0]);
    }
}