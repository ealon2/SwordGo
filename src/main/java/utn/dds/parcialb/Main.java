package utn.dds.parcialb;

import org.uqbarproject.jpa.java8.extras.export.JpaSchemaExport;

public class Main {
  public static void main(String[] args) throws Exception{
    System.out.println("Hello world!");
    JpaSchemaExport.execute("db", "schema.sql", true, true);
  }
}