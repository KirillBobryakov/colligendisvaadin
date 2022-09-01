package com.bkv.colligendis.utils.numista;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NumistaPiece {

    public enum PieceType {
        Coin,
        Banknote,
        Exonumia
    }
//
//
//    public enum DescriptionTitle {
//        Commemorative_issue("Commemorative issue", 1),
//        Obverse("Obverse", 2),
//        Reverse("Reverse", 3),
//        Edge("Edge", 4),
//        Watermark("Watermark", 5),
//        Mints("Mints", 6),
//        Comments("Comments", 7);
//
//        private final String title;
//        private final int code;
//
//        DescriptionTitle(String s, int c) {
//            this.title = s;
//            this.code = c;
//        }
//
//        @Override
//        public String toString() {
//            return title;
//        }
//
//        public int getCode() {
//            return code;
//        }
//    }


    /*
    28206
     */

    public static final List<String> ISSUER_RELATION_FEATURES = Arrays.asList("Issuer", "Issuing entity");




    public enum MAIN_RELATION_FEATURES {
        Currency("Currency"),
        Type("Type"),
        Calendar("Calendar");

        private final String name;
        MAIN_RELATION_FEATURES(String s) { name = s; }
        @Override
        public String toString() { return name; }
    }
//    public final static String STANDARD_CIRCULATION_COIN = "Standard circulation coin";
//    public final static String NON_CIRCULATING_COIN = "Non-circulating coin";
//    public final static String CIRCULATING_COMMEMORATIVE_COIN = "Circulating commemorative coin";
//    public final static String PATTERN = "Pattern";
//    public final static String STANDARD_BANKNOTE = "Standard banknote";
//    public final static String COMMEMORATIVE_NOTE = "Commemorative note";
//    public final static String LOCAL_BANKNOTE = "Local banknote";
    public static final List<String> ISSUE_TYPE_VALUES = Arrays.asList("Standard circulation coin", "Non-circulating coin",
            "Circulating commemorative coin", "Pattern", "Standard banknote", "Commemorative note", "Local banknote", "Token");
    
    public enum MAIN_PROPERTY_FEATURES {
        Location("Location"), //skip
        Value("Value"),
        Year("Year"),
        Years("Years"),
        Demonetized("Demonetized"),
        NumistaNumber("Number"),
        References("References"),
        Count("Count");

        private final String name;
        MAIN_PROPERTY_FEATURES(String s) { name = s; }
        @Override
        public String toString() { return name; }
    }

    public enum TECH_SPECIFIC_PROPERTY_FEATURES {
        Composition("Composition"),
        Weight("Weight"),
        Diameter("Diameter"),
        Thickness("Thickness"),
        Size("Size"),
        Shape("Shape"),
        Technique("Technique"),
        Orientation("Orientation");

        private final String name;

        TECH_SPECIFIC_PROPERTY_FEATURES(String s) { name = s; }

        @Override
        public String toString() { return name; }
    }



    public String name;
    public PieceType pieceType;
    public Territory territory;
    public HashMap<String, String> mainProperties = new HashMap<>();
    public String obversePhotoLink = "";
    public String reversePhotoLink = "";
    public HashMap<String, DescriptionItem> descriptionHashMap = new HashMap<>();
    public ArrayList<NumistaCollectionItem> collection = new ArrayList<>();



    public void addCollectionItem(String date, String tirage, String comment){
        collection.add(new NumistaCollectionItem(date, tirage, comment));
    }

    public void addChildTerritory(String territory){
        Territory lastChildTerritory = getLastChildTerritory(this.territory);

        if(lastChildTerritory == null){
            this.territory = new Territory(territory);
        } else {
            lastChildTerritory.child = new Territory(territory);
        }
    }

    public Territory getLastChildTerritory(Territory territory){
        if(territory == null) {
            return null;
        } else {
            if(territory.child == null) {
                return territory;
            } else {
                return getLastChildTerritory(territory.child);
            }
        }
    }



    public static class DescriptionItem {
        public String text;
        public ArrayList<String> photoLinks = new ArrayList<>();
        public String mentions;

        public void addText(String text){
            this.text = text;
        }
    }


    public static class Territory {
        public String name;
        public Territory child;

        public Territory(String name) {
            this.name = name;
        }
    }




}


