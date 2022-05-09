package org.example;

import com.google.gson.Gson;
/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Compact_Json cjson=new Compact_Json();
        Gson gson=new Gson();
        String json="{\"name\":\"Mario\",\"surname\":\"Rossi\",\"age\":\"52\",\"car\":\"Ferrari Portofino\",\"salary\":\"628000\"}";

        cjson=gson.fromJson(json, Compact_Json.class);

        System.out.println("Name:"+cjson.name+"\nSurname:"+cjson.surname+"\nCar:"+cjson.car+"\nSalary:"+cjson.salary+"\nAge:"+cjson.age);

        cjson.name="Carlo";
        cjson.surname="Mariani";
        cjson.age=38;
        cjson.car="Fiat panda";
        cjson.salary=98988856;

        json=gson.toJson(cjson);
        System.out.println("Json:\n"+json);
    }


}
