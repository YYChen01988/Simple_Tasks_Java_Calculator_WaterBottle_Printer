public class Printer {
    private int paperStock;

    public Printer(int paperStock){
        this.paperStock = paperStock;
    }

    public int getPaperStock(){
        return this.paperStock;
    }

    public boolean printCopies(int inputPaper, int copies){
        return inputPaper == copies ? true: false;
    }



}
