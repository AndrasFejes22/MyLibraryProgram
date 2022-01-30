public class Books {

    private String title;
    //public String author;
    private String author;
    private int pages;
    private int edition;
    private boolean available = true;
    public static int szamlalo = 0;
    int sorszam = 0;
    public static int counter;

    public Books(String title, String author, int pages, int edition, boolean available) {
        super();
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.edition = edition;
        this.available = available;
        szamlalo++;
        sorszam = szamlalo;


    }

//	public Books() {
//		szamlalo++;
//		sorszam = szamlalo;
//	}

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getEdition() {
        return new Integer(edition);
    }

    public boolean getAvailable() {
        return available;
    }
    /*
    public boolean isNotAvailable() {
        return !available;
    }
    */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setEdition(int edition) {
        this.edition =  new Integer(edition);
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }



    @Override
    public String toString() {
        return "Books [title = " + title + ", author = " + author + ", pages = " + pages + ", edition = " + edition
                + ", available = " + available + "]";
    }

}
