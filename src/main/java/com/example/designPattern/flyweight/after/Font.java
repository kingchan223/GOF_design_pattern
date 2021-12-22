package com.example.designPattern.flyweight.after;

/*intrinsit - 해당 객체가 flyweight객체이다.*/
/*Immutable한 클래스. 한번 생성하면 수정할 수 없다.*/
public final class Font {
    final String fontFamily;
    final int size;

    public Font(String fontFamily, int size) {
        this.fontFamily = fontFamily;
        this.size = size;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getSize() {
        return size;
    }
}
