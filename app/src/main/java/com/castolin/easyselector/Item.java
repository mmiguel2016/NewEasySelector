package com.castolin.easyselector;

/**
 * Created by mmiguel on 03.03.2016.
 */
public class Item {

    String selectionName;
    int selectionImage;

    public Item(String selectionName, int selectionImage)
    {

        this.selectionName=selectionName;
        this.selectionImage=selectionImage;
    }
    public String getSelectionName()
    {
        return selectionName;
    }
    public int getSelectionImage()
    {
        return selectionImage;
    }
}