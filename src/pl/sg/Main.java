package pl.sg;

public class Main {

    public static void main(String[] args) {
        Section book = new Section("Harry Potter",0);

        Section section1 = new Section("Rodział pierwszy",1);
        Section section2 = new Section("Rodział drugi",1);
        Section section3 = new Section("Rodział trzeci",1);
        Section subsection = new Section("Pierwszy podrozdział",2);
        section2.add(subsection);
        Section subsection2 = new Section("Drugi podrozdział",2);
        section2.add(subsection2);
        Section subsection3 = new Section("Trzeci podrozdział",2);
        section2.add(subsection3);
        subsection.add(new Paragraph("Kolejny podrozdział",3));
        subsection.add(new Paragraph("I jeszcze jeden podrozdział",3));
        subsection.add(new Paragraph("I dodatkowy jeden podrozdział",3));


        book.add(section1);
        book.add(section2);
        book.add(section3);

        book.showContents();
    }
}
