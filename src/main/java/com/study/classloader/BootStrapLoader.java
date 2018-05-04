package com.study.classloader;
import java.net.URL;

public class BootStrapLoader {
    public static void main(String[] args) {
        URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
        Person person=new Person();
        System.out.println(Person.class.getClassLoader());
        System.out.println(Person.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader()
        );
    }

}
