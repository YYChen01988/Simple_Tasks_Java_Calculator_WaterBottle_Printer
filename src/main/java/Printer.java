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
        if (paperStock >= 5){
            paperStock -= inputPaper * copies;
            tonerVolume -= inputPaper * copies * 1;
        }

    }

    public void refillPaper(int refillPaper){
        paperStock += refillPaper;
    }


}
