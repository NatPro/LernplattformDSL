import java.util.ArrayList;

public class Course {
    private final String title;
    private final String subtitle;
    private final int moduleCount;
    private final String teacher;
    private final String description;
    private ArrayList<Module> modules;

    private Course(CourseBuilder builder) {
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.moduleCount = builder.moduleCount;
        this.teacher = builder.teacher;
        this.description = builder.description;
        this.modules = builder.modules;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getModuleCount() {
        return moduleCount;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        this.modules.add(module);
    }

    @Override
    public String toString() {
        String moduleString = "";
        for (int i = 0; i < modules.size(); i++) {
            moduleString += modules.get(i).toString() + "\n";
        }
        return "Kurstitel: " + title + " - " + subtitle + " - " + moduleCount + " Module:\n" + moduleString;
    }


    public static class CourseBuilder {
        private final String title;
        private final String subtitle;
        private int moduleCount;
        private String teacher;
        private String description;
        private ArrayList<Module> modules;

        public CourseBuilder(String title, String subtitle) {
            this.title = title;
            this.subtitle = subtitle;
        }

        public CourseBuilder moduleCount(int moduleCount) {
            this.moduleCount = moduleCount;
            return this;
        }

        public CourseBuilder teacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public CourseBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CourseBuilder modules(ArrayList<Module> modules) {
            this.modules = modules;
            return this;
        }

        public Course getCourse() {
            return new
                    CourseBuilder("Programmieren mit dem Calliope mini", "Einführung in analoge und digitale Programmierung für Grundschüler")
                    .moduleCount(8)
                    .teacher("Natalia")
                    .description("ganz toller Kurs, etc...")
                    .modules(null)
                    .build();
        }

        public Course build() {
            Course course = new Course(this);
            return course;
        }


    }
}