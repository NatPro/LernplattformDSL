import java.util.ArrayList;

public class Platform {

    public static void main(String[] args) {
        Module module1 = new Module.ModuleBuilder("Was ist ein Spiel?", "Gamedesign - Modul 1")
                .lessonCount(5)
                .teacher("Natalia")
                .description("In diesem Modul gehen wir der Frage nach, wann ein Spiel ein Spiel ist, welche Elemente in einem Spiel enthalten sind und wie du mit deiner Gruppe ein erstes Spielkonzept entwickeln kannst.")
                .build();
        Module module2 = new Module.ModuleBuilder("Spiele machen!", "Gamedesign - Modul 2")
                .lessonCount(5)
                .teacher("Natalia")
                .description("Dieses Modul zeigt dir, wie du mit deiner Gruppe von einer Spielidee zum ersten eigenen Computerspiel gelangst, indem Kinder mit einfachen Elementen vielfältige Spielkonzepte erstellen.")
                .build();
        Module module3 = new Module.ModuleBuilder("Scratch Einführung", "Gamedesign - Modul 3")
                .lessonCount(5)
                .teacher("Natalia")
                .description("In diesem Modul wird die blockbasierte Programmierumgebung \"Scratch\" vorgestellt und spielerisch eingeübt.")
                .build();
        Module module4 = new Module.ModuleBuilder("Das erste eigene Spiel", "Gamedesign - Modul 4")
                .lessonCount(5)
                .teacher("Natalia")
                .description("In diesem Modul erfährst du, wie du die Kids auf Ideen für das erste eigene Computerspiel bringen kannst und wie sie diese dann vorausschauend umsetzen können.")
                .build();
        Module module5 = new Module.ModuleBuilder("Spielerweiterung und Veröffentlichung", "Gamedesign - Modul 5")
                .lessonCount(5)
                .teacher("Natalia")
                .description("In diesem Modul lernst du, wie man ein schon funktionierendes Scratch-Spiel mit Grafiken und Tönen anreichern kann, um es anschließend zu veröffentlichen.")
                .build();
        ArrayList<Module> allModules = new ArrayList<>();
        allModules.add(module1);
        allModules.add(module2);
        allModules.add(module3);
        allModules.add(module4);
        allModules.add(module5);

        Course c = new Course.CourseBuilder("Gamedesign", "Konzeption und Programmierung mit Scratch")
                .moduleCount(5)
                .teacher("Natalia")
                .description("Dieser Kurs vermittelt die Grundlagen zum Thema Spielentwicklung. Anschließend arbeiten die Kinder in einer Gruppe zusammen und entwickeln eine Idee für ein Computerspiel, das sie mit Hilfe von Scratch umsetzen.")
                .modules(allModules)
                .build();

        System.out.println(c.toString());
    }

}
