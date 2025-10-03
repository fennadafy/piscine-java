public class DeadCharacterException extends Exception {
    public Character c;
    public DeadCharacterException(Character c) {
        this.c = c;
    }
    public String getMessage() {
        return String.format("The %s %s is dead.", c.getType(), c.getName());
    }
}