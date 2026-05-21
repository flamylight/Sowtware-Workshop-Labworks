void main(){
    City city = new City("Kyiv");

    city.addInfrastructure("Khreshchatyk", "Проспект");
    city.addInfrastructure("Peremohy", "Проспект");
    city.addInfrastructure("Shevchenka", "Вулиця");
    city.addInfrastructure("Maidan Nezalezhnosti", "Площа");

    Scanner scanner = new Scanner(System.in);

    while (true) {

        System.out.println("\n=== МЕНЮ ===");
        System.out.println("1. Показати всі елементи");
        System.out.println("2. Пошук за типом");
        System.out.println("0. Вихід");

        System.out.print("Ваш вибір: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                city.showInfrastructure();
                break;

            case 2:
                System.out.print("Введіть тип (Проспект / Вулиця / Площа): ");
                String type = scanner.nextLine();

                city.findByType(type);
                break;

            case 0:
                System.out.println("Програму завершено.");
                return;

            default:
                System.out.println("Невірний вибір!");
        }
    }
}