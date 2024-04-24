package advance.dev;

public class Person {
	
	String name;
    int age;
	// Phương thức khởi tạo
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức get cho thuộc tính Name
    public String getName() {
        return name;
    }

    // Phương thức set cho thuộc tính Name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức get cho thuộc tính Age
    public int getAge() {
        return age;
    }

    // Phương thức set cho thuộc tính Age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        Person person = new Person("Anh", 30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        // Cập nhật tên và tuổi
        person.setName("Ánh");
        person.setAge(25);
        System.out.println("Updated Name: " + person.getName() + ", Updated Age: " + person.getAge());
    }
}
