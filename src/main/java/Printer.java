public class Printer {
    private int paperStock;
    private int tonerVolume;

    public Printer(int paperStock, int tonerVolume){
        this.paperStock = paperStock;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperStock(){
        return this.paperStock;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int inputPaper, int copies){
        int totalCopies = inputPaper * copies;
        if (paperStock >= (totalCopies)){
            paperStock -= totalCopies;
            tonerVolume -= totalCopies * 1;
        }

    }

    public void refillPaper(int refillPaper){
        paperStock += refillPaper;
    }


}
