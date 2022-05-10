package com.company.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        Byte b1 = 13;
        Byte b2 = Byte.valueOf((byte) 13);
        Byte b3 = new Byte((byte) 13);
        Byte b4 = Byte.parseByte("13");

        Short sh1 = 13;
        Short sh2 = Short.valueOf((short) 13);
        Short sh3 = new Short((short) 13);
        Short sh4 = Short.parseShort("13");

        Integer i1 = 13;
        Integer i2 = Integer.valueOf(13);
        Integer i3 = new Integer(13);
        Integer i4 = Integer.parseInt("13");

        Long l1 = 13L;
        Long l2 = Long.valueOf(13L);
        Long l3 = new Long(13L);
        Long l4 = Long.parseLong("13");

        Float f1 = 13.0f;
        Float f2 = Float.valueOf(13.0f);
        Float f3 = new Float(13.0f);
        Float f4 = Float.parseFloat("13.0");

        Double d1 = 13.0;
        Double d2 = Double.valueOf(13.0);
        Double d3 = new Double(13.0);
        Double d4 = Double.parseDouble("13.0");

        Boolean isB1 = true;
        Boolean isB2 = Boolean.valueOf(true);
        Boolean isB3 = new Boolean(false);
        Boolean isB4 = Boolean.parseBoolean("false");

        Character ch1 = 'c';
        Character ch2 = new Character('e');
        Character ch3 = Character.valueOf('g');

        // С одного типа в разные
        Double db = 13.13;
        byte by = db.byteValue();
        short sh = db.shortValue();
        int i = db.intValue();
        long l = db.longValue();
        float fl = 13.13F;

        // NaN/infinity проверки
        Double dab1 = 0.0;
        Double dab2 = 1.0;
        Double nanValue = dab2 / dab1;
        Double infinityValue = dab1 / dab1;
        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = " + "NaN");
        }
        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = " + "NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = " + "Infinity");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = " + "Infinity");
        }

        // Еще что-то)
        Long ln1 = 120L;
        Long ln2 = 120L;
        System.out.println(ln1 == ln2);

        Long ln3 = 1200L;
        Long ln4 = 1200L;
        System.out.println(ln3 == ln4);
    }
}
