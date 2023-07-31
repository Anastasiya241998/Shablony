public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анастасия")
                .setSurname("Грачева")
                .setAge(24)
                .setAddress("Россия")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Иван")
                .build();
        System.out.println("У - " + mom + " есть сын, - " + son);
//        try {
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//        try {
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }

    }

}
