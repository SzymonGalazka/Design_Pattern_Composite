package pl.sg;

import java.util.ArrayList;

public class Section extends Layout{

    protected ArrayList<Layout> elements = new ArrayList<>();
    protected static int number=1, previousLayer=0,preservedNumber;

    public Section(String title, int layer) {
        super(title, layer);
        if(layer<previousLayer) {
            presentNumber = ++preservedNumber;
            previousLayer = layer;
        }
        else if(layer == previousLayer) {
            presentNumber = number;
        }else{
            if(preservedNumber==0) preservedNumber = number;
            number=1;
            presentNumber = number;
            previousLayer++;
        }
        number++;
    }

    public void add(Layout l){
        elements.add(l);
    }

    @Override
    public void showContents() {
        if(layer==0) System.out.println(title);
        else {
            System.out.println((presentNumber + ". " + title));

        }
        if(layer==0) for(Layout l : elements) {l.showContents();}
        else for(Layout l : elements) {
            if(l instanceof Section) getParentNumber();
            else getParagraphNumber();
            l.showContents();}
    }

    public void getParentNumber(){
        System.out.print(spaces+presentNumber+".");
    }

    private void getParagraphNumber() {
        System.out.print(spaces+preservedNumber+"."+presentNumber+".");
    }


}
