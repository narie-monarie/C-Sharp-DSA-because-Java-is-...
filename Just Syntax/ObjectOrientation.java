class Book {
  public String title;
  public String author;

  public Book(String title, String author) {
    this.setTitle(title);
    this.setAuthor(author);
  }

  public String getAuthor() {
    return this.author
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void readBook() {
    System.out.println("Reading " + this.title + " Written by " + this.author);
  }
}

class Library extends Book {
  public String countryOfOrigin;

  public Library(String title, String author, String countryOfOrigin) {
    super(title, author);
    this.countryOfOrigin = countryOfOrigin;
  }

  @Override
  public void readBook() {
    System.out.println("Im sitting in the library");
  }
}

interface Animal {
  public void speak();
}

class Cat implements Animal {
  @Override
  public void speak() {
    System.out.println("The cat meows");
  }
}

class Dog implements Animal {
  @Override
  public void speak() {
    System.out.println("The dog Barks");
  }
}

public class ObjectOrientation {
  public static void main(String[] args) {

    // Classes and objects
    Book book1 = new Book("Harry Porter", "JK Rowling");
    System.out.println(book1.getTitle());

    Library lib = new Library("Mashimo", "Monari", "Kenya");
    System.out.println(lib.countryOfOrigin);

    Animal[] animals = {
      new Dog(),
      new Cat()
    };
    for (Animal anima : animals) {
      anima.speak();
    }
  }
}
