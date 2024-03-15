
package libreria.libreria;
public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean available;

    public Book() {
    }

    public Book(String title, int quantity, int id, String genre, String loanDate, String returnDate) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.available = true;
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
