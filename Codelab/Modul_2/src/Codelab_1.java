class Animal{
    String name;
    String type;
    String sound;

    Animal(String name, String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
    void tampilkanInfo(){
        System.out.println("Nama: " + name);
        System.out.println("Jenis: " + type);
        System.out.println("Suara: " + sound + "\n");
    }
}

public class Codelab_1{
    public static void main(String[] args){
        Animal animal1 = new Animal("Kucing", "Mamalia", "Nyann~~");
        Animal animal2 = new Animal("Anjing", "Mamalia", "Woof-Woof!!");

        animal1.tampilkanInfo();
        animal2.tampilkanInfo();
    }
}