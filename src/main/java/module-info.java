module com.java9test{
    requires spring.web;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires java.sql;
    opens com.test;
}