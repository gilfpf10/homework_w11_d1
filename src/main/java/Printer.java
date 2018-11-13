public class Printer {


    private int sheets;
    public int pages;
    public int copies;
    public int toner;

    public Printer(int sheets, int pages, int copies, int toner){
        this.sheets = sheets;
        this.pages = pages;
        this.copies = copies;
        this.toner = toner;

    }

    public int getSheets(){
        return sheets;

    }

    public int getPages(){
        return pages;
    }

    public int getCopies(){
        return copies;

    }

    public int getToner(){
        return toner;

    }

    public int refill(){
        if (sheets <100){
            sheets = 100;
        }
        return sheets;
    }
}
