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

//    public boolean printCopies(int inputPaper, int copies){
//        return inputPaper == copies ? true: false;
//    }

    public int print(int inputPaper, int copies){
        if (paperStock >= 5){
            return paperStock -= inputPaper * copies;
        }
        return paperStock;
    }


    public int refillPaper(int refillPaper){
        return paperStock += refillPaper;
    }

    public int printReduceTonerVolume(int inputPaper, int copies){
        return tonerVolume -= inputPaper * copies * 1;
    }

}
