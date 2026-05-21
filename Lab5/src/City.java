import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List<InfrastructureElement> infrastructureList;

    public City(String cityName) {
        this.cityName = cityName;
        infrastructureList = new ArrayList<>();
    }

    class InfrastructureElement {

        private String name;
        private String type;

        public InfrastructureElement(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public void showInfo() {
            System.out.println("Назва: " + name +
                    " | Тип: " + type);
        }

        public String getType() {
            return type;
        }
    }

    public void addInfrastructure(String name, String type) {
        InfrastructureElement element =
                new InfrastructureElement(name, type);

        infrastructureList.add(element);
    }

    public void showInfrastructure() {

        System.out.println("\nІнфраструктура міста " + cityName + ":");

        for (InfrastructureElement element : infrastructureList) {
            element.showInfo();
        }
    }

    public void findByType(String type) {

        boolean found = false;

        System.out.println("\nРезультати пошуку:");

        for (InfrastructureElement element : infrastructureList) {

            if (element.getType().equalsIgnoreCase(type)) {
                element.showInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Елементи не знайдені.");
        }
    }
}
