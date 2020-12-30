### 享元模式
所谓享元模式，顾名思义，就是被共享的单元。享元模式的意图是复用对象，节省内存，前提是享元对象是不可变对象    
当一个系统中存在大量重复对象时，如果这些对象不可变，我们可以利用享元模式将对象设计成享元，在内存只保留一份实例
供多出代码引用。这样可以减少内存中对象的数量，起到节省内存目的。实际上，不仅仅是相同对象可以设计成享元，对于相似
对象，我们也可以将这些对象中相同的部分提取出来，设计成享元，让这些大量相似引用这些享元。
####文本编辑器使用享元模式
使用之前：
~~~java

public class Character {//文字
  private char c;

  private Font font;
  private int size;
  private int colorRGB;

  public Character(char c, Font font, int size, int colorRGB) {
    this.c = c;
    this.font = font;
    this.size = size;
    this.colorRGB = colorRGB;
  }
}

public class Editor {
  private List<Character> chars = new ArrayList<>();

  public void appendCharacter(char c, Font font, int size, int colorRGB) {
    Character character = new Character(c, font, size, colorRGB);
    chars.add(character);
  }
}
~~~
缺点：
- 每敲一个文字，就会调用Editor类的appendCharacter()方法，创建一个新的Character对象，保存到
chars数组中，如果一个文本文件中，有上万，十几万，几十万的文字，那这种方法会占用大量内存。使用享元模式。
~~~java

public class CharacterStyle {
  private Font font;
  private int size;
  private int colorRGB;

  public CharacterStyle(Font font, int size, int colorRGB) {
    this.font = font;
    this.size = size;
    this.colorRGB = colorRGB;
  }

  @Override
  public boolean equals(Object o) {
    CharacterStyle otherStyle = (CharacterStyle) o;
    return font.equals(otherStyle.font)
            && size == otherStyle.size
            && colorRGB == otherStyle.colorRGB;
  }
}

public class CharacterStyleFactory {
  private static final List<CharacterStyle> styles = new ArrayList<>();

  public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
    CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
    for (CharacterStyle style : styles) {
      if (style.equals(newStyle)) {
        return style;
      }
    }
    styles.add(newStyle);
    return newStyle;
  }
}

public class Character {
  private char c;
  private CharacterStyle style;

  public Character(char c, CharacterStyle style) {
    this.c = c;
    this.style = style;
  }
}

public class Editor {
  private List<Character> chars = new ArrayList<>();

  public void appendCharacter(char c, Font font, int size, int colorRGB) {
    Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
    chars.add(character);
  }
}
~~~

1.享元和单例区别    
   单例汇总一个类只能创建一个对象，而在享元模式中，一个类可以创建多个对象，每个对象被多处代码引用共享。
2.享元和缓存区别    
   享元模式中，我们通过工厂类来缓存已经创建好的对象，这里的缓存实际是存储的意思，跟我们平时所说的“数据库缓存”,“CPU缓存”
我们平时所说的缓存，主要是为了提高访问效率，而非复用。
3.享元模式和对象池区别
   为了避免频繁地进行对象创建和释放导致内存碎片，我们可以预先申请一片连续的内存空间，也就是这里说的对象池，
每次创建对象时，我们从对象池中直接取出一个空闲对象来使用，对象使用完之后，再放回到对象池中以后复用，而非直接释放掉。     
   池化技术中的复用可以理解为重复使用，主要目的是节省时间。
