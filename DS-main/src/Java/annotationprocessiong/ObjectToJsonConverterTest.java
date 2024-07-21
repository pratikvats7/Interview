package Java.annotationprocessiong;

class ObjectToJsonConverterTest {

    public static void main(String[] args) throws JsonSerializationException {
        Person person = new Person("soufiane", "cheouati", "34","302 Aditi");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        System.out.println(jsonString);
    }

}