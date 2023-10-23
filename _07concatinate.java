public class _07concatinate {
    public static void main(String[]args) {

        String name = "skyui";
        String color = "blue";
        System.out.println(name + "is" + color);
        System.out.println(name.length()); //tells the length of the string
        System.out.println(name.toUpperCase());// converts the string to upper case
        System.out.println(name.toLowerCase());//converts the string to lower case
        //escape sequence character
        System.out.println(name + "is\"" + color);
        System.out.println(name + "is\\" + color);
        System.out.println(name + "\tis\t" + color);
        System.out.println(name + "is\n" + color);

        System.out.println(color.contains("bl"));//it returns a boolean and helps to identify that the variable name contains the specific character
        System.out.println(name.charAt(2));// tells us which character is at the given index
        System.out.println(name.endsWith("ky"));//tells us whether the word ends with the given letters
        System.out.println(name.indexOf("ky"));// tells the index 
        

    }
}
