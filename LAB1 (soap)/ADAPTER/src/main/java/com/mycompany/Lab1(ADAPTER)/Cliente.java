package com.mycompany.mavenproject1;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(ClienteAdapter.class)
public interface  Cliente {
    public int getId();
    public String getName();
}
