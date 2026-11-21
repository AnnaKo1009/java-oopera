import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 178);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 168);
        Actor actor3 = new Actor("Семён", "Семёнов", Gender.MALE, 180);

        Director director1 = new Director("Александр", "Васильев", Gender.MALE, 12);
        Director director2 = new Director("Сергей", "Синицын", Gender.MALE, 20);

        Person musicAuthor1 = new Person("Владимир", "Смирнов", Gender.MALE );
        Person choreographer1 = new Person("Николай", "Новиков", Gender.MALE);

        ArrayList<Actor> balletActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> showActors = new ArrayList<>();

        Show show1 = new Show("Пиковая дама",
                110,
                director1,
                showActors);
        Opera opera1 = new Opera("Садко",
                90,
                director2,
                operaActors,
                musicAuthor1,
                "Tекст2",
                20);
        Ballet ballet1 = new Ballet("Лебединое озеро",
                120,
                director1,
                balletActors,
                musicAuthor1,
                "Текст1",
                choreographer1);

        show1.addActor(actor1);
        show1.addActor(actor3);
        opera1.addActor(actor1);
        opera1.addActor(actor2);
        ballet1.addActor(actor1);
        ballet1.addActor(actor2);
        ballet1.addActor(actor3);

        show1.printActors();
        opera1.printActors();
        ballet1.printActors();

        show1.replaceActor(actor2, "Иванов");
        show1.printActors();
        opera1.replaceActor(actor3, "Воронин");

        opera1.printLibrettoText();
        ballet1.printLibrettoText();

        ballet1.printDirectorInfo();
    }
}
