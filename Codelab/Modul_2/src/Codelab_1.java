class Animal{
    private String name;
    private String type;
    private String sound;

    Animal(String name, String type, String sound){
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getType(){
        return type;
    }

    void tampilkanInfo(){
        System.out.println("Nama: " + getName());
        System.out.println("Jenis: " + getType());
        System.out.println("Suara: " + getSound() + "\n");
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