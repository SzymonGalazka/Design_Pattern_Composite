package pl.sg;

import static pl.sg.Section.preservedNumber;
import static pl.sg.Section.previousLayer;
import static pl.sg.Section.number;

public class Paragraph extends Layout {

    public Paragraph(String title, int layer) {
        super(title, layer);
        if(layer == previousLayer) {
            presentNumber = number;
        }else{
            if(preservedNumber==0) preservedNumber = number;
            number=1;
            presentNumber = number;
            previousLayer++;
        }
        number++;
    }

    @Override
    public void showContents() {
        System.out.println(presentNumber+". "+title);
    }

}
