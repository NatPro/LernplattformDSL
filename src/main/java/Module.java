public class Module {
    private final String title;
    private final String subtitle;
    private final int lessonCount;
    private final String teacher;
    private final String description;

    private Module(ModuleBuilder builder) {
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.lessonCount = builder.moduleCount;
        this.teacher = builder.teacher;
        this.description = builder.description;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getLessonCount() {
        return lessonCount;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Modultitel: " + title + " - " + subtitle + " von " + teacher + "\n" +
                "Beschreibung: " + description + " (" + lessonCount + " Lektionen)";
    }

    public static class ModuleBuilder {
        private final String title;
        private final String subtitle;
        private int moduleCount;
        private String teacher;
        private String description;

        public ModuleBuilder(String title, String subtitle) {
            this.title = title;
            this.subtitle = subtitle;
        }

        public ModuleBuilder lessonCount(int moduleCount) {
            this.moduleCount = moduleCount;
            return this;
        }

        public ModuleBuilder teacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public ModuleBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Module getModule() {
            return new
                    ModuleBuilder("Was ist ein Spiel?", "Gamedesign - Modul 1")
                    .lessonCount(8)
                    .teacher("Natalia")
                    .description("ganz tolles Modul, etc...")
                    .build();
        }

        public Module build() {
            Module module = new Module(this);
            return module;
        }


    }









}
