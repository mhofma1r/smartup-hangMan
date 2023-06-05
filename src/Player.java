import javax.xml.namespace.QName;

public class Player {
    private String name;
    private String word;
    private Integer lives;

    public Player(String name, String word, Integer lives) {
        this.name = name;
        this.word = word;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getLives() {
        return lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", word='" + word + '\'' +
                ", lives=" + lives +
                '}';
    }
}
