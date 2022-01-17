package com.mytests.thymeleaf.thymeleafnotresolvedmodelattributes;

public class Item{
        String prop1;
        String prop2;
        String prop3;

        public Item(String prop1, String prop2, String prop3) {
            this.prop1 = prop1;
            this.prop2 = prop2;
            this.prop3 = prop3;
        }

        public String getProp1() {
            return prop1;
        }

        public String getProp2() {
            return prop2;
        }

        public String getProp3() {
            return prop3;
        }
    }
