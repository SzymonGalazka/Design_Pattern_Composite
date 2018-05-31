package pl.sg;

abstract class Layout {
    public abstract void showContents();
    protected String title,spaces;
    protected int layer, presentNumber;

    public Layout(String title, int layer) {
        this.title = title;
        this.layer = layer;
        if(layer>0) spaces = String.format("%"+(4*layer)+"s", "");

    }
}
