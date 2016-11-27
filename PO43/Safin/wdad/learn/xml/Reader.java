package PO43.Safin.wdad.learn.xml;

import java.io.Serializable;

public class Reader implements Serializable{
    private String firstName;
    private String secondName;

    public Reader(String fn,String sn)
    {
        firstName = fn;
        secondName =sn;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }

}
